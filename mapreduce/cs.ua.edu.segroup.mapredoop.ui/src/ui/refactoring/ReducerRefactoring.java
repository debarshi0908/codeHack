package ui.refactoring;

import hdp.parser.MRKeyValueDetails; 

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationExpression;
import org.eclipse.jdt.core.dom.WhileStatement;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jdt.internal.corext.ValidateEditException;
import org.eclipse.jdt.internal.corext.util.JavaModelUtil;


@SuppressWarnings({ "restriction", "unchecked" })
public class ReducerRefactoring extends AbstractRefactoring {
	
	private MRKeyValueDetails details=new MRKeyValueDetails("","","","");
 	public ReducerRefactoring(ICompilationUnit unit, String code1, String code2)
			throws ValidateEditException, JavaModelException,
			IllegalArgumentException, CoreException {
		super(unit,code1+code2);
	//	this.details = parser.getMapperDetails();
		//this.newBlock = parser.getBlock();

	}

	@Override
	public TypeDeclaration getClassDeclaration() {
        TypeDeclaration declaration = createMapperClass("ReducerImpl", "MapReduceBase", new String[]{"Reducer",
        		details.getIn_keytype(),details.getIn_valuetype(), details.getOut_keytype(), details.getOut_valuetype()});
        MethodDeclaration methodDeclaration = getMapMethod();
        declaration.bodyDeclarations().add(methodDeclaration);
    	Block block = ast.newBlock();  
    	methodDeclaration.setBody(block);
         addWhileLoop(block);
      return declaration;
	}
	private void addWhileLoop(Block block) {
		WhileStatement whileStatement = ast.newWhileStatement();
		MethodInvocation invocation = ast.newMethodInvocation();
		invocation.setExpression(ast.newName("_values"));
		invocation.setName(ast.newSimpleName("hasNext"));	
		whileStatement.setExpression(invocation);
		whileStatement.setBody(newBlock);
		block.statements().add(whileStatement);
	}

	
	private MethodDeclaration getMapMethod() {
        
		MethodDeclaration methodDeclaration =  getMethodSignature("reduce", details.getIn_keytype(), details.getIn_valuetype(),
				details.getOut_keytype(), details.getOut_valuetype());
        return methodDeclaration;
	}

	@Override
	public void moreSpecificRefactoring() throws ValidateEditException, JavaModelException, IllegalArgumentException, CoreException {

		ASTParser parser = ASTParser.newParser(AST.JLS3);
		parser.setSource(unit);
		astRoot = (CompilationUnit) parser.createAST(null);
		rewrite = ASTRewrite.create(astRoot.getAST());
		ReduceVisitor reduceVisitor = new ReduceVisitor();
        astRoot.accept(reduceVisitor);
        
        ListRewrite listRewritebeforeWhile = rewrite.getListRewrite(reduceVisitor.getMethodBlock(), Block.STATEMENTS_PROPERTY);
        Statement replacement1 = (Statement) rewrite.createStringPlaceholder("int sum=0;", ASTNode.EXPRESSION_STATEMENT);
        listRewritebeforeWhile.insertFirst(replacement1, null);
    
        Statement replacement = (Statement) rewrite.createStringPlaceholder(getStatements("_inkey", "new IntWritable(sum)"), ASTNode.EXPRESSION_STATEMENT);
       // ListRewrite listRewriteafterWhile = rewrite.getListRewrite(reduceVisitor.getStatement(), Block.STATEMENTS_PROPERTY);
        //listRewriteafterWhile.replace(reduceVisitor.getStatement(), replacement, null);
        listRewritebeforeWhile.replace(reduceVisitor.getStatement(),replacement,null);
        //listRewriteafterWhile.insertFirst(replacement,null);
    	//
       
    	 ListRewrite listrewrite=  rewrite.getListRewrite(reduceVisitor.getBlock(), Block.STATEMENTS_PROPERTY);
     	 Statement replacement2 = (Statement) rewrite.createStringPlaceholder("int value=_values.next().get();", ASTNode.EXPRESSION_STATEMENT);
     	 listrewrite.insertFirst(replacement2, null);
     	 	JavaModelUtil.applyEdit(unit, rewrite.rewriteAST(), true, null);
	
    
	}
	private String getStatements(String key, String value) {
		return "output.collect("+key+", "+value+");";
	}
	
	public MethodDeclaration getMethodSignature(String methodName,String inkeytype, String invaluetype, String outkeytype, String outvaluetype ) {
		MethodDeclaration methodDeclaration = ast.newMethodDeclaration();
		methodDeclaration.setConstructor(false);
		methodDeclaration.modifiers().add(ast.newModifier(ModifierKeyword.PUBLIC_KEYWORD));
		methodDeclaration.setName(ast.newSimpleName(methodName));
		methodDeclaration.thrownExceptions().add(ast.newName("IOException"));
		methodDeclaration.setReturnType2(ast.newPrimitiveType(PrimitiveType.VOID));
		SingleVariableDeclaration variableDeclaration = getSimpleArgument(inkeytype,"_inkey");
		SingleVariableDeclaration variableDeclaration3 = getParameterizedArgument("Iterator",invaluetype,"_values");
		SingleVariableDeclaration variableDeclaration1 = getParameterizedArgument("OutputCollector",outkeytype,outvaluetype,"output");
		SingleVariableDeclaration variableDeclaration2 = getSimpleArgument("Reporter","reporter");

		methodDeclaration.parameters().add(variableDeclaration);
		methodDeclaration.parameters().add(variableDeclaration3);
		methodDeclaration.parameters().add(variableDeclaration1);
		methodDeclaration.parameters().add(variableDeclaration2);
		return methodDeclaration;
	}


}
