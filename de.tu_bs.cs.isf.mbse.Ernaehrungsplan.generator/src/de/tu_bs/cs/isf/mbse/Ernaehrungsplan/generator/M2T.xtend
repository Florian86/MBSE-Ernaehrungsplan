package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.generator

import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Zutat
import java.io.File
import java.io.FileOutputStream
import java.util.ArrayList
import java.util.Calendar
import java.util.Collections
import java.util.Date
import java.util.GregorianCalendar
import java.util.HashMap
import java.util.List
import java.util.Map

class M2T {
	
	ModelLoader loader = new ModelLoader();
	
	List<Ernaehrungsplan> eplans; 					// alle im Modell vorhandenen Ernährungspläne
	List<Gericht> meals;	// hier sollen sieben Random-Gerichte drin sein
	List<Gericht> salads;	// hier sollen zwei Salate und null-Objekte drin sein
	
	EpElement epElement;
	
	File targetLatexFile;
	File targetHtmlFile_EP;
	File targetHtmlFile_EL;
	File targetPhpFile_EL;
	
	FileOutputStream latexStream; 	
	FileOutputStream htmlStream_EP;
	FileOutputStream htmlStream_EL;
	FileOutputStream phpStream_EL;
	
	String latexOutput;
	String htmlOutput_EP;
	String htmlOutput_EL;
	String phpOutput_EL;
	
	File[] filesToUpload;
	
	// Name der aktuellen Person eines Ernährungsplans
	String current_personname;						
	
	// Listen für die berechnete Kalorienanzahl eines Gerichts oder eines Salats	
	List<Integer> mealsKcals;
	List<Integer> saladsKcals;
	// Berechnete Kalorienanzahl, die in der Woche verbraucht wurden
	int usedKcalWeek = 0;	
	
	// Verwendete Zutaten mit ihrer im Ernährungsplan vorkommenden Menge für die 
	// Einkaufsliste; eine Zutat ist der Key, die Menge davon der Value
	Map<Zutat, Integer> amoutOfIngredients; 

	def M2T() {
		
	}
	
	def static void main(String[] args) {
		println("Starte Generierung des Ernährungsplans.")
		val m2t = new M2T()
		m2t.generate("src/de/tu_bs/cs/isf/mbse/Ernaehrungsplan/generator", "test")
		println("Generierung beendet.")
	}
	
	def generate(String folder, String file) {
		
		// Prüfen ob die Datei existiert
		if (!fileExists(folder, file)) {
			println("Datei nicht vorhanden " + folder + "" + file)
			return
		}
		
		//Modell laden
		this.epElement = loader.loadModel(folder, file);
        this.eplans = this.epElement.eplanElement;
        
        // alle in der ep-Datei vorhandenen Ernährungspläne durchlaufen
        for (e: this.eplans) {
        	
 			// Initialisiert, berechnet, speichert zwischen... 
 			this.preparations(e)
			// die Anzahl der Kalorien für die Gerichte der Woche berechnen
        	this.computeKcals()
        	// die Mengenangaben für alle benötigten Zutaten berechnen
        	this.computeAmount()        	       
        	         
	        //--------------------LaTeX--------------------
	        val currentDirectory = new File(".").getCanonicalFile();
	        val outputPath = new File(currentDirectory + File.separator  + "output");
	        targetLatexFile = new File(outputPath + File.separator + this.current_personname + "_Latex.tex");
	        targetLatexFile.getParentFile().mkdirs();				// Pfad zur Datei wird mit erstellt (weil output-Ordner fehlt, wenn leer)
	        targetLatexFile.createNewFile(); 						// Datei erstellen
	        latexStream = new FileOutputStream(targetLatexFile); 	// um Zeug in die Datei zu schreiben
	        
	        latexOutput = generateLatex(e).replaceAll("\"", ""); 	//TODO: mir noch unklar, warum \" ersetzt wird, vorallem warum "
	        latexStream.write(latexOutput.getBytes()); 				// schreibt den generierten Code in die Datei
	        latexStream.close(); 									// Stream schließen und Resourcen freigeben
			val workingDirectory = outputPath;
			GeneratePDF.latex2PDF(targetLatexFile, outputPath, workingDirectory);
	        
	        //--------------------HTML--------------------
	        // ------ Ernährungsplan ------
	        targetHtmlFile_EP = new File("output" + File.separator + this.current_personname + "_EP_HTML.html"); 
	        targetHtmlFile_EP.createNewFile();
	        htmlStream_EP = new FileOutputStream(targetHtmlFile_EP);
	        
	        htmlOutput_EP = generateHtmlSchedule(e);
	        htmlStream_EP.write(htmlOutput_EP.getBytes());
	        htmlStream_EP.close();
	        
	        // ------ Einkaufsliste ------
	        targetHtmlFile_EL = new File("output" + File.separator + this.current_personname + "_EL_HTML.html");
	        targetHtmlFile_EL.createNewFile();
	        htmlStream_EL = new FileOutputStream(targetHtmlFile_EL);
	        
	        htmlOutput_EL = generateHtmlShoppingList(e, false);
	        htmlStream_EL.write(htmlOutput_EL.getBytes());
	        htmlStream_EL.close();
	        
	        // --------- php --------
	        targetPhpFile_EL = new File("output" + File.separator + this.current_personname + ".php");
	        targetPhpFile_EL.createNewFile();
	        phpStream_EL = new FileOutputStream(targetPhpFile_EL);
	        
	        phpOutput_EL = generateHtmlShoppingList(e, true);
	        phpStream_EL.write(phpOutput_EL.getBytes());
	        phpStream_EL.close();
	        
	        filesToUpload = newArrayOfSize(1)
 			filesToUpload.set(0, targetPhpFile_EL)
 			FTPUpload.upload(this.current_personname, filesToUpload);
 			
 			targetPhpFile_EL.delete()
 			println("Einkaufszettel ist erreichbar unter:\n\thttp://uni.florianfranke.net/" + this.current_personname + ".php")
		}
    }
    
    def preparations(Ernaehrungsplan e) {
    	
    	// aktuellen Namen zwischenspeichern
        this.current_personname = e.personen.name
 
        // alles hier initialisieren, damit jeder Ernährungsplan eigene Werte hat
    	this.salads = new ArrayList<Gericht>
    	this.meals = new ArrayList<Gericht>
    	this.amoutOfIngredients = new HashMap<Zutat, Integer>()
    	this.saladsKcals = new ArrayList<Integer>
    	this.mealsKcals = new ArrayList<Integer>
    	this.usedKcalWeek = 0	
    	
    	var String[] mealnameArray
    	var StringBuilder sb
    	var List<Gericht> preMeals = new ArrayList<Gericht>
    	var List<Gericht> preSalads = new ArrayList<Gericht>
    	var List<Integer> randomMeals = new ArrayList<Integer>
    	var List<Integer> randomSalads = new ArrayList<Integer>
    	var List<Integer> randomWeekdays = new ArrayList<Integer>
    	
    	// Aufteilung der Gerichte in normale Gerichte und Salate, um später die Tabelle 
    	// einfacher aufbauen zu können
    	for (g: e.gerichte) {
    		mealnameArray = g.name.split("_")
    		sb = new StringBuilder()
    		for (String s : mealnameArray) {
    			sb.append(s)
    			sb.append(" ")
    		}
    		g.name = sb.toString
    		if (g.isIstSalat) {
    			preSalads.add(g)
    		} 
    		else {
    			preMeals.add(g) 
    		}
    	} 
    	
    	//Zufallsauswahl der Gerichte
    	
    	//wenn zu wenig Gerichte, füge Salat zu den Gerichten und lösche Salate
    	//TODO: evtl. Änderung im Meta-Modell?
    	if(preMeals.size() < 7){
    	    println("Pflanzenfresser entdeckt.")
    	    preMeals.addAll(preSalads)
    	    for(s: 0..< preSalads.size()){
    	        preSalads.set(s,null)
    	    }
    	}else{
            //Liste mit Zahlen für jeden Salat
            for(i: 0..< preSalads.size()){
                randomSalads.add(new Integer(i))
            }
            //Permutiere Zahlen
            Collections.shuffle(randomSalads)
            //Liste mit Zahlen für jeden Wochentag
            for(i: 0..< 7){
                randomWeekdays.add(new Integer(i))
            }
            //Permutiere Zahlen und wähle 2 aus
            //TODO: 2 Salate pro Woche?
            Collections.shuffle(randomWeekdays)
            for(i: 0..< 7){
                if(i == randomWeekdays.get(0)){
                    this.salads.add(preSalads.get(randomSalads.get(0)))
                }else if(i == randomWeekdays.get(1)){
                    this.salads.add(preSalads.get(randomSalads.get(1)))
                }else{
                    this.salads.add(null)
                }
            }
    	}
    	//Liste mit Zahlen für jedes Gericht
    	for(i: 0..< preMeals.size()){
    	    randomMeals.add(new Integer(i))
    	}
    	//Permutiere Zahlen, wähle die ersten sieben aus
    	Collections.shuffle(randomMeals)
    	for(i: 0..< 7){
    	    this.meals.add(preMeals.get(randomMeals.get(i)))
    	}

    }
    
    /*
     * Kalenderwoche berechnen
     */
    def int getWeekOfYear() {
    	var Calendar calendar = new GregorianCalendar();
		var Date trialTime = new Date();   
		calendar.setTime(trialTime);     
		// println(calendar.get(Calendar.WEEK_OF_YEAR));  
		return calendar.get(Calendar.WEEK_OF_YEAR)
    }
    
    /*
     * Berechnung der Kalorienanzahl der jeweiligen Gerichte
     */
    def computeKcals() {
    			
		var kcal = 0		
		var i = 0;
		
		// alle Gerichte durchlaufen
		for(g: this.meals) {
			// alle Zutaten durchlaufen
			for (z: g.zutaten) {
				// kcal für ein Gericht ausrechnen (kcal sind pro hundert gramm, also multiplizieren) 
				kcal = kcal + (z.zutat.kcal * z.menge/100)
			}
			// berechnete Kalorienanzahl für ein Gericht in die Liste speichern
			this.mealsKcals.add(kcal)
			// Kalorienanzahl zu den bereits gebrauchten zurechnen
			this.usedKcalWeek = this.usedKcalWeek + kcal

			kcal = 0
		}
		
		// wie für die Gerichte
		for (i = 0; i < 7; i++) {
			// da es nur zwei Salate pro Woche geben soll, werden die NULL-Elemente abgefangen
			if (this.salads.get(i) != null) {
				for (z: this.salads.get(i).zutaten) {
					// kcal für ein Gericht ausrechnen
					kcal = kcal + (z.zutat.kcal * z.menge/100)
				}
				this.saladsKcals.add(kcal)
				this.usedKcalWeek = this.usedKcalWeek + kcal
				kcal = 0
			} else {
				// Bei einem Null-Objekt einfach 0 Kalorien einfügen
				this.saladsKcals.add(kcal)	
			}			
		}
    }
    
    /*
     * Menge der benötigten Zutaten für die Einkaufsliste berechnen
     */
    def computeAmount() {
    	
    	var amount = 0
    	
    	// alle Gerichte durchlaufen
		for (g: this.meals) {
			// alle Zutaten durchlaufen
			for (g2z: g.zutaten) {
				// wenn es die Zutat noch nicht als Key gibt (die soll ja nur einmal
				// in der Liste auftauchen, deshalb Key), dann wird sie als Key mit der 
				// entsprechenden Menge zugefügt
				if (!this.amoutOfIngredients.containsKey(g2z.zutat)) {
					this.amoutOfIngredients.put(g2z.zutat, g2z.menge)				
				} else {
					// gibt es den Key schonmal, müssen die Mengen addiert werden, 
					// also alter + neuer Wert
					amount = this.amoutOfIngredients.get(g2z.zutat) + g2z.menge
                    this.amoutOfIngredients.put(g2z.zutat, amount);
				}
			}
		}
		// gleiches für die Salate
		for (s: this.salads) {
			if (s != null) {
				for (g2z: s.zutaten) {
					if (!this.amoutOfIngredients.containsKey(g2z.zutat)) {
						this.amoutOfIngredients.put(g2z.zutat, g2z.menge)				
					} else {
						amount = this.amoutOfIngredients.get(g2z.zutat) + g2z.menge
                        this.amoutOfIngredients.put(g2z.zutat, amount);
					}
				}
			}
		}

    }
     
	//--------------------LaTeX--------------------
	
	/*
	 * "Startmethode" der Latex-Generierung
	 * aktueller Ernährungsplan wird übergeben
	 */
	def String generateLatex(Ernaehrungsplan e){
        '''
        «generateLatexHead()»
        \begin{document}
        «generateLatexSchedule(e)»
        \newpage
        «generateLatexShoppingList(e)»
        \end{document}
        '''
    }
    
    /*
     * Latexkopf mit allen Einstellungen, Packages, ... 
     */
    def String generateLatexHead(){
        
        '''
		\documentclass[10pt, a4paper]{article}
		\usepackage[a4paper, bottom=2.0cm, top=2.0cm]{geometry}
		
		\usepackage[utf8]{inputenc}
		\usepackage[ngerman]{babel}
		
		\pagestyle{empty}
		\parindent0pt
		
		\usepackage{tabularx}
		\usepackage{multirow}
		\newcolumntype{C}{>{\centering\arraybackslash}X}
		
		\usepackage{pdflscape}
		\usepackage{ragged2e}
		
		\usepackage{enumitem} 
		\setitemize{leftmargin=*}
		
		\usepackage{helvet}
		\renewcommand{\familydefault}{\sfdefault}
		\fontfamily{phv}\selectfont
		
		\usepackage{colortbl}
		\usepackage{xcolor}
		\definecolor{hellgrau}{rgb}{0.95,0.95,0.95}
		
		'''
    }
    
	/*
	 * Generiert den Ernährungsplan für Latex.
	 */
	def String generateLatexSchedule(Ernaehrungsplan e) {
						
		'''
		
		\begin{landscape}
			\begin{center}
				{\Huge \textbf{Ernährungsplan}} \bigskip \\
				«this.current_personname» \\
				«this.getWeekOfYear() + 1». Kalenderwoche \bigskip \\
				Empfohlener Energiebedarf pro Woche: «e.personen.kcal» Kalorien $\rightarrow$ «e.personen.kcal/7» Kalorien pro Tag \medskip \\
			\end{center}
			\renewcommand*{\arraystretch}{1.5}
			\begin{tabularx}{\linewidth}{|X|X|X|X|X|X|X|}	
				\hline
				\rowcolor{hellgrau} & & & & & & \\
				\rowcolor{hellgrau}\Centering \multirow{-2}{*}{\textbf{Montag}} & 
					\Centering \multirow{-2}{*}{\textbf{Dienstag}} & \Centering \multirow{-2}{*}{\textbf{Mittwoch}} & 
					\Centering \multirow{-2}{*}{\textbf{Donnerstag}} & \Centering \multirow{-2}{*}{\textbf{Freitag}} & 
					\Centering \multirow{-2}{*}{\textbf{Samstag}} & \Centering \multirow{-2}{*}{\textbf{Sonntag}} \\
				\hline
				«FOR j : 0 ..< 7»
					«this.meals.get(j).name» \newline {\scriptsize «this.mealsKcals.get(j)» kcal}
					\begin{small}
						\begin{itemize}
						\itemsep0pt
							«FOR g2z:this.meals.get(j).zutaten»
								\item «g2z.menge»g «g2z.zutat.name»
							«ENDFOR»
						\end{itemize}
					\end{small}
					«IF j < 6»
						&
					«ELSE»
						\\ [-15pt]
					«ENDIF»	
				«ENDFOR»
				«FOR j : 0 ..< 7»
					«IF this.meals.get(j).kommentar.length > 0»
						\scriptsize Anmerkung: «this.meals.get(j).kommentar»
					«ENDIF»
					«IF j < 6»
						&
					«ELSE»
						\\
					«ENDIF»	
				«ENDFOR»
				\hline
				«FOR j : 0 ..< 7»
					«IF this.salads.get(j) != null»
						«this.salads.get(j).name» \newline {\scriptsize «this.saladsKcals.get(j)» kcal}
						\begin{small}
							\begin{itemize}
							\itemsep0pt
								«FOR g2z:this.salads.get(j).zutaten»
									\item «g2z.menge»g «g2z.zutat.name»
								«ENDFOR»
							\end{itemize}
						\end{small}
					«ENDIF»
					«IF j < 6»
						&
					«ELSE»
						\\ [-15pt]
					«ENDIF»
				«ENDFOR»
				«FOR j : 0 ..< 7»
					«IF this.salads.get(j) != null && this.salads.get(j).kommentar.length > 0»
						\scriptsize Anmerkung: «this.salads.get(j).kommentar»
					«ENDIF»
					«IF j < 6»
						&
					«ELSE»
						\\
					«ENDIF»	
				«ENDFOR»
				\hline
			\end{tabularx} \medskip \\ 
		Diese Woche wurden «this.usedKcalWeek» von 
		«e.personen.kcal»
		Kalorien verbraucht. 
		
		\end{landscape}
		'''
	}
	
	/*
	 * Generiert die Einkaufsliste für Latex.
	 */
	def String generateLatexShoppingList(Ernaehrungsplan e) {
		
		'''
		{\Large \textbf{Einkaufsliste}} \medskip \\
		
		\begin{itemize}
			«FOR Zutat key : this.amoutOfIngredients.keySet()»
				\item «this.amoutOfIngredients.get(key)»g «key.name»
			«ENDFOR»
		\end{itemize}
		'''
	}
	
	//--------------------HTML--------------------
	
	/*
	 * Generiert den Ernährungsplan für HTML.
	 */
	def String generateHtmlSchedule(Ernaehrungsplan e) {
		
		'''
		<!DOCTYPE html>
		<html lang="en">
		<head>
		  <meta charset="utf-8">
		  <meta http-equiv="X-UA-Compatible" content="IE=edge">
		  <meta name="viewport" content="width=device-width, initial-scale=1">
		  <title>Ernährungsplan</title>
		
		  <!-- Bootstrap -->
    	  <link href="../html/css/bootstrap.min.css" rel="stylesheet">
		  <link href="../html/css/style_EP.css" rel="stylesheet">
		
		  <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		    <!--[if lt IE 9]>
		      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
		      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		    <![endif]-->
		</head>
		
		    <body>
		      <div class="container">
		        <div class="row">
		        	<div class="head">
			          <h1>Ernährungsplan</h1>
			          <p>«this.current_personname»<br /> «this.getWeekOfYear() + 1». Kalenderwoche <br />Empfohlener Energiebedarf pro Woche:
				 		«e.personen.kcal» Kalorien &rarr; «e.personen.kcal/7» Kalorien pro Tag</p>
			 		</div>
		          <table class="table table-bordered">
		            <thead>
		              <tr>
		                <th>Montag</th>
		                <th>Dienstag</th>
		                <th>Mittwoch</th>
		                <th>Donnerstag</th>
		                <th>Freitag</th>
		                <th>Samstag</th>
		                <th>Sonntag</th>
		              </tr>
		            </thead>
		            <tbody>
		              <tr class="anmerkung_drueber">
		              «FOR j : 0 ..< 7»
		                <td>«this.meals.get(j).name» <br /> <small>«this.mealsKcals.get(j)» kcal</small><br /> 
		                  <ul>
		                  	«FOR g2z:this.meals.get(j).zutaten»
                                <li>«g2z.menge»g «g2z.zutat.name»</li>
							«ENDFOR»
		                  </ul>
		                </td>
		              «ENDFOR»
		              </tr>
		              <tr class="anmerkung">
		              	«FOR j : 0 ..< 7»
		              		«IF this.meals.get(j).kommentar.length > 0»
								<td>«this.meals.get(j).kommentar»</td>
							«ENDIF»
		              	«ENDFOR»
		              </tr>
		               <tr class="anmerkung_drueber">
		              «FOR j : 0 ..< 7»
						«IF this.salads.get(j) != null»
						  <td>«this.salads.get(j).name»<br /> <small>«this.saladsKcals.get(j)» kcal</small><br /> 
							<ul>
							«FOR g2z:this.salads.get(j).zutaten»
								<li>«g2z.menge»g «g2z.zutat.name»</li>
							«ENDFOR»
		                    </ul>
		                  </td>
						«ELSE»
							<td></td>
						«ENDIF»
					  «ENDFOR»
		              </tr>
		              <tr class="anmerkung">
		              	«FOR j : 0 ..< 7»
		              		«IF this.salads.get(j) != null && this.salads.get(j).kommentar.length > 0»
								<td>«this.salads.get(j).kommentar»</td>
							«ELSE»
								<td></td>
							«ENDIF»
		              	«ENDFOR»
		              </tr>
		            </tbody>
		          </table>
		          <p>Diese Woche wurden «this.usedKcalWeek» von «e.personen.kcal» Kalorien verbraucht.</p>
		        </div>
		      </div>
		
		      <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
		      <!-- Include all compiled plugins (below), or include individual files as needed -->
		      <script src="../html/js/bootstrap.min.js"></script>
		    </body>
		    </html>
		'''
	}
	
	/*
	 * Generiert die Einkaufsliste für HTML.
	 */
	def String generateHtmlShoppingList(Ernaehrungsplan e, boolean php){
		'''
		<!DOCTYPE html>
		<html lang="en">
		  <head>
		    <meta charset="utf-8">
		    <meta http-equiv="X-UA-Compatible" content="IE=edge">
		    <meta name="viewport" content="width=device-width, initial-scale=1">
		    <title>Einkaufsliste</title>
		
		    <!-- Bootstrap -->
		    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
		
		    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		    <!--[if lt IE 9]>
		      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
		      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		    <![endif]-->
		
		    <style type="text/css">
		    <!--
		    td:nth-child(1) {
		      width: 30px;
		    }
		    -->
		    </style>
		  </head>
		  <body>
		«IF php »
			<input id="user" type="hidden" value="«this.current_personname»" />
 			<input id="dec_value" type="hidden" value="<?php 
 				echo file_get_contents("http://uni.florianfranke.net/read.php?user=«this.current_personname»"); ?>" />
		«ENDIF»
		    <div class="container">
		      <div class="row">
		        <div class="col-md-6 col-md-offset-2">
		          <h1>Einkaufsliste</h1>
		          <table class="table table-bordered table-striped">
		            <tbody>
		            	«FOR Zutat key : this.amoutOfIngredients.keySet()»
		            		<tr>
		            			<td><input type="checkbox"></td>
		            			<td>«this.amoutOfIngredients.get(key)»g «key.name»</td>
		            		</tr>
				  		«ENDFOR»
				  	</tbody>
		          </table>
		        </div>
		      </div>
		    </div>
		    
		    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
		    <!-- Include all compiled plugins (below), or include individual files as needed -->
		    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
		
			«IF !php»	
		    	<script src="../html/js/einkaufszettel.js"></script>
		    «ELSE»
		    	<script src="einkaufszettel.js"></script>
		    «ENDIF»
		  </body>
		</html>
		'''
	}
	
	/*
	 * Prüft, ob die Datei existiert
	 */
	def boolean fileExists(String folder, String file) {
		
		val path = new StringBuffer
		path.append(folder)
		
		if(folder.charAt(folder.length-1) != "/") {
			path.append("/")
		}
		
		path.append(file)
		path.append(".ep")
		
		val f = new File(path.toString)
		if (f.exists() && !f.isDirectory()) {
			return true
		}	
		
		return false
	}
}