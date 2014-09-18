grammar SQL;
options {
    backtrack=true;
    memoize=true;
    k=3;
}
@header {
package grmr;
}   
@lexer::header {package grmr;}

/*fragment A_ :	'a' | 'A';
fragment B_ :	'b' | 'B';
fragment C_ :	'c' | 'C';
fragment D_ :	'd' | 'D';
fragment E_ :	'e' | 'E';
fragment F_ :	'f' | 'F';
fragment G_ :	'g' | 'G';
fragment H_ :	'h' | 'H';
fragment I_ :	'i' | 'I';
fragment J_ :	'j' | 'J';
fragment K_ :	'k' | 'K';
fragment L_ :	'l' | 'L';
fragment M_ :	'm' | 'M';
fragment N_ :	'n' | 'N';
fragment O_ :	'o' | 'O';
fragment P_ :	'p' | 'P';
fragment Q_ :	'q' | 'Q';
fragment R_ :	'r' | 'R';
fragment S_ :	's' | 'S';
fragment T_ :	't' | 'T';
fragment U_ :	'u' | 'U';
fragment V_ :	'v' | 'V';
fragment W_ :	'w' | 'W';
fragment X_ :	'x' | 'X';
fragment Y_ :	'y' | 'Y';
fragment Z_ :	'z' | 'Z'; */

Query returns [QueryObj qObj]
	:sel=Select from=From  (Where)? ';' 
	{$qObj=new QueryObj(sel,from);}
	;   
Select returns [SelectObj sObj]
	:'select' (star='*'|list=ValueList)?
	 {$sObj=new SelectObj(star,list);}
	;

From returns [List<String> rList]
@init
    {
    	$vars = new ArrayList<String>();
    }
	: id1=ID{$list.add($id1.text);}(',' id2=ID {$list.add($id2.text);})*
	;
        
/*From returns [List<String> rList]
	:'from' $rList=ValueList 
	;*/
Where
	: 'where'
	;

ValueList returns [ List<String> list]
@init
    {
    	$vars = new ArrayList<String>();
    }
	: id1=ID{$list.add($id1.text);}(',' id2=ID {$list.add($id2.text);})*
	;
 
//ID : [a-z]+ ;     // match lower-case identifiers
ID:	
	( 'A'..'Z' | 'a'..'z' | '_' | '$') ( 'A'..'Z' | 'a'..'z' | '_' | '$' | '0'..'9' )*
;

//WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
WS	: ( ' '|'\r'|'\t'|'\n' ) {$channel=HIDDEN;} ;
