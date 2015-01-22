SYNTAXDEF Ernaehrungsplan
FOR <http://www.emftext.org/language/Ernaehrungsplan>
START EntityModel


OPTIONS {
	reloadGeneratorModel = "true";
}


RULES {
	EntityModel ::= "model" types*;
	Entity ::= abstract["abstract" : ""] "entity" name[] "{" features* "}";
	DataType ::= "datatype" name[] ";";
	Feature ::= kind[attribute:"att", reference:"ref", containment:"cont"] type[] name[] ";";
}