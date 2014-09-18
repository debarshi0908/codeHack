/*
* generated by Xtext
*/
grammar InternalMapRedoop;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package cs.ua.edu.se.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleMapRedoop
entryRuleMapRedoop returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getMapRedoopRule(), currentNode); }
	 iv_ruleMapRedoop=ruleMapRedoop 
	 { $current=$iv_ruleMapRedoop.current; } 
	 EOF 
;

// Rule MapRedoop
ruleMapRedoop returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getMapRedoopAccess().getDeclarationDeclarationParserRuleCall_0_0(), currentNode); 
	    }
		lv_declaration_0_0=ruleDeclaration		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getMapRedoopRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"declaration",
	        		lv_declaration_0_0, 
	        		"Declaration", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)	'{' 
    {
        createLeafNode(grammarAccess.getMapRedoopAccess().getLeftCurlyBracketKeyword_1(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getMapRedoopAccess().getContentContentParserRuleCall_2_0(), currentNode); 
	    }
		lv_content_2_0=ruleContent		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getMapRedoopRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"content",
	        		lv_content_2_0, 
	        		"Content", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*	'}' 
    {
        createLeafNode(grammarAccess.getMapRedoopAccess().getRightCurlyBracketKeyword_3(), null); 
    }
)
;





// Entry rule entryRuleContent
entryRuleContent returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getContentRule(), currentNode); }
	 iv_ruleContent=ruleContent 
	 { $current=$iv_ruleContent.current; } 
	 EOF 
;

// Rule Content
ruleContent returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getContentAccess().getEntitiesListofEntitiesParserRuleCall_0_0(), currentNode); 
	    }
		lv_entities_0_0=ruleListofEntities		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getContentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"entities",
	        		lv_entities_0_0, 
	        		"ListofEntities", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)
    |(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getContentAccess().getMrBlocksMRBlockParserRuleCall_1_0(), currentNode); 
	    }
		lv_mrBlocks_1_0=ruleMRBlock		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getContentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"mrBlocks",
	        		lv_mrBlocks_1_0, 
	        		"MRBlock", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))
;





// Entry rule entryRuleListofEntities
entryRuleListofEntities returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getListofEntitiesRule(), currentNode); }
	 iv_ruleListofEntities=ruleListofEntities 
	 { $current=$iv_ruleListofEntities.current; } 
	 EOF 
;

// Rule ListofEntities
ruleListofEntities returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
    { 
        temp=factory.create(grammarAccess.getListofEntitiesAccess().getListofEntitiesAction_0().getType().getClassifier());
        $current = temp; 
        temp = null;
        CompositeNode newNode = createCompositeNode(grammarAccess.getListofEntitiesAccess().getListofEntitiesAction_0(), currentNode.getParent());
    newNode.getChildren().add(currentNode);
    moveLookaheadInfo(currentNode, newNode);
    currentNode = newNode; 
        associateNodeWithAstElement(currentNode, $current); 
    }
)	'{' 
    {
        createLeafNode(grammarAccess.getListofEntitiesAccess().getLeftCurlyBracketKeyword_1(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getListofEntitiesAccess().getEntitiesEntityParserRuleCall_2_0(), currentNode); 
	    }
		lv_entities_2_0=ruleEntity		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getListofEntitiesRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"entities",
	        		lv_entities_2_0, 
	        		"Entity", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*	'}' 
    {
        createLeafNode(grammarAccess.getListofEntitiesAccess().getRightCurlyBracketKeyword_3(), null); 
    }
)
;





// Entry rule entryRuleMRBlock
entryRuleMRBlock returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getMRBlockRule(), currentNode); }
	 iv_ruleMRBlock=ruleMRBlock 
	 { $current=$iv_ruleMRBlock.current; } 
	 EOF 
;

// Rule MRBlock
ruleMRBlock returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getMRBlockAccess().getMapperMapperParserRuleCall_0_0(), currentNode); 
	    }
		lv_mapper_0_0=ruleMapper		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getMRBlockRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"mapper",
	        		lv_mapper_0_0, 
	        		"Mapper", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getMRBlockAccess().getReducerReducerParserRuleCall_1_0(), currentNode); 
	    }
		lv_reducer_1_0=ruleReducer		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getMRBlockRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"reducer",
	        		lv_reducer_1_0, 
	        		"Reducer", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))
;





// Entry rule entryRuleDeclaration
entryRuleDeclaration returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getDeclarationRule(), currentNode); }
	 iv_ruleDeclaration=ruleDeclaration 
	 { $current=$iv_ruleDeclaration.current; } 
	 EOF 
;

// Rule Declaration
ruleDeclaration returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'program' 
    {
        createLeafNode(grammarAccess.getDeclarationAccess().getProgramKeyword_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getDeclarationRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)(	'extend' 
    {
        createLeafNode(grammarAccess.getDeclarationAccess().getExtendKeyword_2_0(), null); 
    }
(
(
		lv_superName_3_0=RULE_ID
		{
			createLeafNode(grammarAccess.getDeclarationAccess().getSuperNameIDTerminalRuleCall_2_1_0(), "superName"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getDeclarationRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"superName",
	        		lv_superName_3_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))?)
;





// Entry rule entryRuleMapper
entryRuleMapper returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getMapperRule(), currentNode); }
	 iv_ruleMapper=ruleMapper 
	 { $current=$iv_ruleMapper.current; } 
	 EOF 
;

// Rule Mapper
ruleMapper returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'map(' 
    {
        createLeafNode(grammarAccess.getMapperAccess().getMapKeyword_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getMapperAccess().getInkeyArgumentParserRuleCall_1_0(), currentNode); 
	    }
		lv_inkey_1_0=ruleArgument		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getMapperRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"inkey",
	        		lv_inkey_1_0, 
	        		"Argument", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)	',' 
    {
        createLeafNode(grammarAccess.getMapperAccess().getCommaKeyword_2(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getMapperAccess().getInvalueArgumentParserRuleCall_3_0(), currentNode); 
	    }
		lv_invalue_3_0=ruleArgument		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getMapperRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"invalue",
	        		lv_invalue_3_0, 
	        		"Argument", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)	',' 
    {
        createLeafNode(grammarAccess.getMapperAccess().getCommaKeyword_4(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getMapperAccess().getOutkeyArgumentParserRuleCall_5_0(), currentNode); 
	    }
		lv_outkey_5_0=ruleArgument		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getMapperRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"outkey",
	        		lv_outkey_5_0, 
	        		"Argument", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)	',' 
    {
        createLeafNode(grammarAccess.getMapperAccess().getCommaKeyword_6(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getMapperAccess().getOutvalueArgumentParserRuleCall_7_0(), currentNode); 
	    }
		lv_outvalue_7_0=ruleArgument		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getMapperRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"outvalue",
	        		lv_outvalue_7_0, 
	        		"Argument", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)	')' 
    {
        createLeafNode(grammarAccess.getMapperAccess().getRightParenthesisKeyword_8(), null); 
    }
RULE_BLOCK
    { 
    createLeafNode(grammarAccess.getMapperAccess().getBlockTerminalRuleCall_9(), null); 
    }
)
;





// Entry rule entryRuleArgument
entryRuleArgument returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getArgumentRule(), currentNode); }
	 iv_ruleArgument=ruleArgument 
	 { $current=$iv_ruleArgument.current; } 
	 EOF 
;

// Rule Argument
ruleArgument returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getTypeTypeParserRuleCall_0_0(), currentNode); 
	    }
		lv_type_0_0=ruleType		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"type",
	        		lv_type_0_0, 
	        		"Type", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)(
(
		lv_argname_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getArgumentAccess().getArgnameIDTerminalRuleCall_1_0(), "argname"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"argname",
	        		lv_argname_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))
;





// Entry rule entryRuleReducer
entryRuleReducer returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getReducerRule(), currentNode); }
	 iv_ruleReducer=ruleReducer 
	 { $current=$iv_ruleReducer.current; } 
	 EOF 
;

// Rule Reducer
ruleReducer returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'reduce(' 
    {
        createLeafNode(grammarAccess.getReducerAccess().getReduceKeyword_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getReducerAccess().getOutkeyArgumentParserRuleCall_1_0(), currentNode); 
	    }
		lv_outkey_1_0=ruleArgument		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getReducerRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"outkey",
	        		lv_outkey_1_0, 
	        		"Argument", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)	',' 
    {
        createLeafNode(grammarAccess.getReducerAccess().getCommaKeyword_2(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getReducerAccess().getOutvalueArgumentParserRuleCall_3_0(), currentNode); 
	    }
		lv_outvalue_3_0=ruleArgument		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getReducerRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"outvalue",
	        		lv_outvalue_3_0, 
	        		"Argument", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)	')' 
    {
        createLeafNode(grammarAccess.getReducerAccess().getRightParenthesisKeyword_4(), null); 
    }
RULE_BLOCK
    { 
    createLeafNode(grammarAccess.getReducerAccess().getBlockTerminalRuleCall_5(), null); 
    }
)
;





// Entry rule entryRuleType
entryRuleType returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); }
	 iv_ruleType=ruleType 
	 { $current=$iv_ruleType.current; } 
	 EOF 
;

// Rule Type
ruleType returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		lv_type_0_0=	'int' 
    {
        createLeafNode(grammarAccess.getTypeAccess().getTypeIntKeyword_0_0(), "type"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "type", lv_type_0_0, "int", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
    |(
(
		lv_type_1_0=	'float' 
    {
        createLeafNode(grammarAccess.getTypeAccess().getTypeFloatKeyword_1_0(), "type"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "type", lv_type_1_0, "float", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
    |(
(
		lv_type_2_0=	'double' 
    {
        createLeafNode(grammarAccess.getTypeAccess().getTypeDoubleKeyword_2_0(), "type"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "type", lv_type_2_0, "double", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
    |(
(
		lv_type_3_0=	'text' 
    {
        createLeafNode(grammarAccess.getTypeAccess().getTypeTextKeyword_3_0(), "type"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "type", lv_type_3_0, "text", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
    |(
(
		lv_type_4_0=	'long' 
    {
        createLeafNode(grammarAccess.getTypeAccess().getTypeLongKeyword_4_0(), "type"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "type", lv_type_4_0, "long", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
    |(
(
		lv_name_5_0=RULE_ID
		{
			createLeafNode(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_5_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_5_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))
;





// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); }
	 iv_ruleEntity=ruleEntity 
	 { $current=$iv_ruleEntity.current; } 
	 EOF 
;

// Rule Entity
ruleEntity returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'metaelement' 
    {
        createLeafNode(grammarAccess.getEntityAccess().getMetaelementKeyword_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)(	'extend' 
    {
        createLeafNode(grammarAccess.getEntityAccess().getExtendKeyword_2_0(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0(), "superType"); 
	}

)
))?	'{' 
    {
        createLeafNode(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0(), currentNode); 
	    }
		lv_features_5_0=ruleFeature		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"features",
	        		lv_features_5_0, 
	        		"Feature", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)+	'}' 
    {
        createLeafNode(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5(), null); 
    }
)
;





// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getFeatureRule(), currentNode); }
	 iv_ruleFeature=ruleFeature 
	 { $current=$iv_ruleFeature.current; } 
	 EOF 
;

// Rule Feature
ruleFeature returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_0_0_0(), currentNode); 
	    }
		lv_type_0_0=ruleTypeRef		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getFeatureRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"type",
	        		lv_type_0_0, 
	        		"TypeRef", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getFeatureRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)	';' 
    {
        createLeafNode(grammarAccess.getFeatureAccess().getSemicolonKeyword_0_2(), null); 
    }
)
    |(
    { 
        currentNode=createCompositeNode(grammarAccess.getFeatureAccess().getReadorWriteParserRuleCall_1_0(), currentNode); 
    }
    this_ReadorWrite_3=ruleReadorWrite
    { 
        $current = $this_ReadorWrite_3.current; 
        currentNode = currentNode.getParent();
    }
	';' 
    {
        createLeafNode(grammarAccess.getFeatureAccess().getSemicolonKeyword_1_1(), null); 
    }
))
;





// Entry rule entryRuleReadorWrite
entryRuleReadorWrite returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getReadorWriteRule(), currentNode); }
	 iv_ruleReadorWrite=ruleReadorWrite 
	 { $current=$iv_ruleReadorWrite.current; } 
	 EOF 
;

// Rule ReadorWrite
ruleReadorWrite returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((	'read' 
    {
        createLeafNode(grammarAccess.getReadorWriteAccess().getReadKeyword_0_0(), null); 
    }
(
(
		lv_readval_1_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getReadorWriteAccess().getReadvalSTRINGTerminalRuleCall_0_1_0(), "readval"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getReadorWriteRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"readval",
	        		lv_readval_1_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))
    |(	'write' 
    {
        createLeafNode(grammarAccess.getReadorWriteAccess().getWriteKeyword_1_0(), null); 
    }
(
(
		lv_writeval_3_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getReadorWriteAccess().getWritevalSTRINGTerminalRuleCall_1_1_0(), "writeval"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getReadorWriteRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"writeval",
	        		lv_writeval_3_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)))
;





// Entry rule entryRuleTypeRef
entryRuleTypeRef returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getTypeRefRule(), currentNode); }
	 iv_ruleTypeRef=ruleTypeRef 
	 { $current=$iv_ruleTypeRef.current; } 
	 EOF 
;

// Rule TypeRef
ruleTypeRef returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getTypeRefAccess().getReferencedTypeParserRuleCall_0_0(), currentNode); 
	    }
		lv_referenced_0_0=ruleType		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getTypeRefRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"referenced",
	        		lv_referenced_0_0, 
	        		"Type", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)(
(
		lv_multi_1_0=	'*' 
    {
        createLeafNode(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0(), "multi"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getTypeRefRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "multi", true, "*", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)?)
;





RULE_BLOCK : '[' ( options {greedy=false;} : . )*']';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

