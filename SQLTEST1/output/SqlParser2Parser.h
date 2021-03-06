/** \file
 *  This C header file was generated by $ANTLR version 3.5
 *
 *     -  From the grammar source file : /Users/debu/Development/SQLTEST1/SqlParser2.g
 *     -                            On : 2013-04-29 17:05:48
 *     -                for the parser : SqlParser2ParserParser
 *
 * Editing it, at least manually, is not wise.
 *
 * C language generator and runtime by Jim Idle, jimi|hereisanat|idle|dotgoeshere|ws.
 *
 *
 * The parser 
SqlParser2Parser

has the callable functions (rules) shown below,
 * which will invoke the code for the associated rule in the source grammar
 * assuming that the input stream is pointing to a token/text stream that could begin
 * this rule.
 *
 * For instance if you call the first (topmost) rule in a parser grammar, you will
 * get the results of a full parse, but calling a rule half way through the grammar will
 * allow you to pass part of a full token stream to the parser, such as for syntax checking
 * in editors and so on.
 *
 * The parser entry points are called indirectly (by function pointer to function) via
 * a parser context typedef pSqlParser2Parser, which is returned from a call to SqlParser2ParserNew().
 *
 * The methods in pSqlParser2Parser are  as follows:
 *
 *  - 
 SqlParser2Parser_integer_types_return
      pSqlParser2Parser->integer_types(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_relational_op_return
      pSqlParser2Parser->relational_op(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_cast_data_type_return
      pSqlParser2Parser->cast_data_type(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_string_literal_return
      pSqlParser2Parser->string_literal(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_number_literal_return
      pSqlParser2Parser->number_literal(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_functionList_return
      pSqlParser2Parser->functionList(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_char_functions_return
      pSqlParser2Parser->char_functions(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_other_functions_return
      pSqlParser2Parser->other_functions(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_group_functions_return
      pSqlParser2Parser->group_functions(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_table_name_return
      pSqlParser2Parser->table_name(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_column_name_return
      pSqlParser2Parser->column_name(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_parser_name_return
      pSqlParser2Parser->parser_name(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_expression_return
      pSqlParser2Parser->expression(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_exp_factor1_return
      pSqlParser2Parser->exp_factor1(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_exp_factor2_return
      pSqlParser2Parser->exp_factor2(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_bool_primary_return
      pSqlParser2Parser->bool_primary(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_predicate_return
      pSqlParser2Parser->predicate(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_table_references_return
      pSqlParser2Parser->table_references(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_table_reference_return
      pSqlParser2Parser->table_reference(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_select_statement_return
      pSqlParser2Parser->select_statement(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_select_expression_return
      pSqlParser2Parser->select_expression(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_where_clause_return
      pSqlParser2Parser->where_clause(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_groupby_clause_return
      pSqlParser2Parser->groupby_clause(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_groupby_item_return
      pSqlParser2Parser->groupby_item(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_column_spec_return
      pSqlParser2Parser->column_spec(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_select_list_return
      pSqlParser2Parser->select_list(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_subquery_return
      pSqlParser2Parser->subquery(pSqlParser2Parser)
 *  - 
 SqlParser2Parser_expression_list_return
      pSqlParser2Parser->expression_list(pSqlParser2Parser)
 * 
 * 
 *
 * The return type for any particular rule is of course determined by the source
 * grammar file.
 */
// [The "BSD license"]
// Copyright (c) 2005-2009 Jim Idle, Temporal Wave LLC
// http://www.temporal-wave.com
// http://www.linkedin.com/in/jimidle
//
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions
// are met:
// 1. Redistributions of source code must retain the above copyright
//    notice, this list of conditions and the following disclaimer.
// 2. Redistributions in binary form must reproduce the above copyright
//    notice, this list of conditions and the following disclaimer in the
//    documentation and/or other materials provided with the distribution.
// 3. The name of the author may not be used to endorse or promote products
//    derived from this software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
// IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
// OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
// IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
// INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
// NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
// DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
// THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
// THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

#ifndef	_SqlParser2Parser_H
#define _SqlParser2Parser_H
/* =============================================================================
 * Standard antlr3 C runtime definitions
 */
#include    <antlr3.h>

/* End of standard antlr 3 runtime definitions
 * =============================================================================
 */

#ifdef __cplusplus
extern "C" {
#endif

// Forward declare the context typedef so that we can use it before it is
// properly defined. Delegators and delegates (from import statements) are
// interdependent and their context structures contain pointers to each other
// C only allows such things to be declared if you pre-declare the typedef.
//
typedef struct SqlParser2Parser_Ctx_struct SqlParser2Parser, * pSqlParser2Parser;



#ifdef	ANTLR3_WINDOWS
// Disable: Unreferenced parameter,							- Rules with parameters that are not used
//          constant conditional,							- ANTLR realizes that a prediction is always true (synpred usually)
//          initialized but unused variable					- tree rewrite variables declared but not needed
//          Unreferenced local variable						- lexer rule declares but does not always use _type
//          potentially unitialized variable used			- retval always returned from a rule
//			unreferenced local function has been removed	- susually getTokenNames or freeScope, they can go without warnigns
//
// These are only really displayed at warning level /W4 but that is the code ideal I am aiming at
// and the codegen must generate some of these warnings by necessity, apart from 4100, which is
// usually generated when a parser rule is given a parameter that it does not use. Mostly though
// this is a matter of orthogonality hence I disable that one.
//
#pragma warning( disable : 4100 )
#pragma warning( disable : 4101 )
#pragma warning( disable : 4127 )
#pragma warning( disable : 4189 )
#pragma warning( disable : 4505 )
#pragma warning( disable : 4701 )
#endif

/* ========================
 * BACKTRACKING IS ENABLED
 * ========================
 */

typedef struct SqlParser2Parser_integer_types_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_integer_types_return;



typedef struct SqlParser2Parser_relational_op_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_relational_op_return;



typedef struct SqlParser2Parser_cast_data_type_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_cast_data_type_return;



typedef struct SqlParser2Parser_string_literal_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_string_literal_return;



typedef struct SqlParser2Parser_number_literal_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_number_literal_return;



typedef struct SqlParser2Parser_functionList_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_functionList_return;



typedef struct SqlParser2Parser_char_functions_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_char_functions_return;



typedef struct SqlParser2Parser_other_functions_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_other_functions_return;



typedef struct SqlParser2Parser_group_functions_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_group_functions_return;



typedef struct SqlParser2Parser_table_name_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_table_name_return;



typedef struct SqlParser2Parser_column_name_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_column_name_return;



typedef struct SqlParser2Parser_parser_name_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_parser_name_return;



typedef struct SqlParser2Parser_expression_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_expression_return;



typedef struct SqlParser2Parser_exp_factor1_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_exp_factor1_return;



typedef struct SqlParser2Parser_exp_factor2_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_exp_factor2_return;



typedef struct SqlParser2Parser_bool_primary_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_bool_primary_return;



typedef struct SqlParser2Parser_predicate_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_predicate_return;



typedef struct SqlParser2Parser_table_references_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_table_references_return;



typedef struct SqlParser2Parser_table_reference_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_table_reference_return;



typedef struct SqlParser2Parser_select_statement_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_select_statement_return;



typedef struct SqlParser2Parser_select_expression_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_select_expression_return;



typedef struct SqlParser2Parser_where_clause_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_where_clause_return;



typedef struct SqlParser2Parser_groupby_clause_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_groupby_clause_return;



typedef struct SqlParser2Parser_groupby_item_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_groupby_item_return;



typedef struct SqlParser2Parser_column_spec_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_column_spec_return;



typedef struct SqlParser2Parser_select_list_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_select_list_return;



typedef struct SqlParser2Parser_subquery_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_subquery_return;



typedef struct SqlParser2Parser_expression_list_return_struct
{
    /** Generic return elements for ANTLR3 rules that are not in tree parsers or returning trees
     */
    pANTLR3_COMMON_TOKEN    start;
    pANTLR3_COMMON_TOKEN    stop;
    pANTLR3_BASE_TREE	tree;

}
    SqlParser2Parser_expression_list_return;




/** Context tracking structure for 
SqlParser2Parser

 */
struct SqlParser2Parser_Ctx_struct
{
    /** Built in ANTLR3 context tracker contains all the generic elements
     *  required for context tracking.
     */
    pANTLR3_PARSER   pParser;

     SqlParser2Parser_integer_types_return
     (*integer_types)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_relational_op_return
     (*relational_op)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_cast_data_type_return
     (*cast_data_type)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_string_literal_return
     (*string_literal)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_number_literal_return
     (*number_literal)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_functionList_return
     (*functionList)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_char_functions_return
     (*char_functions)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_other_functions_return
     (*other_functions)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_group_functions_return
     (*group_functions)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_table_name_return
     (*table_name)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_column_name_return
     (*column_name)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_parser_name_return
     (*parser_name)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_expression_return
     (*expression)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_exp_factor1_return
     (*exp_factor1)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_exp_factor2_return
     (*exp_factor2)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_bool_primary_return
     (*bool_primary)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_predicate_return
     (*predicate)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_table_references_return
     (*table_references)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_table_reference_return
     (*table_reference)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_select_statement_return
     (*select_statement)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_select_expression_return
     (*select_expression)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_where_clause_return
     (*where_clause)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_groupby_clause_return
     (*groupby_clause)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_groupby_item_return
     (*groupby_item)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_column_spec_return
     (*column_spec)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_select_list_return
     (*select_list)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_subquery_return
     (*subquery)	(struct SqlParser2Parser_Ctx_struct * ctx);

     SqlParser2Parser_expression_list_return
     (*expression_list)	(struct SqlParser2Parser_Ctx_struct * ctx);

     ANTLR3_BOOLEAN
     (*synpred21_SqlParser2)	(struct SqlParser2Parser_Ctx_struct * ctx);

     ANTLR3_BOOLEAN
     (*synpred24_SqlParser2)	(struct SqlParser2Parser_Ctx_struct * ctx);
    // Delegated rules

    const char * (*getGrammarFileName)();
    void            (*reset)  (struct SqlParser2Parser_Ctx_struct * ctx);
    void	    (*free)   (struct SqlParser2Parser_Ctx_struct * ctx);
/* @headerFile.members() */
pANTLR3_BASE_TREE_ADAPTOR	adaptor;
pANTLR3_VECTOR_FACTORY		vectors;
/* End @headerFile.members() */
};

// Function protoypes for the constructor functions that external translation units
// such as delegators and delegates may wish to call.
//
ANTLR3_API pSqlParser2Parser SqlParser2ParserNew         (
pANTLR3_COMMON_TOKEN_STREAM
 instream);
ANTLR3_API pSqlParser2Parser SqlParser2ParserNewSSD      (
pANTLR3_COMMON_TOKEN_STREAM
 instream, pANTLR3_RECOGNIZER_SHARED_STATE state);

/** Symbolic definitions of all the tokens that the 
parser
 will work with.
 * \{
 *
 * Antlr will define EOF, but we can't use that as it it is too common in
 * in C header files and that would be confusing. There is no way to filter this out at the moment
 * so we just undef it here for now. That isn't the value we get back from C recognizers
 * anyway. We are looking for ANTLR3_TOKEN_EOF.
 */
#ifdef	EOF
#undef	EOF
#endif
#ifdef	Tokens
#undef	Tokens
#endif
#define EOF      -1
#define T__79      79
#define T__80      80
#define T__81      81
#define ALL      4
#define AND_SYM      5
#define ANY      6
#define ASTERISK      7
#define AVG      8
#define A_      9
#define BY_SYM      10
#define B_      11
#define CHAR      12
#define COMMA      13
#define COUNT      14
#define C_      15
#define DISTINCT      16
#define DISTINCTROW      17
#define DOT      18
#define D_      19
#define EQ_SYM      20
#define EXISTS      21
#define E_      22
#define FOUND_ROWS      23
#define FROM      24
#define F_      25
#define GET      26
#define GROUP_SYM      27
#define GTH      28
#define G_      29
#define H_      30
#define ID      31
#define INTEGER_NUM      32
#define INTEGER_SYM      33
#define I_      34
#define J_      35
#define K_      36
#define LET      37
#define LOAD_FILE      38
#define LPAREN      39
#define LTH      40
#define L_      41
#define MAKE_SET      42
#define MAX_SYM      43
#define MINUS      44
#define MIN_SYM      45
#define M_      46
#define NOT_EQ      47
#define N_      48
#define OR_SYM      49
#define O_      50
#define PLUS      51
#define P_      52
#define Q_      53
#define REAL_NUMBER      54
#define RPAREN      55
#define R_      56
#define SELECT      57
#define SEMI      58
#define SQL_BIG_RESULT      59
#define SQL_BUFFER_RESULT      60
#define SQL_CACHE_SYM      61
#define SQL_CALC_FOUND_ROWS      62
#define SQL_NO_CACHE_SYM      63
#define SQL_SMALL_RESULT      64
#define STRAIGHT_JOIN      65
#define SUM      66
#define S_      67
#define TEXT_STRING      68
#define T_      69
#define UNION_SYM      70
#define U_      71
#define V_      72
#define WHERE      73
#define WHITE_SPACE      74
#define W_      75
#define X_      76
#define Y_      77
#define Z_      78
#ifdef	EOF
#undef	EOF
#define	EOF	ANTLR3_TOKEN_EOF
#endif

#ifndef TOKENSOURCE
#define TOKENSOURCE(lxr) lxr->pLexer->rec->state->tokSource
#endif

/* End of token definitions for SqlParser2Parser
 * =============================================================================
 */
/** } */

#ifdef __cplusplus
}
#endif

#endif

/* END - Note:Keep extra line feed to satisfy UNIX systems */
