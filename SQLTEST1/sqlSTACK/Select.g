grammar Select;

options {
  output=AST;
  tokenVocab=Select;
  ASTLabelType=CommonTree;
}

@header {
  import java.util.List;
  import java.util.Map;
  import java.util.Set;
}

@members {

  private Map<String, List<B>> dataPool;

  public SelectWalker(CommonTreeNodeStream nodes, Map<String, List<B>> data) {
    super(nodes);
    dataPool = data;
  }
}

tokens {
  // imaginary tokens
  ROOT;
  ATTR_LIST;
  UNARY_MINUS;

  // literal tokens
  Eq     = '=';
  NEq    = '!=';
  LT     = '<';
  LTEq   = '<=';
  GT     = '>';
  GTEq   = '>=';
  Minus  = '-';
  Not    = '!';
  Select = 'select';
  From   = 'from';
  Where  = 'where';
  And    = 'AND';
  Or     = 'OR';
}

parse
 : select_stat EOF -> ^(ROOT select_stat)
 ;

/*select_stat
 : Select attr_list From Id where_stat ';' -> ^(Select attr_list Id where_stat)
 ;*/

/*attr_list
 : Id (',' Id)* -> ^(ATTR_LIST Id+)
 ;*/

where_stat
 : Where expr -> expr
 |            -> ^(Eq Int["1"] Int["1"]) 
                 // no 'where', insert '1=1' which is always true
 ;

/*expr
 : or_expr
 ;*/

or_expr
 : and_expr (Or^ and_expr)*
 ;

and_expr
 : eq_expr (And^ eq_expr)*
 ;

eq_expr
 : rel_expr ((Eq | NEq)^ rel_expr)*
 ;

rel_expr
 : unary_expr ((LT | LTEq | GT | GTEq)^ unary_expr)?
 ;

unary_expr
 : Minus atom -> ^(UNARY_MINUS atom)
 | Not atom   -> ^(Not atom)
 | atom
 ;

atom
 : Str
 | Int
 | Id
 | '(' expr ')' -> expr
 ;

Id    : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | Digit)*;
Str   : '\'' ('\'\'' | ~('\'' | '\r' | '\n'))* '\'' 
        {
         // strip the surrounding quotes and replace '' with '
         setText($text.substring(1, $text.length() - 1).replace("''", "'"));
        }
      ;
Int   : Digit+;
Space : (' ' | '\t' | '\r' | '\n') {skip();};

fragment Digit : '0'..'9';

query returns [List<List<Object>> result]
 : ^(ROOT select_stat) {$result = (List<List<Object>>)$select_stat.node.eval(null);}
 ;

select_stat returns [Node node]
 : ^(Select attr_list Id expr) 
    {$node = new SelectNode($attr_list.attributes, dataPool.get($Id.text), $expr.node);}
    |Select attr_list From Id where_stat ';' -> ^(Select attr_list Id where_stat)
 ;

attr_list returns [List<String> attributes]
@init{$attributes = new ArrayList<String>();}
 : ^(ATTR_LIST (Id {$attributes.add($Id.text);})+)
    Id (',' Id)* -> ^(ATTR_LIST Id+)
 ;

expr returns [Node node]
 : or_expr |
   ^(Or a=expr b=expr)   {$node = null; /* TODO */}
 | ^(And a=expr b=expr)  {$node = new AndNode($a.node, $b.node);}
 | ^(Eq a=expr b=expr)   {$node = new EqNode($a.node, $b.node);}
 | ^(NEq a=expr b=expr)  {$node = new NEqNode($a.node, $b.node);}
 | ^(LT a=expr b=expr)   {$node = null; /* TODO */}
 | ^(LTEq a=expr b=expr) {$node = null; /* TODO */}
 | ^(GT a=expr b=expr)   {$node = new GTNode($a.node, $b.node);}
 | ^(GTEq a=expr b=expr) {$node = null; /* TODO */}
 | ^(UNARY_MINUS a=expr) {$node = null; /* TODO */}
 | ^(Not a=expr)         {$node = null; /* TODO */}
 | Str                   {$node = new AtomNode($Str.text);}
 | Int                   {$node = new AtomNode(Integer.valueOf($Int.text));}
 | Id                    {$node = new IdNode($Id.text);}
 ;

