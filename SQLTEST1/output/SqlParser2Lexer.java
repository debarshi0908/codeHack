// $ANTLR 3.5 /Users/debu/Development/SQLTEST1/SqlParser2.g 2013-04-29 17:08:23

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SqlParser2Lexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public SqlParser2Lexer() {} 
	public SqlParser2Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public SqlParser2Lexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/debu/Development/SQLTEST1/SqlParser2.g"; }

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:7:7: ( 'A' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:7:9: 'A'
			{
			match('A'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__79"

	// $ANTLR start "T__80"
	public final void mT__80() throws RecognitionException {
		try {
			int _type = T__80;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:8:7: ( 'B' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:8:9: 'B'
			{
			match('B'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__80"

	// $ANTLR start "T__81"
	public final void mT__81() throws RecognitionException {
		try {
			int _type = T__81;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:9:7: ( 'C' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:9:9: 'C'
			{
			match('C'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__81"

	// $ANTLR start "A_"
	public final void mA_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:10:13: ( 'a' | 'A' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
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
	// $ANTLR end "A_"

	// $ANTLR start "B_"
	public final void mB_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:11:13: ( 'b' | 'B' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
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
	// $ANTLR end "B_"

	// $ANTLR start "C_"
	public final void mC_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:12:13: ( 'c' | 'C' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
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
	// $ANTLR end "C_"

	// $ANTLR start "D_"
	public final void mD_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:13:13: ( 'd' | 'D' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
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
	// $ANTLR end "D_"

	// $ANTLR start "E_"
	public final void mE_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:14:13: ( 'e' | 'E' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
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
	// $ANTLR end "E_"

	// $ANTLR start "F_"
	public final void mF_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:15:13: ( 'f' | 'F' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
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
	// $ANTLR end "F_"

	// $ANTLR start "G_"
	public final void mG_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:16:13: ( 'g' | 'G' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
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
	// $ANTLR end "G_"

	// $ANTLR start "H_"
	public final void mH_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:17:13: ( 'h' | 'H' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
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
	// $ANTLR end "H_"

	// $ANTLR start "I_"
	public final void mI_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:18:13: ( 'i' | 'I' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
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
	// $ANTLR end "I_"

	// $ANTLR start "J_"
	public final void mJ_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:19:13: ( 'j' | 'J' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
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
	// $ANTLR end "J_"

	// $ANTLR start "K_"
	public final void mK_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:20:13: ( 'k' | 'K' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
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
	// $ANTLR end "K_"

	// $ANTLR start "L_"
	public final void mL_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:21:13: ( 'l' | 'L' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
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
	// $ANTLR end "L_"

	// $ANTLR start "M_"
	public final void mM_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:22:13: ( 'm' | 'M' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
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
	// $ANTLR end "M_"

	// $ANTLR start "N_"
	public final void mN_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:23:13: ( 'n' | 'N' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
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
	// $ANTLR end "N_"

	// $ANTLR start "O_"
	public final void mO_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:24:13: ( 'o' | 'O' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
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
	// $ANTLR end "O_"

	// $ANTLR start "P_"
	public final void mP_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:25:13: ( 'p' | 'P' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
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
	// $ANTLR end "P_"

	// $ANTLR start "Q_"
	public final void mQ_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:26:13: ( 'q' | 'Q' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
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
	// $ANTLR end "Q_"

	// $ANTLR start "R_"
	public final void mR_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:27:13: ( 'r' | 'R' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
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
	// $ANTLR end "R_"

	// $ANTLR start "S_"
	public final void mS_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:28:13: ( 's' | 'S' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
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
	// $ANTLR end "S_"

	// $ANTLR start "T_"
	public final void mT_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:29:13: ( 't' | 'T' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
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
	// $ANTLR end "T_"

	// $ANTLR start "U_"
	public final void mU_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:30:13: ( 'u' | 'U' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
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
	// $ANTLR end "U_"

	// $ANTLR start "V_"
	public final void mV_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:31:13: ( 'v' | 'V' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
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
	// $ANTLR end "V_"

	// $ANTLR start "W_"
	public final void mW_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:32:13: ( 'w' | 'W' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
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
	// $ANTLR end "W_"

	// $ANTLR start "X_"
	public final void mX_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:33:13: ( 'x' | 'X' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
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
	// $ANTLR end "X_"

	// $ANTLR start "Y_"
	public final void mY_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:34:13: ( 'y' | 'Y' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
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
	// $ANTLR end "Y_"

	// $ANTLR start "Z_"
	public final void mZ_() throws RecognitionException {
		try {
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:35:13: ( 'z' | 'Z' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:
			{
			if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
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
	// $ANTLR end "Z_"

	// $ANTLR start "INTEGER_SYM"
	public final void mINTEGER_SYM() throws RecognitionException {
		try {
			int _type = INTEGER_SYM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:37:15: ( I_ N_ T_ E_ G_ E_ R_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:37:17: I_ N_ T_ E_ G_ E_ R_
			{
			mI_(); 

			mN_(); 

			mT_(); 

			mE_(); 

			mG_(); 

			mE_(); 

			mR_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER_SYM"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:38:9: ( C_ H_ A_ R_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:38:11: C_ H_ A_ R_
			{
			mC_(); 

			mH_(); 

			mA_(); 

			mR_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "MAKE_SET"
	public final void mMAKE_SET() throws RecognitionException {
		try {
			int _type = MAKE_SET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:39:12: ( M_ A_ K_ E_ '_' S_ E_ T_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:39:14: M_ A_ K_ E_ '_' S_ E_ T_
			{
			mM_(); 

			mA_(); 

			mK_(); 

			mE_(); 

			match('_'); 
			mS_(); 

			mE_(); 

			mT_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAKE_SET"

	// $ANTLR start "LOAD_FILE"
	public final void mLOAD_FILE() throws RecognitionException {
		try {
			int _type = LOAD_FILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:40:13: ( L_ O_ A_ D_ '_' F_ I_ L_ E_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:40:15: L_ O_ A_ D_ '_' F_ I_ L_ E_
			{
			mL_(); 

			mO_(); 

			mA_(); 

			mD_(); 

			match('_'); 
			mF_(); 

			mI_(); 

			mL_(); 

			mE_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOAD_FILE"

	// $ANTLR start "FOUND_ROWS"
	public final void mFOUND_ROWS() throws RecognitionException {
		try {
			int _type = FOUND_ROWS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:41:14: ( F_ O_ U_ N_ D_ '_' R_ O_ W_ S_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:41:16: F_ O_ U_ N_ D_ '_' R_ O_ W_ S_
			{
			mF_(); 

			mO_(); 

			mU_(); 

			mN_(); 

			mD_(); 

			match('_'); 
			mR_(); 

			mO_(); 

			mW_(); 

			mS_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOUND_ROWS"

	// $ANTLR start "AVG"
	public final void mAVG() throws RecognitionException {
		try {
			int _type = AVG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:42:14: ( A_ V_ G_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:42:16: A_ V_ G_
			{
			mA_(); 

			mV_(); 

			mG_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AVG"

	// $ANTLR start "COUNT"
	public final void mCOUNT() throws RecognitionException {
		try {
			int _type = COUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:43:17: ( C_ O_ U_ N_ T_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:43:19: C_ O_ U_ N_ T_
			{
			mC_(); 

			mO_(); 

			mU_(); 

			mN_(); 

			mT_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COUNT"

	// $ANTLR start "MAX_SYM"
	public final void mMAX_SYM() throws RecognitionException {
		try {
			int _type = MAX_SYM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:44:12: ( M_ A_ X_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:44:14: M_ A_ X_
			{
			mM_(); 

			mA_(); 

			mX_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAX_SYM"

	// $ANTLR start "MIN_SYM"
	public final void mMIN_SYM() throws RecognitionException {
		try {
			int _type = MIN_SYM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:45:12: ( M_ I_ N_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:45:14: M_ I_ N_
			{
			mM_(); 

			mI_(); 

			mN_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MIN_SYM"

	// $ANTLR start "SUM"
	public final void mSUM() throws RecognitionException {
		try {
			int _type = SUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:46:30: ( S_ U_ M_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:46:32: S_ U_ M_
			{
			mS_(); 

			mU_(); 

			mM_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUM"

	// $ANTLR start "GROUP_SYM"
	public final void mGROUP_SYM() throws RecognitionException {
		try {
			int _type = GROUP_SYM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:47:33: ( G_ R_ O_ U_ P_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:47:35: G_ R_ O_ U_ P_
			{
			mG_(); 

			mR_(); 

			mO_(); 

			mU_(); 

			mP_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GROUP_SYM"

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:48:11: ( S_ E_ L_ E_ C_ T_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:48:13: S_ E_ L_ E_ C_ T_
			{
			mS_(); 

			mE_(); 

			mL_(); 

			mE_(); 

			mC_(); 

			mT_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "SQL_SMALL_RESULT"
	public final void mSQL_SMALL_RESULT() throws RecognitionException {
		try {
			int _type = SQL_SMALL_RESULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:49:19: ( S_ Q_ L_ '_' S_ M_ A_ L_ L_ '_' R_ E_ S_ U_ L_ T_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:49:21: S_ Q_ L_ '_' S_ M_ A_ L_ L_ '_' R_ E_ S_ U_ L_ T_
			{
			mS_(); 

			mQ_(); 

			mL_(); 

			match('_'); 
			mS_(); 

			mM_(); 

			mA_(); 

			mL_(); 

			mL_(); 

			match('_'); 
			mR_(); 

			mE_(); 

			mS_(); 

			mU_(); 

			mL_(); 

			mT_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL_SMALL_RESULT"

	// $ANTLR start "SQL_BIG_RESULT"
	public final void mSQL_BIG_RESULT() throws RecognitionException {
		try {
			int _type = SQL_BIG_RESULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:50:18: ( S_ Q_ L_ '_' B_ I_ G_ '_' R_ E_ S_ U_ L_ T_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:50:20: S_ Q_ L_ '_' B_ I_ G_ '_' R_ E_ S_ U_ L_ T_
			{
			mS_(); 

			mQ_(); 

			mL_(); 

			match('_'); 
			mB_(); 

			mI_(); 

			mG_(); 

			match('_'); 
			mR_(); 

			mE_(); 

			mS_(); 

			mU_(); 

			mL_(); 

			mT_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL_BIG_RESULT"

	// $ANTLR start "SQL_BUFFER_RESULT"
	public final void mSQL_BUFFER_RESULT() throws RecognitionException {
		try {
			int _type = SQL_BUFFER_RESULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:51:20: ( S_ Q_ L_ '_' B_ U_ F_ F_ E_ R_ '_' R_ E_ S_ U_ L_ T_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:51:22: S_ Q_ L_ '_' B_ U_ F_ F_ E_ R_ '_' R_ E_ S_ U_ L_ T_
			{
			mS_(); 

			mQ_(); 

			mL_(); 

			match('_'); 
			mB_(); 

			mU_(); 

			mF_(); 

			mF_(); 

			mE_(); 

			mR_(); 

			match('_'); 
			mR_(); 

			mE_(); 

			mS_(); 

			mU_(); 

			mL_(); 

			mT_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL_BUFFER_RESULT"

	// $ANTLR start "SQL_CACHE_SYM"
	public final void mSQL_CACHE_SYM() throws RecognitionException {
		try {
			int _type = SQL_CACHE_SYM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:52:17: ( S_ Q_ L_ '_' C_ A_ C_ H_ E_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:52:19: S_ Q_ L_ '_' C_ A_ C_ H_ E_
			{
			mS_(); 

			mQ_(); 

			mL_(); 

			match('_'); 
			mC_(); 

			mA_(); 

			mC_(); 

			mH_(); 

			mE_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL_CACHE_SYM"

	// $ANTLR start "SQL_NO_CACHE_SYM"
	public final void mSQL_NO_CACHE_SYM() throws RecognitionException {
		try {
			int _type = SQL_NO_CACHE_SYM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:53:19: ( S_ Q_ L_ '_' N_ O_ '_' C_ A_ C_ H_ E_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:53:21: S_ Q_ L_ '_' N_ O_ '_' C_ A_ C_ H_ E_
			{
			mS_(); 

			mQ_(); 

			mL_(); 

			match('_'); 
			mN_(); 

			mO_(); 

			match('_'); 
			mC_(); 

			mA_(); 

			mC_(); 

			mH_(); 

			mE_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL_NO_CACHE_SYM"

	// $ANTLR start "SQL_CALC_FOUND_ROWS"
	public final void mSQL_CALC_FOUND_ROWS() throws RecognitionException {
		try {
			int _type = SQL_CALC_FOUND_ROWS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:54:22: ( S_ Q_ L_ '_' C_ A_ L_ C_ '_' F_ O_ U_ N_ D_ '_' R_ O_ W_ S_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:54:24: S_ Q_ L_ '_' C_ A_ L_ C_ '_' F_ O_ U_ N_ D_ '_' R_ O_ W_ S_
			{
			mS_(); 

			mQ_(); 

			mL_(); 

			match('_'); 
			mC_(); 

			mA_(); 

			mL_(); 

			mC_(); 

			match('_'); 
			mF_(); 

			mO_(); 

			mU_(); 

			mN_(); 

			mD_(); 

			match('_'); 
			mR_(); 

			mO_(); 

			mW_(); 

			mS_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL_CALC_FOUND_ROWS"

	// $ANTLR start "ALL"
	public final void mALL() throws RecognitionException {
		try {
			int _type = ALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:55:8: ( A_ L_ L_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:55:10: A_ L_ L_
			{
			mA_(); 

			mL_(); 

			mL_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALL"

	// $ANTLR start "DISTINCT"
	public final void mDISTINCT() throws RecognitionException {
		try {
			int _type = DISTINCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:56:12: ( D_ I_ S_ T_ I_ N_ C_ T_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:56:14: D_ I_ S_ T_ I_ N_ C_ T_
			{
			mD_(); 

			mI_(); 

			mS_(); 

			mT_(); 

			mI_(); 

			mN_(); 

			mC_(); 

			mT_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DISTINCT"

	// $ANTLR start "DISTINCTROW"
	public final void mDISTINCTROW() throws RecognitionException {
		try {
			int _type = DISTINCTROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:57:15: ( D_ I_ S_ T_ I_ N_ C_ T_ R_ O_ W_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:57:17: D_ I_ S_ T_ I_ N_ C_ T_ R_ O_ W_
			{
			mD_(); 

			mI_(); 

			mS_(); 

			mT_(); 

			mI_(); 

			mN_(); 

			mC_(); 

			mT_(); 

			mR_(); 

			mO_(); 

			mW_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DISTINCTROW"

	// $ANTLR start "STRAIGHT_JOIN"
	public final void mSTRAIGHT_JOIN() throws RecognitionException {
		try {
			int _type = STRAIGHT_JOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:58:17: ( S_ T_ R_ A_ I_ G_ H_ T_ '_' J_ O_ I_ N_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:58:19: S_ T_ R_ A_ I_ G_ H_ T_ '_' J_ O_ I_ N_
			{
			mS_(); 

			mT_(); 

			mR_(); 

			mA_(); 

			mI_(); 

			mG_(); 

			mH_(); 

			mT_(); 

			match('_'); 
			mJ_(); 

			mO_(); 

			mI_(); 

			mN_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRAIGHT_JOIN"

	// $ANTLR start "UNION_SYM"
	public final void mUNION_SYM() throws RecognitionException {
		try {
			int _type = UNION_SYM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:59:13: ( U_ N_ I_ O_ N_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:59:15: U_ N_ I_ O_ N_
			{
			mU_(); 

			mN_(); 

			mI_(); 

			mO_(); 

			mN_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNION_SYM"

	// $ANTLR start "FROM"
	public final void mFROM() throws RecognitionException {
		try {
			int _type = FROM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:60:9: ( F_ R_ O_ M_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:60:11: F_ R_ O_ M_
			{
			mF_(); 

			mR_(); 

			mO_(); 

			mM_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FROM"

	// $ANTLR start "WHERE"
	public final void mWHERE() throws RecognitionException {
		try {
			int _type = WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:61:10: ( W_ H_ E_ R_ E_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:61:12: W_ H_ E_ R_ E_
			{
			mW_(); 

			mH_(); 

			mE_(); 

			mR_(); 

			mE_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHERE"

	// $ANTLR start "ANY"
	public final void mANY() throws RecognitionException {
		try {
			int _type = ANY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:62:8: ( A_ N_ Y_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:62:10: A_ N_ Y_
			{
			mA_(); 

			mN_(); 

			mY_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANY"

	// $ANTLR start "EXISTS"
	public final void mEXISTS() throws RecognitionException {
		try {
			int _type = EXISTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:63:11: ( E_ X_ I_ S_ T_ S_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:63:13: E_ X_ I_ S_ T_ S_
			{
			mE_(); 

			mX_(); 

			mI_(); 

			mS_(); 

			mT_(); 

			mS_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXISTS"

	// $ANTLR start "BY_SYM"
	public final void mBY_SYM() throws RecognitionException {
		try {
			int _type = BY_SYM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:64:11: ( B_ Y_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:64:13: B_ Y_
			{
			mB_(); 

			mY_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BY_SYM"

	// $ANTLR start "EQ_SYM"
	public final void mEQ_SYM() throws RecognitionException {
		try {
			int _type = EQ_SYM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:69:8: ( '=' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:69:10: '='
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
	// $ANTLR end "EQ_SYM"

	// $ANTLR start "NOT_EQ"
	public final void mNOT_EQ() throws RecognitionException {
		try {
			int _type = NOT_EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:70:8: ( '<>' | '!=' )
			int alt1=2;
			switch ( input.LA(1) ) {
			case '<':
				{
				alt1=1;
				}
				break;
			case '!':
				{
				alt1=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:70:10: '<>'
					{
					match("<>"); 

					}
					break;
				case 2 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:70:17: '!='
					{
					match("!="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT_EQ"

	// $ANTLR start "LET"
	public final void mLET() throws RecognitionException {
		try {
			int _type = LET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:71:5: ( '<=' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:71:7: '<='
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
	// $ANTLR end "LET"

	// $ANTLR start "GET"
	public final void mGET() throws RecognitionException {
		try {
			int _type = GET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:72:5: ( '>=' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:72:7: '>='
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
	// $ANTLR end "GET"

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:73:6: ( ';' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:73:8: ';'
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
	// $ANTLR end "SEMI"

	// $ANTLR start "ASTERISK"
	public final void mASTERISK() throws RecognitionException {
		try {
			int _type = ASTERISK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:74:9: ( '*' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:74:11: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASTERISK"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:75:8: ( ')' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:75:10: ')'
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
	// $ANTLR end "RPAREN"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:76:8: ( '(' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:76:10: '('
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
	// $ANTLR end "LPAREN"

	// $ANTLR start "GTH"
	public final void mGTH() throws RecognitionException {
		try {
			int _type = GTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:77:5: ( '>' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:77:7: '>'
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
	// $ANTLR end "GTH"

	// $ANTLR start "LTH"
	public final void mLTH() throws RecognitionException {
		try {
			int _type = LTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:78:5: ( '<' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:78:7: '<'
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
	// $ANTLR end "LTH"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:79:5: ( '.' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:79:7: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:80:6: ( '+' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:80:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:81:7: ( '-' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:81:9: '-'
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
	// $ANTLR end "MINUS"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:82:7: ( ',' )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:82:9: ','
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
	// $ANTLR end "COMMA"

	// $ANTLR start "OR_SYM"
	public final void mOR_SYM() throws RecognitionException {
		try {
			int _type = OR_SYM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:83:8: ( O_ R_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:83:10: O_ R_
			{
			mO_(); 

			mR_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR_SYM"

	// $ANTLR start "AND_SYM"
	public final void mAND_SYM() throws RecognitionException {
		try {
			int _type = AND_SYM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:84:9: ( A_ N_ D_ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:84:11: A_ N_ D_
			{
			mA_(); 

			mN_(); 

			mD_(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND_SYM"

	// $ANTLR start "INTEGER_NUM"
	public final void mINTEGER_NUM() throws RecognitionException {
		try {
			int _type = INTEGER_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:86:14: ( ( '0' .. '9' )+ )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:86:16: ( '0' .. '9' )+
			{
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:86:16: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				switch ( input.LA(1) ) {
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
					alt2=1;
					}
					break;
				}
				switch (alt2) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER_NUM"

	// $ANTLR start "REAL_NUMBER"
	public final void mREAL_NUMBER() throws RecognitionException {
		try {
			int _type = REAL_NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:88:12: ( ( INTEGER_NUM DOT INTEGER_NUM | INTEGER_NUM DOT | DOT INTEGER_NUM | INTEGER_NUM ) ( ( 'E' | 'e' ) ( PLUS | MINUS )? INTEGER_NUM )? )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:89:2: ( INTEGER_NUM DOT INTEGER_NUM | INTEGER_NUM DOT | DOT INTEGER_NUM | INTEGER_NUM ) ( ( 'E' | 'e' ) ( PLUS | MINUS )? INTEGER_NUM )?
			{
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:89:2: ( INTEGER_NUM DOT INTEGER_NUM | INTEGER_NUM DOT | DOT INTEGER_NUM | INTEGER_NUM )
			int alt3=4;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:89:5: INTEGER_NUM DOT INTEGER_NUM
					{
					mINTEGER_NUM(); 

					mDOT(); 

					mINTEGER_NUM(); 

					}
					break;
				case 2 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:89:35: INTEGER_NUM DOT
					{
					mINTEGER_NUM(); 

					mDOT(); 

					}
					break;
				case 3 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:89:53: DOT INTEGER_NUM
					{
					mDOT(); 

					mINTEGER_NUM(); 

					}
					break;
				case 4 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:89:71: INTEGER_NUM
					{
					mINTEGER_NUM(); 

					}
					break;

			}

			// /Users/debu/Development/SQLTEST1/SqlParser2.g:90:2: ( ( 'E' | 'e' ) ( PLUS | MINUS )? INTEGER_NUM )?
			int alt5=2;
			switch ( input.LA(1) ) {
				case 'E':
				case 'e':
					{
					alt5=1;
					}
					break;
			}
			switch (alt5) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:90:5: ( 'E' | 'e' ) ( PLUS | MINUS )? INTEGER_NUM
					{
					if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:90:15: ( PLUS | MINUS )?
					int alt4=2;
					switch ( input.LA(1) ) {
						case '+':
						case '-':
							{
							alt4=1;
							}
							break;
					}
					switch (alt4) {
						case 1 :
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:
							{
							if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					mINTEGER_NUM(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REAL_NUMBER"

	// $ANTLR start "TEXT_STRING"
	public final void mTEXT_STRING() throws RecognitionException {
		try {
			int _type = TEXT_STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:93:12: ( ( N_ | ( '_' U_ T_ F_ '8' ) )? ( ( '\\'' ( ( '\\\\' '\\\\' ) | ( '\\'' '\\'' ) | ( '\\\\' '\\'' ) |~ ( '\\'' ) )* '\\'' ) | ( '\\\"' ( ( '\\\\' '\\\\' ) | ( '\\\"' '\\\"' ) | ( '\\\\' '\\\"' ) |~ ( '\\\"' ) )* '\\\"' ) ) )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:94:2: ( N_ | ( '_' U_ T_ F_ '8' ) )? ( ( '\\'' ( ( '\\\\' '\\\\' ) | ( '\\'' '\\'' ) | ( '\\\\' '\\'' ) |~ ( '\\'' ) )* '\\'' ) | ( '\\\"' ( ( '\\\\' '\\\\' ) | ( '\\\"' '\\\"' ) | ( '\\\\' '\\\"' ) |~ ( '\\\"' ) )* '\\\"' ) )
			{
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:94:2: ( N_ | ( '_' U_ T_ F_ '8' ) )?
			int alt6=3;
			switch ( input.LA(1) ) {
				case 'N':
				case 'n':
					{
					alt6=1;
					}
					break;
				case '_':
					{
					alt6=2;
					}
					break;
			}
			switch (alt6) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:94:4: N_
					{
					mN_(); 

					}
					break;
				case 2 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:94:9: ( '_' U_ T_ F_ '8' )
					{
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:94:9: ( '_' U_ T_ F_ '8' )
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:94:10: '_' U_ T_ F_ '8'
					{
					match('_'); 
					mU_(); 

					mT_(); 

					mF_(); 

					match('8'); 
					}

					}
					break;

			}

			// /Users/debu/Development/SQLTEST1/SqlParser2.g:95:2: ( ( '\\'' ( ( '\\\\' '\\\\' ) | ( '\\'' '\\'' ) | ( '\\\\' '\\'' ) |~ ( '\\'' ) )* '\\'' ) | ( '\\\"' ( ( '\\\\' '\\\\' ) | ( '\\\"' '\\\"' ) | ( '\\\\' '\\\"' ) |~ ( '\\\"' ) )* '\\\"' ) )
			int alt9=2;
			switch ( input.LA(1) ) {
			case '\'':
				{
				alt9=1;
				}
				break;
			case '\"':
				{
				alt9=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:96:3: ( '\\'' ( ( '\\\\' '\\\\' ) | ( '\\'' '\\'' ) | ( '\\\\' '\\'' ) |~ ( '\\'' ) )* '\\'' )
					{
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:96:3: ( '\\'' ( ( '\\\\' '\\\\' ) | ( '\\'' '\\'' ) | ( '\\\\' '\\'' ) |~ ( '\\'' ) )* '\\'' )
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:96:6: '\\'' ( ( '\\\\' '\\\\' ) | ( '\\'' '\\'' ) | ( '\\\\' '\\'' ) |~ ( '\\'' ) )* '\\''
					{
					match('\''); 
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:96:11: ( ( '\\\\' '\\\\' ) | ( '\\'' '\\'' ) | ( '\\\\' '\\'' ) |~ ( '\\'' ) )*
					loop7:
					while (true) {
						int alt7=5;
						alt7 = dfa7.predict(input);
						switch (alt7) {
						case 1 :
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:96:13: ( '\\\\' '\\\\' )
							{
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:96:13: ( '\\\\' '\\\\' )
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:96:14: '\\\\' '\\\\'
							{
							match('\\'); 
							match('\\'); 
							}

							}
							break;
						case 2 :
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:96:27: ( '\\'' '\\'' )
							{
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:96:27: ( '\\'' '\\'' )
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:96:28: '\\'' '\\''
							{
							match('\''); 
							match('\''); 
							}

							}
							break;
						case 3 :
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:96:41: ( '\\\\' '\\'' )
							{
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:96:41: ( '\\\\' '\\'' )
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:96:42: '\\\\' '\\''
							{
							match('\\'); 
							match('\''); 
							}

							}
							break;
						case 4 :
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:96:55: ~ ( '\\'' )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
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
							break loop7;
						}
					}

					match('\''); 
					}

					}
					break;
				case 2 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:98:3: ( '\\\"' ( ( '\\\\' '\\\\' ) | ( '\\\"' '\\\"' ) | ( '\\\\' '\\\"' ) |~ ( '\\\"' ) )* '\\\"' )
					{
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:98:3: ( '\\\"' ( ( '\\\\' '\\\\' ) | ( '\\\"' '\\\"' ) | ( '\\\\' '\\\"' ) |~ ( '\\\"' ) )* '\\\"' )
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:98:6: '\\\"' ( ( '\\\\' '\\\\' ) | ( '\\\"' '\\\"' ) | ( '\\\\' '\\\"' ) |~ ( '\\\"' ) )* '\\\"'
					{
					match('\"'); 
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:98:11: ( ( '\\\\' '\\\\' ) | ( '\\\"' '\\\"' ) | ( '\\\\' '\\\"' ) |~ ( '\\\"' ) )*
					loop8:
					while (true) {
						int alt8=5;
						alt8 = dfa8.predict(input);
						switch (alt8) {
						case 1 :
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:98:13: ( '\\\\' '\\\\' )
							{
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:98:13: ( '\\\\' '\\\\' )
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:98:14: '\\\\' '\\\\'
							{
							match('\\'); 
							match('\\'); 
							}

							}
							break;
						case 2 :
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:98:27: ( '\\\"' '\\\"' )
							{
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:98:27: ( '\\\"' '\\\"' )
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:98:28: '\\\"' '\\\"'
							{
							match('\"'); 
							match('\"'); 
							}

							}
							break;
						case 3 :
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:98:41: ( '\\\\' '\\\"' )
							{
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:98:41: ( '\\\\' '\\\"' )
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:98:42: '\\\\' '\\\"'
							{
							match('\\'); 
							match('\"'); 
							}

							}
							break;
						case 4 :
							// /Users/debu/Development/SQLTEST1/SqlParser2.g:98:55: ~ ( '\\\"' )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
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
							break loop8;
						}
					}

					match('\"'); 
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TEXT_STRING"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:102:3: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' )* )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:103:2: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' )*
			{
			if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:103:37: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' )*
			loop10:
			while (true) {
				int alt10=2;
				switch ( input.LA(1) ) {
				case '$':
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
				case 'A':
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
				case 'O':
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
				case 'f':
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
				case 's':
				case 't':
				case 'u':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					{
					alt10=1;
					}
					break;
				}
				switch (alt10) {
				case 1 :
					// /Users/debu/Development/SQLTEST1/SqlParser2.g:
					{
					if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop10;
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
	// $ANTLR end "ID"

	// $ANTLR start "WHITE_SPACE"
	public final void mWHITE_SPACE() throws RecognitionException {
		try {
			int _type = WHITE_SPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:107:13: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
			// /Users/debu/Development/SQLTEST1/SqlParser2.g:107:15: ( ' ' | '\\r' | '\\t' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHITE_SPACE"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:8: ( T__79 | T__80 | T__81 | INTEGER_SYM | CHAR | MAKE_SET | LOAD_FILE | FOUND_ROWS | AVG | COUNT | MAX_SYM | MIN_SYM | SUM | GROUP_SYM | SELECT | SQL_SMALL_RESULT | SQL_BIG_RESULT | SQL_BUFFER_RESULT | SQL_CACHE_SYM | SQL_NO_CACHE_SYM | SQL_CALC_FOUND_ROWS | ALL | DISTINCT | DISTINCTROW | STRAIGHT_JOIN | UNION_SYM | FROM | WHERE | ANY | EXISTS | BY_SYM | EQ_SYM | NOT_EQ | LET | GET | SEMI | ASTERISK | RPAREN | LPAREN | GTH | LTH | DOT | PLUS | MINUS | COMMA | OR_SYM | AND_SYM | INTEGER_NUM | REAL_NUMBER | TEXT_STRING | ID | WHITE_SPACE )
		int alt11=52;
		alt11 = dfa11.predict(input);
		switch (alt11) {
			case 1 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:10: T__79
				{
				mT__79(); 

				}
				break;
			case 2 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:16: T__80
				{
				mT__80(); 

				}
				break;
			case 3 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:22: T__81
				{
				mT__81(); 

				}
				break;
			case 4 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:28: INTEGER_SYM
				{
				mINTEGER_SYM(); 

				}
				break;
			case 5 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:40: CHAR
				{
				mCHAR(); 

				}
				break;
			case 6 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:45: MAKE_SET
				{
				mMAKE_SET(); 

				}
				break;
			case 7 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:54: LOAD_FILE
				{
				mLOAD_FILE(); 

				}
				break;
			case 8 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:64: FOUND_ROWS
				{
				mFOUND_ROWS(); 

				}
				break;
			case 9 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:75: AVG
				{
				mAVG(); 

				}
				break;
			case 10 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:79: COUNT
				{
				mCOUNT(); 

				}
				break;
			case 11 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:85: MAX_SYM
				{
				mMAX_SYM(); 

				}
				break;
			case 12 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:93: MIN_SYM
				{
				mMIN_SYM(); 

				}
				break;
			case 13 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:101: SUM
				{
				mSUM(); 

				}
				break;
			case 14 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:105: GROUP_SYM
				{
				mGROUP_SYM(); 

				}
				break;
			case 15 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:115: SELECT
				{
				mSELECT(); 

				}
				break;
			case 16 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:122: SQL_SMALL_RESULT
				{
				mSQL_SMALL_RESULT(); 

				}
				break;
			case 17 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:139: SQL_BIG_RESULT
				{
				mSQL_BIG_RESULT(); 

				}
				break;
			case 18 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:154: SQL_BUFFER_RESULT
				{
				mSQL_BUFFER_RESULT(); 

				}
				break;
			case 19 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:172: SQL_CACHE_SYM
				{
				mSQL_CACHE_SYM(); 

				}
				break;
			case 20 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:186: SQL_NO_CACHE_SYM
				{
				mSQL_NO_CACHE_SYM(); 

				}
				break;
			case 21 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:203: SQL_CALC_FOUND_ROWS
				{
				mSQL_CALC_FOUND_ROWS(); 

				}
				break;
			case 22 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:223: ALL
				{
				mALL(); 

				}
				break;
			case 23 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:227: DISTINCT
				{
				mDISTINCT(); 

				}
				break;
			case 24 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:236: DISTINCTROW
				{
				mDISTINCTROW(); 

				}
				break;
			case 25 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:248: STRAIGHT_JOIN
				{
				mSTRAIGHT_JOIN(); 

				}
				break;
			case 26 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:262: UNION_SYM
				{
				mUNION_SYM(); 

				}
				break;
			case 27 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:272: FROM
				{
				mFROM(); 

				}
				break;
			case 28 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:277: WHERE
				{
				mWHERE(); 

				}
				break;
			case 29 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:283: ANY
				{
				mANY(); 

				}
				break;
			case 30 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:287: EXISTS
				{
				mEXISTS(); 

				}
				break;
			case 31 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:294: BY_SYM
				{
				mBY_SYM(); 

				}
				break;
			case 32 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:301: EQ_SYM
				{
				mEQ_SYM(); 

				}
				break;
			case 33 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:308: NOT_EQ
				{
				mNOT_EQ(); 

				}
				break;
			case 34 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:315: LET
				{
				mLET(); 

				}
				break;
			case 35 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:319: GET
				{
				mGET(); 

				}
				break;
			case 36 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:323: SEMI
				{
				mSEMI(); 

				}
				break;
			case 37 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:328: ASTERISK
				{
				mASTERISK(); 

				}
				break;
			case 38 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:337: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 39 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:344: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 40 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:351: GTH
				{
				mGTH(); 

				}
				break;
			case 41 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:355: LTH
				{
				mLTH(); 

				}
				break;
			case 42 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:359: DOT
				{
				mDOT(); 

				}
				break;
			case 43 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:363: PLUS
				{
				mPLUS(); 

				}
				break;
			case 44 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:368: MINUS
				{
				mMINUS(); 

				}
				break;
			case 45 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:374: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 46 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:380: OR_SYM
				{
				mOR_SYM(); 

				}
				break;
			case 47 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:387: AND_SYM
				{
				mAND_SYM(); 

				}
				break;
			case 48 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:395: INTEGER_NUM
				{
				mINTEGER_NUM(); 

				}
				break;
			case 49 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:407: REAL_NUMBER
				{
				mREAL_NUMBER(); 

				}
				break;
			case 50 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:419: TEXT_STRING
				{
				mTEXT_STRING(); 

				}
				break;
			case 51 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:431: ID
				{
				mID(); 

				}
				break;
			case 52 :
				// /Users/debu/Development/SQLTEST1/SqlParser2.g:1:434: WHITE_SPACE
				{
				mWHITE_SPACE(); 

				}
				break;

		}
	}


	protected DFA3 dfa3 = new DFA3(this);
	protected DFA7 dfa7 = new DFA7(this);
	protected DFA8 dfa8 = new DFA8(this);
	protected DFA11 dfa11 = new DFA11(this);
	static final String DFA3_eotS =
		"\1\uffff\1\3\2\uffff\1\5\2\uffff";
	static final String DFA3_eofS =
		"\7\uffff";
	static final String DFA3_minS =
		"\2\56\2\uffff\1\60\2\uffff";
	static final String DFA3_maxS =
		"\2\71\2\uffff\1\71\2\uffff";
	static final String DFA3_acceptS =
		"\2\uffff\1\3\1\4\1\uffff\1\2\1\1";
	static final String DFA3_specialS =
		"\7\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\4\1\uffff\12\1",
			"",
			"",
			"\12\6",
			"",
			""
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "89:2: ( INTEGER_NUM DOT INTEGER_NUM | INTEGER_NUM DOT | DOT INTEGER_NUM | INTEGER_NUM )";
		}
	}

	static final String DFA7_eotS =
		"\1\uffff\1\5\5\uffff\1\3\1\11\1\uffff\1\3";
	static final String DFA7_eofS =
		"\13\uffff";
	static final String DFA7_minS =
		"\1\0\1\47\1\0\4\uffff\2\0\1\uffff\1\0";
	static final String DFA7_maxS =
		"\1\uffff\1\47\1\uffff\4\uffff\2\uffff\1\uffff\1\uffff";
	static final String DFA7_acceptS =
		"\3\uffff\1\4\1\2\1\5\1\1\2\uffff\1\3\1\uffff";
	static final String DFA7_specialS =
		"\1\4\1\uffff\1\3\4\uffff\1\1\1\2\1\uffff\1\0}>";
	static final String[] DFA7_transitionS = {
			"\47\3\1\1\64\3\1\2\uffa3\3",
			"\1\4",
			"\47\3\1\7\64\3\1\6\uffa3\3",
			"",
			"",
			"",
			"",
			"\47\11\1\10\uffd8\11",
			"\47\3\1\12\uffd8\3",
			"",
			"\47\11\1\10\uffd8\11"
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 96:11: ( ( '\\\\' '\\\\' ) | ( '\\'' '\\'' ) | ( '\\\\' '\\'' ) |~ ( '\\'' ) )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA7_10 = input.LA(1);
						s = -1;
						if ( (LA7_10=='\'') ) {s = 8;}
						else if ( ((LA7_10 >= '\u0000' && LA7_10 <= '&')||(LA7_10 >= '(' && LA7_10 <= '\uFFFF')) ) {s = 9;}
						else s = 3;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA7_7 = input.LA(1);
						s = -1;
						if ( (LA7_7=='\'') ) {s = 8;}
						else if ( ((LA7_7 >= '\u0000' && LA7_7 <= '&')||(LA7_7 >= '(' && LA7_7 <= '\uFFFF')) ) {s = 9;}
						else s = 3;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA7_8 = input.LA(1);
						s = -1;
						if ( (LA7_8=='\'') ) {s = 10;}
						else if ( ((LA7_8 >= '\u0000' && LA7_8 <= '&')||(LA7_8 >= '(' && LA7_8 <= '\uFFFF')) ) {s = 3;}
						else s = 9;
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA7_2 = input.LA(1);
						s = -1;
						if ( (LA7_2=='\\') ) {s = 6;}
						else if ( (LA7_2=='\'') ) {s = 7;}
						else if ( ((LA7_2 >= '\u0000' && LA7_2 <= '&')||(LA7_2 >= '(' && LA7_2 <= '[')||(LA7_2 >= ']' && LA7_2 <= '\uFFFF')) ) {s = 3;}
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA7_0 = input.LA(1);
						s = -1;
						if ( (LA7_0=='\'') ) {s = 1;}
						else if ( (LA7_0=='\\') ) {s = 2;}
						else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '&')||(LA7_0 >= '(' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {s = 3;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 7, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA8_eotS =
		"\1\uffff\1\5\5\uffff\1\3\1\11\1\uffff\1\3";
	static final String DFA8_eofS =
		"\13\uffff";
	static final String DFA8_minS =
		"\1\0\1\42\1\0\4\uffff\2\0\1\uffff\1\0";
	static final String DFA8_maxS =
		"\1\uffff\1\42\1\uffff\4\uffff\2\uffff\1\uffff\1\uffff";
	static final String DFA8_acceptS =
		"\3\uffff\1\4\1\2\1\5\1\1\2\uffff\1\3\1\uffff";
	static final String DFA8_specialS =
		"\1\1\1\uffff\1\4\4\uffff\1\3\1\2\1\uffff\1\0}>";
	static final String[] DFA8_transitionS = {
			"\42\3\1\1\71\3\1\2\uffa3\3",
			"\1\4",
			"\42\3\1\7\71\3\1\6\uffa3\3",
			"",
			"",
			"",
			"",
			"\42\11\1\10\uffdd\11",
			"\42\3\1\12\uffdd\3",
			"",
			"\42\11\1\10\uffdd\11"
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 98:11: ( ( '\\\\' '\\\\' ) | ( '\\\"' '\\\"' ) | ( '\\\\' '\\\"' ) |~ ( '\\\"' ) )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA8_10 = input.LA(1);
						s = -1;
						if ( (LA8_10=='\"') ) {s = 8;}
						else if ( ((LA8_10 >= '\u0000' && LA8_10 <= '!')||(LA8_10 >= '#' && LA8_10 <= '\uFFFF')) ) {s = 9;}
						else s = 3;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA8_0 = input.LA(1);
						s = -1;
						if ( (LA8_0=='\"') ) {s = 1;}
						else if ( (LA8_0=='\\') ) {s = 2;}
						else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '!')||(LA8_0 >= '#' && LA8_0 <= '[')||(LA8_0 >= ']' && LA8_0 <= '\uFFFF')) ) {s = 3;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA8_8 = input.LA(1);
						s = -1;
						if ( (LA8_8=='\"') ) {s = 10;}
						else if ( ((LA8_8 >= '\u0000' && LA8_8 <= '!')||(LA8_8 >= '#' && LA8_8 <= '\uFFFF')) ) {s = 3;}
						else s = 9;
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA8_7 = input.LA(1);
						s = -1;
						if ( (LA8_7=='\"') ) {s = 8;}
						else if ( ((LA8_7 >= '\u0000' && LA8_7 <= '!')||(LA8_7 >= '#' && LA8_7 <= '\uFFFF')) ) {s = 9;}
						else s = 3;
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA8_2 = input.LA(1);
						s = -1;
						if ( (LA8_2=='\\') ) {s = 6;}
						else if ( (LA8_2=='\"') ) {s = 7;}
						else if ( ((LA8_2 >= '\u0000' && LA8_2 <= '!')||(LA8_2 >= '#' && LA8_2 <= '[')||(LA8_2 >= ']' && LA8_2 <= '\uFFFF')) ) {s = 3;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 8, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA11_eotS =
		"\1\uffff\1\44\1\50\1\52\15\42\1\uffff\1\75\1\uffff\1\77\4\uffff\1\100"+
		"\3\uffff\1\42\1\103\2\42\4\uffff\3\42\1\uffff\1\111\1\uffff\21\42\6\uffff"+
		"\1\134\1\uffff\1\42\1\136\1\137\1\140\1\141\1\uffff\4\42\1\146\1\147\3"+
		"\42\1\153\10\42\1\uffff\1\42\4\uffff\1\165\3\42\2\uffff\2\42\1\173\1\uffff"+
		"\11\42\1\uffff\1\u0088\4\42\1\uffff\6\42\1\u0094\1\42\1\u0096\1\u0097"+
		"\2\42\1\uffff\4\42\1\u009d\6\42\1\uffff\1\42\2\uffff\1\u00a6\1\u00a7\3"+
		"\42\1\uffff\10\42\2\uffff\1\u00b3\11\42\1\u00bd\1\uffff\1\u00bf\4\42\1"+
		"\u00c4\3\42\1\uffff\1\42\1\uffff\1\u00c9\3\42\1\uffff\4\42\1\uffff\6\42"+
		"\1\u00d7\4\42\1\u00dc\1\42\1\uffff\4\42\1\uffff\1\u00e2\1\42\1\u00e4\2"+
		"\42\1\uffff\1\42\1\uffff\2\42\1\u00ea\2\42\1\uffff\1\u00ed\1\42\1\uffff"+
		"\1\42\1\u00f0\1\uffff";
	static final String DFA11_eofS =
		"\u00f1\uffff";
	static final String DFA11_minS =
		"\1\11\3\44\1\116\1\110\1\101\2\117\1\114\1\105\1\122\1\111\1\116\1\110"+
		"\1\130\1\131\1\uffff\1\75\1\uffff\1\75\4\uffff\1\60\3\uffff\1\122\1\56"+
		"\1\42\1\125\4\uffff\1\107\1\114\1\104\1\uffff\1\44\1\uffff\1\101\1\125"+
		"\1\124\1\113\1\116\1\101\1\125\1\117\1\115\2\114\1\122\1\117\1\123\1\111"+
		"\1\105\1\111\6\uffff\1\44\1\uffff\1\124\4\44\1\uffff\1\122\1\116\2\105"+
		"\2\44\1\104\1\116\1\115\1\44\1\105\1\137\1\101\1\125\1\124\1\117\1\122"+
		"\1\123\1\uffff\1\106\4\uffff\1\44\1\124\1\107\1\137\2\uffff\1\137\1\104"+
		"\1\44\1\uffff\1\103\1\102\1\111\1\120\1\111\1\116\1\105\1\124\1\70\1\uffff"+
		"\1\44\1\105\1\123\1\106\1\137\1\uffff\1\124\1\115\1\111\1\101\1\117\1"+
		"\107\1\44\1\116\2\44\1\123\1\42\1\uffff\1\122\1\105\1\111\1\122\1\44\1"+
		"\101\1\107\1\106\1\103\1\137\1\110\1\uffff\1\103\2\uffff\2\44\1\124\1"+
		"\114\1\117\1\uffff\1\114\1\137\1\106\1\110\2\103\2\124\2\uffff\1\44\1"+
		"\105\1\127\1\114\1\122\2\105\1\137\1\101\1\137\1\44\1\uffff\1\44\1\123"+
		"\1\137\1\105\1\122\1\44\1\106\1\103\1\112\1\uffff\1\117\1\uffff\1\44\1"+
		"\122\1\123\1\137\1\uffff\1\117\1\110\1\117\1\127\1\uffff\1\105\1\125\1"+
		"\122\1\125\1\105\1\111\1\44\1\123\1\114\1\105\1\116\1\44\1\116\1\uffff"+
		"\1\125\1\124\1\123\1\104\1\uffff\1\44\1\114\1\44\1\125\1\137\1\uffff\1"+
		"\124\1\uffff\1\114\1\122\1\44\1\124\1\117\1\uffff\1\44\1\127\1\uffff\1"+
		"\123\1\44\1\uffff";
	static final String DFA11_maxS =
		"\4\172\1\156\1\157\1\151\1\157\1\162\1\166\1\165\1\162\1\151\1\156\1\150"+
		"\1\170\1\171\1\uffff\1\76\1\uffff\1\75\4\uffff\1\71\3\uffff\1\162\1\145"+
		"\1\47\1\165\4\uffff\1\147\1\154\1\171\1\uffff\1\172\1\uffff\1\141\1\165"+
		"\1\164\1\170\1\156\1\141\1\165\1\157\1\155\2\154\1\162\1\157\1\163\1\151"+
		"\1\145\1\151\6\uffff\1\172\1\uffff\1\164\4\172\1\uffff\1\162\1\156\2\145"+
		"\2\172\1\144\1\156\1\155\1\172\1\145\1\137\1\141\1\165\1\164\1\157\1\162"+
		"\1\163\1\uffff\1\146\4\uffff\1\172\1\164\1\147\1\137\2\uffff\1\137\1\144"+
		"\1\172\1\uffff\1\143\1\163\1\151\1\160\1\151\1\156\1\145\1\164\1\70\1"+
		"\uffff\1\172\1\145\1\163\1\146\1\137\1\uffff\1\164\1\155\1\165\1\141\1"+
		"\157\1\147\1\172\1\156\2\172\1\163\1\47\1\uffff\1\162\1\145\1\151\1\162"+
		"\1\172\1\141\1\147\1\146\1\154\1\137\1\150\1\uffff\1\143\2\uffff\2\172"+
		"\1\164\1\154\1\157\1\uffff\1\154\1\137\1\146\1\150\2\143\2\164\2\uffff"+
		"\1\172\1\145\1\167\1\154\1\162\2\145\1\137\1\141\1\137\1\172\1\uffff\1"+
		"\172\1\163\1\137\1\145\1\162\1\172\1\146\1\143\1\152\1\uffff\1\157\1\uffff"+
		"\1\172\1\162\1\163\1\137\1\uffff\1\157\1\150\1\157\1\167\1\uffff\1\145"+
		"\1\165\1\162\1\165\1\145\1\151\1\172\1\163\1\154\1\145\1\156\1\172\1\156"+
		"\1\uffff\1\165\1\164\1\163\1\144\1\uffff\1\172\1\154\1\172\1\165\1\137"+
		"\1\uffff\1\164\1\uffff\1\154\1\162\1\172\1\164\1\157\1\uffff\1\172\1\167"+
		"\1\uffff\1\163\1\172\1\uffff";
	static final String DFA11_acceptS =
		"\21\uffff\1\40\1\uffff\1\41\1\uffff\1\44\1\45\1\46\1\47\1\uffff\1\53\1"+
		"\54\1\55\4\uffff\1\62\1\63\1\64\1\1\3\uffff\1\2\1\uffff\1\3\21\uffff\1"+
		"\42\1\51\1\43\1\50\1\52\1\61\1\uffff\1\60\5\uffff\1\37\22\uffff\1\56\1"+
		"\uffff\1\11\1\26\1\35\1\57\4\uffff\1\13\1\14\3\uffff\1\15\11\uffff\1\5"+
		"\5\uffff\1\33\14\uffff\1\12\13\uffff\1\16\1\uffff\1\32\1\34\5\uffff\1"+
		"\17\10\uffff\1\36\1\4\13\uffff\1\6\11\uffff\1\27\1\uffff\1\7\4\uffff\1"+
		"\23\4\uffff\1\10\15\uffff\1\30\4\uffff\1\24\5\uffff\1\31\1\uffff\1\21"+
		"\5\uffff\1\20\2\uffff\1\22\2\uffff\1\25";
	static final String DFA11_specialS =
		"\u00f1\uffff}>";
	static final String[] DFA11_transitionS = {
			"\2\43\2\uffff\1\43\22\uffff\1\43\1\23\1\41\1\uffff\1\42\2\uffff\1\41"+
			"\1\30\1\27\1\26\1\32\1\34\1\33\1\31\1\uffff\12\36\1\uffff\1\25\1\22\1"+
			"\21\1\24\2\uffff\1\1\1\2\1\3\1\14\1\17\1\10\1\13\1\42\1\4\2\42\1\7\1"+
			"\6\1\37\1\35\3\42\1\12\1\42\1\15\1\42\1\16\3\42\4\uffff\1\40\1\uffff"+
			"\1\11\1\20\1\5\1\14\1\17\1\10\1\13\1\42\1\4\2\42\1\7\1\6\1\37\1\35\3"+
			"\42\1\12\1\42\1\15\1\42\1\16\3\42",
			"\1\42\13\uffff\12\42\7\uffff\13\42\1\46\1\42\1\47\7\42\1\45\4\42\4\uffff"+
			"\1\42\1\uffff\13\42\1\46\1\42\1\47\7\42\1\45\4\42",
			"\1\42\13\uffff\12\42\7\uffff\30\42\1\51\1\42\4\uffff\1\42\1\uffff\30"+
			"\42\1\51\1\42",
			"\1\42\13\uffff\12\42\7\uffff\7\42\1\53\6\42\1\54\13\42\4\uffff\1\42"+
			"\1\uffff\7\42\1\53\6\42\1\54\13\42",
			"\1\55\37\uffff\1\55",
			"\1\53\6\uffff\1\54\30\uffff\1\53\6\uffff\1\54",
			"\1\56\7\uffff\1\57\27\uffff\1\56\7\uffff\1\57",
			"\1\60\37\uffff\1\60",
			"\1\61\2\uffff\1\62\34\uffff\1\61\2\uffff\1\62",
			"\1\46\1\uffff\1\47\7\uffff\1\45\25\uffff\1\46\1\uffff\1\47\7\uffff\1"+
			"\45",
			"\1\64\13\uffff\1\65\2\uffff\1\66\1\63\17\uffff\1\64\13\uffff\1\65\2"+
			"\uffff\1\66\1\63",
			"\1\67\37\uffff\1\67",
			"\1\70\37\uffff\1\70",
			"\1\71\37\uffff\1\71",
			"\1\72\37\uffff\1\72",
			"\1\73\37\uffff\1\73",
			"\1\51\37\uffff\1\51",
			"",
			"\1\74\1\23",
			"",
			"\1\76",
			"",
			"",
			"",
			"",
			"\12\101",
			"",
			"",
			"",
			"\1\102\37\uffff\1\102",
			"\1\101\1\uffff\12\36\13\uffff\1\101\37\uffff\1\101",
			"\1\41\4\uffff\1\41",
			"\1\104\37\uffff\1\104",
			"",
			"",
			"",
			"",
			"\1\105\37\uffff\1\105",
			"\1\106\37\uffff\1\106",
			"\1\110\24\uffff\1\107\12\uffff\1\110\24\uffff\1\107",
			"",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"\1\112\37\uffff\1\112",
			"\1\113\37\uffff\1\113",
			"\1\114\37\uffff\1\114",
			"\1\115\14\uffff\1\116\22\uffff\1\115\14\uffff\1\116",
			"\1\117\37\uffff\1\117",
			"\1\120\37\uffff\1\120",
			"\1\121\37\uffff\1\121",
			"\1\122\37\uffff\1\122",
			"\1\123\37\uffff\1\123",
			"\1\124\37\uffff\1\124",
			"\1\125\37\uffff\1\125",
			"\1\126\37\uffff\1\126",
			"\1\127\37\uffff\1\127",
			"\1\130\37\uffff\1\130",
			"\1\131\37\uffff\1\131",
			"\1\132\37\uffff\1\132",
			"\1\133\37\uffff\1\133",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"\1\135\37\uffff\1\135",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"\1\142\37\uffff\1\142",
			"\1\143\37\uffff\1\143",
			"\1\144\37\uffff\1\144",
			"\1\145\37\uffff\1\145",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\150\37\uffff\1\150",
			"\1\151\37\uffff\1\151",
			"\1\152\37\uffff\1\152",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\154\37\uffff\1\154",
			"\1\155",
			"\1\156\37\uffff\1\156",
			"\1\157\37\uffff\1\157",
			"\1\160\37\uffff\1\160",
			"\1\161\37\uffff\1\161",
			"\1\162\37\uffff\1\162",
			"\1\163\37\uffff\1\163",
			"",
			"\1\164\37\uffff\1\164",
			"",
			"",
			"",
			"",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\166\37\uffff\1\166",
			"\1\167\37\uffff\1\167",
			"\1\170",
			"",
			"",
			"\1\171",
			"\1\172\37\uffff\1\172",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"\1\174\37\uffff\1\174",
			"\1\176\1\177\12\uffff\1\u0080\4\uffff\1\175\16\uffff\1\176\1\177\12"+
			"\uffff\1\u0080\4\uffff\1\175",
			"\1\u0081\37\uffff\1\u0081",
			"\1\u0082\37\uffff\1\u0082",
			"\1\u0083\37\uffff\1\u0083",
			"\1\u0084\37\uffff\1\u0084",
			"\1\u0085\37\uffff\1\u0085",
			"\1\u0086\37\uffff\1\u0086",
			"\1\u0087",
			"",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u0089\37\uffff\1\u0089",
			"\1\u008a\37\uffff\1\u008a",
			"\1\u008b\37\uffff\1\u008b",
			"\1\u008c",
			"",
			"\1\u008d\37\uffff\1\u008d",
			"\1\u008e\37\uffff\1\u008e",
			"\1\u008f\13\uffff\1\u0090\23\uffff\1\u008f\13\uffff\1\u0090",
			"\1\u0091\37\uffff\1\u0091",
			"\1\u0092\37\uffff\1\u0092",
			"\1\u0093\37\uffff\1\u0093",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u0095\37\uffff\1\u0095",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u0098\37\uffff\1\u0098",
			"\1\41\4\uffff\1\41",
			"",
			"\1\u0099\37\uffff\1\u0099",
			"\1\u009a\37\uffff\1\u009a",
			"\1\u009b\37\uffff\1\u009b",
			"\1\u009c\37\uffff\1\u009c",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u009e\37\uffff\1\u009e",
			"\1\u009f\37\uffff\1\u009f",
			"\1\u00a0\37\uffff\1\u00a0",
			"\1\u00a1\10\uffff\1\u00a2\26\uffff\1\u00a1\10\uffff\1\u00a2",
			"\1\u00a3",
			"\1\u00a4\37\uffff\1\u00a4",
			"",
			"\1\u00a5\37\uffff\1\u00a5",
			"",
			"",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00a8\37\uffff\1\u00a8",
			"\1\u00a9\37\uffff\1\u00a9",
			"\1\u00aa\37\uffff\1\u00aa",
			"",
			"\1\u00ab\37\uffff\1\u00ab",
			"\1\u00ac",
			"\1\u00ad\37\uffff\1\u00ad",
			"\1\u00ae\37\uffff\1\u00ae",
			"\1\u00af\37\uffff\1\u00af",
			"\1\u00b0\37\uffff\1\u00b0",
			"\1\u00b1\37\uffff\1\u00b1",
			"\1\u00b2\37\uffff\1\u00b2",
			"",
			"",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00b4\37\uffff\1\u00b4",
			"\1\u00b5\37\uffff\1\u00b5",
			"\1\u00b6\37\uffff\1\u00b6",
			"\1\u00b7\37\uffff\1\u00b7",
			"\1\u00b8\37\uffff\1\u00b8",
			"\1\u00b9\37\uffff\1\u00b9",
			"\1\u00ba",
			"\1\u00bb\37\uffff\1\u00bb",
			"\1\u00bc",
			"\1\42\13\uffff\12\42\7\uffff\21\42\1\u00be\10\42\4\uffff\1\42\1\uffff"+
			"\21\42\1\u00be\10\42",
			"",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00c0\37\uffff\1\u00c0",
			"\1\u00c1",
			"\1\u00c2\37\uffff\1\u00c2",
			"\1\u00c3\37\uffff\1\u00c3",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00c5\37\uffff\1\u00c5",
			"\1\u00c6\37\uffff\1\u00c6",
			"\1\u00c7\37\uffff\1\u00c7",
			"",
			"\1\u00c8\37\uffff\1\u00c8",
			"",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00ca\37\uffff\1\u00ca",
			"\1\u00cb\37\uffff\1\u00cb",
			"\1\u00cc",
			"",
			"\1\u00cd\37\uffff\1\u00cd",
			"\1\u00ce\37\uffff\1\u00ce",
			"\1\u00cf\37\uffff\1\u00cf",
			"\1\u00d0\37\uffff\1\u00d0",
			"",
			"\1\u00d1\37\uffff\1\u00d1",
			"\1\u00d2\37\uffff\1\u00d2",
			"\1\u00d3\37\uffff\1\u00d3",
			"\1\u00d4\37\uffff\1\u00d4",
			"\1\u00d5\37\uffff\1\u00d5",
			"\1\u00d6\37\uffff\1\u00d6",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00d8\37\uffff\1\u00d8",
			"\1\u00d9\37\uffff\1\u00d9",
			"\1\u00da\37\uffff\1\u00da",
			"\1\u00db\37\uffff\1\u00db",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00dd\37\uffff\1\u00dd",
			"",
			"\1\u00de\37\uffff\1\u00de",
			"\1\u00df\37\uffff\1\u00df",
			"\1\u00e0\37\uffff\1\u00e0",
			"\1\u00e1\37\uffff\1\u00e1",
			"",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00e3\37\uffff\1\u00e3",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00e5\37\uffff\1\u00e5",
			"\1\u00e6",
			"",
			"\1\u00e7\37\uffff\1\u00e7",
			"",
			"\1\u00e8\37\uffff\1\u00e8",
			"\1\u00e9\37\uffff\1\u00e9",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00eb\37\uffff\1\u00eb",
			"\1\u00ec\37\uffff\1\u00ec",
			"",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00ee\37\uffff\1\u00ee",
			"",
			"\1\u00ef\37\uffff\1\u00ef",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__79 | T__80 | T__81 | INTEGER_SYM | CHAR | MAKE_SET | LOAD_FILE | FOUND_ROWS | AVG | COUNT | MAX_SYM | MIN_SYM | SUM | GROUP_SYM | SELECT | SQL_SMALL_RESULT | SQL_BIG_RESULT | SQL_BUFFER_RESULT | SQL_CACHE_SYM | SQL_NO_CACHE_SYM | SQL_CALC_FOUND_ROWS | ALL | DISTINCT | DISTINCTROW | STRAIGHT_JOIN | UNION_SYM | FROM | WHERE | ANY | EXISTS | BY_SYM | EQ_SYM | NOT_EQ | LET | GET | SEMI | ASTERISK | RPAREN | LPAREN | GTH | LTH | DOT | PLUS | MINUS | COMMA | OR_SYM | AND_SYM | INTEGER_NUM | REAL_NUMBER | TEXT_STRING | ID | WHITE_SPACE );";
		}
	}

}
