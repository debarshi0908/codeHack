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
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationExpression;
import org.eclipse.jdt.core.dom.WhileStatement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jdt.internal.corext.ValidateEditException;
import org.eclipse.jdt.internal.corext.util.JavaModelUtil;


@SuppressWarnings({ "restriction", "unchecked" })
public class MapperRefactoring extends AbstractRefactoring {
	
	private MRKeyValueDetails details=new MRKeyValueDetails();
 	public MapperRefactoring(ICompilationUnit unit, String code)
			throws ValidateEditException, JavaModelException,
			IllegalArgumentException, CoreException {
		super(unit,code);
	//	this.details = parser.getMapperDetails();
		//this.newBlock = parser.getBlock();

	}

	@Override
	public TypeDeclaration getClassDeclaration() {
        TypeDeclaration declaration = createMapperClass("MapperImpl", "MapReduceBase", new String[]{"Mapper",
        		details.getIn_keytype(),details.getIn_valuetype(), details.getOut_keytype(), details.getOut_valuetype()});
        FieldDeclaration fieldDeclaration1 = getFieldDeclarationwithNew(details.getOut_keytype(), "_outkey");
        FieldDeclaration fieldDeclaration2 = getFieldDeclarationwithNew(details.getOut_valuetype(), "_outvalue", true);
        MethodDeclaration methodDeclaration = getMapMethod();
        declaration.bodyDeclarations().add(fieldDeclaration1);
        declaration.bodyDeclarations().add(fieldDeclaration2);
        declaration.bodyDeclarations().add(methodDeclaration);
    	Block block = ast.newBlock();  
    	methodDeclaration.setBody(block);
        addTokenizerStmts(block);
        addWhileLoop(block);
      return declaration;
	}
	private void addWhileLoop(Block block) {
		WhileStatement whileStatement = ast.newWhileStatement();
		MethodInvocation invocation = ast.newMethodInvocation();
		invocation.setExpression(ast.newName("_itr"));
		invocation.setName(ast.newSimpleName("hasMoreTokens"));	
		whileStatement.setExpression(invocation);
		whileStatement.setBody(newBlock);
		block.statements().add(whileStatement);
	}

	private void addTokenizerStmts(Block block) {
		
		VariableDeclarationExpression variableDeclarationExpression = getSimpleVariableDeclaration("String", "line");
		MethodInvocation invocation = ast.newMethodInvocation();
		invocation.setExpression(ast.newName("_invalue"));
		invocation.setName(ast.newSimpleName("toString"));
		Assignment assignment = ast.newAssignment();
		assignment.setLeftHandSide(variableDeclarationExpression);
		assignment.setOperator(Assignment.Operator.ASSIGN);
		assignment.setRightHandSide(invocation);
		ExpressionStatement statement =  ast.newExpressionStatement(assignment);
		block.statements().add(statement);
		VariableDeclarationExpression tk_variableDeclarationExpression = getSimpleVariableDeclaration("StringTokenizer", "_itr");
		ClassInstanceCreation initializer = ast.newClassInstanceCreation();
		initializer.setType(ast.newSimpleType(ast.newName("StringTokenizer")));
		initializer.arguments().add(ast.newSimpleName("line"));
		Assignment tk_assignment = ast.newAssignment();
		tk_assignment.setLeftHandSide(tk_variableDeclarationExpression);
		tk_assignment.setOperator(Assignment.Operator.ASSIGN);
		tk_assignment.setRightHandSide(initializer);
		ExpressionStatement tk_statement =  ast.newExpressionStatement(tk_assignment);
		block.statements().add(tk_statement);
		
	}

	private MethodDeclaration getMapMethod() {
        
		MethodDeclaration methodDeclaration =  getMethodSignature("map", details.getIn_keytype(), details.getIn_valuetype(),
				details.getOut_keytype(), details.getOut_valuetype());
        return methodDeclaration;
	}

	@Override
	public void moreSpecificRefactoring() throws ValidateEditException, JavaModelException, IllegalArgumentException, CoreException {

		ASTParser parser = ASTParser.newParser(AST.JLS3);
		parser.setSource(unit);
		astRoot = (CompilationUnit) parser.createAST(null);
		rewrite = ASTRewrite.create(astRoot.getAST());
		MapVisitor mapVisitor = new MapVisitor();
        astRoot.accept(mapVisitor);
        if(mapVisitor.getStatement()!=null){
     	   Statement replacement = (Statement) rewrite.createStringPlaceholder(getStatements("_outkey", "_outvalue"), ASTNode.BLOCK);
     	  ListRewrite listrewrite=  rewrite.getListRewrite(mapVisitor.getBlock(), Block.STATEMENTS_PROPERTY);
     	 Statement replacement2 = (Statement) rewrite.createStringPlaceholder("String token=_itr.nextToken();", ASTNode.EXPRESSION_STATEMENT);
     	 listrewrite.insertFirst(replacement2, null);
     	 listrewrite.replace(mapVisitor.getStatement(), replacement, null);
			JavaModelUtil.applyEdit(unit, rewrite.rewriteAST(), true, null);
	
        }
	}
	private String getStatements(String key, String value) {
		return ""+key+".set(token);\noutput.collect("+key+", "+value+");";
	}

	


}
