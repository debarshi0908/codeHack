lexer grammar InternalMapRedoop;
@header {
package cs.ua.edu.se.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : '{' ;
T13 : '}' ;
T14 : 'program' ;
T15 : 'extend' ;
T16 : 'map(' ;
T17 : ',' ;
T18 : ')' ;
T19 : 'reduce(' ;
T20 : 'metaelement' ;
T21 : ';' ;
T22 : 'read' ;
T23 : 'write' ;
T24 : 'int' ;
T25 : 'float' ;
T26 : 'double' ;
T27 : 'text' ;
T28 : 'long' ;
T29 : '*' ;

// $ANTLR src "../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g" 2723
RULE_BLOCK : '[' ( options {greedy=false;} : . )*']';

// $ANTLR src "../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g" 2725
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g" 2727
RULE_INT : ('0'..'9')+;

// $ANTLR src "../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g" 2729
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g" 2731
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g" 2733
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g" 2735
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g" 2737
RULE_ANY_OTHER : .;


