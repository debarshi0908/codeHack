// $ANTLR 3.5 /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g 2013-04-29 19:45:54

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SelectLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public SelectLexer() {} 
	public SelectLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public SelectLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/debu/Development/SQLTEST1/sqlSTACK/Select.g"; }

	// $ANTLR start "And"
	public final void mAnd() throws RecognitionException {
		try {
			int _type = And;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:2:5: ( 'AND' )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:2:7: 'AND'
			{
			match("AND"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "And"

	// $ANTLR start "Eq"
	public final void mEq() throws RecognitionException {
		try {
			int _type = Eq;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:3:4: ( '=' )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:3:6: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Eq"

	// $ANTLR start "From"
	public final void mFrom() throws RecognitionException {
		try {
			int _type = From;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:4:6: ( 'from' )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:4:8: 'from'
			{
			match("from"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "From"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:5:4: ( '>' )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:5:6: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "GTEq"
	public final void mGTEq() throws RecognitionException {
		try {
			int _type = GTEq;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:6:6: ( '>=' )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:6:8: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GTEq"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:7:4: ( '<' )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:7:6: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "LTEq"
	public final void mLTEq() throws RecognitionException {
		try {
			int _type = LTEq;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:8:6: ( '<=' )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:8:8: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LTEq"

	// $ANTLR start "Minus"
	public final void mMinus() throws RecognitionException {
		try {
			int _type = Minus;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:9:7: ( '-' )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:9:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Minus"

	// $ANTLR start "NEq"
	public final void mNEq() throws RecognitionException {
		try {
			int _type = NEq;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:10:5: ( '!=' )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:10:7: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEq"

	// $ANTLR start "Not"
	public final void mNot() throws RecognitionException {
		try {
			int _type = Not;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:11:5: ( '!' )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:11:7: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Not"

	// $ANTLR start "Or"
	public final void mOr() throws RecognitionException {
		try {
			int _type = Or;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:12:4: ( 'OR' )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:12:6: 'OR'
			{
			match("OR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Or"

	// $ANTLR start "Select"
	public final void mSelect() throws RecognitionException {
		try {
			int _type = Select;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:13:8: ( 'select' )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:13:10: 'select'
			{
			match("select"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Select"

	// $ANTLR start "Where"
	public final void mWhere() throws RecognitionException {
		try {
			int _type = Where;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:14:7: ( 'where' )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:14:9: 'where'
			{
			match("where"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Where"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:15:7: ( '(' )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:15:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:16:7: ( ')' )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:16:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:17:7: ( ',' )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:17:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:18:7: ( ';' )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:18:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "Id"
	public final void mId() throws RecognitionException {
		try {
			int _type = Id;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:80:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )* )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:80:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:80:37: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Id"

	// $ANTLR start "Str"
	public final void mStr() throws RecognitionException {
		try {
			int _type = Str;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:81:7: ( '\\'' ( '\\'\\'' |~ ( '\\'' | '\\r' | '\\n' ) )* '\\'' )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:81:9: '\\'' ( '\\'\\'' |~ ( '\\'' | '\\r' | '\\n' ) )* '\\''
			{
			match('\''); 
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:81:14: ( '\\'\\'' |~ ( '\\'' | '\\r' | '\\n' ) )*
			loop2:
			while (true) {
				int alt2=3;
				int LA2_0 = input.LA(1);
				if ( (LA2_0=='\'') ) {
					int LA2_1 = input.LA(2);
					if ( (LA2_1=='\'') ) {
						alt2=1;
					}

				}
				else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '&')||(LA2_0 >= '(' && LA2_0 <= '\uFFFF')) ) {
					alt2=2;
				}

				switch (alt2) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:81:15: '\\'\\''
					{
					match("''"); 

					}
					break;
				case 2 :
					// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:81:24: ~ ( '\\'' | '\\r' | '\\n' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			match('\''); 

			         // strip the surrounding quotes and replace '' with '
			         setText(getText().substring(1, getText().length() - 1).replace("''", "'"));
			        
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Str"

	// $ANTLR start "Int"
	public final void mInt() throws RecognitionException {
		try {
			int _type = Int;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:87:7: ( ( Digit )+ )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:87:9: ( Digit )+
			{
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:87:9: ( Digit )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Int"

	// $ANTLR start "Space"
	public final void mSpace() throws RecognitionException {
		try {
			int _type = Space;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:88:7: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:88:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Space"

	// $ANTLR start "Digit"
	public final void mDigit() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:90:16: ( '0' .. '9' )
			// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Digit"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:1:8: ( And | Eq | From | GT | GTEq | LT | LTEq | Minus | NEq | Not | Or | Select | Where | T__25 | T__26 | T__27 | T__28 | Id | Str | Int | Space )
		int alt4=21;
		switch ( input.LA(1) ) {
		case 'A':
			{
			int LA4_1 = input.LA(2);
			if ( (LA4_1=='N') ) {
				int LA4_19 = input.LA(3);
				if ( (LA4_19=='D') ) {
					int LA4_30 = input.LA(4);
					if ( ((LA4_30 >= '0' && LA4_30 <= '9')||(LA4_30 >= 'A' && LA4_30 <= 'Z')||LA4_30=='_'||(LA4_30 >= 'a' && LA4_30 <= 'z')) ) {
						alt4=18;
					}

					else {
						alt4=1;
					}

				}

				else {
					alt4=18;
				}

			}

			else {
				alt4=18;
			}

			}
			break;
		case '=':
			{
			alt4=2;
			}
			break;
		case 'f':
			{
			int LA4_3 = input.LA(2);
			if ( (LA4_3=='r') ) {
				int LA4_20 = input.LA(3);
				if ( (LA4_20=='o') ) {
					int LA4_31 = input.LA(4);
					if ( (LA4_31=='m') ) {
						int LA4_36 = input.LA(5);
						if ( ((LA4_36 >= '0' && LA4_36 <= '9')||(LA4_36 >= 'A' && LA4_36 <= 'Z')||LA4_36=='_'||(LA4_36 >= 'a' && LA4_36 <= 'z')) ) {
							alt4=18;
						}

						else {
							alt4=3;
						}

					}

					else {
						alt4=18;
					}

				}

				else {
					alt4=18;
				}

			}

			else {
				alt4=18;
			}

			}
			break;
		case '>':
			{
			int LA4_4 = input.LA(2);
			if ( (LA4_4=='=') ) {
				alt4=5;
			}

			else {
				alt4=4;
			}

			}
			break;
		case '<':
			{
			int LA4_5 = input.LA(2);
			if ( (LA4_5=='=') ) {
				alt4=7;
			}

			else {
				alt4=6;
			}

			}
			break;
		case '-':
			{
			alt4=8;
			}
			break;
		case '!':
			{
			int LA4_7 = input.LA(2);
			if ( (LA4_7=='=') ) {
				alt4=9;
			}

			else {
				alt4=10;
			}

			}
			break;
		case 'O':
			{
			int LA4_8 = input.LA(2);
			if ( (LA4_8=='R') ) {
				int LA4_27 = input.LA(3);
				if ( ((LA4_27 >= '0' && LA4_27 <= '9')||(LA4_27 >= 'A' && LA4_27 <= 'Z')||LA4_27=='_'||(LA4_27 >= 'a' && LA4_27 <= 'z')) ) {
					alt4=18;
				}

				else {
					alt4=11;
				}

			}

			else {
				alt4=18;
			}

			}
			break;
		case 's':
			{
			int LA4_9 = input.LA(2);
			if ( (LA4_9=='e') ) {
				int LA4_28 = input.LA(3);
				if ( (LA4_28=='l') ) {
					int LA4_33 = input.LA(4);
					if ( (LA4_33=='e') ) {
						int LA4_37 = input.LA(5);
						if ( (LA4_37=='c') ) {
							int LA4_40 = input.LA(6);
							if ( (LA4_40=='t') ) {
								int LA4_42 = input.LA(7);
								if ( ((LA4_42 >= '0' && LA4_42 <= '9')||(LA4_42 >= 'A' && LA4_42 <= 'Z')||LA4_42=='_'||(LA4_42 >= 'a' && LA4_42 <= 'z')) ) {
									alt4=18;
								}

								else {
									alt4=12;
								}

							}

							else {
								alt4=18;
							}

						}

						else {
							alt4=18;
						}

					}

					else {
						alt4=18;
					}

				}

				else {
					alt4=18;
				}

			}

			else {
				alt4=18;
			}

			}
			break;
		case 'w':
			{
			int LA4_10 = input.LA(2);
			if ( (LA4_10=='h') ) {
				int LA4_29 = input.LA(3);
				if ( (LA4_29=='e') ) {
					int LA4_34 = input.LA(4);
					if ( (LA4_34=='r') ) {
						int LA4_38 = input.LA(5);
						if ( (LA4_38=='e') ) {
							int LA4_41 = input.LA(6);
							if ( ((LA4_41 >= '0' && LA4_41 <= '9')||(LA4_41 >= 'A' && LA4_41 <= 'Z')||LA4_41=='_'||(LA4_41 >= 'a' && LA4_41 <= 'z')) ) {
								alt4=18;
							}

							else {
								alt4=13;
							}

						}

						else {
							alt4=18;
						}

					}

					else {
						alt4=18;
					}

				}

				else {
					alt4=18;
				}

			}

			else {
				alt4=18;
			}

			}
			break;
		case '(':
			{
			alt4=14;
			}
			break;
		case ')':
			{
			alt4=15;
			}
			break;
		case ',':
			{
			alt4=16;
			}
			break;
		case ';':
			{
			alt4=17;
			}
			break;
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case '_':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 't':
		case 'u':
		case 'v':
		case 'x':
		case 'y':
		case 'z':
			{
			alt4=18;
			}
			break;
		case '\'':
			{
			alt4=19;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt4=20;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt4=21;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:1:10: And
				{
				mAnd(); 

				}
				break;
			case 2 :
				// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:1:14: Eq
				{
				mEq(); 

				}
				break;
			case 3 :
				// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:1:17: From
				{
				mFrom(); 

				}
				break;
			case 4 :
				// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:1:22: GT
				{
				mGT(); 

				}
				break;
			case 5 :
				// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:1:25: GTEq
				{
				mGTEq(); 

				}
				break;
			case 6 :
				// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:1:30: LT
				{
				mLT(); 

				}
				break;
			case 7 :
				// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:1:33: LTEq
				{
				mLTEq(); 

				}
				break;
			case 8 :
				// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:1:38: Minus
				{
				mMinus(); 

				}
				break;
			case 9 :
				// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:1:44: NEq
				{
				mNEq(); 

				}
				break;
			case 10 :
				// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:1:48: Not
				{
				mNot(); 

				}
				break;
			case 11 :
				// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:1:52: Or
				{
				mOr(); 

				}
				break;
			case 12 :
				// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:1:55: Select
				{
				mSelect(); 

				}
				break;
			case 13 :
				// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:1:62: Where
				{
				mWhere(); 

				}
				break;
			case 14 :
				// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:1:68: T__25
				{
				mT__25(); 

				}
				break;
			case 15 :
				// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:1:74: T__26
				{
				mT__26(); 

				}
				break;
			case 16 :
				// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:1:80: T__27
				{
				mT__27(); 

				}
				break;
			case 17 :
				// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:1:86: T__28
				{
				mT__28(); 

				}
				break;
			case 18 :
				// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:1:92: Id
				{
				mId(); 

				}
				break;
			case 19 :
				// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:1:95: Str
				{
				mStr(); 

				}
				break;
			case 20 :
				// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:1:99: Int
				{
				mInt(); 

				}
				break;
			case 21 :
				// /Users/debu/Development/SQLTEST1/sqlSTACK/Select.g:1:103: Space
				{
				mSpace(); 

				}
				break;

		}
	}



}
