grammar Parser1;

options 
{
	language=C;
	output=AST;
	backtrack=true;
}

tokens 
{
    SELECT='select';
    FROM='from';
    WHERE='where';
    AND='and';
    COUNT='count';
    SUM='sum';
    MAX='max';
    MIN='min';
    AVG='avg';
    GROUP='group';
    BY='by';
    FILE='file';
    DATA='data';
    METADATA='metadata';
    COL='col';
}

command
    :    sentence (NEWLINE sentence)* NEWLINE? EOF
    |
    ;
    
    //EOF = semi colon (;)??
    
 sentence
    :    WS? verb WS (object)* WS preposition WS (target)* WS?
    ;

verb
    :    SELECT
    |    GROUP
         COUNT
         SUM
         MAX
         MIN
         AVG
    ;
 
object
    :    DATA   
         METADATA
         COL
    ;
 
preposition
    :    FROM
    |    WHERE
    |    AND
    |    BY
    ;
 
target
    :    FILE
    ;
    
FILE
    : 'A'|'B'|'C'
    ;
    
    
NEWLINE
    : '\r'? '\n'
    ;
    
 
WS
    : (' '|'\t'|'\n'|'\r')+ {skip();}
    ;
    
