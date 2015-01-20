package transf

import ep.EpElement
import ep.Ernaehrungsplan
import ep.Gericht
import java.io.File
import java.io.FileOutputStream
import java.util.List

class M2T {
	
	ModelLoader loader = new ModelLoader();
	List<Ernaehrungsplan> eplans; 		// alle im Modell vorhandenen Ernährungspläne
	List<Gericht> meals;
	EpElement epElement;
	File targetLatexFile;
	File targetHtmlFile_EP;
	File targetHtmlFile_EL;
	FileOutputStream latexStream; 	
	FileOutputStream htmlStream_EP;
	FileOutputStream htmlStream_EL;
	String latexOutput;
	String htmlOutput_EP;
	String htmlOutput_EL;

	String current_personname;		

	def M2T() {
		
	}
	
	def static void main(String[] args) {
		println("Starte Generierung des Ernährungsplans.")
		val m2t = new M2T()
		m2t.generate("src/metamodel", "test")
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
        
        // ------------ zu Testzwecken --------------
        
//        for (e: this.eplans) {
//        	// Aufruf, neues Modell
//        	// println(e.personen.name + ", " + e.personen.kcal)
//        	for (p:e.personen) {
//        		println(p.name + ", " + p.kcal)
//        	}
//        	for (g: e.gerichte) {
//        		println(g.name + ", Salat? " + g.istSalat + ", " + g.kommentar)
//        		for (z:g.zutaten) {
//        		// Zutatennamen der Gerichte: epElement.gerichtElement.zutaten.zutat.name
//        		// zutaten ist die Beziehung zwischen Gericht und Gericht2Zutat
//        		// zutat ist die Beziehung zwischen Gericht2Zutat und der abtrakten 
//        		// Klasse Zutat, die die Attribute name und kcal hat
//        		println(z.zutat.name + ", " + z.menge +", " + z.zutat.kcal)
//           		}  
//        	}
//        }
                
        //TODO: Hier müsste schon ein zufällige Auswahl der Gerichte stattfinden, da die Auswahl für HTML und Latex gleich sein muss
        
        for (e: this.eplans) {
        
        	for (p: e.personen) {
        		this.current_personname = p.name
        	}
        	this.meals = e.gerichte;
        
	        //--------------------LaTeX--------------------
	        targetLatexFile = new File("output" + File.separator + this.current_personname + "_Latex.tex");
	        										// new File(folder + File.separator + file + "_" + p.getName().toLowerCase + ".tex"); 
	        targetLatexFile.createNewFile(); 						// Datei erstellen
	        latexStream = new FileOutputStream(targetLatexFile); 	// um Zeug in die Datei zu schreiben
	        
	        latexOutput = generateLatex(e).replaceAll("\"", ""); 	//TODO: mir noch unklar, warum \" ersetzt wird, vorallem warum "
	        latexStream.write(latexOutput.getBytes()); 				// schreibt den generierten Code in die Datei
	        latexStream.close(); 									// Stream schließen und Resourcen freigeben
	        
	        //--------------------HTML--------------------
	        targetHtmlFile_EP = new File("output" + File.separator + this.current_personname + "_EP_HTML.html");  
	                   								// new File(folder + File.separator + file + "_" + p.getName().toLowerCase + ".html");
	        targetHtmlFile_EP.createNewFile();
	        htmlStream_EP = new FileOutputStream(targetHtmlFile_EP);
	        
	        htmlOutput_EP = generateHtmlSchedule(e);
	        htmlStream_EP.write(htmlOutput_EP.getBytes());
	        htmlStream_EP.close();
	        
	        targetHtmlFile_EL = new File("output" + File.separator + this.current_personname + "_EL_HTML.html");  
	                   								// new File(folder + File.separator + file + "_" + p.getName().toLowerCase + ".html");
	        targetHtmlFile_EL.createNewFile();
	        htmlStream_EL = new FileOutputStream(targetHtmlFile_EL);
	        
	        htmlOutput_EL = generateHtmlShoppingList(e);
	        htmlStream_EL.write(htmlOutput_EL.getBytes());
	        htmlStream_EL.close();
		}
    }
     
	//--------------------LaTeX--------------------
	
	/*
	 * "Startmethode" der Latex-Generierung
	 * ohne p erstmal !!!!!!!!!!
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
     * 
     */
    def String generateLatexHead(){
        //TODO: hier kommt documentclass, usepackages etc. rein (alles was vor begin(document) kommt), einfach copy-paste aus Latex
        
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
		
		'''
    }
    
	/*
	 * Generiert den Ernährungsplan für Latex.
	 */
	def String generateLatexSchedule(Ernaehrungsplan e) {
		//TODO: Latex-Code für den Wochenplan; zu befüllen mit den Informationen aus unserer Modellinstanz "plan" (später)
		
		//TODO Liste mit Gerichten darf hier schon nur 7 Elemente enthalten!!
		
		var kcal = 0
		var int[] kcal_array = newIntArrayOfSize(7)
		var String[] name_array = newArrayOfSize(7)
		
		var i = 0;
		
		for(g: this.meals) {
			for (z: g.zutaten) {
				kcal = kcal + (z.zutat.kcal * z.menge/100)
			}
			if (i <= 6) {
				name_array.set(i, g.name)
				kcal_array.set(i, kcal)
				i++
			}
			kcal = 0
		}
		
		// kcal sind pro hundert gramm, also multiplizieren 
		// 200g Kartoffeln 73kcal + 500g Lammfleisch 73kcal	
		// = 200/100*73 + 500/100*73 = 2*73 + 5*73 = 146 + 365 = 511kcal
		
		'''
		
		\begin{landscape}
		
			{\Large \textbf{Ernährungsplan}} \medskip \\
			«this.current_personname»
			\\ Empfohlener Energiebedarf pro Woche: 
		
	«««		«e.personen.kcal»
			«FOR p: e.personen»
				«p.kcal»
			«ENDFOR»
			 Kalorien $\rightarrow$ 
	«««		«e.personen.kcal/7»
			«FOR p: e.personen»
				«p.kcal/7»
			«ENDFOR»
			Kalorien pro Tag \medskip \\
			\renewcommand*{\arraystretch}{1.2}
			\begin{tabularx}{\linewidth}{|X|X|X|X|X|X|X|}	
				\hline
				\Centering \multirow{2}{*}{\textbf{Montag}} & \Centering \multirow{2}{*}{\textbf{Dienstag}} & \Centering \multirow{2}{*}{\textbf{Mittwoch}} & \Centering \multirow{2}{*}{\textbf{Donnerstag}} & \Centering \multirow{2}{*}{\textbf{Freitag}} & \Centering \multirow{2}{*}{\textbf{Samstag}} & \Centering \multirow{2}{*}{\textbf{Sonntag}} \\
		%		&  &  &  &  &  &  \\
				&  &  &  &  &  &  \\
				\hline
				«name_array.get(0)»	\newline {\scriptsize «kcal_array.get(0)» kcal} 
				\begin{small}
				\begin{itemize}
				\itemsep0pt
					\item 100g Spaghetti
					\item 200g Bolognesesoße 
					\smallskip
				\end{itemize}
				\end{small}
				\begin{scriptsize}
				Anmerkung: Gericht ist in Buch blablabla auf S.30 zu finden.
				\end{scriptsize}
				& «name_array.get(1)» \newline {\scriptsize «kcal_array.get(1)» kcal} 
				\begin{small}
				\begin{itemize}
				\itemsep0pt
					\item 500g Kartoffeln
					\item 200g Rührei 
					\item 100g Spinat
				\end{itemize}
				\end{small}
				& «name_array.get(2)» \newline {\scriptsize «kcal_array.get(2)» kcal}  
				\begin{small}
				\begin{itemize}
				\itemsep0pt
					\item 300g Pfannkuchen
				\end{itemize}
				\end{small}
				&  «name_array.get(3)» \newline {\scriptsize «kcal_array.get(3)» kcal}  
				\begin{small}
				\begin{itemize}
				\itemsep0pt
					\item 500g Kartoffeln
					\item 200g Rührei 
					\item 100g Spinat
				\end{itemize}
				\end{small}
				&  «name_array.get(4)» \newline {\scriptsize «kcal_array.get(4)» kcal}  
				\begin{small}
				\begin{itemize}
				\itemsep0pt
					\item 500g Kartoffelbrei
					\item 200g Rührei 
					\item 100g Spinat
				\end{itemize}
				\end{small}
				&  «name_array.get(5)» \newline {\scriptsize «kcal_array.get(5)» kcal}  
				\begin{small}
				\begin{itemize}
				\itemsep0pt
					\item 500g Zungenragout
					\item 200g Rührei 
					\item 100g Spinat
				\end{itemize}
				\end{small}
				&  «name_array.get(6)» \newline {\scriptsize «kcal_array.get(6)» kcal}  
				\begin{small}
				\begin{itemize}
				\itemsep0pt
					\item 500g Kartoffeln
					\item 200g Rührei 
					\item 100g Rotkohl 
				\end{itemize}
				\end{small} 
				\\
				\hline
				& & Salat \newline {\scriptsize 300 kcal} 
				\begin{small}
				\begin{itemize}
				\itemsep0pt
					\item 500g Salat
					\item 50ml Dressing
				\end{itemize}
				\end{small}
				& & & & Salat \newline {\scriptsize 300 kcal}  
				\begin{small}
				\begin{itemize}
				\itemsep0pt
					\item 500g Salat
					\item 50ml Dressing
				\end{itemize}
				\end{small}
				\\
				\hline
			\end{tabularx} \medskip \\ 
		Für diese Woche wurden xxxxx von 14.000 kcal verbraucht. 
		
		\end{landscape}
		'''
	}
	
	/*
	 * Generiert die Einkaufsliste für Latex.
	 */
	def String generateLatexShoppingList(Ernaehrungsplan e) {
		//TODO: Latex-Code für die Einkaufsliste; zu befüllen mit den Informationen aus unserer Modellinstanz "plan" (später)
		
		'''
		{\Large \textbf{Einkaufsliste}} \medskip \\
		
		\begin{itemize}
			\item 100g Spaghetti ($\rightarrow$ 100 = Mo + Di + Mi + ... + So)
			\item 500g Kartoffeln 
			\item 
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
		          <h1>Ernährungsplan</h1>
		          <p>«this.current_personname»<br />Empfohlener Energiebedarf pro Woche: 14.000 Kalorien &rarr; 2.000 Kalorien pro Tag</p>
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
		              <tr>
		                <td>Spaghetti Bolognese <br /> <small>1000 kcal</small><br /> 
		                  <ul>
		                    <li>100g Spaghetti</li>
		                    <li>200g Bolognesesoße</li>
		                  </ul>
		                </td>
		                <td>Gericht A <br /> <small>1000 kcal</small><br /> 
		                  <ul>
		                    <li>500g Kartoffeln</li>
		                    <li>200g Rührei</li>
		                    <li>100g Spinat</li>
		                  </ul> 
		                </td>
		                <td>Pfannkuchen <br /> <small>500 kcal</small><br /> 
		                  <ul> 
		                    <li>300g Pfannkuchen</li>
		                  </ul>
		                </td>
		                <td>Gericht A <br /> <small>1000 kcal</small><br /> 
		                  <ul>
		                    <li>500g Kartoffeln</li>
		                    <li>200g Rührei</li>
		                    <li>100g Spinat</li>
		                  </ul> 
		                </td>
		                <td>Gericht A <br /> <small>1000 kcal</small><br /> 
		                  <ul>
		                    <li>500g Kartoffelbrei</li>
		                    <li>200g Rührei</li>
		                    <li>100g Spinat</li>
		                  </ul> 
		                </td>
		                <td>Gericht A <br /> <small>1000 kcal</small><br /> 
		                  <ul>
		                    <li>500g Zungenragout</li>
		                    <li>200g Rührei</li>
		                    <li>100g Spinat</li>
		                  </ul> 
		                </td>
		                <td>Gericht A <br /> <small>1000 kcal</small><br /> 
		                  <ul>
		                    <li>500g Kartoffeln</li>
		                    <li>200g Rührei</li>
		                    <li>100g Rotkohl</li>
		                  </ul> 
		                </td>
		              </tr>
		              <tr>
		                <td></td>
		                <td></td>
		                <td>Salat <br /> <small>300 kcal</small><br /> 
		                  <ul>
		                    <li>500g Salat</li>
		                    <li>50ml Dressing</li>
		                  </ul>
		                </td>
		                <td></td>
		                <td></td>
		                <td></td>
		                <td>Salat <br /> <small>300 kcal</small><br /> 
		                  <ul>
		                    <li>500g Salat</li>
		                    <li>50ml Dressing</li>
		                  </ul>
		                </td>
		              </tr>
		            </tbody>
		          </table>
		          <p>Für diese Woche wurden xxxxx von 14.000 kcal verbraucht.</p>
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
	def String generateHtmlShoppingList(Ernaehrungsplan e){
		'''
		<!DOCTYPE html>
		<html lang="en">
		<head>
			<meta charset="utf-8">
			<meta http-equiv="X-UA-Compatible" content="IE=edge">
			<meta name="viewport" content="width=device-width, initial-scale=1">
			<title>Einkaufsliste</title>
		
			<!-- Bootstrap -->
			<link href="../html/css/bootstrap.min.css" rel="stylesheet">
			<link href="../html/css/style_EL.css" rel="stylesheet">
		
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
		  			<h1>Einkaufsliste</h1>
		        <ul>
		          <li>100g Spaghetti</li>
		          <li>500g Kartoffeln</li>
		        </ul>
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