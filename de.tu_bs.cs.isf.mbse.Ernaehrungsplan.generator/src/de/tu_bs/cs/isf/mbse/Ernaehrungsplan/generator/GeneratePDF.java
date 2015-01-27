package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.generator;

import java.io.File;

import de.nixosoft.jlr.JLRGenerator;

public class GeneratePDF {
	
	public static void latex2PDF(File inputFile, File outputPath, File workingDirectory)
	{
		try {
			// Je nach Benutzer anzupassen
			// Marcel
//			File latex = new File("/usr/local/texlive/2014/bin/x86_64-darwin/pdflatex");
			// FloF, Tabea
			File latex = new File("/usr/local/texlive/2013/bin/x86_64-darwin/pdflatex");
			
			JLRGenerator pdfGen = new JLRGenerator();
			// löscht temporäre Dateien
			pdfGen.deleteTempFiles(true, true, true);
			// PDF-Dokument generieren
			pdfGen.generate(latex, inputFile, outputPath, workingDirectory);
		} catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
}
