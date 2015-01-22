SYNTAXDEF ep
FOR <http://www.example.org/metamodel>
START EpElement

OPTIONS{
	reloadGeneratorModel = "true";
	generateCodeFromGeneratorModel = "true";
}


RULES {
	EpElement ::= "Ernaehrungsplan" "{"  
					personElement+
					zutatElement+
					gerichtElement+
					eplanElement+
				   "}";
				   
	Person ::= "Person" "(" name[] "," kcal[]?")";
	
	Hauptbestandteil ::= "Hauptbestandteil" "(" name[] "," kcal[]?")";
	
	Beilage ::= "Beilage" "(" name[] "," kcal[]?")";
	
	Sauce ::= "Sauce" "(" name[] "," kcal[]?")";
	
	Gericht ::= "Gericht" "{"
				"name" name[]
				"kommentar" kommentar['"','"']?
				"istSalat" istSalat["ja":"nein"]?
				"besteht aus" "{"zutaten+ "}"
				"}";
	
	Ernaehrungsplan ::= "eplan" "{"
						"person" "(" personen[] ")"
						"gerichte" "(" gerichte[] ("," gerichte[])* ")"
						"}";
	
	Gericht2Zutat ::= "zutat" "("menge[]"," zutat[] "," gericht[] ")";
	
}