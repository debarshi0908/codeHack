// $ANTLR 3.5 /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g 2013-04-29 19:45:53

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class SelectParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATTR_LIST", "And", "Digit", "Eq", 
		"From", "GT", "GTEq", "Id", "Int", "LT", "LTEq", "Minus", "NEq", "Not", 
		"Or", "ROOT", "Select", "Space", "Str", "UNARY_MINUS", "Where", "'('", 
		"')'", "','", "';'"
	};
	public static final int EOF=-1;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int ATTR_LIST=4;
	public static final int And=5;
	public static final int Digit=6;
	public static final int Eq=7;
	public static final int From=8;
	public static final int GT=9;
	public static final int GTEq=10;
	public static final int Id=11;
	public static final int Int=12;
	public static final int LT=13;
	public static final int LTEq=14;
	public static final int Minus=15;
	public static final int NEq=16;
	public static final int Not=17;
	public static final int Or=18;
	public static final int ROOT=19;
	public static final int Select=20;
	public static final int Space=21;
	public static final int Str=22;
	public static final int UNARY_MINUS=23;
	public static final int Where=24;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public SelectParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public SelectParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return SelectParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/debu/Development/SQLTEST1/sqlSTACK/Select.g"; }


	public static class parse_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "parse"
	// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:29:1: parse : select_stat EOF -> ^( ROOT select_stat ) ;
	public final SelectParser.parse_return parse() throws RecognitionException {
		SelectParser.parse_return retval = new SelectParser.parse_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope select_stat1 =null;

		Object EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_select_stat=new RewriteRuleSubtreeStream(adaptor,"rule select_stat");

		try {
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:30:2: ( select_stat EOF -> ^( ROOT select_stat ) )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:30:4: select_stat EOF
			{
			pushFollow(FOLLOW_select_stat_in_parse200);
			select_stat1=select_stat();
			state._fsp--;

			stream_select_stat.add(select_stat1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_parse202);  
			stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: select_stat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 30:20: -> ^( ROOT select_stat )
			{
				// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:30:23: ^( ROOT select_stat )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ROOT, "ROOT"), root_1);
				adaptor.addChild(root_1, stream_select_stat.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// $ANTLR end "parse"


	public static class select_stat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "select_stat"
	// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:33:1: select_stat : Select attr_list From Id where_stat ';' -> ^( Select attr_list Id where_stat ) ;
	public final SelectParser.select_stat_return select_stat() throws RecognitionException {
		SelectParser.select_stat_return retval = new SelectParser.select_stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Select3=null;
		Token From5=null;
		Token Id6=null;
		Token char_literal8=null;
		ParserRuleReturnScope attr_list4 =null;
		ParserRuleReturnScope where_stat7 =null;

		Object Select3_tree=null;
		Object From5_tree=null;
		Object Id6_tree=null;
		Object char_literal8_tree=null;
		RewriteRuleTokenStream stream_Select=new RewriteRuleTokenStream(adaptor,"token Select");
		RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
		RewriteRuleTokenStream stream_From=new RewriteRuleTokenStream(adaptor,"token From");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleSubtreeStream stream_attr_list=new RewriteRuleSubtreeStream(adaptor,"rule attr_list");
		RewriteRuleSubtreeStream stream_where_stat=new RewriteRuleSubtreeStream(adaptor,"rule where_stat");

		try {
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:34:2: ( Select attr_list From Id where_stat ';' -> ^( Select attr_list Id where_stat ) )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:34:4: Select attr_list From Id where_stat ';'
			{
			Select3=(Token)match(input,Select,FOLLOW_Select_in_select_stat221);  
			stream_Select.add(Select3);

			pushFollow(FOLLOW_attr_list_in_select_stat223);
			attr_list4=attr_list();
			state._fsp--;

			stream_attr_list.add(attr_list4.getTree());
			From5=(Token)match(input,From,FOLLOW_From_in_select_stat225);  
			stream_From.add(From5);

			Id6=(Token)match(input,Id,FOLLOW_Id_in_select_stat227);  
			stream_Id.add(Id6);

			pushFollow(FOLLOW_where_stat_in_select_stat229);
			where_stat7=where_stat();
			state._fsp--;

			stream_where_stat.add(where_stat7.getTree());
			char_literal8=(Token)match(input,28,FOLLOW_28_in_select_stat231);  
			stream_28.add(char_literal8);

			// AST REWRITE
			// elements: attr_list, Id, where_stat, Select
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 34:44: -> ^( Select attr_list Id where_stat )
			{
				// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:34:47: ^( Select attr_list Id where_stat )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_Select.nextNode(), root_1);
				adaptor.addChild(root_1, stream_attr_list.nextTree());
				adaptor.addChild(root_1, stream_Id.nextNode());
				adaptor.addChild(root_1, stream_where_stat.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// $ANTLR end "select_stat"


	public static class attr_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "attr_list"
	// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:37:1: attr_list : Id ( ',' Id )* -> ^( ATTR_LIST ( Id )+ ) ;
	public final SelectParser.attr_list_return attr_list() throws RecognitionException {
		SelectParser.attr_list_return retval = new SelectParser.attr_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Id9=null;
		Token char_literal10=null;
		Token Id11=null;

		Object Id9_tree=null;
		Object char_literal10_tree=null;
		Object Id11_tree=null;
		RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");

		try {
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:38:2: ( Id ( ',' Id )* -> ^( ATTR_LIST ( Id )+ ) )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:38:4: Id ( ',' Id )*
			{
			Id9=(Token)match(input,Id,FOLLOW_Id_in_attr_list254);  
			stream_Id.add(Id9);

			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:38:7: ( ',' Id )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==27) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:38:8: ',' Id
					{
					char_literal10=(Token)match(input,27,FOLLOW_27_in_attr_list257);  
					stream_27.add(char_literal10);

					Id11=(Token)match(input,Id,FOLLOW_Id_in_attr_list259);  
					stream_Id.add(Id11);

					}
					break;

				default :
					break loop1;
				}
			}

			// AST REWRITE
			// elements: Id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 38:17: -> ^( ATTR_LIST ( Id )+ )
			{
				// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:38:20: ^( ATTR_LIST ( Id )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATTR_LIST, "ATTR_LIST"), root_1);
				if ( !(stream_Id.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_Id.hasNext() ) {
					adaptor.addChild(root_1, stream_Id.nextNode());
				}
				stream_Id.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// $ANTLR end "attr_list"


	public static class where_stat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "where_stat"
	// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:41:1: where_stat : ( Where expr -> expr | -> ^( Eq Int[\"1\"] Int[\"1\"] ) );
	public final SelectParser.where_stat_return where_stat() throws RecognitionException {
		SelectParser.where_stat_return retval = new SelectParser.where_stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Where12=null;
		ParserRuleReturnScope expr13 =null;

		Object Where12_tree=null;
		RewriteRuleTokenStream stream_Where=new RewriteRuleTokenStream(adaptor,"token Where");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:42:2: ( Where expr -> expr | -> ^( Eq Int[\"1\"] Int[\"1\"] ) )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Where) ) {
				alt2=1;
			}
			else if ( (LA2_0==28) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:42:4: Where expr
					{
					Where12=(Token)match(input,Where,FOLLOW_Where_in_where_stat281);  
					stream_Where.add(Where12);

					pushFollow(FOLLOW_expr_in_where_stat283);
					expr13=expr();
					state._fsp--;

					stream_expr.add(expr13.getTree());
					// AST REWRITE
					// elements: expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 42:15: -> expr
					{
						adaptor.addChild(root_0, stream_expr.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:43:15: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 43:15: -> ^( Eq Int[\"1\"] Int[\"1\"] )
					{
						// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:43:18: ^( Eq Int[\"1\"] Int[\"1\"] )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Eq, "Eq"), root_1);
						adaptor.addChild(root_1, (Object)adaptor.create(Int, "1"));
						adaptor.addChild(root_1, (Object)adaptor.create(Int, "1"));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// $ANTLR end "where_stat"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:47:1: expr : or_expr ;
	public final SelectParser.expr_return expr() throws RecognitionException {
		SelectParser.expr_return retval = new SelectParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope or_expr14 =null;


		try {
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:48:2: ( or_expr )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:48:4: or_expr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_or_expr_in_expr343);
			or_expr14=or_expr();
			state._fsp--;

			adaptor.addChild(root_0, or_expr14.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// $ANTLR end "expr"


	public static class or_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "or_expr"
	// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:51:1: or_expr : and_expr ( Or ^ and_expr )* ;
	public final SelectParser.or_expr_return or_expr() throws RecognitionException {
		SelectParser.or_expr_return retval = new SelectParser.or_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Or16=null;
		ParserRuleReturnScope and_expr15 =null;
		ParserRuleReturnScope and_expr17 =null;

		Object Or16_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:52:2: ( and_expr ( Or ^ and_expr )* )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:52:4: and_expr ( Or ^ and_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_and_expr_in_or_expr354);
			and_expr15=and_expr();
			state._fsp--;

			adaptor.addChild(root_0, and_expr15.getTree());

			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:52:13: ( Or ^ and_expr )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==Or) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:52:14: Or ^ and_expr
					{
					Or16=(Token)match(input,Or,FOLLOW_Or_in_or_expr357); 
					Or16_tree = (Object)adaptor.create(Or16);
					root_0 = (Object)adaptor.becomeRoot(Or16_tree, root_0);

					pushFollow(FOLLOW_and_expr_in_or_expr360);
					and_expr17=and_expr();
					state._fsp--;

					adaptor.addChild(root_0, and_expr17.getTree());

					}
					break;

				default :
					break loop3;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// $ANTLR end "or_expr"


	public static class and_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "and_expr"
	// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:55:1: and_expr : eq_expr ( And ^ eq_expr )* ;
	public final SelectParser.and_expr_return and_expr() throws RecognitionException {
		SelectParser.and_expr_return retval = new SelectParser.and_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token And19=null;
		ParserRuleReturnScope eq_expr18 =null;
		ParserRuleReturnScope eq_expr20 =null;

		Object And19_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:56:2: ( eq_expr ( And ^ eq_expr )* )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:56:4: eq_expr ( And ^ eq_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_eq_expr_in_and_expr373);
			eq_expr18=eq_expr();
			state._fsp--;

			adaptor.addChild(root_0, eq_expr18.getTree());

			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:56:12: ( And ^ eq_expr )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==And) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:56:13: And ^ eq_expr
					{
					And19=(Token)match(input,And,FOLLOW_And_in_and_expr376); 
					And19_tree = (Object)adaptor.create(And19);
					root_0 = (Object)adaptor.becomeRoot(And19_tree, root_0);

					pushFollow(FOLLOW_eq_expr_in_and_expr379);
					eq_expr20=eq_expr();
					state._fsp--;

					adaptor.addChild(root_0, eq_expr20.getTree());

					}
					break;

				default :
					break loop4;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// $ANTLR end "and_expr"


	public static class eq_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "eq_expr"
	// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:59:1: eq_expr : rel_expr ( ( Eq | NEq ) ^ rel_expr )* ;
	public final SelectParser.eq_expr_return eq_expr() throws RecognitionException {
		SelectParser.eq_expr_return retval = new SelectParser.eq_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set22=null;
		ParserRuleReturnScope rel_expr21 =null;
		ParserRuleReturnScope rel_expr23 =null;

		Object set22_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:60:2: ( rel_expr ( ( Eq | NEq ) ^ rel_expr )* )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:60:4: rel_expr ( ( Eq | NEq ) ^ rel_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_rel_expr_in_eq_expr392);
			rel_expr21=rel_expr();
			state._fsp--;

			adaptor.addChild(root_0, rel_expr21.getTree());

			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:60:13: ( ( Eq | NEq ) ^ rel_expr )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==Eq||LA5_0==NEq) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:60:14: ( Eq | NEq ) ^ rel_expr
					{
					set22=input.LT(1);
					set22=input.LT(1);
					if ( input.LA(1)==Eq||input.LA(1)==NEq ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set22), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_rel_expr_in_eq_expr404);
					rel_expr23=rel_expr();
					state._fsp--;

					adaptor.addChild(root_0, rel_expr23.getTree());

					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// $ANTLR end "eq_expr"


	public static class rel_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "rel_expr"
	// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:63:1: rel_expr : unary_expr ( ( LT | LTEq | GT | GTEq ) ^ unary_expr )? ;
	public final SelectParser.rel_expr_return rel_expr() throws RecognitionException {
		SelectParser.rel_expr_return retval = new SelectParser.rel_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set25=null;
		ParserRuleReturnScope unary_expr24 =null;
		ParserRuleReturnScope unary_expr26 =null;

		Object set25_tree=null;

		try {
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:64:2: ( unary_expr ( ( LT | LTEq | GT | GTEq ) ^ unary_expr )? )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:64:4: unary_expr ( ( LT | LTEq | GT | GTEq ) ^ unary_expr )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unary_expr_in_rel_expr417);
			unary_expr24=unary_expr();
			state._fsp--;

			adaptor.addChild(root_0, unary_expr24.getTree());

			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:64:15: ( ( LT | LTEq | GT | GTEq ) ^ unary_expr )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( ((LA6_0 >= GT && LA6_0 <= GTEq)||(LA6_0 >= LT && LA6_0 <= LTEq)) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:64:16: ( LT | LTEq | GT | GTEq ) ^ unary_expr
					{
					set25=input.LT(1);
					set25=input.LT(1);
					if ( (input.LA(1) >= GT && input.LA(1) <= GTEq)||(input.LA(1) >= LT && input.LA(1) <= LTEq) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set25), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unary_expr_in_rel_expr437);
					unary_expr26=unary_expr();
					state._fsp--;

					adaptor.addChild(root_0, unary_expr26.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// $ANTLR end "rel_expr"


	public static class unary_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unary_expr"
	// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:67:1: unary_expr : ( Minus atom -> ^( UNARY_MINUS atom ) | Not atom -> ^( Not atom ) | atom );
	public final SelectParser.unary_expr_return unary_expr() throws RecognitionException {
		SelectParser.unary_expr_return retval = new SelectParser.unary_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Minus27=null;
		Token Not29=null;
		ParserRuleReturnScope atom28 =null;
		ParserRuleReturnScope atom30 =null;
		ParserRuleReturnScope atom31 =null;

		Object Minus27_tree=null;
		Object Not29_tree=null;
		RewriteRuleTokenStream stream_Minus=new RewriteRuleTokenStream(adaptor,"token Minus");
		RewriteRuleTokenStream stream_Not=new RewriteRuleTokenStream(adaptor,"token Not");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");

		try {
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:68:2: ( Minus atom -> ^( UNARY_MINUS atom ) | Not atom -> ^( Not atom ) | atom )
			int alt7=3;
			switch ( input.LA(1) ) {
			case Minus:
				{
				alt7=1;
				}
				break;
			case Not:
				{
				alt7=2;
				}
				break;
			case Id:
			case Int:
			case Str:
			case 25:
				{
				alt7=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:68:4: Minus atom
					{
					Minus27=(Token)match(input,Minus,FOLLOW_Minus_in_unary_expr450);  
					stream_Minus.add(Minus27);

					pushFollow(FOLLOW_atom_in_unary_expr452);
					atom28=atom();
					state._fsp--;

					stream_atom.add(atom28.getTree());
					// AST REWRITE
					// elements: atom
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 68:15: -> ^( UNARY_MINUS atom )
					{
						// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:68:18: ^( UNARY_MINUS atom )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);
						adaptor.addChild(root_1, stream_atom.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:69:4: Not atom
					{
					Not29=(Token)match(input,Not,FOLLOW_Not_in_unary_expr465);  
					stream_Not.add(Not29);

					pushFollow(FOLLOW_atom_in_unary_expr467);
					atom30=atom();
					state._fsp--;

					stream_atom.add(atom30.getTree());
					// AST REWRITE
					// elements: Not, atom
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 69:15: -> ^( Not atom )
					{
						// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:69:18: ^( Not atom )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_Not.nextNode(), root_1);
						adaptor.addChild(root_1, stream_atom.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:70:4: atom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atom_in_unary_expr482);
					atom31=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom31.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// $ANTLR end "unary_expr"


	public static class atom_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:73:1: atom : ( Str | Int | Id | '(' expr ')' -> expr );
	public final SelectParser.atom_return atom() throws RecognitionException {
		SelectParser.atom_return retval = new SelectParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Str32=null;
		Token Int33=null;
		Token Id34=null;
		Token char_literal35=null;
		Token char_literal37=null;
		ParserRuleReturnScope expr36 =null;

		Object Str32_tree=null;
		Object Int33_tree=null;
		Object Id34_tree=null;
		Object char_literal35_tree=null;
		Object char_literal37_tree=null;
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:74:2: ( Str | Int | Id | '(' expr ')' -> expr )
			int alt8=4;
			switch ( input.LA(1) ) {
			case Str:
				{
				alt8=1;
				}
				break;
			case Int:
				{
				alt8=2;
				}
				break;
			case Id:
				{
				alt8=3;
				}
				break;
			case 25:
				{
				alt8=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:74:4: Str
					{
					root_0 = (Object)adaptor.nil();


					Str32=(Token)match(input,Str,FOLLOW_Str_in_atom493); 
					Str32_tree = (Object)adaptor.create(Str32);
					adaptor.addChild(root_0, Str32_tree);

					}
					break;
				case 2 :
					// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:75:4: Int
					{
					root_0 = (Object)adaptor.nil();


					Int33=(Token)match(input,Int,FOLLOW_Int_in_atom498); 
					Int33_tree = (Object)adaptor.create(Int33);
					adaptor.addChild(root_0, Int33_tree);

					}
					break;
				case 3 :
					// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:76:4: Id
					{
					root_0 = (Object)adaptor.nil();


					Id34=(Token)match(input,Id,FOLLOW_Id_in_atom503); 
					Id34_tree = (Object)adaptor.create(Id34);
					adaptor.addChild(root_0, Id34_tree);

					}
					break;
				case 4 :
					// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:77:4: '(' expr ')'
					{
					char_literal35=(Token)match(input,25,FOLLOW_25_in_atom508);  
					stream_25.add(char_literal35);

					pushFollow(FOLLOW_expr_in_atom510);
					expr36=expr();
					state._fsp--;

					stream_expr.add(expr36.getTree());
					char_literal37=(Token)match(input,26,FOLLOW_26_in_atom512);  
					stream_26.add(char_literal37);

					// AST REWRITE
					// elements: expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 77:17: -> expr
					{
						adaptor.addChild(root_0, stream_expr.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// $ANTLR end "atom"

	// Delegated rules



	public static final BitSet FOLLOW_select_stat_in_parse200 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_parse202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Select_in_select_stat221 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_attr_list_in_select_stat223 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_From_in_select_stat225 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_Id_in_select_stat227 = new BitSet(new long[]{0x0000000011000000L});
	public static final BitSet FOLLOW_where_stat_in_select_stat229 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_select_stat231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Id_in_attr_list254 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_27_in_attr_list257 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_Id_in_attr_list259 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_Where_in_where_stat281 = new BitSet(new long[]{0x0000000002429800L});
	public static final BitSet FOLLOW_expr_in_where_stat283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_or_expr_in_expr343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_expr_in_or_expr354 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_Or_in_or_expr357 = new BitSet(new long[]{0x0000000002429800L});
	public static final BitSet FOLLOW_and_expr_in_or_expr360 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_eq_expr_in_and_expr373 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_And_in_and_expr376 = new BitSet(new long[]{0x0000000002429800L});
	public static final BitSet FOLLOW_eq_expr_in_and_expr379 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_rel_expr_in_eq_expr392 = new BitSet(new long[]{0x0000000000010082L});
	public static final BitSet FOLLOW_set_in_eq_expr395 = new BitSet(new long[]{0x0000000002429800L});
	public static final BitSet FOLLOW_rel_expr_in_eq_expr404 = new BitSet(new long[]{0x0000000000010082L});
	public static final BitSet FOLLOW_unary_expr_in_rel_expr417 = new BitSet(new long[]{0x0000000000006602L});
	public static final BitSet FOLLOW_set_in_rel_expr420 = new BitSet(new long[]{0x0000000002429800L});
	public static final BitSet FOLLOW_unary_expr_in_rel_expr437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Minus_in_unary_expr450 = new BitSet(new long[]{0x0000000002401800L});
	public static final BitSet FOLLOW_atom_in_unary_expr452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Not_in_unary_expr465 = new BitSet(new long[]{0x0000000002401800L});
	public static final BitSet FOLLOW_atom_in_unary_expr467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_unary_expr482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Str_in_atom493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Int_in_atom498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Id_in_atom503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_atom508 = new BitSet(new long[]{0x0000000002429800L});
	public static final BitSet FOLLOW_expr_in_atom510 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_atom512 = new BitSet(new long[]{0x0000000000000002L});
}
