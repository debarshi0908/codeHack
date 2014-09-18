// $ANTLR 3.5 /Users/debu/Development/SQLTEST1/SqlParser2.g 2013-04-29 17:08:23

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class SqlParser2Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALL", "AND_SYM", "ANY", "ASTERISK", 
		"AVG", "A_", "BY_SYM", "B_", "CHAR", "COMMA", "COUNT", "C_", "DISTINCT", 
		"DISTINCTROW", "DOT", "D_", "EQ_SYM", "EXISTS", "E_", "FOUND_ROWS", "FROM", 
		"F_", "GET", "GROUP_SYM", "GTH", "G_", "H_", "ID", "INTEGER_NUM", "INTEGER_SYM", 
		"I_", "J_", "K_", "LET", "LOAD_FILE", "LPAREN", "LTH", "L_", "MAKE_SET", 
		"MAX_SYM", "MINUS", "MIN_SYM", "M_", "NOT_EQ", "N_", "OR_SYM", "O_", "PLUS", 
		"P_", "Q_", "REAL_NUMBER", "RPAREN", "R_", "SELECT", "SEMI", "SQL_BIG_RESULT", 
		"SQL_BUFFER_RESULT", "SQL_CACHE_SYM", "SQL_CALC_FOUND_ROWS", "SQL_NO_CACHE_SYM", 
		"SQL_SMALL_RESULT", "STRAIGHT_JOIN", "SUM", "S_", "TEXT_STRING", "T_", 
		"UNION_SYM", "U_", "V_", "WHERE", "WHITE_SPACE", "W_", "X_", "Y_", "Z_", 
		"'A'", "'B'", "'C'"
	};
	public static final int EOF=-1;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int ALL=4;
	public static final int AND_SYM=5;
	public static final int ANY=6;
	public static final int ASTERISK=7;
	public static final int AVG=8;
	public static final int A_=9;
	public static final int BY_SYM=10;
	public static final int B_=11;
	public static final int CHAR=12;
	public static final int COMMA=13;
	public static final int COUNT=14;
	public static final int C_=15;
	public static final int DISTINCT=16;
	public static final int DISTINCTROW=17;
	public static final int DOT=18;
	public static final int D_=19;
	public static final int EQ_SYM=20;
	public static final int EXISTS=21;
	public static final int E_=22;
	public static final int FOUND_ROWS=23;
	public static final int FROM=24;
	public static final int F_=25;
	public static final int GET=26;
	public static final int GROUP_SYM=27;
	public static final int GTH=28;
	public static final int G_=29;
	public static final int H_=30;
	public static final int ID=31;
	public static final int INTEGER_NUM=32;
	public static final int INTEGER_SYM=33;
	public static final int I_=34;
	public static final int J_=35;
	public static final int K_=36;
	public static final int LET=37;
	public static final int LOAD_FILE=38;
	public static final int LPAREN=39;
	public static final int LTH=40;
	public static final int L_=41;
	public static final int MAKE_SET=42;
	public static final int MAX_SYM=43;
	public static final int MINUS=44;
	public static final int MIN_SYM=45;
	public static final int M_=46;
	public static final int NOT_EQ=47;
	public static final int N_=48;
	public static final int OR_SYM=49;
	public static final int O_=50;
	public static final int PLUS=51;
	public static final int P_=52;
	public static final int Q_=53;
	public static final int REAL_NUMBER=54;
	public static final int RPAREN=55;
	public static final int R_=56;
	public static final int SELECT=57;
	public static final int SEMI=58;
	public static final int SQL_BIG_RESULT=59;
	public static final int SQL_BUFFER_RESULT=60;
	public static final int SQL_CACHE_SYM=61;
	public static final int SQL_CALC_FOUND_ROWS=62;
	public static final int SQL_NO_CACHE_SYM=63;
	public static final int SQL_SMALL_RESULT=64;
	public static final int STRAIGHT_JOIN=65;
	public static final int SUM=66;
	public static final int S_=67;
	public static final int TEXT_STRING=68;
	public static final int T_=69;
	public static final int UNION_SYM=70;
	public static final int U_=71;
	public static final int V_=72;
	public static final int WHERE=73;
	public static final int WHITE_SPACE=74;
	public static final int W_=75;
	public static final int X_=76;
	public static final int Y_=77;
	public static final int Z_=78;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public SqlParser2Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public SqlParser2Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return SqlParser2Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/debu/Development/SQLTEST1/SqlParser2.g"; }


	public static class integer_types_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "integer_types"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:112:1: integer_types : ( INTEGER_SYM |);
	public final SqlParser2Parser.integer_types_return integer_types() throws RecognitionException {
		SqlParser2Parser.integer_types_return retval = new SqlParser2Parser.integer_types_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTEGER_SYM1=null;

		Object INTEGER_SYM1_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:112:14: ( INTEGER_SYM |)
			int alt1=2;
			switch ( input.LA(1) ) {
			case INTEGER_SYM:
				{
				alt1=1;
				}
				break;
			case EOF:
				{
				alt1=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:113:2: INTEGER_SYM
					{
					root_0 = (Object)adaptor.nil();


					INTEGER_SYM1=(Token)match(input,INTEGER_SYM,FOLLOW_INTEGER_SYM_in_integer_types1549); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTEGER_SYM1_tree = (Object)adaptor.create(INTEGER_SYM1);
					adaptor.addChild(root_0, INTEGER_SYM1_tree);
					}

					}
					break;
				case 2 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:113:16: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "integer_types"


	public static class relational_op_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relational_op"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:117:1: relational_op : ( EQ_SYM | LTH | GTH | NOT_EQ | LET | GET );
	public final SqlParser2Parser.relational_op_return relational_op() throws RecognitionException {
		SqlParser2Parser.relational_op_return retval = new SqlParser2Parser.relational_op_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set2=null;

		Object set2_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:117:14: ( EQ_SYM | LTH | GTH | NOT_EQ | LET | GET )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			root_0 = (Object)adaptor.nil();


			set2=input.LT(1);
			if ( input.LA(1)==EQ_SYM||input.LA(1)==GET||input.LA(1)==GTH||input.LA(1)==LET||input.LA(1)==LTH||input.LA(1)==NOT_EQ ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set2));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relational_op"


	public static class cast_data_type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "cast_data_type"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:120:1: cast_data_type : (| CHAR ( INTEGER_NUM )? );
	public final SqlParser2Parser.cast_data_type_return cast_data_type() throws RecognitionException {
		SqlParser2Parser.cast_data_type_return retval = new SqlParser2Parser.cast_data_type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CHAR3=null;
		Token INTEGER_NUM4=null;

		Object CHAR3_tree=null;
		Object INTEGER_NUM4_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:120:15: (| CHAR ( INTEGER_NUM )? )
			int alt3=2;
			switch ( input.LA(1) ) {
			case EOF:
				{
				alt3=1;
				}
				break;
			case CHAR:
				{
				alt3=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:121:2: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;
				case 2 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:121:4: CHAR ( INTEGER_NUM )?
					{
					root_0 = (Object)adaptor.nil();


					CHAR3=(Token)match(input,CHAR,FOLLOW_CHAR_in_cast_data_type1598); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHAR3_tree = (Object)adaptor.create(CHAR3);
					adaptor.addChild(root_0, CHAR3_tree);
					}

					// /Users/debu/Development/SQLTEST1/SqlParser2.g:121:9: ( INTEGER_NUM )?
					int alt2=2;
					switch ( input.LA(1) ) {
						case INTEGER_NUM:
							{
							alt2=1;
							}
							break;
					}
					switch (alt2) {
						case 1 :
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:121:10: INTEGER_NUM
							{
							INTEGER_NUM4=(Token)match(input,INTEGER_NUM,FOLLOW_INTEGER_NUM_in_cast_data_type1601); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							INTEGER_NUM4_tree = (Object)adaptor.create(INTEGER_NUM4);
							adaptor.addChild(root_0, INTEGER_NUM4_tree);
							}

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cast_data_type"


	public static class string_literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "string_literal"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:125:1: string_literal : TEXT_STRING ;
	public final SqlParser2Parser.string_literal_return string_literal() throws RecognitionException {
		SqlParser2Parser.string_literal_return retval = new SqlParser2Parser.string_literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TEXT_STRING5=null;

		Object TEXT_STRING5_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:125:15: ( TEXT_STRING )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:125:18: TEXT_STRING
			{
			root_0 = (Object)adaptor.nil();


			TEXT_STRING5=(Token)match(input,TEXT_STRING,FOLLOW_TEXT_STRING_in_string_literal1613); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			TEXT_STRING5_tree = (Object)adaptor.create(TEXT_STRING5);
			adaptor.addChild(root_0, TEXT_STRING5_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "string_literal"


	public static class number_literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "number_literal"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:126:1: number_literal : ( PLUS | MINUS )? ( INTEGER_NUM | REAL_NUMBER ) ;
	public final SqlParser2Parser.number_literal_return number_literal() throws RecognitionException {
		SqlParser2Parser.number_literal_return retval = new SqlParser2Parser.number_literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set6=null;
		Token set7=null;

		Object set6_tree=null;
		Object set7_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:126:15: ( ( PLUS | MINUS )? ( INTEGER_NUM | REAL_NUMBER ) )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:126:18: ( PLUS | MINUS )? ( INTEGER_NUM | REAL_NUMBER )
			{
			root_0 = (Object)adaptor.nil();


			// /Users/debu/Development/SQLTEST1/SqlParser2.g:126:18: ( PLUS | MINUS )?
			int alt4=2;
			switch ( input.LA(1) ) {
				case MINUS:
				case PLUS:
					{
					alt4=1;
					}
					break;
			}
			switch (alt4) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:
					{
					set6=input.LT(1);
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set6));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			set7=input.LT(1);
			if ( input.LA(1)==INTEGER_NUM||input.LA(1)==REAL_NUMBER ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set7));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "number_literal"


	public static class functionList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionList"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:129:1: functionList : char_functions other_functions ;
	public final SqlParser2Parser.functionList_return functionList() throws RecognitionException {
		SqlParser2Parser.functionList_return retval = new SqlParser2Parser.functionList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope char_functions8 =null;
		ParserRuleReturnScope other_functions9 =null;


		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:129:13: ( char_functions other_functions )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:130:4: char_functions other_functions
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_char_functions_in_functionList1648);
			char_functions8=char_functions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, char_functions8.getTree());

			pushFollow(FOLLOW_other_functions_in_functionList1653);
			other_functions9=other_functions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, other_functions9.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionList"


	public static class char_functions_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "char_functions"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:134:1: char_functions : ( MAKE_SET | LOAD_FILE );
	public final SqlParser2Parser.char_functions_return char_functions() throws RecognitionException {
		SqlParser2Parser.char_functions_return retval = new SqlParser2Parser.char_functions_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set10=null;

		Object set10_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:135:2: ( MAKE_SET | LOAD_FILE )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			root_0 = (Object)adaptor.nil();


			set10=input.LT(1);
			if ( input.LA(1)==LOAD_FILE||input.LA(1)==MAKE_SET ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set10));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "char_functions"


	public static class other_functions_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "other_functions"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:138:1: other_functions : ( MAKE_SET | LOAD_FILE | FOUND_ROWS );
	public final SqlParser2Parser.other_functions_return other_functions() throws RecognitionException {
		SqlParser2Parser.other_functions_return retval = new SqlParser2Parser.other_functions_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set11=null;

		Object set11_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:138:16: ( MAKE_SET | LOAD_FILE | FOUND_ROWS )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			root_0 = (Object)adaptor.nil();


			set11=input.LT(1);
			if ( input.LA(1)==FOUND_ROWS||input.LA(1)==LOAD_FILE||input.LA(1)==MAKE_SET ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set11));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "other_functions"


	public static class group_functions_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "group_functions"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:142:1: group_functions : ( AVG | COUNT | MAX_SYM | MIN_SYM | SUM );
	public final SqlParser2Parser.group_functions_return group_functions() throws RecognitionException {
		SqlParser2Parser.group_functions_return retval = new SqlParser2Parser.group_functions_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set12=null;

		Object set12_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:142:16: ( AVG | COUNT | MAX_SYM | MIN_SYM | SUM )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			root_0 = (Object)adaptor.nil();


			set12=input.LT(1);
			if ( input.LA(1)==AVG||input.LA(1)==COUNT||input.LA(1)==MAX_SYM||input.LA(1)==MIN_SYM||input.LA(1)==SUM ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set12));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "group_functions"


	public static class table_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "table_name"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:147:1: table_name : tmpName= ID {...}?;
	public final SqlParser2Parser.table_name_return table_name() throws RecognitionException {
		SqlParser2Parser.table_name_return retval = new SqlParser2Parser.table_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token tmpName=null;

		Object tmpName_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:147:12: (tmpName= ID {...}?)
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:147:14: tmpName= ID {...}?
			{
			root_0 = (Object)adaptor.nil();


			tmpName=(Token)match(input,ID,FOLLOW_ID_in_table_name1722); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			tmpName_tree = (Object)adaptor.create(tmpName);
			adaptor.addChild(root_0, tmpName_tree);
			}

			if ( !((strlen((const char *)(tmpName!=null?tmpName.getText():null)->chars) <= 64)) ) {
				if (state.backtracking>0) {state.failed=true; return retval;}
				throw new FailedPredicateException(input, "table_name", "strlen((const char *)$tmpName.text->chars) <= 64");
			}
			if ( state.backtracking==0 ) {printf("table name = %s \n",(char*)((tmpName!=null?tmpName.getText():null)->chars));}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "table_name"


	public static class column_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "column_name"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:148:1: column_name : tmpName= ID {...}?;
	public final SqlParser2Parser.column_name_return column_name() throws RecognitionException {
		SqlParser2Parser.column_name_return retval = new SqlParser2Parser.column_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token tmpName=null;

		Object tmpName_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:148:13: (tmpName= ID {...}?)
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:148:15: tmpName= ID {...}?
			{
			root_0 = (Object)adaptor.nil();


			tmpName=(Token)match(input,ID,FOLLOW_ID_in_column_name1735); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			tmpName_tree = (Object)adaptor.create(tmpName);
			adaptor.addChild(root_0, tmpName_tree);
			}

			if ( !((strlen((const char *)(tmpName!=null?tmpName.getText():null)->chars) <= 64)) ) {
				if (state.backtracking>0) {state.failed=true; return retval;}
				throw new FailedPredicateException(input, "column_name", "strlen((const char *)$tmpName.text->chars) <= 64");
			}
			if ( state.backtracking==0 ) {printf("column name = %s \n",(char*)((tmpName!=null?tmpName.getText():null)->chars));}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "column_name"


	public static class parser_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "parser_name"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:149:1: parser_name : tmpName= ID {...}?;
	public final SqlParser2Parser.parser_name_return parser_name() throws RecognitionException {
		SqlParser2Parser.parser_name_return retval = new SqlParser2Parser.parser_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token tmpName=null;

		Object tmpName_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:149:13: (tmpName= ID {...}?)
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:149:15: tmpName= ID {...}?
			{
			root_0 = (Object)adaptor.nil();


			tmpName=(Token)match(input,ID,FOLLOW_ID_in_parser_name1748); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			tmpName_tree = (Object)adaptor.create(tmpName);
			adaptor.addChild(root_0, tmpName_tree);
			}

			if ( !((strlen((const char *)(tmpName!=null?tmpName.getText():null)->chars) <= 64)) ) {
				if (state.backtracking>0) {state.failed=true; return retval;}
				throw new FailedPredicateException(input, "parser_name", "strlen((const char *)$tmpName.text->chars) <= 64");
			}
			if ( state.backtracking==0 ) {printf("index name = %s \n",(char*)((tmpName!=null?tmpName.getText():null)->chars));}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parser_name"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:154:1: expression : exp_factor1 ( OR_SYM exp_factor1 )* ;
	public final SqlParser2Parser.expression_return expression() throws RecognitionException {
		SqlParser2Parser.expression_return retval = new SqlParser2Parser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR_SYM14=null;
		ParserRuleReturnScope exp_factor113 =null;
		ParserRuleReturnScope exp_factor115 =null;

		Object OR_SYM14_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:154:11: ( exp_factor1 ( OR_SYM exp_factor1 )* )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:154:13: exp_factor1 ( OR_SYM exp_factor1 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_exp_factor1_in_expression1762);
			exp_factor113=exp_factor1();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, exp_factor113.getTree());

			// /Users/debu/Development/SQLTEST1/SqlParser2.g:154:25: ( OR_SYM exp_factor1 )*
			loop5:
			while (true) {
				int alt5=2;
				switch ( input.LA(1) ) {
				case OR_SYM:
					{
					alt5=1;
					}
					break;
				}
				switch (alt5) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:154:27: OR_SYM exp_factor1
					{
					OR_SYM14=(Token)match(input,OR_SYM,FOLLOW_OR_SYM_in_expression1766); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR_SYM14_tree = (Object)adaptor.create(OR_SYM14);
					adaptor.addChild(root_0, OR_SYM14_tree);
					}

					pushFollow(FOLLOW_exp_factor1_in_expression1768);
					exp_factor115=exp_factor1();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exp_factor115.getTree());

					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class exp_factor1_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exp_factor1"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:155:1: exp_factor1 : exp_factor2 ( AND_SYM exp_factor2 )* ;
	public final SqlParser2Parser.exp_factor1_return exp_factor1() throws RecognitionException {
		SqlParser2Parser.exp_factor1_return retval = new SqlParser2Parser.exp_factor1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND_SYM17=null;
		ParserRuleReturnScope exp_factor216 =null;
		ParserRuleReturnScope exp_factor218 =null;

		Object AND_SYM17_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:155:12: ( exp_factor2 ( AND_SYM exp_factor2 )* )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:155:14: exp_factor2 ( AND_SYM exp_factor2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_exp_factor2_in_exp_factor11778);
			exp_factor216=exp_factor2();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, exp_factor216.getTree());

			// /Users/debu/Development/SQLTEST1/SqlParser2.g:155:26: ( AND_SYM exp_factor2 )*
			loop6:
			while (true) {
				int alt6=2;
				switch ( input.LA(1) ) {
				case AND_SYM:
					{
					alt6=1;
					}
					break;
				}
				switch (alt6) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:155:28: AND_SYM exp_factor2
					{
					AND_SYM17=(Token)match(input,AND_SYM,FOLLOW_AND_SYM_in_exp_factor11782); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND_SYM17_tree = (Object)adaptor.create(AND_SYM17);
					adaptor.addChild(root_0, AND_SYM17_tree);
					}

					pushFollow(FOLLOW_exp_factor2_in_exp_factor11784);
					exp_factor218=exp_factor2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exp_factor218.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exp_factor1"


	public static class exp_factor2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exp_factor2"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:156:1: exp_factor2 : bool_primary ;
	public final SqlParser2Parser.exp_factor2_return exp_factor2() throws RecognitionException {
		SqlParser2Parser.exp_factor2_return retval = new SqlParser2Parser.exp_factor2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope bool_primary19 =null;


		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:156:12: ( bool_primary )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:156:14: bool_primary
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_bool_primary_in_exp_factor21794);
			bool_primary19=bool_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_primary19.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exp_factor2"


	public static class bool_primary_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bool_primary"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:158:1: bool_primary : ( ( predicate relational_op predicate ) | ( predicate relational_op ( ALL | ANY )? subquery ) | ( EXISTS subquery ) | predicate );
	public final SqlParser2Parser.bool_primary_return bool_primary() throws RecognitionException {
		SqlParser2Parser.bool_primary_return retval = new SqlParser2Parser.bool_primary_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set25=null;
		Token EXISTS27=null;
		ParserRuleReturnScope predicate20 =null;
		ParserRuleReturnScope relational_op21 =null;
		ParserRuleReturnScope predicate22 =null;
		ParserRuleReturnScope predicate23 =null;
		ParserRuleReturnScope relational_op24 =null;
		ParserRuleReturnScope subquery26 =null;
		ParserRuleReturnScope subquery28 =null;
		ParserRuleReturnScope predicate29 =null;

		Object set25_tree=null;
		Object EXISTS27_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:158:13: ( ( predicate relational_op predicate ) | ( predicate relational_op ( ALL | ANY )? subquery ) | ( EXISTS subquery ) | predicate )
			int alt8=4;
			switch ( input.LA(1) ) {
			case LPAREN:
				{
				int LA8_1 = input.LA(2);
				if ( (synpred21_SqlParser2()) ) {
					alt8=1;
				}
				else if ( (synpred24_SqlParser2()) ) {
					alt8=2;
				}
				else if ( (true) ) {
					alt8=4;
				}

				}
				break;
			case EXISTS:
				{
				alt8=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:159:4: ( predicate relational_op predicate )
					{
					root_0 = (Object)adaptor.nil();


					// /Users/debu/Development/SQLTEST1/SqlParser2.g:159:4: ( predicate relational_op predicate )
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:159:6: predicate relational_op predicate
					{
					pushFollow(FOLLOW_predicate_in_bool_primary1807);
					predicate20=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate20.getTree());

					pushFollow(FOLLOW_relational_op_in_bool_primary1809);
					relational_op21=relational_op();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_op21.getTree());

					pushFollow(FOLLOW_predicate_in_bool_primary1811);
					predicate22=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate22.getTree());

					}

					}
					break;
				case 2 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:160:4: ( predicate relational_op ( ALL | ANY )? subquery )
					{
					root_0 = (Object)adaptor.nil();


					// /Users/debu/Development/SQLTEST1/SqlParser2.g:160:4: ( predicate relational_op ( ALL | ANY )? subquery )
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:160:6: predicate relational_op ( ALL | ANY )? subquery
					{
					pushFollow(FOLLOW_predicate_in_bool_primary1821);
					predicate23=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate23.getTree());

					pushFollow(FOLLOW_relational_op_in_bool_primary1823);
					relational_op24=relational_op();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_op24.getTree());

					// /Users/debu/Development/SQLTEST1/SqlParser2.g:160:30: ( ALL | ANY )?
					int alt7=2;
					switch ( input.LA(1) ) {
						case ALL:
						case ANY:
							{
							alt7=1;
							}
							break;
					}
					switch (alt7) {
						case 1 :
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:
							{
							set25=input.LT(1);
							if ( input.LA(1)==ALL||input.LA(1)==ANY ) {
								input.consume();
								if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set25));
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					pushFollow(FOLLOW_subquery_in_bool_primary1836);
					subquery26=subquery();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery26.getTree());

					}

					}
					break;
				case 3 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:161:4: ( EXISTS subquery )
					{
					root_0 = (Object)adaptor.nil();


					// /Users/debu/Development/SQLTEST1/SqlParser2.g:161:4: ( EXISTS subquery )
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:161:6: EXISTS subquery
					{
					EXISTS27=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_bool_primary1845); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EXISTS27_tree = (Object)adaptor.create(EXISTS27);
					adaptor.addChild(root_0, EXISTS27_tree);
					}

					pushFollow(FOLLOW_subquery_in_bool_primary1847);
					subquery28=subquery();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery28.getTree());

					}

					}
					break;
				case 4 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:162:4: predicate
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_predicate_in_bool_primary1854);
					predicate29=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate29.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bool_primary"


	public static class predicate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "predicate"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:165:1: predicate : ( subquery | expression_list ) ;
	public final SqlParser2Parser.predicate_return predicate() throws RecognitionException {
		SqlParser2Parser.predicate_return retval = new SqlParser2Parser.predicate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope subquery30 =null;
		ParserRuleReturnScope expression_list31 =null;


		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:165:10: ( ( subquery | expression_list ) )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:166:4: ( subquery | expression_list )
			{
			root_0 = (Object)adaptor.nil();


			// /Users/debu/Development/SQLTEST1/SqlParser2.g:166:4: ( subquery | expression_list )
			int alt9=2;
			switch ( input.LA(1) ) {
			case LPAREN:
				{
				switch ( input.LA(2) ) {
				case SELECT:
					{
					alt9=1;
					}
					break;
				case EXISTS:
				case LPAREN:
					{
					alt9=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:166:5: subquery
					{
					pushFollow(FOLLOW_subquery_in_predicate1867);
					subquery30=subquery();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery30.getTree());

					}
					break;
				case 2 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:166:16: expression_list
					{
					pushFollow(FOLLOW_expression_list_in_predicate1871);
					expression_list31=expression_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_list31.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "predicate"


	public static class table_references_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "table_references"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:171:1: table_references : table_reference ( COMMA table_reference )* ;
	public final SqlParser2Parser.table_references_return table_references() throws RecognitionException {
		SqlParser2Parser.table_references_return retval = new SqlParser2Parser.table_references_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA33=null;
		ParserRuleReturnScope table_reference32 =null;
		ParserRuleReturnScope table_reference34 =null;

		Object COMMA33_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:171:17: ( table_reference ( COMMA table_reference )* )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:172:9: table_reference ( COMMA table_reference )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_table_reference_in_table_references1891);
			table_reference32=table_reference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, table_reference32.getTree());

			// /Users/debu/Development/SQLTEST1/SqlParser2.g:172:25: ( COMMA table_reference )*
			loop10:
			while (true) {
				int alt10=2;
				switch ( input.LA(1) ) {
				case COMMA:
					{
					alt10=1;
					}
					break;
				}
				switch (alt10) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:172:27: COMMA table_reference
					{
					COMMA33=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_references1895); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA33_tree = (Object)adaptor.create(COMMA33);
					adaptor.addChild(root_0, COMMA33_tree);
					}

					pushFollow(FOLLOW_table_reference_in_table_references1897);
					table_reference34=table_reference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, table_reference34.getTree());

					}
					break;

				default :
					break loop10;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "table_references"


	public static class table_reference_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "table_reference"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:174:1: table_reference : ( 'A' | 'B' | 'C' );
	public final SqlParser2Parser.table_reference_return table_reference() throws RecognitionException {
		SqlParser2Parser.table_reference_return retval = new SqlParser2Parser.table_reference_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set35=null;

		Object set35_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:174:16: ( 'A' | 'B' | 'C' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			root_0 = (Object)adaptor.nil();


			set35=input.LT(1);
			if ( (input.LA(1) >= 79 && input.LA(1) <= 81) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set35));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "table_reference"


	public static class select_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "select_statement"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:177:1: select_statement : select_expression ( ( UNION_SYM ( ALL )? ) select_expression )* ;
	public final SqlParser2Parser.select_statement_return select_statement() throws RecognitionException {
		SqlParser2Parser.select_statement_return retval = new SqlParser2Parser.select_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token UNION_SYM37=null;
		Token ALL38=null;
		ParserRuleReturnScope select_expression36 =null;
		ParserRuleReturnScope select_expression39 =null;

		Object UNION_SYM37_tree=null;
		Object ALL38_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:177:17: ( select_expression ( ( UNION_SYM ( ALL )? ) select_expression )* )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:178:9: select_expression ( ( UNION_SYM ( ALL )? ) select_expression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_select_expression_in_select_statement1930);
			select_expression36=select_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, select_expression36.getTree());

			// /Users/debu/Development/SQLTEST1/SqlParser2.g:178:27: ( ( UNION_SYM ( ALL )? ) select_expression )*
			loop12:
			while (true) {
				int alt12=2;
				switch ( input.LA(1) ) {
				case UNION_SYM:
					{
					alt12=1;
					}
					break;
				}
				switch (alt12) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:178:29: ( UNION_SYM ( ALL )? ) select_expression
					{
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:178:29: ( UNION_SYM ( ALL )? )
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:178:30: UNION_SYM ( ALL )?
					{
					UNION_SYM37=(Token)match(input,UNION_SYM,FOLLOW_UNION_SYM_in_select_statement1935); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UNION_SYM37_tree = (Object)adaptor.create(UNION_SYM37);
					adaptor.addChild(root_0, UNION_SYM37_tree);
					}

					// /Users/debu/Development/SQLTEST1/SqlParser2.g:178:40: ( ALL )?
					int alt11=2;
					switch ( input.LA(1) ) {
						case ALL:
							{
							alt11=1;
							}
							break;
					}
					switch (alt11) {
						case 1 :
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:178:41: ALL
							{
							ALL38=(Token)match(input,ALL,FOLLOW_ALL_in_select_statement1938); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							ALL38_tree = (Object)adaptor.create(ALL38);
							adaptor.addChild(root_0, ALL38_tree);
							}

							}
							break;

					}

					}

					pushFollow(FOLLOW_select_expression_in_select_statement1943);
					select_expression39=select_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, select_expression39.getTree());

					}
					break;

				default :
					break loop12;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "select_statement"


	public static class select_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "select_expression"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:181:1: select_expression : SELECT ( ALL | DISTINCT | DISTINCTROW )? ( STRAIGHT_JOIN )? ( SQL_SMALL_RESULT )? ( SQL_BIG_RESULT )? ( SQL_BUFFER_RESULT )? ( SQL_CACHE_SYM | SQL_NO_CACHE_SYM )? ( SQL_CALC_FOUND_ROWS )? select_list ( FROM table_references ( where_clause )? ( groupby_clause )? )? ;
	public final SqlParser2Parser.select_expression_return select_expression() throws RecognitionException {
		SqlParser2Parser.select_expression_return retval = new SqlParser2Parser.select_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SELECT40=null;
		Token set41=null;
		Token STRAIGHT_JOIN42=null;
		Token SQL_SMALL_RESULT43=null;
		Token SQL_BIG_RESULT44=null;
		Token SQL_BUFFER_RESULT45=null;
		Token set46=null;
		Token SQL_CALC_FOUND_ROWS47=null;
		Token FROM49=null;
		ParserRuleReturnScope select_list48 =null;
		ParserRuleReturnScope table_references50 =null;
		ParserRuleReturnScope where_clause51 =null;
		ParserRuleReturnScope groupby_clause52 =null;

		Object SELECT40_tree=null;
		Object set41_tree=null;
		Object STRAIGHT_JOIN42_tree=null;
		Object SQL_SMALL_RESULT43_tree=null;
		Object SQL_BIG_RESULT44_tree=null;
		Object SQL_BUFFER_RESULT45_tree=null;
		Object set46_tree=null;
		Object SQL_CALC_FOUND_ROWS47_tree=null;
		Object FROM49_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:181:18: ( SELECT ( ALL | DISTINCT | DISTINCTROW )? ( STRAIGHT_JOIN )? ( SQL_SMALL_RESULT )? ( SQL_BIG_RESULT )? ( SQL_BUFFER_RESULT )? ( SQL_CACHE_SYM | SQL_NO_CACHE_SYM )? ( SQL_CALC_FOUND_ROWS )? select_list ( FROM table_references ( where_clause )? ( groupby_clause )? )? )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:182:2: SELECT ( ALL | DISTINCT | DISTINCTROW )? ( STRAIGHT_JOIN )? ( SQL_SMALL_RESULT )? ( SQL_BIG_RESULT )? ( SQL_BUFFER_RESULT )? ( SQL_CACHE_SYM | SQL_NO_CACHE_SYM )? ( SQL_CALC_FOUND_ROWS )? select_list ( FROM table_references ( where_clause )? ( groupby_clause )? )?
			{
			root_0 = (Object)adaptor.nil();


			SELECT40=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_expression1956); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			SELECT40_tree = (Object)adaptor.create(SELECT40);
			adaptor.addChild(root_0, SELECT40_tree);
			}

			// /Users/debu/Development/SQLTEST1/SqlParser2.g:184:2: ( ALL | DISTINCT | DISTINCTROW )?
			int alt13=2;
			switch ( input.LA(1) ) {
				case ALL:
				case DISTINCT:
				case DISTINCTROW:
					{
					alt13=1;
					}
					break;
			}
			switch (alt13) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:
					{
					set41=input.LT(1);
					if ( input.LA(1)==ALL||(input.LA(1) >= DISTINCT && input.LA(1) <= DISTINCTROW) ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set41));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			// /Users/debu/Development/SQLTEST1/SqlParser2.g:185:2: ( STRAIGHT_JOIN )?
			int alt14=2;
			switch ( input.LA(1) ) {
				case STRAIGHT_JOIN:
					{
					alt14=1;
					}
					break;
			}
			switch (alt14) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:185:3: STRAIGHT_JOIN
					{
					STRAIGHT_JOIN42=(Token)match(input,STRAIGHT_JOIN,FOLLOW_STRAIGHT_JOIN_in_select_expression1979); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRAIGHT_JOIN42_tree = (Object)adaptor.create(STRAIGHT_JOIN42);
					adaptor.addChild(root_0, STRAIGHT_JOIN42_tree);
					}

					}
					break;

			}

			// /Users/debu/Development/SQLTEST1/SqlParser2.g:186:2: ( SQL_SMALL_RESULT )?
			int alt15=2;
			switch ( input.LA(1) ) {
				case SQL_SMALL_RESULT:
					{
					alt15=1;
					}
					break;
			}
			switch (alt15) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:186:3: SQL_SMALL_RESULT
					{
					SQL_SMALL_RESULT43=(Token)match(input,SQL_SMALL_RESULT,FOLLOW_SQL_SMALL_RESULT_in_select_expression1985); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SQL_SMALL_RESULT43_tree = (Object)adaptor.create(SQL_SMALL_RESULT43);
					adaptor.addChild(root_0, SQL_SMALL_RESULT43_tree);
					}

					}
					break;

			}

			// /Users/debu/Development/SQLTEST1/SqlParser2.g:186:22: ( SQL_BIG_RESULT )?
			int alt16=2;
			switch ( input.LA(1) ) {
				case SQL_BIG_RESULT:
					{
					alt16=1;
					}
					break;
			}
			switch (alt16) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:186:23: SQL_BIG_RESULT
					{
					SQL_BIG_RESULT44=(Token)match(input,SQL_BIG_RESULT,FOLLOW_SQL_BIG_RESULT_in_select_expression1990); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SQL_BIG_RESULT44_tree = (Object)adaptor.create(SQL_BIG_RESULT44);
					adaptor.addChild(root_0, SQL_BIG_RESULT44_tree);
					}

					}
					break;

			}

			// /Users/debu/Development/SQLTEST1/SqlParser2.g:186:40: ( SQL_BUFFER_RESULT )?
			int alt17=2;
			switch ( input.LA(1) ) {
				case SQL_BUFFER_RESULT:
					{
					alt17=1;
					}
					break;
			}
			switch (alt17) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:186:41: SQL_BUFFER_RESULT
					{
					SQL_BUFFER_RESULT45=(Token)match(input,SQL_BUFFER_RESULT,FOLLOW_SQL_BUFFER_RESULT_in_select_expression1995); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SQL_BUFFER_RESULT45_tree = (Object)adaptor.create(SQL_BUFFER_RESULT45);
					adaptor.addChild(root_0, SQL_BUFFER_RESULT45_tree);
					}

					}
					break;

			}

			// /Users/debu/Development/SQLTEST1/SqlParser2.g:187:2: ( SQL_CACHE_SYM | SQL_NO_CACHE_SYM )?
			int alt18=2;
			switch ( input.LA(1) ) {
				case SQL_CACHE_SYM:
				case SQL_NO_CACHE_SYM:
					{
					alt18=1;
					}
					break;
			}
			switch (alt18) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:
					{
					set46=input.LT(1);
					if ( input.LA(1)==SQL_CACHE_SYM||input.LA(1)==SQL_NO_CACHE_SYM ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set46));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			// /Users/debu/Development/SQLTEST1/SqlParser2.g:187:38: ( SQL_CALC_FOUND_ROWS )?
			int alt19=2;
			switch ( input.LA(1) ) {
				case SQL_CALC_FOUND_ROWS:
					{
					alt19=1;
					}
					break;
			}
			switch (alt19) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:187:39: SQL_CALC_FOUND_ROWS
					{
					SQL_CALC_FOUND_ROWS47=(Token)match(input,SQL_CALC_FOUND_ROWS,FOLLOW_SQL_CALC_FOUND_ROWS_in_select_expression2010); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SQL_CALC_FOUND_ROWS47_tree = (Object)adaptor.create(SQL_CALC_FOUND_ROWS47);
					adaptor.addChild(root_0, SQL_CALC_FOUND_ROWS47_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_select_list_in_select_expression2016);
			select_list48=select_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, select_list48.getTree());

			// /Users/debu/Development/SQLTEST1/SqlParser2.g:191:2: ( FROM table_references ( where_clause )? ( groupby_clause )? )?
			int alt22=2;
			switch ( input.LA(1) ) {
				case FROM:
					{
					alt22=1;
					}
					break;
			}
			switch (alt22) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:192:3: FROM table_references ( where_clause )? ( groupby_clause )?
					{
					FROM49=(Token)match(input,FROM,FOLLOW_FROM_in_select_expression2026); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FROM49_tree = (Object)adaptor.create(FROM49);
					adaptor.addChild(root_0, FROM49_tree);
					}

					pushFollow(FOLLOW_table_references_in_select_expression2028);
					table_references50=table_references();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, table_references50.getTree());

					// /Users/debu/Development/SQLTEST1/SqlParser2.g:193:3: ( where_clause )?
					int alt20=2;
					switch ( input.LA(1) ) {
						case WHERE:
							{
							alt20=1;
							}
							break;
					}
					switch (alt20) {
						case 1 :
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:193:5: where_clause
							{
							pushFollow(FOLLOW_where_clause_in_select_expression2035);
							where_clause51=where_clause();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, where_clause51.getTree());

							}
							break;

					}

					// /Users/debu/Development/SQLTEST1/SqlParser2.g:194:3: ( groupby_clause )?
					int alt21=2;
					switch ( input.LA(1) ) {
						case GROUP_SYM:
							{
							alt21=1;
							}
							break;
					}
					switch (alt21) {
						case 1 :
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:194:5: groupby_clause
							{
							pushFollow(FOLLOW_groupby_clause_in_select_expression2045);
							groupby_clause52=groupby_clause();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, groupby_clause52.getTree());

							}
							break;

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "select_expression"


	public static class where_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "where_clause"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:198:1: where_clause : WHERE expression ;
	public final SqlParser2Parser.where_clause_return where_clause() throws RecognitionException {
		SqlParser2Parser.where_clause_return retval = new SqlParser2Parser.where_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHERE53=null;
		ParserRuleReturnScope expression54 =null;

		Object WHERE53_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:198:13: ( WHERE expression )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:199:2: WHERE expression
			{
			root_0 = (Object)adaptor.nil();


			WHERE53=(Token)match(input,WHERE,FOLLOW_WHERE_in_where_clause2063); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WHERE53_tree = (Object)adaptor.create(WHERE53);
			adaptor.addChild(root_0, WHERE53_tree);
			}

			pushFollow(FOLLOW_expression_in_where_clause2065);
			expression54=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression54.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "where_clause"


	public static class groupby_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "groupby_clause"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:202:1: groupby_clause : GROUP_SYM BY_SYM groupby_item ( COMMA groupby_item )* ;
	public final SqlParser2Parser.groupby_clause_return groupby_clause() throws RecognitionException {
		SqlParser2Parser.groupby_clause_return retval = new SqlParser2Parser.groupby_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token GROUP_SYM55=null;
		Token BY_SYM56=null;
		Token COMMA58=null;
		ParserRuleReturnScope groupby_item57 =null;
		ParserRuleReturnScope groupby_item59 =null;

		Object GROUP_SYM55_tree=null;
		Object BY_SYM56_tree=null;
		Object COMMA58_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:202:15: ( GROUP_SYM BY_SYM groupby_item ( COMMA groupby_item )* )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:203:2: GROUP_SYM BY_SYM groupby_item ( COMMA groupby_item )*
			{
			root_0 = (Object)adaptor.nil();


			GROUP_SYM55=(Token)match(input,GROUP_SYM,FOLLOW_GROUP_SYM_in_groupby_clause2074); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			GROUP_SYM55_tree = (Object)adaptor.create(GROUP_SYM55);
			adaptor.addChild(root_0, GROUP_SYM55_tree);
			}

			BY_SYM56=(Token)match(input,BY_SYM,FOLLOW_BY_SYM_in_groupby_clause2076); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			BY_SYM56_tree = (Object)adaptor.create(BY_SYM56);
			adaptor.addChild(root_0, BY_SYM56_tree);
			}

			pushFollow(FOLLOW_groupby_item_in_groupby_clause2078);
			groupby_item57=groupby_item();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, groupby_item57.getTree());

			// /Users/debu/Development/SQLTEST1/SqlParser2.g:203:32: ( COMMA groupby_item )*
			loop23:
			while (true) {
				int alt23=2;
				switch ( input.LA(1) ) {
				case COMMA:
					{
					alt23=1;
					}
					break;
				}
				switch (alt23) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:203:33: COMMA groupby_item
					{
					COMMA58=(Token)match(input,COMMA,FOLLOW_COMMA_in_groupby_clause2081); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA58_tree = (Object)adaptor.create(COMMA58);
					adaptor.addChild(root_0, COMMA58_tree);
					}

					pushFollow(FOLLOW_groupby_item_in_groupby_clause2083);
					groupby_item59=groupby_item();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, groupby_item59.getTree());

					}
					break;

				default :
					break loop23;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "groupby_clause"


	public static class groupby_item_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "groupby_item"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:205:1: groupby_item : ( column_spec | INTEGER_NUM );
	public final SqlParser2Parser.groupby_item_return groupby_item() throws RecognitionException {
		SqlParser2Parser.groupby_item_return retval = new SqlParser2Parser.groupby_item_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTEGER_NUM61=null;
		ParserRuleReturnScope column_spec60 =null;

		Object INTEGER_NUM61_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:205:13: ( column_spec | INTEGER_NUM )
			int alt24=2;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt24=1;
				}
				break;
			case INTEGER_NUM:
				{
				alt24=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:205:15: column_spec
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_column_spec_in_groupby_item2092);
					column_spec60=column_spec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, column_spec60.getTree());

					}
					break;
				case 2 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:205:29: INTEGER_NUM
					{
					root_0 = (Object)adaptor.nil();


					INTEGER_NUM61=(Token)match(input,INTEGER_NUM,FOLLOW_INTEGER_NUM_in_groupby_item2096); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTEGER_NUM61_tree = (Object)adaptor.create(INTEGER_NUM61);
					adaptor.addChild(root_0, INTEGER_NUM61_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "groupby_item"


	public static class column_spec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "column_spec"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:207:1: column_spec : table_name column_name ;
	public final SqlParser2Parser.column_spec_return column_spec() throws RecognitionException {
		SqlParser2Parser.column_spec_return retval = new SqlParser2Parser.column_spec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope table_name62 =null;
		ParserRuleReturnScope column_name63 =null;


		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:207:12: ( table_name column_name )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:208:2: table_name column_name
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_table_name_in_column_spec2105);
			table_name62=table_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, table_name62.getTree());

			pushFollow(FOLLOW_column_name_in_column_spec2107);
			column_name63=column_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, column_name63.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "column_spec"


	public static class select_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "select_list"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:210:1: select_list : ( ( column_spec ( COMMA column_spec )* ) | ASTERISK ) ;
	public final SqlParser2Parser.select_list_return select_list() throws RecognitionException {
		SqlParser2Parser.select_list_return retval = new SqlParser2Parser.select_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA65=null;
		Token ASTERISK67=null;
		ParserRuleReturnScope column_spec64 =null;
		ParserRuleReturnScope column_spec66 =null;

		Object COMMA65_tree=null;
		Object ASTERISK67_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:210:12: ( ( ( column_spec ( COMMA column_spec )* ) | ASTERISK ) )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:211:2: ( ( column_spec ( COMMA column_spec )* ) | ASTERISK )
			{
			root_0 = (Object)adaptor.nil();


			// /Users/debu/Development/SQLTEST1/SqlParser2.g:211:2: ( ( column_spec ( COMMA column_spec )* ) | ASTERISK )
			int alt26=2;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt26=1;
				}
				break;
			case ASTERISK:
				{
				alt26=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:211:4: ( column_spec ( COMMA column_spec )* )
					{
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:211:4: ( column_spec ( COMMA column_spec )* )
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:211:6: column_spec ( COMMA column_spec )*
					{
					pushFollow(FOLLOW_column_spec_in_select_list2120);
					column_spec64=column_spec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, column_spec64.getTree());

					// /Users/debu/Development/SQLTEST1/SqlParser2.g:211:18: ( COMMA column_spec )*
					loop25:
					while (true) {
						int alt25=2;
						switch ( input.LA(1) ) {
						case COMMA:
							{
							alt25=1;
							}
							break;
						}
						switch (alt25) {
						case 1 :
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:211:20: COMMA column_spec
							{
							COMMA65=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_list2124); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							COMMA65_tree = (Object)adaptor.create(COMMA65);
							adaptor.addChild(root_0, COMMA65_tree);
							}

							pushFollow(FOLLOW_column_spec_in_select_list2126);
							column_spec66=column_spec();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, column_spec66.getTree());

							}
							break;

						default :
							break loop25;
						}
					}

					}

					}
					break;
				case 2 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:212:4: ASTERISK
					{
					ASTERISK67=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_select_list2135); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ASTERISK67_tree = (Object)adaptor.create(ASTERISK67);
					adaptor.addChild(root_0, ASTERISK67_tree);
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "select_list"


	public static class subquery_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "subquery"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:214:1: subquery : LPAREN select_statement RPAREN ;
	public final SqlParser2Parser.subquery_return subquery() throws RecognitionException {
		SqlParser2Parser.subquery_return retval = new SqlParser2Parser.subquery_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN68=null;
		Token RPAREN70=null;
		ParserRuleReturnScope select_statement69 =null;

		Object LPAREN68_tree=null;
		Object RPAREN70_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:214:9: ( LPAREN select_statement RPAREN )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:215:2: LPAREN select_statement RPAREN
			{
			root_0 = (Object)adaptor.nil();


			LPAREN68=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_subquery2146); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN68_tree = (Object)adaptor.create(LPAREN68);
			adaptor.addChild(root_0, LPAREN68_tree);
			}

			pushFollow(FOLLOW_select_statement_in_subquery2148);
			select_statement69=select_statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, select_statement69.getTree());

			RPAREN70=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_subquery2150); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN70_tree = (Object)adaptor.create(RPAREN70);
			adaptor.addChild(root_0, RPAREN70_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subquery"


	public static class expression_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression_list"
	// /Users/debu/Development/SQLTEST1/SqlParser2.g:218:1: expression_list : LPAREN expression ( COMMA expression )* RPAREN ;
	public final SqlParser2Parser.expression_list_return expression_list() throws RecognitionException {
		SqlParser2Parser.expression_list_return retval = new SqlParser2Parser.expression_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN71=null;
		Token COMMA73=null;
		Token RPAREN75=null;
		ParserRuleReturnScope expression72 =null;
		ParserRuleReturnScope expression74 =null;

		Object LPAREN71_tree=null;
		Object COMMA73_tree=null;
		Object RPAREN75_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:218:16: ( LPAREN expression ( COMMA expression )* RPAREN )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:219:2: LPAREN expression ( COMMA expression )* RPAREN
			{
			root_0 = (Object)adaptor.nil();


			LPAREN71=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expression_list2160); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN71_tree = (Object)adaptor.create(LPAREN71);
			adaptor.addChild(root_0, LPAREN71_tree);
			}

			pushFollow(FOLLOW_expression_in_expression_list2162);
			expression72=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression72.getTree());

			// /Users/debu/Development/SQLTEST1/SqlParser2.g:219:20: ( COMMA expression )*
			loop27:
			while (true) {
				int alt27=2;
				switch ( input.LA(1) ) {
				case COMMA:
					{
					alt27=1;
					}
					break;
				}
				switch (alt27) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:219:22: COMMA expression
					{
					COMMA73=(Token)match(input,COMMA,FOLLOW_COMMA_in_expression_list2166); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA73_tree = (Object)adaptor.create(COMMA73);
					adaptor.addChild(root_0, COMMA73_tree);
					}

					pushFollow(FOLLOW_expression_in_expression_list2168);
					expression74=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression74.getTree());

					}
					break;

				default :
					break loop27;
				}
			}

			RPAREN75=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expression_list2173); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN75_tree = (Object)adaptor.create(RPAREN75);
			adaptor.addChild(root_0, RPAREN75_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression_list"

	// $ANTLR start synpred21_SqlParser2
	public final void synpred21_SqlParser2_fragment() throws RecognitionException {
		// /Users/debu/Development/SQLTEST1/SqlParser2.g:159:4: ( ( predicate relational_op predicate ) )
		// /Users/debu/Development/SQLTEST1/SqlParser2.g:159:4: ( predicate relational_op predicate )
		{
		// /Users/debu/Development/SQLTEST1/SqlParser2.g:159:4: ( predicate relational_op predicate )
		// /Users/debu/Development/SQLTEST1/SqlParser2.g:159:6: predicate relational_op predicate
		{
		pushFollow(FOLLOW_predicate_in_synpred21_SqlParser21807);
		predicate();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_relational_op_in_synpred21_SqlParser21809);
		relational_op();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_predicate_in_synpred21_SqlParser21811);
		predicate();
		state._fsp--;
		if (state.failed) return;

		}

		}

	}
	// $ANTLR end synpred21_SqlParser2

	// $ANTLR start synpred24_SqlParser2
	public final void synpred24_SqlParser2_fragment() throws RecognitionException {
		// /Users/debu/Development/SQLTEST1/SqlParser2.g:160:4: ( ( predicate relational_op ( ALL | ANY )? subquery ) )
		// /Users/debu/Development/SQLTEST1/SqlParser2.g:160:4: ( predicate relational_op ( ALL | ANY )? subquery )
		{
		// /Users/debu/Development/SQLTEST1/SqlParser2.g:160:4: ( predicate relational_op ( ALL | ANY )? subquery )
		// /Users/debu/Development/SQLTEST1/SqlParser2.g:160:6: predicate relational_op ( ALL | ANY )? subquery
		{
		pushFollow(FOLLOW_predicate_in_synpred24_SqlParser21821);
		predicate();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_relational_op_in_synpred24_SqlParser21823);
		relational_op();
		state._fsp--;
		if (state.failed) return;

		// /Users/debu/Development/SQLTEST1/SqlParser2.g:160:30: ( ALL | ANY )?
		int alt28=2;
		switch ( input.LA(1) ) {
			case ALL:
			case ANY:
				{
				alt28=1;
				}
				break;
		}
		switch (alt28) {
			case 1 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:
				{
				if ( input.LA(1)==ALL||input.LA(1)==ANY ) {
					input.consume();
					state.errorRecovery=false;
					state.failed=false;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return;}
					MismatchedSetException mse = new MismatchedSetException(null,input);
					throw mse;
				}
				}
				break;

		}

		pushFollow(FOLLOW_subquery_in_synpred24_SqlParser21836);
		subquery();
		state._fsp--;
		if (state.failed) return;

		}

		}

	}
	// $ANTLR end synpred24_SqlParser2

	// Delegated rules

	public final boolean synpred21_SqlParser2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred21_SqlParser2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred24_SqlParser2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred24_SqlParser2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_INTEGER_SYM_in_integer_types1549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_cast_data_type1598 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_INTEGER_NUM_in_cast_data_type1601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_STRING_in_string_literal1613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_number_literal1630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_char_functions_in_functionList1648 = new BitSet(new long[]{0x0000044000800000L});
	public static final BitSet FOLLOW_other_functions_in_functionList1653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_table_name1722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_column_name1735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_parser_name1748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_factor1_in_expression1762 = new BitSet(new long[]{0x0002000000000002L});
	public static final BitSet FOLLOW_OR_SYM_in_expression1766 = new BitSet(new long[]{0x0000008000200000L});
	public static final BitSet FOLLOW_exp_factor1_in_expression1768 = new BitSet(new long[]{0x0002000000000002L});
	public static final BitSet FOLLOW_exp_factor2_in_exp_factor11778 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AND_SYM_in_exp_factor11782 = new BitSet(new long[]{0x0000008000200000L});
	public static final BitSet FOLLOW_exp_factor2_in_exp_factor11784 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_bool_primary_in_exp_factor21794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_bool_primary1807 = new BitSet(new long[]{0x0000812014100000L});
	public static final BitSet FOLLOW_relational_op_in_bool_primary1809 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_predicate_in_bool_primary1811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_bool_primary1821 = new BitSet(new long[]{0x0000812014100000L});
	public static final BitSet FOLLOW_relational_op_in_bool_primary1823 = new BitSet(new long[]{0x0000008000000050L});
	public static final BitSet FOLLOW_subquery_in_bool_primary1836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXISTS_in_bool_primary1845 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_subquery_in_bool_primary1847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_bool_primary1854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subquery_in_predicate1867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_list_in_predicate1871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_reference_in_table_references1891 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_COMMA_in_table_references1895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000038000L});
	public static final BitSet FOLLOW_table_reference_in_table_references1897 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_select_expression_in_select_statement1930 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_UNION_SYM_in_select_statement1935 = new BitSet(new long[]{0x0200000000000010L});
	public static final BitSet FOLLOW_ALL_in_select_statement1938 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_select_expression_in_select_statement1943 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_SELECT_in_select_expression1956 = new BitSet(new long[]{0xF800000080030090L,0x0000000000000003L});
	public static final BitSet FOLLOW_STRAIGHT_JOIN_in_select_expression1979 = new BitSet(new long[]{0xF800000080000080L,0x0000000000000001L});
	public static final BitSet FOLLOW_SQL_SMALL_RESULT_in_select_expression1985 = new BitSet(new long[]{0xF800000080000080L});
	public static final BitSet FOLLOW_SQL_BIG_RESULT_in_select_expression1990 = new BitSet(new long[]{0xF000000080000080L});
	public static final BitSet FOLLOW_SQL_BUFFER_RESULT_in_select_expression1995 = new BitSet(new long[]{0xE000000080000080L});
	public static final BitSet FOLLOW_SQL_CALC_FOUND_ROWS_in_select_expression2010 = new BitSet(new long[]{0x0000000080000080L});
	public static final BitSet FOLLOW_select_list_in_select_expression2016 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_FROM_in_select_expression2026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000038000L});
	public static final BitSet FOLLOW_table_references_in_select_expression2028 = new BitSet(new long[]{0x0000000008000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_where_clause_in_select_expression2035 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_groupby_clause_in_select_expression2045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHERE_in_where_clause2063 = new BitSet(new long[]{0x0000008000200000L});
	public static final BitSet FOLLOW_expression_in_where_clause2065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_SYM_in_groupby_clause2074 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BY_SYM_in_groupby_clause2076 = new BitSet(new long[]{0x0000000180000000L});
	public static final BitSet FOLLOW_groupby_item_in_groupby_clause2078 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_COMMA_in_groupby_clause2081 = new BitSet(new long[]{0x0000000180000000L});
	public static final BitSet FOLLOW_groupby_item_in_groupby_clause2083 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_column_spec_in_groupby_item2092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_NUM_in_groupby_item2096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_name_in_column_spec2105 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_column_name_in_column_spec2107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_spec_in_select_list2120 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_COMMA_in_select_list2124 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_column_spec_in_select_list2126 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_ASTERISK_in_select_list2135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_subquery2146 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_select_statement_in_subquery2148 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_subquery2150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_expression_list2160 = new BitSet(new long[]{0x0000008000200000L});
	public static final BitSet FOLLOW_expression_in_expression_list2162 = new BitSet(new long[]{0x0080000000002000L});
	public static final BitSet FOLLOW_COMMA_in_expression_list2166 = new BitSet(new long[]{0x0000008000200000L});
	public static final BitSet FOLLOW_expression_in_expression_list2168 = new BitSet(new long[]{0x0080000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_expression_list2173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_synpred21_SqlParser21807 = new BitSet(new long[]{0x0000812014100000L});
	public static final BitSet FOLLOW_relational_op_in_synpred21_SqlParser21809 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_predicate_in_synpred21_SqlParser21811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_synpred24_SqlParser21821 = new BitSet(new long[]{0x0000812014100000L});
	public static final BitSet FOLLOW_relational_op_in_synpred24_SqlParser21823 = new BitSet(new long[]{0x0000008000000050L});
	public static final BitSet FOLLOW_subquery_in_synpred24_SqlParser21836 = new BitSet(new long[]{0x0000000000000002L});
}
