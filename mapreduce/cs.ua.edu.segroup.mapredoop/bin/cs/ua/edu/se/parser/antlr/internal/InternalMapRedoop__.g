lexer grammar InternalMapRedoop;
@header {
package cs.ua.edu.se.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : '{' ;
T13 : '}' ;
T14 : 'program' ;
T15 : 'extend' ;
T16 : 'map(' ;
T17 : ',' ;
T18 : ')' ;
T19 : 'reduce(' ;
T20 : 'int' ;
T21 : 'float' ;
T22 : 'double' ;
T23 : 'text' ;
T24 : 'long' ;
T25 : 'metaelement' ;
T26 : ';' ;
T27 : 'read' ;
T28 : 'write' ;
T29 : '*' ;

// $ANTLR src "../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g" 1239
RULE_BLOCK : '[' ( options {greedy=false;} : . )*']';

// $ANTLR src "../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g" 1241
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g" 1243
RULE_INT : ('0'..'9')+;

// $ANTLR src "../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g" 1245
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g" 1247
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g" 1249
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g" 1251
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g" 1253
RULE_ANY_OTHER : .;


