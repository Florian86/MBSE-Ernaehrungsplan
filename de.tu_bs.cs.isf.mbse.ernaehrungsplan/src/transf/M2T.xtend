package transf

import de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Ernaehrungsplan
import java.io.File
import java.io.FileOutputStream
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Person
import java.util.List

class M2T {
	def M2T() {
		
	}
	
	ModelLoader loader = new ModelLoader();
	List<Person> persons; //Für jede Person soll der Plan erstellt werden.
	Ernaehrungsplan plan;
	File targetLatexFile;
	File targetHtmlFile;
	FileOutputStream latexStream; //prinzipiell soll
	FileOutputStream htmlStream;
	String latexOutput;
	String htmlOutput;
	
	def generate(String folder, String file){
		//Modell laden
		plan = loader.loadModel(folder, file);
        persons = plan.personen;
        for(p : persons) { //für alle Personen im Ernaehrungsplan folgendes ausführen
        //TODO: Hier müsste schon ein zufällige Auswahl der Gerichte stattfinden, da die Auswahl für HTML und Latex gleich sein muss.
            //--------------------LaTeX--------------------
            targetLatexFile = new File(folder + File.separator + file + "_" + p.getName().toLowerCase + ".tex"); //Datei bekommt den Namen: folder/file_person.tex
            targetLatexFile.createNewFile(); //Datei erstellen
            latexStream = new FileOutputStream(targetLatexFile); //um Zeug in die Datei zu schreiben
            
            latexOutput = generateLatex(p).replaceAll("\"", ""); //TODO: mir noch unklar, warum \" ersetzt wird, vorallem warum "
            latexStream.write(latexOutput.getBytes()); //schreibt den generierten Code in die Datei
            latexStream.close(); //Stream schließen und Resourcen freigeben
            
            //--------------------HTML--------------------
            targetHtmlFile = new File(folder + File.separator + file + "_" + p.getName().toLowerCase + ".html"); //Datei bekommt den Namen: folder/file_person.html
            targetHtmlFile.createNewFile();
            htmlStream = new FileOutputStream(targetHtmlFile);
            
            htmlOutput = generateHtml(p).replaceAll("\"", "");
            htmlStream.write(htmlOutput.getBytes());
            htmlStream.close();
	   }
    }
    

    
 
     
	//--------------------LaTeX--------------------
	
	/*
	 * "Startmethode" der Latex-Generierung
	 */
	def String generateLatex(Person p){
        '''
        «generateLatexHead()»
        \begin(document)
        «generateLatexSchedule()»
        \newpage
        «generateLatexShoppingList()»
        \end(document)
        '''
    }
    
    /*
     * 
     */
    def String generateLatexHead(){
        //TODO: hier kommt documentclass, usepackages etc. rein (alles was vor begin(document) kommt), einfach copy-paste aus Latex
    }
    
	/*
	 * Generiert den Ernährungsplan für Latex.
	 */
	def String generateLatexSchedule(){
		//TODO: Latex-Code für den Wochenplan; zu befüllen mit den Informationen aus unserer Modellinstanz "plan" (später)
	}
	
	/*
	 * Generiert die Einkaufsliste für Latex.
	 */
	def String generateLatexShoppingList(){
		//TODO: Latex-Code für die Einkaufsliste; zu befüllen mit den Informationen aus unserer Modellinstanz "plan" (später)
	}
	
	//--------------------HTML--------------------
	
	/*
	 * "Startmethode" der HTML-Generierung
	 */
	def String generateHtml(Person p){
        generateHtmlSchedule();
        generateHtmlShoppingList();
    }  
    
	/*
	 * Generiert den Ernährungsplan für HTML.
	 */
	def String generateHtmlSchedule(){
		
	}
	
	/*
	 * Generiert die Einkaufsliste für HTML.
	 */
	def String generateHtmlShoppingList(){
		
	}
	
}