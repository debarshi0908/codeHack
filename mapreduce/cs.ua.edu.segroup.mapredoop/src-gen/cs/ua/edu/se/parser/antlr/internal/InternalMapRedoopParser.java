package cs.ua.edu.se.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import cs.ua.edu.se.services.MapRedoopGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMapRedoopParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BLOCK", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'program'", "'extend'", "'map('", "','", "')'", "'reduce('", "'int'", "'float'", "'double'", "'text'", "'long'", "'metaelement'", "';'", "'read'", "'write'", "'*'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_BLOCK=5;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalMapRedoopParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g"; }



     	private MapRedoopGrammarAccess grammarAccess;
     	
        public InternalMapRedoopParser(TokenStream input, IAstFactory factory, MapRedoopGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MapRedoop";	
       	}
       	
       	@Override
       	protected MapRedoopGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleMapRedoop
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:77:1: entryRuleMapRedoop returns [EObject current=null] : iv_ruleMapRedoop= ruleMapRedoop EOF ;
    public final EObject entryRuleMapRedoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapRedoop = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:78:2: (iv_ruleMapRedoop= ruleMapRedoop EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:79:2: iv_ruleMapRedoop= ruleMapRedoop EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMapRedoopRule(), currentNode); 
            pushFollow(FOLLOW_ruleMapRedoop_in_entryRuleMapRedoop75);
            iv_ruleMapRedoop=ruleMapRedoop();
            _fsp--;

             current =iv_ruleMapRedoop; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapRedoop85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMapRedoop


    // $ANTLR start ruleMapRedoop
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:86:1: ruleMapRedoop returns [EObject current=null] : ( ( (lv_declaration_0_0= ruleDeclaration ) ) '{' ( (lv_content_2_0= ruleContent ) )* '}' ) ;
    public final EObject ruleMapRedoop() throws RecognitionException {
        EObject current = null;

        EObject lv_declaration_0_0 = null;

        EObject lv_content_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:91:6: ( ( ( (lv_declaration_0_0= ruleDeclaration ) ) '{' ( (lv_content_2_0= ruleContent ) )* '}' ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:92:1: ( ( (lv_declaration_0_0= ruleDeclaration ) ) '{' ( (lv_content_2_0= ruleContent ) )* '}' )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:92:1: ( ( (lv_declaration_0_0= ruleDeclaration ) ) '{' ( (lv_content_2_0= ruleContent ) )* '}' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:92:2: ( (lv_declaration_0_0= ruleDeclaration ) ) '{' ( (lv_content_2_0= ruleContent ) )* '}'
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:92:2: ( (lv_declaration_0_0= ruleDeclaration ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:93:1: (lv_declaration_0_0= ruleDeclaration )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:93:1: (lv_declaration_0_0= ruleDeclaration )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:94:3: lv_declaration_0_0= ruleDeclaration
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMapRedoopAccess().getDeclarationDeclarationParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDeclaration_in_ruleMapRedoop131);
            lv_declaration_0_0=ruleDeclaration();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMapRedoopRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"declaration",
            	        		lv_declaration_0_0, 
            	        		"Declaration", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleMapRedoop141); 

                    createLeafNode(grammarAccess.getMapRedoopAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:120:1: ( (lv_content_2_0= ruleContent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:121:1: (lv_content_2_0= ruleContent )
            	    {
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:121:1: (lv_content_2_0= ruleContent )
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:122:3: lv_content_2_0= ruleContent
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMapRedoopAccess().getContentContentParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleContent_in_ruleMapRedoop162);
            	    lv_content_2_0=ruleContent();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMapRedoopRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"content",
            	    	        		lv_content_2_0, 
            	    	        		"Content", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleMapRedoop173); 

                    createLeafNode(grammarAccess.getMapRedoopAccess().getRightCurlyBracketKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMapRedoop


    // $ANTLR start entryRuleContent
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:156:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:157:2: (iv_ruleContent= ruleContent EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:158:2: iv_ruleContent= ruleContent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContentRule(), currentNode); 
            pushFollow(FOLLOW_ruleContent_in_entryRuleContent209);
            iv_ruleContent=ruleContent();
            _fsp--;

             current =iv_ruleContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContent219); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleContent


    // $ANTLR start ruleContent
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:165:1: ruleContent returns [EObject current=null] : ( ( (lv_entities_0_0= ruleListofEntities ) ) | ( (lv_mrBlocks_1_0= ruleMRBlock ) ) ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_0_0 = null;

        EObject lv_mrBlocks_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:170:6: ( ( ( (lv_entities_0_0= ruleListofEntities ) ) | ( (lv_mrBlocks_1_0= ruleMRBlock ) ) ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:171:1: ( ( (lv_entities_0_0= ruleListofEntities ) ) | ( (lv_mrBlocks_1_0= ruleMRBlock ) ) )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:171:1: ( ( (lv_entities_0_0= ruleListofEntities ) ) | ( (lv_mrBlocks_1_0= ruleMRBlock ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("171:1: ( ( (lv_entities_0_0= ruleListofEntities ) ) | ( (lv_mrBlocks_1_0= ruleMRBlock ) ) )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:171:2: ( (lv_entities_0_0= ruleListofEntities ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:171:2: ( (lv_entities_0_0= ruleListofEntities ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:172:1: (lv_entities_0_0= ruleListofEntities )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:172:1: (lv_entities_0_0= ruleListofEntities )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:173:3: lv_entities_0_0= ruleListofEntities
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getContentAccess().getEntitiesListofEntitiesParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleListofEntities_in_ruleContent265);
                    lv_entities_0_0=ruleListofEntities();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getContentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"entities",
                    	        		lv_entities_0_0, 
                    	        		"ListofEntities", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:196:6: ( (lv_mrBlocks_1_0= ruleMRBlock ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:196:6: ( (lv_mrBlocks_1_0= ruleMRBlock ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:197:1: (lv_mrBlocks_1_0= ruleMRBlock )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:197:1: (lv_mrBlocks_1_0= ruleMRBlock )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:198:3: lv_mrBlocks_1_0= ruleMRBlock
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getContentAccess().getMrBlocksMRBlockParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleMRBlock_in_ruleContent292);
                    lv_mrBlocks_1_0=ruleMRBlock();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getContentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"mrBlocks",
                    	        		lv_mrBlocks_1_0, 
                    	        		"MRBlock", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleContent


    // $ANTLR start entryRuleListofEntities
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:228:1: entryRuleListofEntities returns [EObject current=null] : iv_ruleListofEntities= ruleListofEntities EOF ;
    public final EObject entryRuleListofEntities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListofEntities = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:229:2: (iv_ruleListofEntities= ruleListofEntities EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:230:2: iv_ruleListofEntities= ruleListofEntities EOF
            {
             currentNode = createCompositeNode(grammarAccess.getListofEntitiesRule(), currentNode); 
            pushFollow(FOLLOW_ruleListofEntities_in_entryRuleListofEntities328);
            iv_ruleListofEntities=ruleListofEntities();
            _fsp--;

             current =iv_ruleListofEntities; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListofEntities338); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleListofEntities


    // $ANTLR start ruleListofEntities
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:237:1: ruleListofEntities returns [EObject current=null] : ( () '{' ( (lv_entities_2_0= ruleEntity ) )* '}' ) ;
    public final EObject ruleListofEntities() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:242:6: ( ( () '{' ( (lv_entities_2_0= ruleEntity ) )* '}' ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:243:1: ( () '{' ( (lv_entities_2_0= ruleEntity ) )* '}' )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:243:1: ( () '{' ( (lv_entities_2_0= ruleEntity ) )* '}' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:243:2: () '{' ( (lv_entities_2_0= ruleEntity ) )* '}'
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:243:2: ()
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:244:5: 
            {
             
                    temp=factory.create(grammarAccess.getListofEntitiesAccess().getListofEntitiesAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getListofEntitiesAccess().getListofEntitiesAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,12,FOLLOW_12_in_ruleListofEntities382); 

                    createLeafNode(grammarAccess.getListofEntitiesAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:258:1: ( (lv_entities_2_0= ruleEntity ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:259:1: (lv_entities_2_0= ruleEntity )
            	    {
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:259:1: (lv_entities_2_0= ruleEntity )
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:260:3: lv_entities_2_0= ruleEntity
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getListofEntitiesAccess().getEntitiesEntityParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleListofEntities403);
            	    lv_entities_2_0=ruleEntity();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getListofEntitiesRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"entities",
            	    	        		lv_entities_2_0, 
            	    	        		"Entity", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleListofEntities414); 

                    createLeafNode(grammarAccess.getListofEntitiesAccess().getRightCurlyBracketKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleListofEntities


    // $ANTLR start entryRuleMRBlock
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:294:1: entryRuleMRBlock returns [EObject current=null] : iv_ruleMRBlock= ruleMRBlock EOF ;
    public final EObject entryRuleMRBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMRBlock = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:295:2: (iv_ruleMRBlock= ruleMRBlock EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:296:2: iv_ruleMRBlock= ruleMRBlock EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMRBlockRule(), currentNode); 
            pushFollow(FOLLOW_ruleMRBlock_in_entryRuleMRBlock450);
            iv_ruleMRBlock=ruleMRBlock();
            _fsp--;

             current =iv_ruleMRBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMRBlock460); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMRBlock


    // $ANTLR start ruleMRBlock
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:303:1: ruleMRBlock returns [EObject current=null] : ( ( (lv_mapper_0_0= ruleMapper ) ) ( (lv_reducer_1_0= ruleReducer ) ) ) ;
    public final EObject ruleMRBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_mapper_0_0 = null;

        EObject lv_reducer_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:308:6: ( ( ( (lv_mapper_0_0= ruleMapper ) ) ( (lv_reducer_1_0= ruleReducer ) ) ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:309:1: ( ( (lv_mapper_0_0= ruleMapper ) ) ( (lv_reducer_1_0= ruleReducer ) ) )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:309:1: ( ( (lv_mapper_0_0= ruleMapper ) ) ( (lv_reducer_1_0= ruleReducer ) ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:309:2: ( (lv_mapper_0_0= ruleMapper ) ) ( (lv_reducer_1_0= ruleReducer ) )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:309:2: ( (lv_mapper_0_0= ruleMapper ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:310:1: (lv_mapper_0_0= ruleMapper )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:310:1: (lv_mapper_0_0= ruleMapper )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:311:3: lv_mapper_0_0= ruleMapper
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMRBlockAccess().getMapperMapperParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMapper_in_ruleMRBlock506);
            lv_mapper_0_0=ruleMapper();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMRBlockRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"mapper",
            	        		lv_mapper_0_0, 
            	        		"Mapper", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:333:2: ( (lv_reducer_1_0= ruleReducer ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:334:1: (lv_reducer_1_0= ruleReducer )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:334:1: (lv_reducer_1_0= ruleReducer )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:335:3: lv_reducer_1_0= ruleReducer
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMRBlockAccess().getReducerReducerParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReducer_in_ruleMRBlock527);
            lv_reducer_1_0=ruleReducer();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMRBlockRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"reducer",
            	        		lv_reducer_1_0, 
            	        		"Reducer", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMRBlock


    // $ANTLR start entryRuleDeclaration
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:365:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:366:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:367:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration563);
            iv_ruleDeclaration=ruleDeclaration();
            _fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration573); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDeclaration


    // $ANTLR start ruleDeclaration
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:374:1: ruleDeclaration returns [EObject current=null] : ( 'program' ( (lv_name_1_0= RULE_ID ) ) ( 'extend' ( (lv_superName_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_superName_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:379:6: ( ( 'program' ( (lv_name_1_0= RULE_ID ) ) ( 'extend' ( (lv_superName_3_0= RULE_ID ) ) )? ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:380:1: ( 'program' ( (lv_name_1_0= RULE_ID ) ) ( 'extend' ( (lv_superName_3_0= RULE_ID ) ) )? )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:380:1: ( 'program' ( (lv_name_1_0= RULE_ID ) ) ( 'extend' ( (lv_superName_3_0= RULE_ID ) ) )? )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:380:3: 'program' ( (lv_name_1_0= RULE_ID ) ) ( 'extend' ( (lv_superName_3_0= RULE_ID ) ) )?
            {
            match(input,14,FOLLOW_14_in_ruleDeclaration608); 

                    createLeafNode(grammarAccess.getDeclarationAccess().getProgramKeyword_0(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:384:1: ( (lv_name_1_0= RULE_ID ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:385:1: (lv_name_1_0= RULE_ID )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:385:1: (lv_name_1_0= RULE_ID )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:386:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclaration625); 

            			createLeafNode(grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDeclarationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:408:2: ( 'extend' ( (lv_superName_3_0= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:408:4: 'extend' ( (lv_superName_3_0= RULE_ID ) )
                    {
                    match(input,15,FOLLOW_15_in_ruleDeclaration641); 

                            createLeafNode(grammarAccess.getDeclarationAccess().getExtendKeyword_2_0(), null); 
                        
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:412:1: ( (lv_superName_3_0= RULE_ID ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:413:1: (lv_superName_3_0= RULE_ID )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:413:1: (lv_superName_3_0= RULE_ID )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:414:3: lv_superName_3_0= RULE_ID
                    {
                    lv_superName_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclaration658); 

                    			createLeafNode(grammarAccess.getDeclarationAccess().getSuperNameIDTerminalRuleCall_2_1_0(), "superName"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"superName",
                    	        		lv_superName_3_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDeclaration


    // $ANTLR start entryRuleMapper
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:444:1: entryRuleMapper returns [EObject current=null] : iv_ruleMapper= ruleMapper EOF ;
    public final EObject entryRuleMapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapper = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:445:2: (iv_ruleMapper= ruleMapper EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:446:2: iv_ruleMapper= ruleMapper EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMapperRule(), currentNode); 
            pushFollow(FOLLOW_ruleMapper_in_entryRuleMapper701);
            iv_ruleMapper=ruleMapper();
            _fsp--;

             current =iv_ruleMapper; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapper711); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMapper


    // $ANTLR start ruleMapper
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:453:1: ruleMapper returns [EObject current=null] : ( 'map(' ( (lv_inkey_1_0= ruleArgument ) ) ',' ( (lv_invalue_3_0= ruleArgument ) ) ',' ( (lv_outkey_5_0= ruleArgument ) ) ',' ( (lv_outvalue_7_0= ruleArgument ) ) ')' RULE_BLOCK ) ;
    public final EObject ruleMapper() throws RecognitionException {
        EObject current = null;

        EObject lv_inkey_1_0 = null;

        EObject lv_invalue_3_0 = null;

        EObject lv_outkey_5_0 = null;

        EObject lv_outvalue_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:458:6: ( ( 'map(' ( (lv_inkey_1_0= ruleArgument ) ) ',' ( (lv_invalue_3_0= ruleArgument ) ) ',' ( (lv_outkey_5_0= ruleArgument ) ) ',' ( (lv_outvalue_7_0= ruleArgument ) ) ')' RULE_BLOCK ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:459:1: ( 'map(' ( (lv_inkey_1_0= ruleArgument ) ) ',' ( (lv_invalue_3_0= ruleArgument ) ) ',' ( (lv_outkey_5_0= ruleArgument ) ) ',' ( (lv_outvalue_7_0= ruleArgument ) ) ')' RULE_BLOCK )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:459:1: ( 'map(' ( (lv_inkey_1_0= ruleArgument ) ) ',' ( (lv_invalue_3_0= ruleArgument ) ) ',' ( (lv_outkey_5_0= ruleArgument ) ) ',' ( (lv_outvalue_7_0= ruleArgument ) ) ')' RULE_BLOCK )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:459:3: 'map(' ( (lv_inkey_1_0= ruleArgument ) ) ',' ( (lv_invalue_3_0= ruleArgument ) ) ',' ( (lv_outkey_5_0= ruleArgument ) ) ',' ( (lv_outvalue_7_0= ruleArgument ) ) ')' RULE_BLOCK
            {
            match(input,16,FOLLOW_16_in_ruleMapper746); 

                    createLeafNode(grammarAccess.getMapperAccess().getMapKeyword_0(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:463:1: ( (lv_inkey_1_0= ruleArgument ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:464:1: (lv_inkey_1_0= ruleArgument )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:464:1: (lv_inkey_1_0= ruleArgument )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:465:3: lv_inkey_1_0= ruleArgument
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMapperAccess().getInkeyArgumentParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleArgument_in_ruleMapper767);
            lv_inkey_1_0=ruleArgument();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMapperRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"inkey",
            	        		lv_inkey_1_0, 
            	        		"Argument", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleMapper777); 

                    createLeafNode(grammarAccess.getMapperAccess().getCommaKeyword_2(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:491:1: ( (lv_invalue_3_0= ruleArgument ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:492:1: (lv_invalue_3_0= ruleArgument )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:492:1: (lv_invalue_3_0= ruleArgument )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:493:3: lv_invalue_3_0= ruleArgument
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMapperAccess().getInvalueArgumentParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleArgument_in_ruleMapper798);
            lv_invalue_3_0=ruleArgument();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMapperRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"invalue",
            	        		lv_invalue_3_0, 
            	        		"Argument", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleMapper808); 

                    createLeafNode(grammarAccess.getMapperAccess().getCommaKeyword_4(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:519:1: ( (lv_outkey_5_0= ruleArgument ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:520:1: (lv_outkey_5_0= ruleArgument )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:520:1: (lv_outkey_5_0= ruleArgument )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:521:3: lv_outkey_5_0= ruleArgument
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMapperAccess().getOutkeyArgumentParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleArgument_in_ruleMapper829);
            lv_outkey_5_0=ruleArgument();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMapperRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"outkey",
            	        		lv_outkey_5_0, 
            	        		"Argument", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleMapper839); 

                    createLeafNode(grammarAccess.getMapperAccess().getCommaKeyword_6(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:547:1: ( (lv_outvalue_7_0= ruleArgument ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:548:1: (lv_outvalue_7_0= ruleArgument )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:548:1: (lv_outvalue_7_0= ruleArgument )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:549:3: lv_outvalue_7_0= ruleArgument
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMapperAccess().getOutvalueArgumentParserRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleArgument_in_ruleMapper860);
            lv_outvalue_7_0=ruleArgument();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMapperRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"outvalue",
            	        		lv_outvalue_7_0, 
            	        		"Argument", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,18,FOLLOW_18_in_ruleMapper870); 

                    createLeafNode(grammarAccess.getMapperAccess().getRightParenthesisKeyword_8(), null); 
                
            match(input,RULE_BLOCK,FOLLOW_RULE_BLOCK_in_ruleMapper879); 
             
                createLeafNode(grammarAccess.getMapperAccess().getBlockTerminalRuleCall_9(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMapper


    // $ANTLR start entryRuleArgument
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:587:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:588:2: (iv_ruleArgument= ruleArgument EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:589:2: iv_ruleArgument= ruleArgument EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArgumentRule(), currentNode); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument914);
            iv_ruleArgument=ruleArgument();
            _fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument924); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleArgument


    // $ANTLR start ruleArgument
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:596:1: ruleArgument returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_argname_1_0= RULE_ID ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_argname_1_0=null;
        EObject lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:601:6: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_argname_1_0= RULE_ID ) ) ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:602:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_argname_1_0= RULE_ID ) ) )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:602:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_argname_1_0= RULE_ID ) ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:602:2: ( (lv_type_0_0= ruleType ) ) ( (lv_argname_1_0= RULE_ID ) )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:602:2: ( (lv_type_0_0= ruleType ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:603:1: (lv_type_0_0= ruleType )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:603:1: (lv_type_0_0= ruleType )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:604:3: lv_type_0_0= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getTypeTypeParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleArgument970);
            lv_type_0_0=ruleType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_0_0, 
            	        		"Type", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:626:2: ( (lv_argname_1_0= RULE_ID ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:627:1: (lv_argname_1_0= RULE_ID )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:627:1: (lv_argname_1_0= RULE_ID )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:628:3: lv_argname_1_0= RULE_ID
            {
            lv_argname_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument987); 

            			createLeafNode(grammarAccess.getArgumentAccess().getArgnameIDTerminalRuleCall_1_0(), "argname"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"argname",
            	        		lv_argname_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleArgument


    // $ANTLR start entryRuleReducer
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:658:1: entryRuleReducer returns [EObject current=null] : iv_ruleReducer= ruleReducer EOF ;
    public final EObject entryRuleReducer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReducer = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:659:2: (iv_ruleReducer= ruleReducer EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:660:2: iv_ruleReducer= ruleReducer EOF
            {
             currentNode = createCompositeNode(grammarAccess.getReducerRule(), currentNode); 
            pushFollow(FOLLOW_ruleReducer_in_entryRuleReducer1028);
            iv_ruleReducer=ruleReducer();
            _fsp--;

             current =iv_ruleReducer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReducer1038); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleReducer


    // $ANTLR start ruleReducer
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:667:1: ruleReducer returns [EObject current=null] : ( 'reduce(' ( (lv_outkey_1_0= ruleArgument ) ) ',' ( (lv_outvalue_3_0= ruleArgument ) ) ')' RULE_BLOCK ) ;
    public final EObject ruleReducer() throws RecognitionException {
        EObject current = null;

        EObject lv_outkey_1_0 = null;

        EObject lv_outvalue_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:672:6: ( ( 'reduce(' ( (lv_outkey_1_0= ruleArgument ) ) ',' ( (lv_outvalue_3_0= ruleArgument ) ) ')' RULE_BLOCK ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:673:1: ( 'reduce(' ( (lv_outkey_1_0= ruleArgument ) ) ',' ( (lv_outvalue_3_0= ruleArgument ) ) ')' RULE_BLOCK )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:673:1: ( 'reduce(' ( (lv_outkey_1_0= ruleArgument ) ) ',' ( (lv_outvalue_3_0= ruleArgument ) ) ')' RULE_BLOCK )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:673:3: 'reduce(' ( (lv_outkey_1_0= ruleArgument ) ) ',' ( (lv_outvalue_3_0= ruleArgument ) ) ')' RULE_BLOCK
            {
            match(input,19,FOLLOW_19_in_ruleReducer1073); 

                    createLeafNode(grammarAccess.getReducerAccess().getReduceKeyword_0(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:677:1: ( (lv_outkey_1_0= ruleArgument ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:678:1: (lv_outkey_1_0= ruleArgument )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:678:1: (lv_outkey_1_0= ruleArgument )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:679:3: lv_outkey_1_0= ruleArgument
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getReducerAccess().getOutkeyArgumentParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleArgument_in_ruleReducer1094);
            lv_outkey_1_0=ruleArgument();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getReducerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"outkey",
            	        		lv_outkey_1_0, 
            	        		"Argument", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleReducer1104); 

                    createLeafNode(grammarAccess.getReducerAccess().getCommaKeyword_2(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:705:1: ( (lv_outvalue_3_0= ruleArgument ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:706:1: (lv_outvalue_3_0= ruleArgument )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:706:1: (lv_outvalue_3_0= ruleArgument )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:707:3: lv_outvalue_3_0= ruleArgument
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getReducerAccess().getOutvalueArgumentParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleArgument_in_ruleReducer1125);
            lv_outvalue_3_0=ruleArgument();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getReducerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"outvalue",
            	        		lv_outvalue_3_0, 
            	        		"Argument", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,18,FOLLOW_18_in_ruleReducer1135); 

                    createLeafNode(grammarAccess.getReducerAccess().getRightParenthesisKeyword_4(), null); 
                
            match(input,RULE_BLOCK,FOLLOW_RULE_BLOCK_in_ruleReducer1144); 
             
                createLeafNode(grammarAccess.getReducerAccess().getBlockTerminalRuleCall_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleReducer


    // $ANTLR start entryRuleType
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:745:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:746:2: (iv_ruleType= ruleType EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:747:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1179);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1189); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:754:1: ruleType returns [EObject current=null] : ( ( (lv_type_0_0= 'int' ) ) | ( (lv_type_1_0= 'float' ) ) | ( (lv_type_2_0= 'double' ) ) | ( (lv_type_3_0= 'text' ) ) | ( (lv_type_4_0= 'long' ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_type_1_0=null;
        Token lv_type_2_0=null;
        Token lv_type_3_0=null;
        Token lv_type_4_0=null;
        Token lv_name_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:759:6: ( ( ( (lv_type_0_0= 'int' ) ) | ( (lv_type_1_0= 'float' ) ) | ( (lv_type_2_0= 'double' ) ) | ( (lv_type_3_0= 'text' ) ) | ( (lv_type_4_0= 'long' ) ) | ( (lv_name_5_0= RULE_ID ) ) ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:760:1: ( ( (lv_type_0_0= 'int' ) ) | ( (lv_type_1_0= 'float' ) ) | ( (lv_type_2_0= 'double' ) ) | ( (lv_type_3_0= 'text' ) ) | ( (lv_type_4_0= 'long' ) ) | ( (lv_name_5_0= RULE_ID ) ) )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:760:1: ( ( (lv_type_0_0= 'int' ) ) | ( (lv_type_1_0= 'float' ) ) | ( (lv_type_2_0= 'double' ) ) | ( (lv_type_3_0= 'text' ) ) | ( (lv_type_4_0= 'long' ) ) | ( (lv_name_5_0= RULE_ID ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            case 23:
                {
                alt5=4;
                }
                break;
            case 24:
                {
                alt5=5;
                }
                break;
            case RULE_ID:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("760:1: ( ( (lv_type_0_0= 'int' ) ) | ( (lv_type_1_0= 'float' ) ) | ( (lv_type_2_0= 'double' ) ) | ( (lv_type_3_0= 'text' ) ) | ( (lv_type_4_0= 'long' ) ) | ( (lv_name_5_0= RULE_ID ) ) )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:760:2: ( (lv_type_0_0= 'int' ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:760:2: ( (lv_type_0_0= 'int' ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:761:1: (lv_type_0_0= 'int' )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:761:1: (lv_type_0_0= 'int' )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:762:3: lv_type_0_0= 'int'
                    {
                    lv_type_0_0=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_ruleType1232); 

                            createLeafNode(grammarAccess.getTypeAccess().getTypeIntKeyword_0_0(), "type"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_0_0, "int", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:782:6: ( (lv_type_1_0= 'float' ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:782:6: ( (lv_type_1_0= 'float' ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:783:1: (lv_type_1_0= 'float' )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:783:1: (lv_type_1_0= 'float' )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:784:3: lv_type_1_0= 'float'
                    {
                    lv_type_1_0=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_ruleType1269); 

                            createLeafNode(grammarAccess.getTypeAccess().getTypeFloatKeyword_1_0(), "type"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_1_0, "float", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:804:6: ( (lv_type_2_0= 'double' ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:804:6: ( (lv_type_2_0= 'double' ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:805:1: (lv_type_2_0= 'double' )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:805:1: (lv_type_2_0= 'double' )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:806:3: lv_type_2_0= 'double'
                    {
                    lv_type_2_0=(Token)input.LT(1);
                    match(input,22,FOLLOW_22_in_ruleType1306); 

                            createLeafNode(grammarAccess.getTypeAccess().getTypeDoubleKeyword_2_0(), "type"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_2_0, "double", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:826:6: ( (lv_type_3_0= 'text' ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:826:6: ( (lv_type_3_0= 'text' ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:827:1: (lv_type_3_0= 'text' )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:827:1: (lv_type_3_0= 'text' )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:828:3: lv_type_3_0= 'text'
                    {
                    lv_type_3_0=(Token)input.LT(1);
                    match(input,23,FOLLOW_23_in_ruleType1343); 

                            createLeafNode(grammarAccess.getTypeAccess().getTypeTextKeyword_3_0(), "type"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_3_0, "text", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:848:6: ( (lv_type_4_0= 'long' ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:848:6: ( (lv_type_4_0= 'long' ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:849:1: (lv_type_4_0= 'long' )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:849:1: (lv_type_4_0= 'long' )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:850:3: lv_type_4_0= 'long'
                    {
                    lv_type_4_0=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_ruleType1380); 

                            createLeafNode(grammarAccess.getTypeAccess().getTypeLongKeyword_4_0(), "type"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_4_0, "long", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:870:6: ( (lv_name_5_0= RULE_ID ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:870:6: ( (lv_name_5_0= RULE_ID ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:871:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:871:1: (lv_name_5_0= RULE_ID )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:872:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType1416); 

                    			createLeafNode(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_5_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_5_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleEntity
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:902:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:903:2: (iv_ruleEntity= ruleEntity EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:904:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1457);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1467); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:911:1: ruleEntity returns [EObject current=null] : ( 'metaelement' ( (lv_name_1_0= RULE_ID ) ) ( 'extend' ( ( RULE_ID ) ) )? '{' ( (lv_features_5_0= ruleFeature ) )+ '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_features_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:916:6: ( ( 'metaelement' ( (lv_name_1_0= RULE_ID ) ) ( 'extend' ( ( RULE_ID ) ) )? '{' ( (lv_features_5_0= ruleFeature ) )+ '}' ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:917:1: ( 'metaelement' ( (lv_name_1_0= RULE_ID ) ) ( 'extend' ( ( RULE_ID ) ) )? '{' ( (lv_features_5_0= ruleFeature ) )+ '}' )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:917:1: ( 'metaelement' ( (lv_name_1_0= RULE_ID ) ) ( 'extend' ( ( RULE_ID ) ) )? '{' ( (lv_features_5_0= ruleFeature ) )+ '}' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:917:3: 'metaelement' ( (lv_name_1_0= RULE_ID ) ) ( 'extend' ( ( RULE_ID ) ) )? '{' ( (lv_features_5_0= ruleFeature ) )+ '}'
            {
            match(input,25,FOLLOW_25_in_ruleEntity1502); 

                    createLeafNode(grammarAccess.getEntityAccess().getMetaelementKeyword_0(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:921:1: ( (lv_name_1_0= RULE_ID ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:922:1: (lv_name_1_0= RULE_ID )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:922:1: (lv_name_1_0= RULE_ID )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:923:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1519); 

            			createLeafNode(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:945:2: ( 'extend' ( ( RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:945:4: 'extend' ( ( RULE_ID ) )
                    {
                    match(input,15,FOLLOW_15_in_ruleEntity1535); 

                            createLeafNode(grammarAccess.getEntityAccess().getExtendKeyword_2_0(), null); 
                        
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:949:1: ( ( RULE_ID ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:950:1: ( RULE_ID )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:950:1: ( RULE_ID )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:951:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1553); 

                    		createLeafNode(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0(), "superType"); 
                    	

                    }


                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleEntity1565); 

                    createLeafNode(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:967:1: ( (lv_features_5_0= ruleFeature ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=20 && LA7_0<=24)||(LA7_0>=27 && LA7_0<=28)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:968:1: (lv_features_5_0= ruleFeature )
            	    {
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:968:1: (lv_features_5_0= ruleFeature )
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:969:3: lv_features_5_0= ruleFeature
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity1586);
            	    lv_features_5_0=ruleFeature();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"features",
            	    	        		lv_features_5_0, 
            	    	        		"Feature", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            match(input,13,FOLLOW_13_in_ruleEntity1597); 

                    createLeafNode(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleFeature
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1003:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1004:2: (iv_ruleFeature= ruleFeature EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1005:2: iv_ruleFeature= ruleFeature EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFeatureRule(), currentNode); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature1633);
            iv_ruleFeature=ruleFeature();
            _fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature1643); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFeature


    // $ANTLR start ruleFeature
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1012:1: ruleFeature returns [EObject current=null] : ( ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ';' ) | (this_ReadorWrite_3= ruleReadorWrite ';' ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;

        EObject this_ReadorWrite_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1017:6: ( ( ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ';' ) | (this_ReadorWrite_3= ruleReadorWrite ';' ) ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1018:1: ( ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ';' ) | (this_ReadorWrite_3= ruleReadorWrite ';' ) )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1018:1: ( ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ';' ) | (this_ReadorWrite_3= ruleReadorWrite ';' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||(LA8_0>=20 && LA8_0<=24)) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=27 && LA8_0<=28)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1018:1: ( ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ';' ) | (this_ReadorWrite_3= ruleReadorWrite ';' ) )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1018:2: ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ';' )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1018:2: ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ';' )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1018:3: ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ';'
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1018:3: ( (lv_type_0_0= ruleTypeRef ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1019:1: (lv_type_0_0= ruleTypeRef )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1019:1: (lv_type_0_0= ruleTypeRef )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1020:3: lv_type_0_0= ruleTypeRef
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTypeRef_in_ruleFeature1690);
                    lv_type_0_0=ruleTypeRef();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"type",
                    	        		lv_type_0_0, 
                    	        		"TypeRef", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1042:2: ( (lv_name_1_0= RULE_ID ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1043:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1043:1: (lv_name_1_0= RULE_ID )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1044:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature1707); 

                    			createLeafNode(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_1_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,26,FOLLOW_26_in_ruleFeature1722); 

                            createLeafNode(grammarAccess.getFeatureAccess().getSemicolonKeyword_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1071:6: (this_ReadorWrite_3= ruleReadorWrite ';' )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1071:6: (this_ReadorWrite_3= ruleReadorWrite ';' )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1072:5: this_ReadorWrite_3= ruleReadorWrite ';'
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFeatureAccess().getReadorWriteParserRuleCall_1_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleReadorWrite_in_ruleFeature1752);
                    this_ReadorWrite_3=ruleReadorWrite();
                    _fsp--;

                     
                            current = this_ReadorWrite_3; 
                            currentNode = currentNode.getParent();
                        
                    match(input,26,FOLLOW_26_in_ruleFeature1761); 

                            createLeafNode(grammarAccess.getFeatureAccess().getSemicolonKeyword_1_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFeature


    // $ANTLR start entryRuleReadorWrite
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1092:1: entryRuleReadorWrite returns [EObject current=null] : iv_ruleReadorWrite= ruleReadorWrite EOF ;
    public final EObject entryRuleReadorWrite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadorWrite = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1093:2: (iv_ruleReadorWrite= ruleReadorWrite EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1094:2: iv_ruleReadorWrite= ruleReadorWrite EOF
            {
             currentNode = createCompositeNode(grammarAccess.getReadorWriteRule(), currentNode); 
            pushFollow(FOLLOW_ruleReadorWrite_in_entryRuleReadorWrite1798);
            iv_ruleReadorWrite=ruleReadorWrite();
            _fsp--;

             current =iv_ruleReadorWrite; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadorWrite1808); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleReadorWrite


    // $ANTLR start ruleReadorWrite
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1101:1: ruleReadorWrite returns [EObject current=null] : ( ( 'read' ( (lv_readval_1_0= RULE_STRING ) ) ) | ( 'write' ( (lv_writeval_3_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleReadorWrite() throws RecognitionException {
        EObject current = null;

        Token lv_readval_1_0=null;
        Token lv_writeval_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1106:6: ( ( ( 'read' ( (lv_readval_1_0= RULE_STRING ) ) ) | ( 'write' ( (lv_writeval_3_0= RULE_STRING ) ) ) ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1107:1: ( ( 'read' ( (lv_readval_1_0= RULE_STRING ) ) ) | ( 'write' ( (lv_writeval_3_0= RULE_STRING ) ) ) )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1107:1: ( ( 'read' ( (lv_readval_1_0= RULE_STRING ) ) ) | ( 'write' ( (lv_writeval_3_0= RULE_STRING ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            else if ( (LA9_0==28) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1107:1: ( ( 'read' ( (lv_readval_1_0= RULE_STRING ) ) ) | ( 'write' ( (lv_writeval_3_0= RULE_STRING ) ) ) )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1107:2: ( 'read' ( (lv_readval_1_0= RULE_STRING ) ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1107:2: ( 'read' ( (lv_readval_1_0= RULE_STRING ) ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1107:4: 'read' ( (lv_readval_1_0= RULE_STRING ) )
                    {
                    match(input,27,FOLLOW_27_in_ruleReadorWrite1844); 

                            createLeafNode(grammarAccess.getReadorWriteAccess().getReadKeyword_0_0(), null); 
                        
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1111:1: ( (lv_readval_1_0= RULE_STRING ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1112:1: (lv_readval_1_0= RULE_STRING )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1112:1: (lv_readval_1_0= RULE_STRING )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1113:3: lv_readval_1_0= RULE_STRING
                    {
                    lv_readval_1_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleReadorWrite1861); 

                    			createLeafNode(grammarAccess.getReadorWriteAccess().getReadvalSTRINGTerminalRuleCall_0_1_0(), "readval"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getReadorWriteRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"readval",
                    	        		lv_readval_1_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1136:6: ( 'write' ( (lv_writeval_3_0= RULE_STRING ) ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1136:6: ( 'write' ( (lv_writeval_3_0= RULE_STRING ) ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1136:8: 'write' ( (lv_writeval_3_0= RULE_STRING ) )
                    {
                    match(input,28,FOLLOW_28_in_ruleReadorWrite1884); 

                            createLeafNode(grammarAccess.getReadorWriteAccess().getWriteKeyword_1_0(), null); 
                        
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1140:1: ( (lv_writeval_3_0= RULE_STRING ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1141:1: (lv_writeval_3_0= RULE_STRING )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1141:1: (lv_writeval_3_0= RULE_STRING )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1142:3: lv_writeval_3_0= RULE_STRING
                    {
                    lv_writeval_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleReadorWrite1901); 

                    			createLeafNode(grammarAccess.getReadorWriteAccess().getWritevalSTRINGTerminalRuleCall_1_1_0(), "writeval"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getReadorWriteRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"writeval",
                    	        		lv_writeval_3_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleReadorWrite


    // $ANTLR start entryRuleTypeRef
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1172:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1173:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1174:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef1943);
            iv_ruleTypeRef=ruleTypeRef();
            _fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef1953); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeRef


    // $ANTLR start ruleTypeRef
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1181:1: ruleTypeRef returns [EObject current=null] : ( ( (lv_referenced_0_0= ruleType ) ) ( (lv_multi_1_0= '*' ) )? ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token lv_multi_1_0=null;
        EObject lv_referenced_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1186:6: ( ( ( (lv_referenced_0_0= ruleType ) ) ( (lv_multi_1_0= '*' ) )? ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1187:1: ( ( (lv_referenced_0_0= ruleType ) ) ( (lv_multi_1_0= '*' ) )? )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1187:1: ( ( (lv_referenced_0_0= ruleType ) ) ( (lv_multi_1_0= '*' ) )? )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1187:2: ( (lv_referenced_0_0= ruleType ) ) ( (lv_multi_1_0= '*' ) )?
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1187:2: ( (lv_referenced_0_0= ruleType ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1188:1: (lv_referenced_0_0= ruleType )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1188:1: (lv_referenced_0_0= ruleType )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1189:3: lv_referenced_0_0= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTypeRefAccess().getReferencedTypeParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleTypeRef1999);
            lv_referenced_0_0=ruleType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTypeRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"referenced",
            	        		lv_referenced_0_0, 
            	        		"Type", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1211:2: ( (lv_multi_1_0= '*' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1212:1: (lv_multi_1_0= '*' )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1212:1: (lv_multi_1_0= '*' )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1213:3: lv_multi_1_0= '*'
                    {
                    lv_multi_1_0=(Token)input.LT(1);
                    match(input,29,FOLLOW_29_in_ruleTypeRef2017); 

                            createLeafNode(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0(), "multi"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTypeRefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "multi", true, "*", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeRef


 

    public static final BitSet FOLLOW_ruleMapRedoop_in_entryRuleMapRedoop75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapRedoop85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleMapRedoop131 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMapRedoop141 = new BitSet(new long[]{0x0000000000013000L});
    public static final BitSet FOLLOW_ruleContent_in_ruleMapRedoop162 = new BitSet(new long[]{0x0000000000013000L});
    public static final BitSet FOLLOW_13_in_ruleMapRedoop173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_entryRuleContent209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContent219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListofEntities_in_ruleContent265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMRBlock_in_ruleContent292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListofEntities_in_entryRuleListofEntities328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListofEntities338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleListofEntities382 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleListofEntities403 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_13_in_ruleListofEntities414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMRBlock_in_entryRuleMRBlock450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMRBlock460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapper_in_ruleMRBlock506 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleReducer_in_ruleMRBlock527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDeclaration608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaration625 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleDeclaration641 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaration658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapper_in_entryRuleMapper701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapper711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleMapper746 = new BitSet(new long[]{0x0000000001F00010L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleMapper767 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMapper777 = new BitSet(new long[]{0x0000000001F00010L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleMapper798 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMapper808 = new BitSet(new long[]{0x0000000001F00010L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleMapper829 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMapper839 = new BitSet(new long[]{0x0000000001F00010L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleMapper860 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMapper870 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_BLOCK_in_ruleMapper879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleArgument970 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReducer_in_entryRuleReducer1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReducer1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleReducer1073 = new BitSet(new long[]{0x0000000001F00010L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleReducer1094 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleReducer1104 = new BitSet(new long[]{0x0000000001F00010L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleReducer1125 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleReducer1135 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_BLOCK_in_ruleReducer1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleType1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleType1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleType1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleType1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleType1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleType1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleEntity1502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1519 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15_in_ruleEntity1535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1553 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity1565 = new BitSet(new long[]{0x0000000019F00010L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity1586 = new BitSet(new long[]{0x0000000019F02010L});
    public static final BitSet FOLLOW_13_in_ruleEntity1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleFeature1690 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature1707 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleFeature1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadorWrite_in_ruleFeature1752 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleFeature1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadorWrite_in_entryRuleReadorWrite1798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadorWrite1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleReadorWrite1844 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleReadorWrite1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleReadorWrite1884 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleReadorWrite1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef1943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeRef1999 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleTypeRef2017 = new BitSet(new long[]{0x0000000000000002L});

}