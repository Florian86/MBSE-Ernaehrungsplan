SYNTAXDEF ep
FOR <http://www.example.org/metamodel>
START EpElement

OPTIONS{
	reloadGeneratorModel = "true";
	generateCodeFromGeneratorModel = "true";
	usePredefinedTokens = "false";
}

TOKENS {
	DEFINE TEXT  $('A'..'Z'|'a'..'z'|'_'|'-')+$;
  	DEFINE LINEBREAK  $('\r\n'|'\r'|'\n')$;
	DEFINE WHITESPACE $(' '|'\t'|'\f')$;
	DEFINE INTEGER $('0'..'9')$;
}


RULES {
	EpElement ::= "Ernaehrungsplan" "{"  
					personElement+
					zutatElement+
					gerichtElement+
					eplanElement+
				   "}";
				   
	Person ::= "Person" "(" name[] "," kcal[INTEGER]?")";
	
	Hauptbestandteil ::= "Hauptbestandteil" "(" name[] "," kcal[INTEGER]?")";
	
	Beilage ::= "Beilage" "(" name[] "," kcal[INTEGER]?")";
	
	Sauce ::= "Sauce" "(" name[] "," kcal[INTEGER]?")";
	
	Gericht ::= "Gericht" "{"
				"name" name[]
				"kommentar" kommentar['"','"']?
				"istSalat" istSalat["ja":"nein"]?
				"besteht aus" "{"zutaten+ "}"
				"}";
	
	Ernaehrungsplan ::= "eplan" "{"
						"person" "(" personen[] ")"
						"gerichte" "(" gerichte[] 
							       "," gerichte[]
							       "," gerichte[]
							       "," gerichte[]
							       "," gerichte[]
							       "," gerichte[]
							       "," gerichte[]+ ")"
						"}";
	
	Gericht2Zutat ::= "zutat" "("menge[INTEGER]"," zutat[] "," gericht[] ")";
	
}