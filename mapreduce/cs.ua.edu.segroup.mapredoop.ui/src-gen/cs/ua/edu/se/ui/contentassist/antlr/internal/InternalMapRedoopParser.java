package cs.ua.edu.se.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import cs.ua.edu.se.services.MapRedoopGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMapRedoopParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BLOCK", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'program'", "'extend'", "'map('", "','", "')'", "'reduce('", "'metaelement'", "';'", "'read'", "'write'", "'int'", "'float'", "'double'", "'text'", "'long'", "'*'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_BLOCK=4;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalMapRedoopParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g"; }


     
     	private MapRedoopGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MapRedoopGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleMapRedoop
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:61:1: entryRuleMapRedoop : ruleMapRedoop EOF ;
    public final void entryRuleMapRedoop() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:62:1: ( ruleMapRedoop EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:63:1: ruleMapRedoop EOF
            {
             before(grammarAccess.getMapRedoopRule()); 
            pushFollow(FOLLOW_ruleMapRedoop_in_entryRuleMapRedoop61);
            ruleMapRedoop();
            _fsp--;

             after(grammarAccess.getMapRedoopRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapRedoop68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleMapRedoop


    // $ANTLR start ruleMapRedoop
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:70:1: ruleMapRedoop : ( ( rule__MapRedoop__Group__0 ) ) ;
    public final void ruleMapRedoop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:74:2: ( ( ( rule__MapRedoop__Group__0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:75:1: ( ( rule__MapRedoop__Group__0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:75:1: ( ( rule__MapRedoop__Group__0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:76:1: ( rule__MapRedoop__Group__0 )
            {
             before(grammarAccess.getMapRedoopAccess().getGroup()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:77:1: ( rule__MapRedoop__Group__0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:77:2: rule__MapRedoop__Group__0
            {
            pushFollow(FOLLOW_rule__MapRedoop__Group__0_in_ruleMapRedoop94);
            rule__MapRedoop__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMapRedoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMapRedoop


    // $ANTLR start entryRuleContent
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:89:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:90:1: ( ruleContent EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:91:1: ruleContent EOF
            {
             before(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_ruleContent_in_entryRuleContent121);
            ruleContent();
            _fsp--;

             after(grammarAccess.getContentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContent128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleContent


    // $ANTLR start ruleContent
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:98:1: ruleContent : ( ( rule__Content__Alternatives ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:102:2: ( ( ( rule__Content__Alternatives ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:103:1: ( ( rule__Content__Alternatives ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:103:1: ( ( rule__Content__Alternatives ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:104:1: ( rule__Content__Alternatives )
            {
             before(grammarAccess.getContentAccess().getAlternatives()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:105:1: ( rule__Content__Alternatives )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:105:2: rule__Content__Alternatives
            {
            pushFollow(FOLLOW_rule__Content__Alternatives_in_ruleContent154);
            rule__Content__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getContentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleContent


    // $ANTLR start entryRuleListofEntities
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:117:1: entryRuleListofEntities : ruleListofEntities EOF ;
    public final void entryRuleListofEntities() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:118:1: ( ruleListofEntities EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:119:1: ruleListofEntities EOF
            {
             before(grammarAccess.getListofEntitiesRule()); 
            pushFollow(FOLLOW_ruleListofEntities_in_entryRuleListofEntities181);
            ruleListofEntities();
            _fsp--;

             after(grammarAccess.getListofEntitiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListofEntities188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleListofEntities


    // $ANTLR start ruleListofEntities
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:126:1: ruleListofEntities : ( ( rule__ListofEntities__Group__0 ) ) ;
    public final void ruleListofEntities() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:130:2: ( ( ( rule__ListofEntities__Group__0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:131:1: ( ( rule__ListofEntities__Group__0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:131:1: ( ( rule__ListofEntities__Group__0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:132:1: ( rule__ListofEntities__Group__0 )
            {
             before(grammarAccess.getListofEntitiesAccess().getGroup()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:133:1: ( rule__ListofEntities__Group__0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:133:2: rule__ListofEntities__Group__0
            {
            pushFollow(FOLLOW_rule__ListofEntities__Group__0_in_ruleListofEntities214);
            rule__ListofEntities__Group__0();
            _fsp--;


            }

             after(grammarAccess.getListofEntitiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleListofEntities


    // $ANTLR start entryRuleMRBlock
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:145:1: entryRuleMRBlock : ruleMRBlock EOF ;
    public final void entryRuleMRBlock() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:146:1: ( ruleMRBlock EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:147:1: ruleMRBlock EOF
            {
             before(grammarAccess.getMRBlockRule()); 
            pushFollow(FOLLOW_ruleMRBlock_in_entryRuleMRBlock241);
            ruleMRBlock();
            _fsp--;

             after(grammarAccess.getMRBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMRBlock248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleMRBlock


    // $ANTLR start ruleMRBlock
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:154:1: ruleMRBlock : ( ( rule__MRBlock__Group__0 ) ) ;
    public final void ruleMRBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:158:2: ( ( ( rule__MRBlock__Group__0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:159:1: ( ( rule__MRBlock__Group__0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:159:1: ( ( rule__MRBlock__Group__0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:160:1: ( rule__MRBlock__Group__0 )
            {
             before(grammarAccess.getMRBlockAccess().getGroup()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:161:1: ( rule__MRBlock__Group__0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:161:2: rule__MRBlock__Group__0
            {
            pushFollow(FOLLOW_rule__MRBlock__Group__0_in_ruleMRBlock274);
            rule__MRBlock__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMRBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMRBlock


    // $ANTLR start entryRuleDeclaration
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:173:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:174:1: ( ruleDeclaration EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:175:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration301);
            ruleDeclaration();
            _fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDeclaration


    // $ANTLR start ruleDeclaration
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:182:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:186:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:187:1: ( ( rule__Declaration__Group__0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:187:1: ( ( rule__Declaration__Group__0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:188:1: ( rule__Declaration__Group__0 )
            {
             before(grammarAccess.getDeclarationAccess().getGroup()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:189:1: ( rule__Declaration__Group__0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:189:2: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration334);
            rule__Declaration__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDeclaration


    // $ANTLR start entryRuleMapper
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:201:1: entryRuleMapper : ruleMapper EOF ;
    public final void entryRuleMapper() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:202:1: ( ruleMapper EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:203:1: ruleMapper EOF
            {
             before(grammarAccess.getMapperRule()); 
            pushFollow(FOLLOW_ruleMapper_in_entryRuleMapper361);
            ruleMapper();
            _fsp--;

             after(grammarAccess.getMapperRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapper368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleMapper


    // $ANTLR start ruleMapper
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:210:1: ruleMapper : ( ( rule__Mapper__Group__0 ) ) ;
    public final void ruleMapper() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:214:2: ( ( ( rule__Mapper__Group__0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:215:1: ( ( rule__Mapper__Group__0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:215:1: ( ( rule__Mapper__Group__0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:216:1: ( rule__Mapper__Group__0 )
            {
             before(grammarAccess.getMapperAccess().getGroup()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:217:1: ( rule__Mapper__Group__0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:217:2: rule__Mapper__Group__0
            {
            pushFollow(FOLLOW_rule__Mapper__Group__0_in_ruleMapper394);
            rule__Mapper__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMapperAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMapper


    // $ANTLR start entryRuleArgument
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:229:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:230:1: ( ruleArgument EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:231:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument421);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleArgument


    // $ANTLR start ruleArgument
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:238:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:242:2: ( ( ( rule__Argument__Group__0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:243:1: ( ( rule__Argument__Group__0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:243:1: ( ( rule__Argument__Group__0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:244:1: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:245:1: ( rule__Argument__Group__0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:245:2: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_rule__Argument__Group__0_in_ruleArgument454);
            rule__Argument__Group__0();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleArgument


    // $ANTLR start entryRuleReducer
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:257:1: entryRuleReducer : ruleReducer EOF ;
    public final void entryRuleReducer() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:258:1: ( ruleReducer EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:259:1: ruleReducer EOF
            {
             before(grammarAccess.getReducerRule()); 
            pushFollow(FOLLOW_ruleReducer_in_entryRuleReducer481);
            ruleReducer();
            _fsp--;

             after(grammarAccess.getReducerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReducer488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleReducer


    // $ANTLR start ruleReducer
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:266:1: ruleReducer : ( ( rule__Reducer__Group__0 ) ) ;
    public final void ruleReducer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:270:2: ( ( ( rule__Reducer__Group__0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:271:1: ( ( rule__Reducer__Group__0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:271:1: ( ( rule__Reducer__Group__0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:272:1: ( rule__Reducer__Group__0 )
            {
             before(grammarAccess.getReducerAccess().getGroup()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:273:1: ( rule__Reducer__Group__0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:273:2: rule__Reducer__Group__0
            {
            pushFollow(FOLLOW_rule__Reducer__Group__0_in_ruleReducer514);
            rule__Reducer__Group__0();
            _fsp--;


            }

             after(grammarAccess.getReducerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleReducer


    // $ANTLR start entryRuleType
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:285:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:286:1: ( ruleType EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:287:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType541);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:294:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:298:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:299:1: ( ( rule__Type__Alternatives ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:299:1: ( ( rule__Type__Alternatives ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:300:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:301:1: ( rule__Type__Alternatives )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:301:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType574);
            rule__Type__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleEntity
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:313:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:314:1: ( ruleEntity EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:315:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity601);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:322:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:326:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:327:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:327:1: ( ( rule__Entity__Group__0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:328:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:329:1: ( rule__Entity__Group__0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:329:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity634);
            rule__Entity__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleFeature
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:341:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:342:1: ( ruleFeature EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:343:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature661);
            ruleFeature();
            _fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleFeature


    // $ANTLR start ruleFeature
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:350:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:354:2: ( ( ( rule__Feature__Alternatives ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:355:1: ( ( rule__Feature__Alternatives ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:355:1: ( ( rule__Feature__Alternatives ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:356:1: ( rule__Feature__Alternatives )
            {
             before(grammarAccess.getFeatureAccess().getAlternatives()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:357:1: ( rule__Feature__Alternatives )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:357:2: rule__Feature__Alternatives
            {
            pushFollow(FOLLOW_rule__Feature__Alternatives_in_ruleFeature694);
            rule__Feature__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFeature


    // $ANTLR start entryRuleReadorWrite
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:369:1: entryRuleReadorWrite : ruleReadorWrite EOF ;
    public final void entryRuleReadorWrite() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:370:1: ( ruleReadorWrite EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:371:1: ruleReadorWrite EOF
            {
             before(grammarAccess.getReadorWriteRule()); 
            pushFollow(FOLLOW_ruleReadorWrite_in_entryRuleReadorWrite721);
            ruleReadorWrite();
            _fsp--;

             after(grammarAccess.getReadorWriteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadorWrite728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleReadorWrite


    // $ANTLR start ruleReadorWrite
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:378:1: ruleReadorWrite : ( ( rule__ReadorWrite__Alternatives ) ) ;
    public final void ruleReadorWrite() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:382:2: ( ( ( rule__ReadorWrite__Alternatives ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:383:1: ( ( rule__ReadorWrite__Alternatives ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:383:1: ( ( rule__ReadorWrite__Alternatives ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:384:1: ( rule__ReadorWrite__Alternatives )
            {
             before(grammarAccess.getReadorWriteAccess().getAlternatives()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:385:1: ( rule__ReadorWrite__Alternatives )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:385:2: rule__ReadorWrite__Alternatives
            {
            pushFollow(FOLLOW_rule__ReadorWrite__Alternatives_in_ruleReadorWrite754);
            rule__ReadorWrite__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getReadorWriteAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleReadorWrite


    // $ANTLR start entryRuleTypeRef
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:397:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:398:1: ( ruleTypeRef EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:399:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef781);
            ruleTypeRef();
            _fsp--;

             after(grammarAccess.getTypeRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTypeRef


    // $ANTLR start ruleTypeRef
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:406:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:410:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:411:1: ( ( rule__TypeRef__Group__0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:411:1: ( ( rule__TypeRef__Group__0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:412:1: ( rule__TypeRef__Group__0 )
            {
             before(grammarAccess.getTypeRefAccess().getGroup()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:413:1: ( rule__TypeRef__Group__0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:413:2: rule__TypeRef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef814);
            rule__TypeRef__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTypeRef


    // $ANTLR start rule__Content__Alternatives
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:425:1: rule__Content__Alternatives : ( ( ( rule__Content__EntitiesAssignment_0 ) ) | ( ( rule__Content__MrBlocksAssignment_1 ) ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:429:1: ( ( ( rule__Content__EntitiesAssignment_0 ) ) | ( ( rule__Content__MrBlocksAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("425:1: rule__Content__Alternatives : ( ( ( rule__Content__EntitiesAssignment_0 ) ) | ( ( rule__Content__MrBlocksAssignment_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:430:1: ( ( rule__Content__EntitiesAssignment_0 ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:430:1: ( ( rule__Content__EntitiesAssignment_0 ) )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:431:1: ( rule__Content__EntitiesAssignment_0 )
                    {
                     before(grammarAccess.getContentAccess().getEntitiesAssignment_0()); 
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:432:1: ( rule__Content__EntitiesAssignment_0 )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:432:2: rule__Content__EntitiesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Content__EntitiesAssignment_0_in_rule__Content__Alternatives850);
                    rule__Content__EntitiesAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getContentAccess().getEntitiesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:436:6: ( ( rule__Content__MrBlocksAssignment_1 ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:436:6: ( ( rule__Content__MrBlocksAssignment_1 ) )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:437:1: ( rule__Content__MrBlocksAssignment_1 )
                    {
                     before(grammarAccess.getContentAccess().getMrBlocksAssignment_1()); 
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:438:1: ( rule__Content__MrBlocksAssignment_1 )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:438:2: rule__Content__MrBlocksAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Content__MrBlocksAssignment_1_in_rule__Content__Alternatives868);
                    rule__Content__MrBlocksAssignment_1();
                    _fsp--;


                    }

                     after(grammarAccess.getContentAccess().getMrBlocksAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Content__Alternatives


    // $ANTLR start rule__Type__Alternatives
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:447:1: rule__Type__Alternatives : ( ( ( rule__Type__TypeAssignment_0 ) ) | ( ( rule__Type__TypeAssignment_1 ) ) | ( ( rule__Type__TypeAssignment_2 ) ) | ( ( rule__Type__TypeAssignment_3 ) ) | ( ( rule__Type__TypeAssignment_4 ) ) | ( ( rule__Type__NameAssignment_5 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:451:1: ( ( ( rule__Type__TypeAssignment_0 ) ) | ( ( rule__Type__TypeAssignment_1 ) ) | ( ( rule__Type__TypeAssignment_2 ) ) | ( ( rule__Type__TypeAssignment_3 ) ) | ( ( rule__Type__TypeAssignment_4 ) ) | ( ( rule__Type__NameAssignment_5 ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 26:
                {
                alt2=3;
                }
                break;
            case 27:
                {
                alt2=4;
                }
                break;
            case 28:
                {
                alt2=5;
                }
                break;
            case RULE_ID:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("447:1: rule__Type__Alternatives : ( ( ( rule__Type__TypeAssignment_0 ) ) | ( ( rule__Type__TypeAssignment_1 ) ) | ( ( rule__Type__TypeAssignment_2 ) ) | ( ( rule__Type__TypeAssignment_3 ) ) | ( ( rule__Type__TypeAssignment_4 ) ) | ( ( rule__Type__NameAssignment_5 ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:452:1: ( ( rule__Type__TypeAssignment_0 ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:452:1: ( ( rule__Type__TypeAssignment_0 ) )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:453:1: ( rule__Type__TypeAssignment_0 )
                    {
                     before(grammarAccess.getTypeAccess().getTypeAssignment_0()); 
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:454:1: ( rule__Type__TypeAssignment_0 )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:454:2: rule__Type__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Type__TypeAssignment_0_in_rule__Type__Alternatives901);
                    rule__Type__TypeAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:458:6: ( ( rule__Type__TypeAssignment_1 ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:458:6: ( ( rule__Type__TypeAssignment_1 ) )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:459:1: ( rule__Type__TypeAssignment_1 )
                    {
                     before(grammarAccess.getTypeAccess().getTypeAssignment_1()); 
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:460:1: ( rule__Type__TypeAssignment_1 )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:460:2: rule__Type__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Type__TypeAssignment_1_in_rule__Type__Alternatives919);
                    rule__Type__TypeAssignment_1();
                    _fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:464:6: ( ( rule__Type__TypeAssignment_2 ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:464:6: ( ( rule__Type__TypeAssignment_2 ) )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:465:1: ( rule__Type__TypeAssignment_2 )
                    {
                     before(grammarAccess.getTypeAccess().getTypeAssignment_2()); 
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:466:1: ( rule__Type__TypeAssignment_2 )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:466:2: rule__Type__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Type__TypeAssignment_2_in_rule__Type__Alternatives937);
                    rule__Type__TypeAssignment_2();
                    _fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTypeAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:470:6: ( ( rule__Type__TypeAssignment_3 ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:470:6: ( ( rule__Type__TypeAssignment_3 ) )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:471:1: ( rule__Type__TypeAssignment_3 )
                    {
                     before(grammarAccess.getTypeAccess().getTypeAssignment_3()); 
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:472:1: ( rule__Type__TypeAssignment_3 )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:472:2: rule__Type__TypeAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Type__TypeAssignment_3_in_rule__Type__Alternatives955);
                    rule__Type__TypeAssignment_3();
                    _fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTypeAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:476:6: ( ( rule__Type__TypeAssignment_4 ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:476:6: ( ( rule__Type__TypeAssignment_4 ) )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:477:1: ( rule__Type__TypeAssignment_4 )
                    {
                     before(grammarAccess.getTypeAccess().getTypeAssignment_4()); 
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:478:1: ( rule__Type__TypeAssignment_4 )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:478:2: rule__Type__TypeAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Type__TypeAssignment_4_in_rule__Type__Alternatives973);
                    rule__Type__TypeAssignment_4();
                    _fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTypeAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:482:6: ( ( rule__Type__NameAssignment_5 ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:482:6: ( ( rule__Type__NameAssignment_5 ) )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:483:1: ( rule__Type__NameAssignment_5 )
                    {
                     before(grammarAccess.getTypeAccess().getNameAssignment_5()); 
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:484:1: ( rule__Type__NameAssignment_5 )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:484:2: rule__Type__NameAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Type__NameAssignment_5_in_rule__Type__Alternatives991);
                    rule__Type__NameAssignment_5();
                    _fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getNameAssignment_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Type__Alternatives


    // $ANTLR start rule__Feature__Alternatives
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:493:1: rule__Feature__Alternatives : ( ( ( rule__Feature__Group_0__0 ) ) | ( ( rule__Feature__Group_1__0 ) ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:497:1: ( ( ( rule__Feature__Group_0__0 ) ) | ( ( rule__Feature__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||(LA3_0>=24 && LA3_0<=28)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=22 && LA3_0<=23)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("493:1: rule__Feature__Alternatives : ( ( ( rule__Feature__Group_0__0 ) ) | ( ( rule__Feature__Group_1__0 ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:498:1: ( ( rule__Feature__Group_0__0 ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:498:1: ( ( rule__Feature__Group_0__0 ) )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:499:1: ( rule__Feature__Group_0__0 )
                    {
                     before(grammarAccess.getFeatureAccess().getGroup_0()); 
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:500:1: ( rule__Feature__Group_0__0 )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:500:2: rule__Feature__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Feature__Group_0__0_in_rule__Feature__Alternatives1024);
                    rule__Feature__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFeatureAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:504:6: ( ( rule__Feature__Group_1__0 ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:504:6: ( ( rule__Feature__Group_1__0 ) )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:505:1: ( rule__Feature__Group_1__0 )
                    {
                     before(grammarAccess.getFeatureAccess().getGroup_1()); 
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:506:1: ( rule__Feature__Group_1__0 )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:506:2: rule__Feature__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Feature__Group_1__0_in_rule__Feature__Alternatives1042);
                    rule__Feature__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFeatureAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Alternatives


    // $ANTLR start rule__ReadorWrite__Alternatives
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:515:1: rule__ReadorWrite__Alternatives : ( ( ( rule__ReadorWrite__Group_0__0 ) ) | ( ( rule__ReadorWrite__Group_1__0 ) ) );
    public final void rule__ReadorWrite__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:519:1: ( ( ( rule__ReadorWrite__Group_0__0 ) ) | ( ( rule__ReadorWrite__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            else if ( (LA4_0==23) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("515:1: rule__ReadorWrite__Alternatives : ( ( ( rule__ReadorWrite__Group_0__0 ) ) | ( ( rule__ReadorWrite__Group_1__0 ) ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:520:1: ( ( rule__ReadorWrite__Group_0__0 ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:520:1: ( ( rule__ReadorWrite__Group_0__0 ) )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:521:1: ( rule__ReadorWrite__Group_0__0 )
                    {
                     before(grammarAccess.getReadorWriteAccess().getGroup_0()); 
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:522:1: ( rule__ReadorWrite__Group_0__0 )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:522:2: rule__ReadorWrite__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ReadorWrite__Group_0__0_in_rule__ReadorWrite__Alternatives1075);
                    rule__ReadorWrite__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getReadorWriteAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:526:6: ( ( rule__ReadorWrite__Group_1__0 ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:526:6: ( ( rule__ReadorWrite__Group_1__0 ) )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:527:1: ( rule__ReadorWrite__Group_1__0 )
                    {
                     before(grammarAccess.getReadorWriteAccess().getGroup_1()); 
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:528:1: ( rule__ReadorWrite__Group_1__0 )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:528:2: rule__ReadorWrite__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ReadorWrite__Group_1__0_in_rule__ReadorWrite__Alternatives1093);
                    rule__ReadorWrite__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getReadorWriteAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Alternatives


    // $ANTLR start rule__MapRedoop__Group__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:539:1: rule__MapRedoop__Group__0 : rule__MapRedoop__Group__0__Impl rule__MapRedoop__Group__1 ;
    public final void rule__MapRedoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:543:1: ( rule__MapRedoop__Group__0__Impl rule__MapRedoop__Group__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:544:2: rule__MapRedoop__Group__0__Impl rule__MapRedoop__Group__1
            {
            pushFollow(FOLLOW_rule__MapRedoop__Group__0__Impl_in_rule__MapRedoop__Group__01124);
            rule__MapRedoop__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MapRedoop__Group__1_in_rule__MapRedoop__Group__01127);
            rule__MapRedoop__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MapRedoop__Group__0


    // $ANTLR start rule__MapRedoop__Group__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:551:1: rule__MapRedoop__Group__0__Impl : ( ( rule__MapRedoop__DeclarationAssignment_0 ) ) ;
    public final void rule__MapRedoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:555:1: ( ( ( rule__MapRedoop__DeclarationAssignment_0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:556:1: ( ( rule__MapRedoop__DeclarationAssignment_0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:556:1: ( ( rule__MapRedoop__DeclarationAssignment_0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:557:1: ( rule__MapRedoop__DeclarationAssignment_0 )
            {
             before(grammarAccess.getMapRedoopAccess().getDeclarationAssignment_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:558:1: ( rule__MapRedoop__DeclarationAssignment_0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:558:2: rule__MapRedoop__DeclarationAssignment_0
            {
            pushFollow(FOLLOW_rule__MapRedoop__DeclarationAssignment_0_in_rule__MapRedoop__Group__0__Impl1154);
            rule__MapRedoop__DeclarationAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMapRedoopAccess().getDeclarationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MapRedoop__Group__0__Impl


    // $ANTLR start rule__MapRedoop__Group__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:568:1: rule__MapRedoop__Group__1 : rule__MapRedoop__Group__1__Impl rule__MapRedoop__Group__2 ;
    public final void rule__MapRedoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:572:1: ( rule__MapRedoop__Group__1__Impl rule__MapRedoop__Group__2 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:573:2: rule__MapRedoop__Group__1__Impl rule__MapRedoop__Group__2
            {
            pushFollow(FOLLOW_rule__MapRedoop__Group__1__Impl_in_rule__MapRedoop__Group__11184);
            rule__MapRedoop__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MapRedoop__Group__2_in_rule__MapRedoop__Group__11187);
            rule__MapRedoop__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MapRedoop__Group__1


    // $ANTLR start rule__MapRedoop__Group__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:580:1: rule__MapRedoop__Group__1__Impl : ( '{' ) ;
    public final void rule__MapRedoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:584:1: ( ( '{' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:585:1: ( '{' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:585:1: ( '{' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:586:1: '{'
            {
             before(grammarAccess.getMapRedoopAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__MapRedoop__Group__1__Impl1215); 
             after(grammarAccess.getMapRedoopAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MapRedoop__Group__1__Impl


    // $ANTLR start rule__MapRedoop__Group__2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:599:1: rule__MapRedoop__Group__2 : rule__MapRedoop__Group__2__Impl rule__MapRedoop__Group__3 ;
    public final void rule__MapRedoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:603:1: ( rule__MapRedoop__Group__2__Impl rule__MapRedoop__Group__3 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:604:2: rule__MapRedoop__Group__2__Impl rule__MapRedoop__Group__3
            {
            pushFollow(FOLLOW_rule__MapRedoop__Group__2__Impl_in_rule__MapRedoop__Group__21246);
            rule__MapRedoop__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MapRedoop__Group__3_in_rule__MapRedoop__Group__21249);
            rule__MapRedoop__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MapRedoop__Group__2


    // $ANTLR start rule__MapRedoop__Group__2__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:611:1: rule__MapRedoop__Group__2__Impl : ( ( rule__MapRedoop__ContentAssignment_2 )* ) ;
    public final void rule__MapRedoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:615:1: ( ( ( rule__MapRedoop__ContentAssignment_2 )* ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:616:1: ( ( rule__MapRedoop__ContentAssignment_2 )* )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:616:1: ( ( rule__MapRedoop__ContentAssignment_2 )* )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:617:1: ( rule__MapRedoop__ContentAssignment_2 )*
            {
             before(grammarAccess.getMapRedoopAccess().getContentAssignment_2()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:618:1: ( rule__MapRedoop__ContentAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==12||LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:618:2: rule__MapRedoop__ContentAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__MapRedoop__ContentAssignment_2_in_rule__MapRedoop__Group__2__Impl1276);
            	    rule__MapRedoop__ContentAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getMapRedoopAccess().getContentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MapRedoop__Group__2__Impl


    // $ANTLR start rule__MapRedoop__Group__3
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:628:1: rule__MapRedoop__Group__3 : rule__MapRedoop__Group__3__Impl ;
    public final void rule__MapRedoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:632:1: ( rule__MapRedoop__Group__3__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:633:2: rule__MapRedoop__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MapRedoop__Group__3__Impl_in_rule__MapRedoop__Group__31307);
            rule__MapRedoop__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MapRedoop__Group__3


    // $ANTLR start rule__MapRedoop__Group__3__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:639:1: rule__MapRedoop__Group__3__Impl : ( '}' ) ;
    public final void rule__MapRedoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:643:1: ( ( '}' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:644:1: ( '}' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:644:1: ( '}' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:645:1: '}'
            {
             before(grammarAccess.getMapRedoopAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__MapRedoop__Group__3__Impl1335); 
             after(grammarAccess.getMapRedoopAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MapRedoop__Group__3__Impl


    // $ANTLR start rule__ListofEntities__Group__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:666:1: rule__ListofEntities__Group__0 : rule__ListofEntities__Group__0__Impl rule__ListofEntities__Group__1 ;
    public final void rule__ListofEntities__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:670:1: ( rule__ListofEntities__Group__0__Impl rule__ListofEntities__Group__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:671:2: rule__ListofEntities__Group__0__Impl rule__ListofEntities__Group__1
            {
            pushFollow(FOLLOW_rule__ListofEntities__Group__0__Impl_in_rule__ListofEntities__Group__01374);
            rule__ListofEntities__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListofEntities__Group__1_in_rule__ListofEntities__Group__01377);
            rule__ListofEntities__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListofEntities__Group__0


    // $ANTLR start rule__ListofEntities__Group__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:678:1: rule__ListofEntities__Group__0__Impl : ( () ) ;
    public final void rule__ListofEntities__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:682:1: ( ( () ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:683:1: ( () )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:683:1: ( () )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:684:1: ()
            {
             before(grammarAccess.getListofEntitiesAccess().getListofEntitiesAction_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:685:1: ()
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:687:1: 
            {
            }

             after(grammarAccess.getListofEntitiesAccess().getListofEntitiesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListofEntities__Group__0__Impl


    // $ANTLR start rule__ListofEntities__Group__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:697:1: rule__ListofEntities__Group__1 : rule__ListofEntities__Group__1__Impl rule__ListofEntities__Group__2 ;
    public final void rule__ListofEntities__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:701:1: ( rule__ListofEntities__Group__1__Impl rule__ListofEntities__Group__2 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:702:2: rule__ListofEntities__Group__1__Impl rule__ListofEntities__Group__2
            {
            pushFollow(FOLLOW_rule__ListofEntities__Group__1__Impl_in_rule__ListofEntities__Group__11435);
            rule__ListofEntities__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListofEntities__Group__2_in_rule__ListofEntities__Group__11438);
            rule__ListofEntities__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListofEntities__Group__1


    // $ANTLR start rule__ListofEntities__Group__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:709:1: rule__ListofEntities__Group__1__Impl : ( '{' ) ;
    public final void rule__ListofEntities__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:713:1: ( ( '{' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:714:1: ( '{' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:714:1: ( '{' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:715:1: '{'
            {
             before(grammarAccess.getListofEntitiesAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__ListofEntities__Group__1__Impl1466); 
             after(grammarAccess.getListofEntitiesAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListofEntities__Group__1__Impl


    // $ANTLR start rule__ListofEntities__Group__2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:728:1: rule__ListofEntities__Group__2 : rule__ListofEntities__Group__2__Impl rule__ListofEntities__Group__3 ;
    public final void rule__ListofEntities__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:732:1: ( rule__ListofEntities__Group__2__Impl rule__ListofEntities__Group__3 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:733:2: rule__ListofEntities__Group__2__Impl rule__ListofEntities__Group__3
            {
            pushFollow(FOLLOW_rule__ListofEntities__Group__2__Impl_in_rule__ListofEntities__Group__21497);
            rule__ListofEntities__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListofEntities__Group__3_in_rule__ListofEntities__Group__21500);
            rule__ListofEntities__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListofEntities__Group__2


    // $ANTLR start rule__ListofEntities__Group__2__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:740:1: rule__ListofEntities__Group__2__Impl : ( ( rule__ListofEntities__EntitiesAssignment_2 )* ) ;
    public final void rule__ListofEntities__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:744:1: ( ( ( rule__ListofEntities__EntitiesAssignment_2 )* ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:745:1: ( ( rule__ListofEntities__EntitiesAssignment_2 )* )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:745:1: ( ( rule__ListofEntities__EntitiesAssignment_2 )* )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:746:1: ( rule__ListofEntities__EntitiesAssignment_2 )*
            {
             before(grammarAccess.getListofEntitiesAccess().getEntitiesAssignment_2()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:747:1: ( rule__ListofEntities__EntitiesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:747:2: rule__ListofEntities__EntitiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ListofEntities__EntitiesAssignment_2_in_rule__ListofEntities__Group__2__Impl1527);
            	    rule__ListofEntities__EntitiesAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getListofEntitiesAccess().getEntitiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListofEntities__Group__2__Impl


    // $ANTLR start rule__ListofEntities__Group__3
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:757:1: rule__ListofEntities__Group__3 : rule__ListofEntities__Group__3__Impl ;
    public final void rule__ListofEntities__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:761:1: ( rule__ListofEntities__Group__3__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:762:2: rule__ListofEntities__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ListofEntities__Group__3__Impl_in_rule__ListofEntities__Group__31558);
            rule__ListofEntities__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListofEntities__Group__3


    // $ANTLR start rule__ListofEntities__Group__3__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:768:1: rule__ListofEntities__Group__3__Impl : ( '}' ) ;
    public final void rule__ListofEntities__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:772:1: ( ( '}' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:773:1: ( '}' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:773:1: ( '}' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:774:1: '}'
            {
             before(grammarAccess.getListofEntitiesAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__ListofEntities__Group__3__Impl1586); 
             after(grammarAccess.getListofEntitiesAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListofEntities__Group__3__Impl


    // $ANTLR start rule__MRBlock__Group__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:795:1: rule__MRBlock__Group__0 : rule__MRBlock__Group__0__Impl rule__MRBlock__Group__1 ;
    public final void rule__MRBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:799:1: ( rule__MRBlock__Group__0__Impl rule__MRBlock__Group__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:800:2: rule__MRBlock__Group__0__Impl rule__MRBlock__Group__1
            {
            pushFollow(FOLLOW_rule__MRBlock__Group__0__Impl_in_rule__MRBlock__Group__01625);
            rule__MRBlock__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MRBlock__Group__1_in_rule__MRBlock__Group__01628);
            rule__MRBlock__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MRBlock__Group__0


    // $ANTLR start rule__MRBlock__Group__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:807:1: rule__MRBlock__Group__0__Impl : ( ( rule__MRBlock__MapperAssignment_0 ) ) ;
    public final void rule__MRBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:811:1: ( ( ( rule__MRBlock__MapperAssignment_0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:812:1: ( ( rule__MRBlock__MapperAssignment_0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:812:1: ( ( rule__MRBlock__MapperAssignment_0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:813:1: ( rule__MRBlock__MapperAssignment_0 )
            {
             before(grammarAccess.getMRBlockAccess().getMapperAssignment_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:814:1: ( rule__MRBlock__MapperAssignment_0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:814:2: rule__MRBlock__MapperAssignment_0
            {
            pushFollow(FOLLOW_rule__MRBlock__MapperAssignment_0_in_rule__MRBlock__Group__0__Impl1655);
            rule__MRBlock__MapperAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMRBlockAccess().getMapperAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MRBlock__Group__0__Impl


    // $ANTLR start rule__MRBlock__Group__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:824:1: rule__MRBlock__Group__1 : rule__MRBlock__Group__1__Impl ;
    public final void rule__MRBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:828:1: ( rule__MRBlock__Group__1__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:829:2: rule__MRBlock__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MRBlock__Group__1__Impl_in_rule__MRBlock__Group__11685);
            rule__MRBlock__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MRBlock__Group__1


    // $ANTLR start rule__MRBlock__Group__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:835:1: rule__MRBlock__Group__1__Impl : ( ( rule__MRBlock__ReducerAssignment_1 ) ) ;
    public final void rule__MRBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:839:1: ( ( ( rule__MRBlock__ReducerAssignment_1 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:840:1: ( ( rule__MRBlock__ReducerAssignment_1 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:840:1: ( ( rule__MRBlock__ReducerAssignment_1 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:841:1: ( rule__MRBlock__ReducerAssignment_1 )
            {
             before(grammarAccess.getMRBlockAccess().getReducerAssignment_1()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:842:1: ( rule__MRBlock__ReducerAssignment_1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:842:2: rule__MRBlock__ReducerAssignment_1
            {
            pushFollow(FOLLOW_rule__MRBlock__ReducerAssignment_1_in_rule__MRBlock__Group__1__Impl1712);
            rule__MRBlock__ReducerAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getMRBlockAccess().getReducerAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MRBlock__Group__1__Impl


    // $ANTLR start rule__Declaration__Group__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:856:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:860:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:861:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__01746);
            rule__Declaration__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__01749);
            rule__Declaration__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declaration__Group__0


    // $ANTLR start rule__Declaration__Group__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:868:1: rule__Declaration__Group__0__Impl : ( 'program' ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:872:1: ( ( 'program' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:873:1: ( 'program' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:873:1: ( 'program' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:874:1: 'program'
            {
             before(grammarAccess.getDeclarationAccess().getProgramKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Declaration__Group__0__Impl1777); 
             after(grammarAccess.getDeclarationAccess().getProgramKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declaration__Group__0__Impl


    // $ANTLR start rule__Declaration__Group__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:887:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl rule__Declaration__Group__2 ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:891:1: ( rule__Declaration__Group__1__Impl rule__Declaration__Group__2 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:892:2: rule__Declaration__Group__1__Impl rule__Declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__11808);
            rule__Declaration__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__11811);
            rule__Declaration__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declaration__Group__1


    // $ANTLR start rule__Declaration__Group__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:899:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__NameAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:903:1: ( ( ( rule__Declaration__NameAssignment_1 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:904:1: ( ( rule__Declaration__NameAssignment_1 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:904:1: ( ( rule__Declaration__NameAssignment_1 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:905:1: ( rule__Declaration__NameAssignment_1 )
            {
             before(grammarAccess.getDeclarationAccess().getNameAssignment_1()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:906:1: ( rule__Declaration__NameAssignment_1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:906:2: rule__Declaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl1838);
            rule__Declaration__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declaration__Group__1__Impl


    // $ANTLR start rule__Declaration__Group__2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:916:1: rule__Declaration__Group__2 : rule__Declaration__Group__2__Impl ;
    public final void rule__Declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:920:1: ( rule__Declaration__Group__2__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:921:2: rule__Declaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__21868);
            rule__Declaration__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declaration__Group__2


    // $ANTLR start rule__Declaration__Group__2__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:927:1: rule__Declaration__Group__2__Impl : ( ( rule__Declaration__Group_2__0 )? ) ;
    public final void rule__Declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:931:1: ( ( ( rule__Declaration__Group_2__0 )? ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:932:1: ( ( rule__Declaration__Group_2__0 )? )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:932:1: ( ( rule__Declaration__Group_2__0 )? )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:933:1: ( rule__Declaration__Group_2__0 )?
            {
             before(grammarAccess.getDeclarationAccess().getGroup_2()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:934:1: ( rule__Declaration__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:934:2: rule__Declaration__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Declaration__Group_2__0_in_rule__Declaration__Group__2__Impl1895);
                    rule__Declaration__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclarationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declaration__Group__2__Impl


    // $ANTLR start rule__Declaration__Group_2__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:950:1: rule__Declaration__Group_2__0 : rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1 ;
    public final void rule__Declaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:954:1: ( rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:955:2: rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group_2__0__Impl_in_rule__Declaration__Group_2__01932);
            rule__Declaration__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group_2__1_in_rule__Declaration__Group_2__01935);
            rule__Declaration__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declaration__Group_2__0


    // $ANTLR start rule__Declaration__Group_2__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:962:1: rule__Declaration__Group_2__0__Impl : ( 'extend' ) ;
    public final void rule__Declaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:966:1: ( ( 'extend' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:967:1: ( 'extend' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:967:1: ( 'extend' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:968:1: 'extend'
            {
             before(grammarAccess.getDeclarationAccess().getExtendKeyword_2_0()); 
            match(input,15,FOLLOW_15_in_rule__Declaration__Group_2__0__Impl1963); 
             after(grammarAccess.getDeclarationAccess().getExtendKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declaration__Group_2__0__Impl


    // $ANTLR start rule__Declaration__Group_2__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:981:1: rule__Declaration__Group_2__1 : rule__Declaration__Group_2__1__Impl ;
    public final void rule__Declaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:985:1: ( rule__Declaration__Group_2__1__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:986:2: rule__Declaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group_2__1__Impl_in_rule__Declaration__Group_2__11994);
            rule__Declaration__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declaration__Group_2__1


    // $ANTLR start rule__Declaration__Group_2__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:992:1: rule__Declaration__Group_2__1__Impl : ( ( rule__Declaration__SuperNameAssignment_2_1 ) ) ;
    public final void rule__Declaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:996:1: ( ( ( rule__Declaration__SuperNameAssignment_2_1 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:997:1: ( ( rule__Declaration__SuperNameAssignment_2_1 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:997:1: ( ( rule__Declaration__SuperNameAssignment_2_1 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:998:1: ( rule__Declaration__SuperNameAssignment_2_1 )
            {
             before(grammarAccess.getDeclarationAccess().getSuperNameAssignment_2_1()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:999:1: ( rule__Declaration__SuperNameAssignment_2_1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:999:2: rule__Declaration__SuperNameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Declaration__SuperNameAssignment_2_1_in_rule__Declaration__Group_2__1__Impl2021);
            rule__Declaration__SuperNameAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getSuperNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declaration__Group_2__1__Impl


    // $ANTLR start rule__Mapper__Group__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1013:1: rule__Mapper__Group__0 : rule__Mapper__Group__0__Impl rule__Mapper__Group__1 ;
    public final void rule__Mapper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1017:1: ( rule__Mapper__Group__0__Impl rule__Mapper__Group__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1018:2: rule__Mapper__Group__0__Impl rule__Mapper__Group__1
            {
            pushFollow(FOLLOW_rule__Mapper__Group__0__Impl_in_rule__Mapper__Group__02055);
            rule__Mapper__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapper__Group__1_in_rule__Mapper__Group__02058);
            rule__Mapper__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__0


    // $ANTLR start rule__Mapper__Group__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1025:1: rule__Mapper__Group__0__Impl : ( 'map(' ) ;
    public final void rule__Mapper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1029:1: ( ( 'map(' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1030:1: ( 'map(' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1030:1: ( 'map(' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1031:1: 'map('
            {
             before(grammarAccess.getMapperAccess().getMapKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Mapper__Group__0__Impl2086); 
             after(grammarAccess.getMapperAccess().getMapKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__0__Impl


    // $ANTLR start rule__Mapper__Group__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1044:1: rule__Mapper__Group__1 : rule__Mapper__Group__1__Impl rule__Mapper__Group__2 ;
    public final void rule__Mapper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1048:1: ( rule__Mapper__Group__1__Impl rule__Mapper__Group__2 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1049:2: rule__Mapper__Group__1__Impl rule__Mapper__Group__2
            {
            pushFollow(FOLLOW_rule__Mapper__Group__1__Impl_in_rule__Mapper__Group__12117);
            rule__Mapper__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapper__Group__2_in_rule__Mapper__Group__12120);
            rule__Mapper__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__1


    // $ANTLR start rule__Mapper__Group__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1056:1: rule__Mapper__Group__1__Impl : ( ( rule__Mapper__InkeyAssignment_1 ) ) ;
    public final void rule__Mapper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1060:1: ( ( ( rule__Mapper__InkeyAssignment_1 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1061:1: ( ( rule__Mapper__InkeyAssignment_1 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1061:1: ( ( rule__Mapper__InkeyAssignment_1 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1062:1: ( rule__Mapper__InkeyAssignment_1 )
            {
             before(grammarAccess.getMapperAccess().getInkeyAssignment_1()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1063:1: ( rule__Mapper__InkeyAssignment_1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1063:2: rule__Mapper__InkeyAssignment_1
            {
            pushFollow(FOLLOW_rule__Mapper__InkeyAssignment_1_in_rule__Mapper__Group__1__Impl2147);
            rule__Mapper__InkeyAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getMapperAccess().getInkeyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__1__Impl


    // $ANTLR start rule__Mapper__Group__2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1073:1: rule__Mapper__Group__2 : rule__Mapper__Group__2__Impl rule__Mapper__Group__3 ;
    public final void rule__Mapper__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1077:1: ( rule__Mapper__Group__2__Impl rule__Mapper__Group__3 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1078:2: rule__Mapper__Group__2__Impl rule__Mapper__Group__3
            {
            pushFollow(FOLLOW_rule__Mapper__Group__2__Impl_in_rule__Mapper__Group__22177);
            rule__Mapper__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapper__Group__3_in_rule__Mapper__Group__22180);
            rule__Mapper__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__2


    // $ANTLR start rule__Mapper__Group__2__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1085:1: rule__Mapper__Group__2__Impl : ( ',' ) ;
    public final void rule__Mapper__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1089:1: ( ( ',' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1090:1: ( ',' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1090:1: ( ',' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1091:1: ','
            {
             before(grammarAccess.getMapperAccess().getCommaKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Mapper__Group__2__Impl2208); 
             after(grammarAccess.getMapperAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__2__Impl


    // $ANTLR start rule__Mapper__Group__3
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1104:1: rule__Mapper__Group__3 : rule__Mapper__Group__3__Impl rule__Mapper__Group__4 ;
    public final void rule__Mapper__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1108:1: ( rule__Mapper__Group__3__Impl rule__Mapper__Group__4 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1109:2: rule__Mapper__Group__3__Impl rule__Mapper__Group__4
            {
            pushFollow(FOLLOW_rule__Mapper__Group__3__Impl_in_rule__Mapper__Group__32239);
            rule__Mapper__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapper__Group__4_in_rule__Mapper__Group__32242);
            rule__Mapper__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__3


    // $ANTLR start rule__Mapper__Group__3__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1116:1: rule__Mapper__Group__3__Impl : ( ( rule__Mapper__InvalueAssignment_3 ) ) ;
    public final void rule__Mapper__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1120:1: ( ( ( rule__Mapper__InvalueAssignment_3 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1121:1: ( ( rule__Mapper__InvalueAssignment_3 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1121:1: ( ( rule__Mapper__InvalueAssignment_3 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1122:1: ( rule__Mapper__InvalueAssignment_3 )
            {
             before(grammarAccess.getMapperAccess().getInvalueAssignment_3()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1123:1: ( rule__Mapper__InvalueAssignment_3 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1123:2: rule__Mapper__InvalueAssignment_3
            {
            pushFollow(FOLLOW_rule__Mapper__InvalueAssignment_3_in_rule__Mapper__Group__3__Impl2269);
            rule__Mapper__InvalueAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getMapperAccess().getInvalueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__3__Impl


    // $ANTLR start rule__Mapper__Group__4
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1133:1: rule__Mapper__Group__4 : rule__Mapper__Group__4__Impl rule__Mapper__Group__5 ;
    public final void rule__Mapper__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1137:1: ( rule__Mapper__Group__4__Impl rule__Mapper__Group__5 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1138:2: rule__Mapper__Group__4__Impl rule__Mapper__Group__5
            {
            pushFollow(FOLLOW_rule__Mapper__Group__4__Impl_in_rule__Mapper__Group__42299);
            rule__Mapper__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapper__Group__5_in_rule__Mapper__Group__42302);
            rule__Mapper__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__4


    // $ANTLR start rule__Mapper__Group__4__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1145:1: rule__Mapper__Group__4__Impl : ( ',' ) ;
    public final void rule__Mapper__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1149:1: ( ( ',' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1150:1: ( ',' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1150:1: ( ',' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1151:1: ','
            {
             before(grammarAccess.getMapperAccess().getCommaKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Mapper__Group__4__Impl2330); 
             after(grammarAccess.getMapperAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__4__Impl


    // $ANTLR start rule__Mapper__Group__5
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1164:1: rule__Mapper__Group__5 : rule__Mapper__Group__5__Impl rule__Mapper__Group__6 ;
    public final void rule__Mapper__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1168:1: ( rule__Mapper__Group__5__Impl rule__Mapper__Group__6 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1169:2: rule__Mapper__Group__5__Impl rule__Mapper__Group__6
            {
            pushFollow(FOLLOW_rule__Mapper__Group__5__Impl_in_rule__Mapper__Group__52361);
            rule__Mapper__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapper__Group__6_in_rule__Mapper__Group__52364);
            rule__Mapper__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__5


    // $ANTLR start rule__Mapper__Group__5__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1176:1: rule__Mapper__Group__5__Impl : ( ( rule__Mapper__OutkeyAssignment_5 ) ) ;
    public final void rule__Mapper__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1180:1: ( ( ( rule__Mapper__OutkeyAssignment_5 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1181:1: ( ( rule__Mapper__OutkeyAssignment_5 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1181:1: ( ( rule__Mapper__OutkeyAssignment_5 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1182:1: ( rule__Mapper__OutkeyAssignment_5 )
            {
             before(grammarAccess.getMapperAccess().getOutkeyAssignment_5()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1183:1: ( rule__Mapper__OutkeyAssignment_5 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1183:2: rule__Mapper__OutkeyAssignment_5
            {
            pushFollow(FOLLOW_rule__Mapper__OutkeyAssignment_5_in_rule__Mapper__Group__5__Impl2391);
            rule__Mapper__OutkeyAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getMapperAccess().getOutkeyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__5__Impl


    // $ANTLR start rule__Mapper__Group__6
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1193:1: rule__Mapper__Group__6 : rule__Mapper__Group__6__Impl rule__Mapper__Group__7 ;
    public final void rule__Mapper__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1197:1: ( rule__Mapper__Group__6__Impl rule__Mapper__Group__7 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1198:2: rule__Mapper__Group__6__Impl rule__Mapper__Group__7
            {
            pushFollow(FOLLOW_rule__Mapper__Group__6__Impl_in_rule__Mapper__Group__62421);
            rule__Mapper__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapper__Group__7_in_rule__Mapper__Group__62424);
            rule__Mapper__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__6


    // $ANTLR start rule__Mapper__Group__6__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1205:1: rule__Mapper__Group__6__Impl : ( ',' ) ;
    public final void rule__Mapper__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1209:1: ( ( ',' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1210:1: ( ',' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1210:1: ( ',' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1211:1: ','
            {
             before(grammarAccess.getMapperAccess().getCommaKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__Mapper__Group__6__Impl2452); 
             after(grammarAccess.getMapperAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__6__Impl


    // $ANTLR start rule__Mapper__Group__7
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1224:1: rule__Mapper__Group__7 : rule__Mapper__Group__7__Impl rule__Mapper__Group__8 ;
    public final void rule__Mapper__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1228:1: ( rule__Mapper__Group__7__Impl rule__Mapper__Group__8 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1229:2: rule__Mapper__Group__7__Impl rule__Mapper__Group__8
            {
            pushFollow(FOLLOW_rule__Mapper__Group__7__Impl_in_rule__Mapper__Group__72483);
            rule__Mapper__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapper__Group__8_in_rule__Mapper__Group__72486);
            rule__Mapper__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__7


    // $ANTLR start rule__Mapper__Group__7__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1236:1: rule__Mapper__Group__7__Impl : ( ( rule__Mapper__OutvalueAssignment_7 ) ) ;
    public final void rule__Mapper__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1240:1: ( ( ( rule__Mapper__OutvalueAssignment_7 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1241:1: ( ( rule__Mapper__OutvalueAssignment_7 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1241:1: ( ( rule__Mapper__OutvalueAssignment_7 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1242:1: ( rule__Mapper__OutvalueAssignment_7 )
            {
             before(grammarAccess.getMapperAccess().getOutvalueAssignment_7()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1243:1: ( rule__Mapper__OutvalueAssignment_7 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1243:2: rule__Mapper__OutvalueAssignment_7
            {
            pushFollow(FOLLOW_rule__Mapper__OutvalueAssignment_7_in_rule__Mapper__Group__7__Impl2513);
            rule__Mapper__OutvalueAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getMapperAccess().getOutvalueAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__7__Impl


    // $ANTLR start rule__Mapper__Group__8
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1253:1: rule__Mapper__Group__8 : rule__Mapper__Group__8__Impl rule__Mapper__Group__9 ;
    public final void rule__Mapper__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1257:1: ( rule__Mapper__Group__8__Impl rule__Mapper__Group__9 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1258:2: rule__Mapper__Group__8__Impl rule__Mapper__Group__9
            {
            pushFollow(FOLLOW_rule__Mapper__Group__8__Impl_in_rule__Mapper__Group__82543);
            rule__Mapper__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapper__Group__9_in_rule__Mapper__Group__82546);
            rule__Mapper__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__8


    // $ANTLR start rule__Mapper__Group__8__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1265:1: rule__Mapper__Group__8__Impl : ( ')' ) ;
    public final void rule__Mapper__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1269:1: ( ( ')' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1270:1: ( ')' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1270:1: ( ')' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1271:1: ')'
            {
             before(grammarAccess.getMapperAccess().getRightParenthesisKeyword_8()); 
            match(input,18,FOLLOW_18_in_rule__Mapper__Group__8__Impl2574); 
             after(grammarAccess.getMapperAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__8__Impl


    // $ANTLR start rule__Mapper__Group__9
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1284:1: rule__Mapper__Group__9 : rule__Mapper__Group__9__Impl ;
    public final void rule__Mapper__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1288:1: ( rule__Mapper__Group__9__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1289:2: rule__Mapper__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Mapper__Group__9__Impl_in_rule__Mapper__Group__92605);
            rule__Mapper__Group__9__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__9


    // $ANTLR start rule__Mapper__Group__9__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1295:1: rule__Mapper__Group__9__Impl : ( RULE_BLOCK ) ;
    public final void rule__Mapper__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1299:1: ( ( RULE_BLOCK ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1300:1: ( RULE_BLOCK )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1300:1: ( RULE_BLOCK )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1301:1: RULE_BLOCK
            {
             before(grammarAccess.getMapperAccess().getBlockTerminalRuleCall_9()); 
            match(input,RULE_BLOCK,FOLLOW_RULE_BLOCK_in_rule__Mapper__Group__9__Impl2632); 
             after(grammarAccess.getMapperAccess().getBlockTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__9__Impl


    // $ANTLR start rule__Argument__Group__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1332:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1336:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1337:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__02681);
            rule__Argument__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__02684);
            rule__Argument__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__0


    // $ANTLR start rule__Argument__Group__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1344:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__TypeAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1348:1: ( ( ( rule__Argument__TypeAssignment_0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1349:1: ( ( rule__Argument__TypeAssignment_0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1349:1: ( ( rule__Argument__TypeAssignment_0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1350:1: ( rule__Argument__TypeAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1351:1: ( rule__Argument__TypeAssignment_0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1351:2: rule__Argument__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Argument__TypeAssignment_0_in_rule__Argument__Group__0__Impl2711);
            rule__Argument__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__0__Impl


    // $ANTLR start rule__Argument__Group__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1361:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1365:1: ( rule__Argument__Group__1__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1366:2: rule__Argument__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__12741);
            rule__Argument__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__1


    // $ANTLR start rule__Argument__Group__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1372:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__ArgnameAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1376:1: ( ( ( rule__Argument__ArgnameAssignment_1 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1377:1: ( ( rule__Argument__ArgnameAssignment_1 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1377:1: ( ( rule__Argument__ArgnameAssignment_1 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1378:1: ( rule__Argument__ArgnameAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getArgnameAssignment_1()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1379:1: ( rule__Argument__ArgnameAssignment_1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1379:2: rule__Argument__ArgnameAssignment_1
            {
            pushFollow(FOLLOW_rule__Argument__ArgnameAssignment_1_in_rule__Argument__Group__1__Impl2768);
            rule__Argument__ArgnameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getArgnameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__1__Impl


    // $ANTLR start rule__Reducer__Group__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1393:1: rule__Reducer__Group__0 : rule__Reducer__Group__0__Impl rule__Reducer__Group__1 ;
    public final void rule__Reducer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1397:1: ( rule__Reducer__Group__0__Impl rule__Reducer__Group__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1398:2: rule__Reducer__Group__0__Impl rule__Reducer__Group__1
            {
            pushFollow(FOLLOW_rule__Reducer__Group__0__Impl_in_rule__Reducer__Group__02802);
            rule__Reducer__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reducer__Group__1_in_rule__Reducer__Group__02805);
            rule__Reducer__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__0


    // $ANTLR start rule__Reducer__Group__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1405:1: rule__Reducer__Group__0__Impl : ( 'reduce(' ) ;
    public final void rule__Reducer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1409:1: ( ( 'reduce(' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1410:1: ( 'reduce(' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1410:1: ( 'reduce(' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1411:1: 'reduce('
            {
             before(grammarAccess.getReducerAccess().getReduceKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Reducer__Group__0__Impl2833); 
             after(grammarAccess.getReducerAccess().getReduceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__0__Impl


    // $ANTLR start rule__Reducer__Group__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1424:1: rule__Reducer__Group__1 : rule__Reducer__Group__1__Impl rule__Reducer__Group__2 ;
    public final void rule__Reducer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1428:1: ( rule__Reducer__Group__1__Impl rule__Reducer__Group__2 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1429:2: rule__Reducer__Group__1__Impl rule__Reducer__Group__2
            {
            pushFollow(FOLLOW_rule__Reducer__Group__1__Impl_in_rule__Reducer__Group__12864);
            rule__Reducer__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reducer__Group__2_in_rule__Reducer__Group__12867);
            rule__Reducer__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__1


    // $ANTLR start rule__Reducer__Group__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1436:1: rule__Reducer__Group__1__Impl : ( ( rule__Reducer__OutkeyAssignment_1 ) ) ;
    public final void rule__Reducer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1440:1: ( ( ( rule__Reducer__OutkeyAssignment_1 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1441:1: ( ( rule__Reducer__OutkeyAssignment_1 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1441:1: ( ( rule__Reducer__OutkeyAssignment_1 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1442:1: ( rule__Reducer__OutkeyAssignment_1 )
            {
             before(grammarAccess.getReducerAccess().getOutkeyAssignment_1()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1443:1: ( rule__Reducer__OutkeyAssignment_1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1443:2: rule__Reducer__OutkeyAssignment_1
            {
            pushFollow(FOLLOW_rule__Reducer__OutkeyAssignment_1_in_rule__Reducer__Group__1__Impl2894);
            rule__Reducer__OutkeyAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getReducerAccess().getOutkeyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__1__Impl


    // $ANTLR start rule__Reducer__Group__2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1453:1: rule__Reducer__Group__2 : rule__Reducer__Group__2__Impl rule__Reducer__Group__3 ;
    public final void rule__Reducer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1457:1: ( rule__Reducer__Group__2__Impl rule__Reducer__Group__3 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1458:2: rule__Reducer__Group__2__Impl rule__Reducer__Group__3
            {
            pushFollow(FOLLOW_rule__Reducer__Group__2__Impl_in_rule__Reducer__Group__22924);
            rule__Reducer__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reducer__Group__3_in_rule__Reducer__Group__22927);
            rule__Reducer__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__2


    // $ANTLR start rule__Reducer__Group__2__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1465:1: rule__Reducer__Group__2__Impl : ( ',' ) ;
    public final void rule__Reducer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1469:1: ( ( ',' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1470:1: ( ',' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1470:1: ( ',' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1471:1: ','
            {
             before(grammarAccess.getReducerAccess().getCommaKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Reducer__Group__2__Impl2955); 
             after(grammarAccess.getReducerAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__2__Impl


    // $ANTLR start rule__Reducer__Group__3
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1484:1: rule__Reducer__Group__3 : rule__Reducer__Group__3__Impl rule__Reducer__Group__4 ;
    public final void rule__Reducer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1488:1: ( rule__Reducer__Group__3__Impl rule__Reducer__Group__4 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1489:2: rule__Reducer__Group__3__Impl rule__Reducer__Group__4
            {
            pushFollow(FOLLOW_rule__Reducer__Group__3__Impl_in_rule__Reducer__Group__32986);
            rule__Reducer__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reducer__Group__4_in_rule__Reducer__Group__32989);
            rule__Reducer__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__3


    // $ANTLR start rule__Reducer__Group__3__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1496:1: rule__Reducer__Group__3__Impl : ( ( rule__Reducer__OutvalueAssignment_3 ) ) ;
    public final void rule__Reducer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1500:1: ( ( ( rule__Reducer__OutvalueAssignment_3 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1501:1: ( ( rule__Reducer__OutvalueAssignment_3 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1501:1: ( ( rule__Reducer__OutvalueAssignment_3 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1502:1: ( rule__Reducer__OutvalueAssignment_3 )
            {
             before(grammarAccess.getReducerAccess().getOutvalueAssignment_3()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1503:1: ( rule__Reducer__OutvalueAssignment_3 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1503:2: rule__Reducer__OutvalueAssignment_3
            {
            pushFollow(FOLLOW_rule__Reducer__OutvalueAssignment_3_in_rule__Reducer__Group__3__Impl3016);
            rule__Reducer__OutvalueAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getReducerAccess().getOutvalueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__3__Impl


    // $ANTLR start rule__Reducer__Group__4
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1513:1: rule__Reducer__Group__4 : rule__Reducer__Group__4__Impl rule__Reducer__Group__5 ;
    public final void rule__Reducer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1517:1: ( rule__Reducer__Group__4__Impl rule__Reducer__Group__5 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1518:2: rule__Reducer__Group__4__Impl rule__Reducer__Group__5
            {
            pushFollow(FOLLOW_rule__Reducer__Group__4__Impl_in_rule__Reducer__Group__43046);
            rule__Reducer__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reducer__Group__5_in_rule__Reducer__Group__43049);
            rule__Reducer__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__4


    // $ANTLR start rule__Reducer__Group__4__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1525:1: rule__Reducer__Group__4__Impl : ( ')' ) ;
    public final void rule__Reducer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1529:1: ( ( ')' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1530:1: ( ')' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1530:1: ( ')' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1531:1: ')'
            {
             before(grammarAccess.getReducerAccess().getRightParenthesisKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Reducer__Group__4__Impl3077); 
             after(grammarAccess.getReducerAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__4__Impl


    // $ANTLR start rule__Reducer__Group__5
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1544:1: rule__Reducer__Group__5 : rule__Reducer__Group__5__Impl ;
    public final void rule__Reducer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1548:1: ( rule__Reducer__Group__5__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1549:2: rule__Reducer__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Reducer__Group__5__Impl_in_rule__Reducer__Group__53108);
            rule__Reducer__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__5


    // $ANTLR start rule__Reducer__Group__5__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1555:1: rule__Reducer__Group__5__Impl : ( RULE_BLOCK ) ;
    public final void rule__Reducer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1559:1: ( ( RULE_BLOCK ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1560:1: ( RULE_BLOCK )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1560:1: ( RULE_BLOCK )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1561:1: RULE_BLOCK
            {
             before(grammarAccess.getReducerAccess().getBlockTerminalRuleCall_5()); 
            match(input,RULE_BLOCK,FOLLOW_RULE_BLOCK_in_rule__Reducer__Group__5__Impl3135); 
             after(grammarAccess.getReducerAccess().getBlockTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__5__Impl


    // $ANTLR start rule__Entity__Group__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1584:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1588:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1589:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03176);
            rule__Entity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03179);
            rule__Entity__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__0


    // $ANTLR start rule__Entity__Group__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1596:1: rule__Entity__Group__0__Impl : ( 'metaelement' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1600:1: ( ( 'metaelement' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1601:1: ( 'metaelement' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1601:1: ( 'metaelement' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1602:1: 'metaelement'
            {
             before(grammarAccess.getEntityAccess().getMetaelementKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Entity__Group__0__Impl3207); 
             after(grammarAccess.getEntityAccess().getMetaelementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__0__Impl


    // $ANTLR start rule__Entity__Group__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1615:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1619:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1620:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13238);
            rule__Entity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13241);
            rule__Entity__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__1


    // $ANTLR start rule__Entity__Group__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1627:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1631:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1632:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1632:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1633:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1634:1: ( rule__Entity__NameAssignment_1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1634:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl3268);
            rule__Entity__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__1__Impl


    // $ANTLR start rule__Entity__Group__2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1644:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1648:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1649:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23298);
            rule__Entity__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23301);
            rule__Entity__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__2


    // $ANTLR start rule__Entity__Group__2__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1656:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1660:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1661:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1661:1: ( ( rule__Entity__Group_2__0 )? )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1662:1: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1663:1: ( rule__Entity__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1663:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl3328);
                    rule__Entity__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__2__Impl


    // $ANTLR start rule__Entity__Group__3
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1673:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1677:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1678:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33359);
            rule__Entity__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33362);
            rule__Entity__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__3


    // $ANTLR start rule__Entity__Group__3__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1685:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1689:1: ( ( '{' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1690:1: ( '{' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1690:1: ( '{' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1691:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Entity__Group__3__Impl3390); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__3__Impl


    // $ANTLR start rule__Entity__Group__4
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1704:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1708:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1709:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43421);
            rule__Entity__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__43424);
            rule__Entity__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__4


    // $ANTLR start rule__Entity__Group__4__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1716:1: rule__Entity__Group__4__Impl : ( ( ( rule__Entity__FeaturesAssignment_4 ) ) ( ( rule__Entity__FeaturesAssignment_4 )* ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1720:1: ( ( ( ( rule__Entity__FeaturesAssignment_4 ) ) ( ( rule__Entity__FeaturesAssignment_4 )* ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1721:1: ( ( ( rule__Entity__FeaturesAssignment_4 ) ) ( ( rule__Entity__FeaturesAssignment_4 )* ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1721:1: ( ( ( rule__Entity__FeaturesAssignment_4 ) ) ( ( rule__Entity__FeaturesAssignment_4 )* ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1722:1: ( ( rule__Entity__FeaturesAssignment_4 ) ) ( ( rule__Entity__FeaturesAssignment_4 )* )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1722:1: ( ( rule__Entity__FeaturesAssignment_4 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1723:1: ( rule__Entity__FeaturesAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1724:1: ( rule__Entity__FeaturesAssignment_4 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1724:2: rule__Entity__FeaturesAssignment_4
            {
            pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_4_in_rule__Entity__Group__4__Impl3453);
            rule__Entity__FeaturesAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 

            }

            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1727:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1728:1: ( rule__Entity__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1729:1: ( rule__Entity__FeaturesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=22 && LA9_0<=28)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1729:2: rule__Entity__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_4_in_rule__Entity__Group__4__Impl3465);
            	    rule__Entity__FeaturesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__4__Impl


    // $ANTLR start rule__Entity__Group__5
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1740:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1744:1: ( rule__Entity__Group__5__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1745:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__53498);
            rule__Entity__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__5


    // $ANTLR start rule__Entity__Group__5__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1751:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1755:1: ( ( '}' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1756:1: ( '}' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1756:1: ( '}' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1757:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__Entity__Group__5__Impl3526); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__5__Impl


    // $ANTLR start rule__Entity__Group_2__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1782:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1786:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1787:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__03569);
            rule__Entity__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__03572);
            rule__Entity__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_2__0


    // $ANTLR start rule__Entity__Group_2__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1794:1: rule__Entity__Group_2__0__Impl : ( 'extend' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1798:1: ( ( 'extend' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1799:1: ( 'extend' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1799:1: ( 'extend' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1800:1: 'extend'
            {
             before(grammarAccess.getEntityAccess().getExtendKeyword_2_0()); 
            match(input,15,FOLLOW_15_in_rule__Entity__Group_2__0__Impl3600); 
             after(grammarAccess.getEntityAccess().getExtendKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_2__0__Impl


    // $ANTLR start rule__Entity__Group_2__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1813:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1817:1: ( rule__Entity__Group_2__1__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1818:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__13631);
            rule__Entity__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_2__1


    // $ANTLR start rule__Entity__Group_2__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1824:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1828:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1829:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1829:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1830:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1831:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1831:2: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl3658);
            rule__Entity__SuperTypeAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_2__1__Impl


    // $ANTLR start rule__Feature__Group_0__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1845:1: rule__Feature__Group_0__0 : rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1 ;
    public final void rule__Feature__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1849:1: ( rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1850:2: rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1
            {
            pushFollow(FOLLOW_rule__Feature__Group_0__0__Impl_in_rule__Feature__Group_0__03692);
            rule__Feature__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_0__1_in_rule__Feature__Group_0__03695);
            rule__Feature__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group_0__0


    // $ANTLR start rule__Feature__Group_0__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1857:1: rule__Feature__Group_0__0__Impl : ( ( rule__Feature__TypeAssignment_0_0 ) ) ;
    public final void rule__Feature__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1861:1: ( ( ( rule__Feature__TypeAssignment_0_0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1862:1: ( ( rule__Feature__TypeAssignment_0_0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1862:1: ( ( rule__Feature__TypeAssignment_0_0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1863:1: ( rule__Feature__TypeAssignment_0_0 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_0_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1864:1: ( rule__Feature__TypeAssignment_0_0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1864:2: rule__Feature__TypeAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Feature__TypeAssignment_0_0_in_rule__Feature__Group_0__0__Impl3722);
            rule__Feature__TypeAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group_0__0__Impl


    // $ANTLR start rule__Feature__Group_0__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1874:1: rule__Feature__Group_0__1 : rule__Feature__Group_0__1__Impl rule__Feature__Group_0__2 ;
    public final void rule__Feature__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1878:1: ( rule__Feature__Group_0__1__Impl rule__Feature__Group_0__2 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1879:2: rule__Feature__Group_0__1__Impl rule__Feature__Group_0__2
            {
            pushFollow(FOLLOW_rule__Feature__Group_0__1__Impl_in_rule__Feature__Group_0__13752);
            rule__Feature__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_0__2_in_rule__Feature__Group_0__13755);
            rule__Feature__Group_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group_0__1


    // $ANTLR start rule__Feature__Group_0__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1886:1: rule__Feature__Group_0__1__Impl : ( ( rule__Feature__NameAssignment_0_1 ) ) ;
    public final void rule__Feature__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1890:1: ( ( ( rule__Feature__NameAssignment_0_1 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1891:1: ( ( rule__Feature__NameAssignment_0_1 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1891:1: ( ( rule__Feature__NameAssignment_0_1 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1892:1: ( rule__Feature__NameAssignment_0_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_0_1()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1893:1: ( rule__Feature__NameAssignment_0_1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1893:2: rule__Feature__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_0_1_in_rule__Feature__Group_0__1__Impl3782);
            rule__Feature__NameAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group_0__1__Impl


    // $ANTLR start rule__Feature__Group_0__2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1903:1: rule__Feature__Group_0__2 : rule__Feature__Group_0__2__Impl ;
    public final void rule__Feature__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1907:1: ( rule__Feature__Group_0__2__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1908:2: rule__Feature__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group_0__2__Impl_in_rule__Feature__Group_0__23812);
            rule__Feature__Group_0__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group_0__2


    // $ANTLR start rule__Feature__Group_0__2__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1914:1: rule__Feature__Group_0__2__Impl : ( ';' ) ;
    public final void rule__Feature__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1918:1: ( ( ';' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1919:1: ( ';' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1919:1: ( ';' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1920:1: ';'
            {
             before(grammarAccess.getFeatureAccess().getSemicolonKeyword_0_2()); 
            match(input,21,FOLLOW_21_in_rule__Feature__Group_0__2__Impl3840); 
             after(grammarAccess.getFeatureAccess().getSemicolonKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group_0__2__Impl


    // $ANTLR start rule__Feature__Group_1__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1939:1: rule__Feature__Group_1__0 : rule__Feature__Group_1__0__Impl rule__Feature__Group_1__1 ;
    public final void rule__Feature__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1943:1: ( rule__Feature__Group_1__0__Impl rule__Feature__Group_1__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1944:2: rule__Feature__Group_1__0__Impl rule__Feature__Group_1__1
            {
            pushFollow(FOLLOW_rule__Feature__Group_1__0__Impl_in_rule__Feature__Group_1__03877);
            rule__Feature__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_1__1_in_rule__Feature__Group_1__03880);
            rule__Feature__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group_1__0


    // $ANTLR start rule__Feature__Group_1__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1951:1: rule__Feature__Group_1__0__Impl : ( ruleReadorWrite ) ;
    public final void rule__Feature__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1955:1: ( ( ruleReadorWrite ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1956:1: ( ruleReadorWrite )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1956:1: ( ruleReadorWrite )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1957:1: ruleReadorWrite
            {
             before(grammarAccess.getFeatureAccess().getReadorWriteParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReadorWrite_in_rule__Feature__Group_1__0__Impl3907);
            ruleReadorWrite();
            _fsp--;

             after(grammarAccess.getFeatureAccess().getReadorWriteParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group_1__0__Impl


    // $ANTLR start rule__Feature__Group_1__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1968:1: rule__Feature__Group_1__1 : rule__Feature__Group_1__1__Impl ;
    public final void rule__Feature__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1972:1: ( rule__Feature__Group_1__1__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1973:2: rule__Feature__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group_1__1__Impl_in_rule__Feature__Group_1__13936);
            rule__Feature__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group_1__1


    // $ANTLR start rule__Feature__Group_1__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1979:1: rule__Feature__Group_1__1__Impl : ( ';' ) ;
    public final void rule__Feature__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1983:1: ( ( ';' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1984:1: ( ';' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1984:1: ( ';' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1985:1: ';'
            {
             before(grammarAccess.getFeatureAccess().getSemicolonKeyword_1_1()); 
            match(input,21,FOLLOW_21_in_rule__Feature__Group_1__1__Impl3964); 
             after(grammarAccess.getFeatureAccess().getSemicolonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group_1__1__Impl


    // $ANTLR start rule__ReadorWrite__Group_0__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2002:1: rule__ReadorWrite__Group_0__0 : rule__ReadorWrite__Group_0__0__Impl rule__ReadorWrite__Group_0__1 ;
    public final void rule__ReadorWrite__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2006:1: ( rule__ReadorWrite__Group_0__0__Impl rule__ReadorWrite__Group_0__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2007:2: rule__ReadorWrite__Group_0__0__Impl rule__ReadorWrite__Group_0__1
            {
            pushFollow(FOLLOW_rule__ReadorWrite__Group_0__0__Impl_in_rule__ReadorWrite__Group_0__03999);
            rule__ReadorWrite__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ReadorWrite__Group_0__1_in_rule__ReadorWrite__Group_0__04002);
            rule__ReadorWrite__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_0__0


    // $ANTLR start rule__ReadorWrite__Group_0__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2014:1: rule__ReadorWrite__Group_0__0__Impl : ( 'read' ) ;
    public final void rule__ReadorWrite__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2018:1: ( ( 'read' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2019:1: ( 'read' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2019:1: ( 'read' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2020:1: 'read'
            {
             before(grammarAccess.getReadorWriteAccess().getReadKeyword_0_0()); 
            match(input,22,FOLLOW_22_in_rule__ReadorWrite__Group_0__0__Impl4030); 
             after(grammarAccess.getReadorWriteAccess().getReadKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_0__0__Impl


    // $ANTLR start rule__ReadorWrite__Group_0__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2033:1: rule__ReadorWrite__Group_0__1 : rule__ReadorWrite__Group_0__1__Impl ;
    public final void rule__ReadorWrite__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2037:1: ( rule__ReadorWrite__Group_0__1__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2038:2: rule__ReadorWrite__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ReadorWrite__Group_0__1__Impl_in_rule__ReadorWrite__Group_0__14061);
            rule__ReadorWrite__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_0__1


    // $ANTLR start rule__ReadorWrite__Group_0__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2044:1: rule__ReadorWrite__Group_0__1__Impl : ( ( rule__ReadorWrite__ReadvalAssignment_0_1 ) ) ;
    public final void rule__ReadorWrite__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2048:1: ( ( ( rule__ReadorWrite__ReadvalAssignment_0_1 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2049:1: ( ( rule__ReadorWrite__ReadvalAssignment_0_1 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2049:1: ( ( rule__ReadorWrite__ReadvalAssignment_0_1 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2050:1: ( rule__ReadorWrite__ReadvalAssignment_0_1 )
            {
             before(grammarAccess.getReadorWriteAccess().getReadvalAssignment_0_1()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2051:1: ( rule__ReadorWrite__ReadvalAssignment_0_1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2051:2: rule__ReadorWrite__ReadvalAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ReadorWrite__ReadvalAssignment_0_1_in_rule__ReadorWrite__Group_0__1__Impl4088);
            rule__ReadorWrite__ReadvalAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getReadorWriteAccess().getReadvalAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_0__1__Impl


    // $ANTLR start rule__ReadorWrite__Group_1__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2065:1: rule__ReadorWrite__Group_1__0 : rule__ReadorWrite__Group_1__0__Impl rule__ReadorWrite__Group_1__1 ;
    public final void rule__ReadorWrite__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2069:1: ( rule__ReadorWrite__Group_1__0__Impl rule__ReadorWrite__Group_1__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2070:2: rule__ReadorWrite__Group_1__0__Impl rule__ReadorWrite__Group_1__1
            {
            pushFollow(FOLLOW_rule__ReadorWrite__Group_1__0__Impl_in_rule__ReadorWrite__Group_1__04122);
            rule__ReadorWrite__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ReadorWrite__Group_1__1_in_rule__ReadorWrite__Group_1__04125);
            rule__ReadorWrite__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_1__0


    // $ANTLR start rule__ReadorWrite__Group_1__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2077:1: rule__ReadorWrite__Group_1__0__Impl : ( 'write' ) ;
    public final void rule__ReadorWrite__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2081:1: ( ( 'write' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2082:1: ( 'write' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2082:1: ( 'write' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2083:1: 'write'
            {
             before(grammarAccess.getReadorWriteAccess().getWriteKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__ReadorWrite__Group_1__0__Impl4153); 
             after(grammarAccess.getReadorWriteAccess().getWriteKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_1__0__Impl


    // $ANTLR start rule__ReadorWrite__Group_1__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2096:1: rule__ReadorWrite__Group_1__1 : rule__ReadorWrite__Group_1__1__Impl ;
    public final void rule__ReadorWrite__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2100:1: ( rule__ReadorWrite__Group_1__1__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2101:2: rule__ReadorWrite__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ReadorWrite__Group_1__1__Impl_in_rule__ReadorWrite__Group_1__14184);
            rule__ReadorWrite__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_1__1


    // $ANTLR start rule__ReadorWrite__Group_1__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2107:1: rule__ReadorWrite__Group_1__1__Impl : ( ( rule__ReadorWrite__WritevalAssignment_1_1 ) ) ;
    public final void rule__ReadorWrite__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2111:1: ( ( ( rule__ReadorWrite__WritevalAssignment_1_1 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2112:1: ( ( rule__ReadorWrite__WritevalAssignment_1_1 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2112:1: ( ( rule__ReadorWrite__WritevalAssignment_1_1 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2113:1: ( rule__ReadorWrite__WritevalAssignment_1_1 )
            {
             before(grammarAccess.getReadorWriteAccess().getWritevalAssignment_1_1()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2114:1: ( rule__ReadorWrite__WritevalAssignment_1_1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2114:2: rule__ReadorWrite__WritevalAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ReadorWrite__WritevalAssignment_1_1_in_rule__ReadorWrite__Group_1__1__Impl4211);
            rule__ReadorWrite__WritevalAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getReadorWriteAccess().getWritevalAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_1__1__Impl


    // $ANTLR start rule__TypeRef__Group__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2128:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2132:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2133:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__04245);
            rule__TypeRef__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__04248);
            rule__TypeRef__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeRef__Group__0


    // $ANTLR start rule__TypeRef__Group__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2140:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__ReferencedAssignment_0 ) ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2144:1: ( ( ( rule__TypeRef__ReferencedAssignment_0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2145:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2145:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2146:1: ( rule__TypeRef__ReferencedAssignment_0 )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2147:1: ( rule__TypeRef__ReferencedAssignment_0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2147:2: rule__TypeRef__ReferencedAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl4275);
            rule__TypeRef__ReferencedAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeRef__Group__0__Impl


    // $ANTLR start rule__TypeRef__Group__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2157:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2161:1: ( rule__TypeRef__Group__1__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2162:2: rule__TypeRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__14305);
            rule__TypeRef__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeRef__Group__1


    // $ANTLR start rule__TypeRef__Group__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2168:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__MultiAssignment_1 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2172:1: ( ( ( rule__TypeRef__MultiAssignment_1 )? ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2173:1: ( ( rule__TypeRef__MultiAssignment_1 )? )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2173:1: ( ( rule__TypeRef__MultiAssignment_1 )? )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2174:1: ( rule__TypeRef__MultiAssignment_1 )?
            {
             before(grammarAccess.getTypeRefAccess().getMultiAssignment_1()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2175:1: ( rule__TypeRef__MultiAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2175:2: rule__TypeRef__MultiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeRef__MultiAssignment_1_in_rule__TypeRef__Group__1__Impl4332);
                    rule__TypeRef__MultiAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeRefAccess().getMultiAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeRef__Group__1__Impl


    // $ANTLR start rule__MapRedoop__DeclarationAssignment_0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2190:1: rule__MapRedoop__DeclarationAssignment_0 : ( ruleDeclaration ) ;
    public final void rule__MapRedoop__DeclarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2194:1: ( ( ruleDeclaration ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2195:1: ( ruleDeclaration )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2195:1: ( ruleDeclaration )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2196:1: ruleDeclaration
            {
             before(grammarAccess.getMapRedoopAccess().getDeclarationDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__MapRedoop__DeclarationAssignment_04372);
            ruleDeclaration();
            _fsp--;

             after(grammarAccess.getMapRedoopAccess().getDeclarationDeclarationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MapRedoop__DeclarationAssignment_0


    // $ANTLR start rule__MapRedoop__ContentAssignment_2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2205:1: rule__MapRedoop__ContentAssignment_2 : ( ruleContent ) ;
    public final void rule__MapRedoop__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2209:1: ( ( ruleContent ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2210:1: ( ruleContent )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2210:1: ( ruleContent )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2211:1: ruleContent
            {
             before(grammarAccess.getMapRedoopAccess().getContentContentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleContent_in_rule__MapRedoop__ContentAssignment_24403);
            ruleContent();
            _fsp--;

             after(grammarAccess.getMapRedoopAccess().getContentContentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MapRedoop__ContentAssignment_2


    // $ANTLR start rule__Content__EntitiesAssignment_0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2220:1: rule__Content__EntitiesAssignment_0 : ( ruleListofEntities ) ;
    public final void rule__Content__EntitiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2224:1: ( ( ruleListofEntities ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2225:1: ( ruleListofEntities )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2225:1: ( ruleListofEntities )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2226:1: ruleListofEntities
            {
             before(grammarAccess.getContentAccess().getEntitiesListofEntitiesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleListofEntities_in_rule__Content__EntitiesAssignment_04434);
            ruleListofEntities();
            _fsp--;

             after(grammarAccess.getContentAccess().getEntitiesListofEntitiesParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Content__EntitiesAssignment_0


    // $ANTLR start rule__Content__MrBlocksAssignment_1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2235:1: rule__Content__MrBlocksAssignment_1 : ( ruleMRBlock ) ;
    public final void rule__Content__MrBlocksAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2239:1: ( ( ruleMRBlock ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2240:1: ( ruleMRBlock )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2240:1: ( ruleMRBlock )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2241:1: ruleMRBlock
            {
             before(grammarAccess.getContentAccess().getMrBlocksMRBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMRBlock_in_rule__Content__MrBlocksAssignment_14465);
            ruleMRBlock();
            _fsp--;

             after(grammarAccess.getContentAccess().getMrBlocksMRBlockParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Content__MrBlocksAssignment_1


    // $ANTLR start rule__ListofEntities__EntitiesAssignment_2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2250:1: rule__ListofEntities__EntitiesAssignment_2 : ( ruleEntity ) ;
    public final void rule__ListofEntities__EntitiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2254:1: ( ( ruleEntity ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2255:1: ( ruleEntity )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2255:1: ( ruleEntity )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2256:1: ruleEntity
            {
             before(grammarAccess.getListofEntitiesAccess().getEntitiesEntityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__ListofEntities__EntitiesAssignment_24496);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getListofEntitiesAccess().getEntitiesEntityParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListofEntities__EntitiesAssignment_2


    // $ANTLR start rule__MRBlock__MapperAssignment_0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2265:1: rule__MRBlock__MapperAssignment_0 : ( ruleMapper ) ;
    public final void rule__MRBlock__MapperAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2269:1: ( ( ruleMapper ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2270:1: ( ruleMapper )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2270:1: ( ruleMapper )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2271:1: ruleMapper
            {
             before(grammarAccess.getMRBlockAccess().getMapperMapperParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMapper_in_rule__MRBlock__MapperAssignment_04527);
            ruleMapper();
            _fsp--;

             after(grammarAccess.getMRBlockAccess().getMapperMapperParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MRBlock__MapperAssignment_0


    // $ANTLR start rule__MRBlock__ReducerAssignment_1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2280:1: rule__MRBlock__ReducerAssignment_1 : ( ruleReducer ) ;
    public final void rule__MRBlock__ReducerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2284:1: ( ( ruleReducer ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2285:1: ( ruleReducer )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2285:1: ( ruleReducer )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2286:1: ruleReducer
            {
             before(grammarAccess.getMRBlockAccess().getReducerReducerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReducer_in_rule__MRBlock__ReducerAssignment_14558);
            ruleReducer();
            _fsp--;

             after(grammarAccess.getMRBlockAccess().getReducerReducerParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MRBlock__ReducerAssignment_1


    // $ANTLR start rule__Declaration__NameAssignment_1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2295:1: rule__Declaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Declaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2299:1: ( ( RULE_ID ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2300:1: ( RULE_ID )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2300:1: ( RULE_ID )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2301:1: RULE_ID
            {
             before(grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Declaration__NameAssignment_14589); 
             after(grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declaration__NameAssignment_1


    // $ANTLR start rule__Declaration__SuperNameAssignment_2_1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2310:1: rule__Declaration__SuperNameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Declaration__SuperNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2314:1: ( ( RULE_ID ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2315:1: ( RULE_ID )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2315:1: ( RULE_ID )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2316:1: RULE_ID
            {
             before(grammarAccess.getDeclarationAccess().getSuperNameIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Declaration__SuperNameAssignment_2_14620); 
             after(grammarAccess.getDeclarationAccess().getSuperNameIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declaration__SuperNameAssignment_2_1


    // $ANTLR start rule__Mapper__InkeyAssignment_1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2325:1: rule__Mapper__InkeyAssignment_1 : ( ruleArgument ) ;
    public final void rule__Mapper__InkeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2329:1: ( ( ruleArgument ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2330:1: ( ruleArgument )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2330:1: ( ruleArgument )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2331:1: ruleArgument
            {
             before(grammarAccess.getMapperAccess().getInkeyArgumentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Mapper__InkeyAssignment_14651);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getMapperAccess().getInkeyArgumentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__InkeyAssignment_1


    // $ANTLR start rule__Mapper__InvalueAssignment_3
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2340:1: rule__Mapper__InvalueAssignment_3 : ( ruleArgument ) ;
    public final void rule__Mapper__InvalueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2344:1: ( ( ruleArgument ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2345:1: ( ruleArgument )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2345:1: ( ruleArgument )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2346:1: ruleArgument
            {
             before(grammarAccess.getMapperAccess().getInvalueArgumentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Mapper__InvalueAssignment_34682);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getMapperAccess().getInvalueArgumentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__InvalueAssignment_3


    // $ANTLR start rule__Mapper__OutkeyAssignment_5
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2355:1: rule__Mapper__OutkeyAssignment_5 : ( ruleArgument ) ;
    public final void rule__Mapper__OutkeyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2359:1: ( ( ruleArgument ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2360:1: ( ruleArgument )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2360:1: ( ruleArgument )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2361:1: ruleArgument
            {
             before(grammarAccess.getMapperAccess().getOutkeyArgumentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Mapper__OutkeyAssignment_54713);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getMapperAccess().getOutkeyArgumentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__OutkeyAssignment_5


    // $ANTLR start rule__Mapper__OutvalueAssignment_7
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2370:1: rule__Mapper__OutvalueAssignment_7 : ( ruleArgument ) ;
    public final void rule__Mapper__OutvalueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2374:1: ( ( ruleArgument ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2375:1: ( ruleArgument )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2375:1: ( ruleArgument )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2376:1: ruleArgument
            {
             before(grammarAccess.getMapperAccess().getOutvalueArgumentParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Mapper__OutvalueAssignment_74744);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getMapperAccess().getOutvalueArgumentParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__OutvalueAssignment_7


    // $ANTLR start rule__Argument__TypeAssignment_0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2385:1: rule__Argument__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Argument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2389:1: ( ( ruleType ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2390:1: ( ruleType )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2390:1: ( ruleType )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2391:1: ruleType
            {
             before(grammarAccess.getArgumentAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Argument__TypeAssignment_04775);
            ruleType();
            _fsp--;

             after(grammarAccess.getArgumentAccess().getTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__TypeAssignment_0


    // $ANTLR start rule__Argument__ArgnameAssignment_1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2400:1: rule__Argument__ArgnameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Argument__ArgnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2404:1: ( ( RULE_ID ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2405:1: ( RULE_ID )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2405:1: ( RULE_ID )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2406:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getArgnameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__ArgnameAssignment_14806); 
             after(grammarAccess.getArgumentAccess().getArgnameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__ArgnameAssignment_1


    // $ANTLR start rule__Reducer__OutkeyAssignment_1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2415:1: rule__Reducer__OutkeyAssignment_1 : ( ruleArgument ) ;
    public final void rule__Reducer__OutkeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2419:1: ( ( ruleArgument ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2420:1: ( ruleArgument )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2420:1: ( ruleArgument )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2421:1: ruleArgument
            {
             before(grammarAccess.getReducerAccess().getOutkeyArgumentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Reducer__OutkeyAssignment_14837);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getReducerAccess().getOutkeyArgumentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__OutkeyAssignment_1


    // $ANTLR start rule__Reducer__OutvalueAssignment_3
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2430:1: rule__Reducer__OutvalueAssignment_3 : ( ruleArgument ) ;
    public final void rule__Reducer__OutvalueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2434:1: ( ( ruleArgument ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2435:1: ( ruleArgument )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2435:1: ( ruleArgument )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2436:1: ruleArgument
            {
             before(grammarAccess.getReducerAccess().getOutvalueArgumentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Reducer__OutvalueAssignment_34868);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getReducerAccess().getOutvalueArgumentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__OutvalueAssignment_3


    // $ANTLR start rule__Type__TypeAssignment_0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2445:1: rule__Type__TypeAssignment_0 : ( ( 'int' ) ) ;
    public final void rule__Type__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2449:1: ( ( ( 'int' ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2450:1: ( ( 'int' ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2450:1: ( ( 'int' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2451:1: ( 'int' )
            {
             before(grammarAccess.getTypeAccess().getTypeIntKeyword_0_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2452:1: ( 'int' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2453:1: 'int'
            {
             before(grammarAccess.getTypeAccess().getTypeIntKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__Type__TypeAssignment_04904); 
             after(grammarAccess.getTypeAccess().getTypeIntKeyword_0_0()); 

            }

             after(grammarAccess.getTypeAccess().getTypeIntKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Type__TypeAssignment_0


    // $ANTLR start rule__Type__TypeAssignment_1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2468:1: rule__Type__TypeAssignment_1 : ( ( 'float' ) ) ;
    public final void rule__Type__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2472:1: ( ( ( 'float' ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2473:1: ( ( 'float' ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2473:1: ( ( 'float' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2474:1: ( 'float' )
            {
             before(grammarAccess.getTypeAccess().getTypeFloatKeyword_1_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2475:1: ( 'float' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2476:1: 'float'
            {
             before(grammarAccess.getTypeAccess().getTypeFloatKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Type__TypeAssignment_14948); 
             after(grammarAccess.getTypeAccess().getTypeFloatKeyword_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getTypeFloatKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Type__TypeAssignment_1


    // $ANTLR start rule__Type__TypeAssignment_2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2491:1: rule__Type__TypeAssignment_2 : ( ( 'double' ) ) ;
    public final void rule__Type__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2495:1: ( ( ( 'double' ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2496:1: ( ( 'double' ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2496:1: ( ( 'double' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2497:1: ( 'double' )
            {
             before(grammarAccess.getTypeAccess().getTypeDoubleKeyword_2_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2498:1: ( 'double' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2499:1: 'double'
            {
             before(grammarAccess.getTypeAccess().getTypeDoubleKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Type__TypeAssignment_24992); 
             after(grammarAccess.getTypeAccess().getTypeDoubleKeyword_2_0()); 

            }

             after(grammarAccess.getTypeAccess().getTypeDoubleKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Type__TypeAssignment_2


    // $ANTLR start rule__Type__TypeAssignment_3
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2514:1: rule__Type__TypeAssignment_3 : ( ( 'text' ) ) ;
    public final void rule__Type__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2518:1: ( ( ( 'text' ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2519:1: ( ( 'text' ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2519:1: ( ( 'text' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2520:1: ( 'text' )
            {
             before(grammarAccess.getTypeAccess().getTypeTextKeyword_3_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2521:1: ( 'text' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2522:1: 'text'
            {
             before(grammarAccess.getTypeAccess().getTypeTextKeyword_3_0()); 
            match(input,27,FOLLOW_27_in_rule__Type__TypeAssignment_35036); 
             after(grammarAccess.getTypeAccess().getTypeTextKeyword_3_0()); 

            }

             after(grammarAccess.getTypeAccess().getTypeTextKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Type__TypeAssignment_3


    // $ANTLR start rule__Type__TypeAssignment_4
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2537:1: rule__Type__TypeAssignment_4 : ( ( 'long' ) ) ;
    public final void rule__Type__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2541:1: ( ( ( 'long' ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2542:1: ( ( 'long' ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2542:1: ( ( 'long' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2543:1: ( 'long' )
            {
             before(grammarAccess.getTypeAccess().getTypeLongKeyword_4_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2544:1: ( 'long' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2545:1: 'long'
            {
             before(grammarAccess.getTypeAccess().getTypeLongKeyword_4_0()); 
            match(input,28,FOLLOW_28_in_rule__Type__TypeAssignment_45080); 
             after(grammarAccess.getTypeAccess().getTypeLongKeyword_4_0()); 

            }

             after(grammarAccess.getTypeAccess().getTypeLongKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Type__TypeAssignment_4


    // $ANTLR start rule__Type__NameAssignment_5
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2560:1: rule__Type__NameAssignment_5 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2564:1: ( ( RULE_ID ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2565:1: ( RULE_ID )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2565:1: ( RULE_ID )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2566:1: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Type__NameAssignment_55119); 
             after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Type__NameAssignment_5


    // $ANTLR start rule__Entity__NameAssignment_1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2575:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2579:1: ( ( RULE_ID ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2580:1: ( RULE_ID )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2580:1: ( RULE_ID )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2581:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_15150); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__NameAssignment_1


    // $ANTLR start rule__Entity__SuperTypeAssignment_2_1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2590:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2594:1: ( ( ( RULE_ID ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2595:1: ( ( RULE_ID ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2595:1: ( ( RULE_ID ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2596:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2597:1: ( RULE_ID )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2598:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_2_15185); 
             after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__SuperTypeAssignment_2_1


    // $ANTLR start rule__Entity__FeaturesAssignment_4
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2609:1: rule__Entity__FeaturesAssignment_4 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2613:1: ( ( ruleFeature ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2614:1: ( ruleFeature )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2614:1: ( ruleFeature )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2615:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_45220);
            ruleFeature();
            _fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__FeaturesAssignment_4


    // $ANTLR start rule__Feature__TypeAssignment_0_0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2624:1: rule__Feature__TypeAssignment_0_0 : ( ruleTypeRef ) ;
    public final void rule__Feature__TypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2628:1: ( ( ruleTypeRef ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2629:1: ( ruleTypeRef )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2629:1: ( ruleTypeRef )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2630:1: ruleTypeRef
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Feature__TypeAssignment_0_05251);
            ruleTypeRef();
            _fsp--;

             after(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__TypeAssignment_0_0


    // $ANTLR start rule__Feature__NameAssignment_0_1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2639:1: rule__Feature__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2643:1: ( ( RULE_ID ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2644:1: ( RULE_ID )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2644:1: ( RULE_ID )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2645:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_0_15282); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__NameAssignment_0_1


    // $ANTLR start rule__ReadorWrite__ReadvalAssignment_0_1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2654:1: rule__ReadorWrite__ReadvalAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__ReadorWrite__ReadvalAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2658:1: ( ( RULE_STRING ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2659:1: ( RULE_STRING )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2659:1: ( RULE_STRING )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2660:1: RULE_STRING
            {
             before(grammarAccess.getReadorWriteAccess().getReadvalSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ReadorWrite__ReadvalAssignment_0_15313); 
             after(grammarAccess.getReadorWriteAccess().getReadvalSTRINGTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__ReadvalAssignment_0_1


    // $ANTLR start rule__ReadorWrite__WritevalAssignment_1_1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2669:1: rule__ReadorWrite__WritevalAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__ReadorWrite__WritevalAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2673:1: ( ( RULE_STRING ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2674:1: ( RULE_STRING )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2674:1: ( RULE_STRING )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2675:1: RULE_STRING
            {
             before(grammarAccess.getReadorWriteAccess().getWritevalSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ReadorWrite__WritevalAssignment_1_15344); 
             after(grammarAccess.getReadorWriteAccess().getWritevalSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__WritevalAssignment_1_1


    // $ANTLR start rule__TypeRef__ReferencedAssignment_0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2684:1: rule__TypeRef__ReferencedAssignment_0 : ( ruleType ) ;
    public final void rule__TypeRef__ReferencedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2688:1: ( ( ruleType ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2689:1: ( ruleType )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2689:1: ( ruleType )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2690:1: ruleType
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__TypeRef__ReferencedAssignment_05375);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRefAccess().getReferencedTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeRef__ReferencedAssignment_0


    // $ANTLR start rule__TypeRef__MultiAssignment_1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2699:1: rule__TypeRef__MultiAssignment_1 : ( ( '*' ) ) ;
    public final void rule__TypeRef__MultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2703:1: ( ( ( '*' ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2704:1: ( ( '*' ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2704:1: ( ( '*' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2705:1: ( '*' )
            {
             before(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2706:1: ( '*' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2707:1: '*'
            {
             before(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__TypeRef__MultiAssignment_15411); 
             after(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeRef__MultiAssignment_1


 

    public static final BitSet FOLLOW_ruleMapRedoop_in_entryRuleMapRedoop61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapRedoop68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapRedoop__Group__0_in_ruleMapRedoop94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_entryRuleContent121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContent128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__Alternatives_in_ruleContent154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListofEntities_in_entryRuleListofEntities181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListofEntities188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListofEntities__Group__0_in_ruleListofEntities214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMRBlock_in_entryRuleMRBlock241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMRBlock248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MRBlock__Group__0_in_ruleMRBlock274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapper_in_entryRuleMapper361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapper368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__Group__0_in_ruleMapper394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0_in_ruleArgument454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReducer_in_entryRuleReducer481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReducer488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__Group__0_in_ruleReducer514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Alternatives_in_ruleFeature694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadorWrite_in_entryRuleReadorWrite721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadorWrite728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Alternatives_in_ruleReadorWrite754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__EntitiesAssignment_0_in_rule__Content__Alternatives850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__MrBlocksAssignment_1_in_rule__Content__Alternatives868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TypeAssignment_0_in_rule__Type__Alternatives901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TypeAssignment_1_in_rule__Type__Alternatives919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TypeAssignment_2_in_rule__Type__Alternatives937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TypeAssignment_3_in_rule__Type__Alternatives955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TypeAssignment_4_in_rule__Type__Alternatives973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__NameAssignment_5_in_rule__Type__Alternatives991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_0__0_in_rule__Feature__Alternatives1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_1__0_in_rule__Feature__Alternatives1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_0__0_in_rule__ReadorWrite__Alternatives1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_1__0_in_rule__ReadorWrite__Alternatives1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapRedoop__Group__0__Impl_in_rule__MapRedoop__Group__01124 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__MapRedoop__Group__1_in_rule__MapRedoop__Group__01127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapRedoop__DeclarationAssignment_0_in_rule__MapRedoop__Group__0__Impl1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapRedoop__Group__1__Impl_in_rule__MapRedoop__Group__11184 = new BitSet(new long[]{0x0000000000013000L});
    public static final BitSet FOLLOW_rule__MapRedoop__Group__2_in_rule__MapRedoop__Group__11187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MapRedoop__Group__1__Impl1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapRedoop__Group__2__Impl_in_rule__MapRedoop__Group__21246 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MapRedoop__Group__3_in_rule__MapRedoop__Group__21249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapRedoop__ContentAssignment_2_in_rule__MapRedoop__Group__2__Impl1276 = new BitSet(new long[]{0x0000000000011002L});
    public static final BitSet FOLLOW_rule__MapRedoop__Group__3__Impl_in_rule__MapRedoop__Group__31307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MapRedoop__Group__3__Impl1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListofEntities__Group__0__Impl_in_rule__ListofEntities__Group__01374 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ListofEntities__Group__1_in_rule__ListofEntities__Group__01377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListofEntities__Group__1__Impl_in_rule__ListofEntities__Group__11435 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_rule__ListofEntities__Group__2_in_rule__ListofEntities__Group__11438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ListofEntities__Group__1__Impl1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListofEntities__Group__2__Impl_in_rule__ListofEntities__Group__21497 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ListofEntities__Group__3_in_rule__ListofEntities__Group__21500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListofEntities__EntitiesAssignment_2_in_rule__ListofEntities__Group__2__Impl1527 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__ListofEntities__Group__3__Impl_in_rule__ListofEntities__Group__31558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ListofEntities__Group__3__Impl1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MRBlock__Group__0__Impl_in_rule__MRBlock__Group__01625 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__MRBlock__Group__1_in_rule__MRBlock__Group__01628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MRBlock__MapperAssignment_0_in_rule__MRBlock__Group__0__Impl1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MRBlock__Group__1__Impl_in_rule__MRBlock__Group__11685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MRBlock__ReducerAssignment_1_in_rule__MRBlock__Group__1__Impl1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__01746 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__01749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Declaration__Group__0__Impl1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__11808 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__11811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__21868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_2__0_in_rule__Declaration__Group__2__Impl1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_2__0__Impl_in_rule__Declaration__Group_2__01932 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Declaration__Group_2__1_in_rule__Declaration__Group_2__01935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Declaration__Group_2__0__Impl1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_2__1__Impl_in_rule__Declaration__Group_2__11994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__SuperNameAssignment_2_1_in_rule__Declaration__Group_2__1__Impl2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__Group__0__Impl_in_rule__Mapper__Group__02055 = new BitSet(new long[]{0x000000001F000020L});
    public static final BitSet FOLLOW_rule__Mapper__Group__1_in_rule__Mapper__Group__02058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Mapper__Group__0__Impl2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__Group__1__Impl_in_rule__Mapper__Group__12117 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Mapper__Group__2_in_rule__Mapper__Group__12120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__InkeyAssignment_1_in_rule__Mapper__Group__1__Impl2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__Group__2__Impl_in_rule__Mapper__Group__22177 = new BitSet(new long[]{0x000000001F000020L});
    public static final BitSet FOLLOW_rule__Mapper__Group__3_in_rule__Mapper__Group__22180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Mapper__Group__2__Impl2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__Group__3__Impl_in_rule__Mapper__Group__32239 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Mapper__Group__4_in_rule__Mapper__Group__32242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__InvalueAssignment_3_in_rule__Mapper__Group__3__Impl2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__Group__4__Impl_in_rule__Mapper__Group__42299 = new BitSet(new long[]{0x000000001F000020L});
    public static final BitSet FOLLOW_rule__Mapper__Group__5_in_rule__Mapper__Group__42302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Mapper__Group__4__Impl2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__Group__5__Impl_in_rule__Mapper__Group__52361 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Mapper__Group__6_in_rule__Mapper__Group__52364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__OutkeyAssignment_5_in_rule__Mapper__Group__5__Impl2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__Group__6__Impl_in_rule__Mapper__Group__62421 = new BitSet(new long[]{0x000000001F000020L});
    public static final BitSet FOLLOW_rule__Mapper__Group__7_in_rule__Mapper__Group__62424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Mapper__Group__6__Impl2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__Group__7__Impl_in_rule__Mapper__Group__72483 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Mapper__Group__8_in_rule__Mapper__Group__72486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__OutvalueAssignment_7_in_rule__Mapper__Group__7__Impl2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__Group__8__Impl_in_rule__Mapper__Group__82543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mapper__Group__9_in_rule__Mapper__Group__82546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Mapper__Group__8__Impl2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__Group__9__Impl_in_rule__Mapper__Group__92605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BLOCK_in_rule__Mapper__Group__9__Impl2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__02681 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__02684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__TypeAssignment_0_in_rule__Argument__Group__0__Impl2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__12741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__ArgnameAssignment_1_in_rule__Argument__Group__1__Impl2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__Group__0__Impl_in_rule__Reducer__Group__02802 = new BitSet(new long[]{0x000000001F000020L});
    public static final BitSet FOLLOW_rule__Reducer__Group__1_in_rule__Reducer__Group__02805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Reducer__Group__0__Impl2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__Group__1__Impl_in_rule__Reducer__Group__12864 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Reducer__Group__2_in_rule__Reducer__Group__12867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__OutkeyAssignment_1_in_rule__Reducer__Group__1__Impl2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__Group__2__Impl_in_rule__Reducer__Group__22924 = new BitSet(new long[]{0x000000001F000020L});
    public static final BitSet FOLLOW_rule__Reducer__Group__3_in_rule__Reducer__Group__22927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Reducer__Group__2__Impl2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__Group__3__Impl_in_rule__Reducer__Group__32986 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Reducer__Group__4_in_rule__Reducer__Group__32989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__OutvalueAssignment_3_in_rule__Reducer__Group__3__Impl3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__Group__4__Impl_in_rule__Reducer__Group__43046 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reducer__Group__5_in_rule__Reducer__Group__43049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Reducer__Group__4__Impl3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__Group__5__Impl_in_rule__Reducer__Group__53108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BLOCK_in_rule__Reducer__Group__5__Impl3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03176 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Entity__Group__0__Impl3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13238 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23298 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33359 = new BitSet(new long[]{0x000000001FC00020L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Entity__Group__3__Impl3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43421 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__43424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_4_in_rule__Entity__Group__4__Impl3453 = new BitSet(new long[]{0x000000001FC00022L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_4_in_rule__Entity__Group__4__Impl3465 = new BitSet(new long[]{0x000000001FC00022L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__53498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Entity__Group__5__Impl3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__03569 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__03572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Entity__Group_2__0__Impl3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__13631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_0__0__Impl_in_rule__Feature__Group_0__03692 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Feature__Group_0__1_in_rule__Feature__Group_0__03695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TypeAssignment_0_0_in_rule__Feature__Group_0__0__Impl3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_0__1__Impl_in_rule__Feature__Group_0__13752 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Feature__Group_0__2_in_rule__Feature__Group_0__13755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_0_1_in_rule__Feature__Group_0__1__Impl3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_0__2__Impl_in_rule__Feature__Group_0__23812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Feature__Group_0__2__Impl3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_1__0__Impl_in_rule__Feature__Group_1__03877 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Feature__Group_1__1_in_rule__Feature__Group_1__03880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadorWrite_in_rule__Feature__Group_1__0__Impl3907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_1__1__Impl_in_rule__Feature__Group_1__13936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Feature__Group_1__1__Impl3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_0__0__Impl_in_rule__ReadorWrite__Group_0__03999 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_0__1_in_rule__ReadorWrite__Group_0__04002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ReadorWrite__Group_0__0__Impl4030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_0__1__Impl_in_rule__ReadorWrite__Group_0__14061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__ReadvalAssignment_0_1_in_rule__ReadorWrite__Group_0__1__Impl4088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_1__0__Impl_in_rule__ReadorWrite__Group_1__04122 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_1__1_in_rule__ReadorWrite__Group_1__04125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ReadorWrite__Group_1__0__Impl4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_1__1__Impl_in_rule__ReadorWrite__Group_1__14184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__WritevalAssignment_1_1_in_rule__ReadorWrite__Group_1__1__Impl4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__04245 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__04248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl4275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__14305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__MultiAssignment_1_in_rule__TypeRef__Group__1__Impl4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__MapRedoop__DeclarationAssignment_04372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_rule__MapRedoop__ContentAssignment_24403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListofEntities_in_rule__Content__EntitiesAssignment_04434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMRBlock_in_rule__Content__MrBlocksAssignment_14465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__ListofEntities__EntitiesAssignment_24496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapper_in_rule__MRBlock__MapperAssignment_04527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReducer_in_rule__MRBlock__ReducerAssignment_14558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Declaration__NameAssignment_14589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Declaration__SuperNameAssignment_2_14620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Mapper__InkeyAssignment_14651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Mapper__InvalueAssignment_34682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Mapper__OutkeyAssignment_54713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Mapper__OutvalueAssignment_74744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Argument__TypeAssignment_04775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__ArgnameAssignment_14806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Reducer__OutkeyAssignment_14837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Reducer__OutvalueAssignment_34868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Type__TypeAssignment_04904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Type__TypeAssignment_14948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Type__TypeAssignment_24992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Type__TypeAssignment_35036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Type__TypeAssignment_45080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Type__NameAssignment_55119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_15150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_2_15185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_45220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Feature__TypeAssignment_0_05251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_0_15282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ReadorWrite__ReadvalAssignment_0_15313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ReadorWrite__WritevalAssignment_1_15344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TypeRef__ReferencedAssignment_05375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TypeRef__MultiAssignment_15411 = new BitSet(new long[]{0x0000000000000002L});

}