package ui.refactoring;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationExpression;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.internal.corext.ValidateEditException;
import org.eclipse.jdt.internal.corext.util.JavaModelUtil;
@SuppressWarnings({ "restriction", "unchecked" })
public abstract class AbstractRefactoring {

	protected CompilationUnit astRoot =null;
	protected AST ast =null; 
	protected  ICompilationUnit unit =null;
	protected Block newBlock =null;
	protected ASTRewrite rewrite =null;
    private String code=null;
	public AbstractRefactoring(ICompilationUnit unit, String code) throws ValidateEditException, JavaModelException, IllegalArgumentException, CoreException {
		ASTParser parser = ASTParser.newParser(AST.JLS3);
		parser.setSource(unit);
		astRoot = (CompilationUnit) parser.createAST(null);
		//parser.setResolveBindings(true);
		ast = astRoot.getAST();
		this.unit = unit;   
		this.code= code;

	}
	

	public void refactor() throws CoreException,
	ValidateEditException, JavaModelException {
		// creation of ASTRewrite
		
		rewrite = ASTRewrite.create(astRoot.getAST());


		 newBlock = (Block) rewrite.createStringPlaceholder(code, ASTNode.BLOCK);
		
		// description of the change
		TypeDeclaration oldClass =  (TypeDeclaration)astRoot.types().get(0);
		//    SimpleName newName = astRoot.getAST().newSimpleName("Y");
		TypeDeclaration declaration = getClassDeclaration();
		rewrite.replace(oldClass, declaration, null);
		JavaModelUtil.applyEdit(unit, rewrite.rewriteAST(), true, null);


	      moreSpecificRefactoring();
		
	}

	public abstract void moreSpecificRefactoring()throws ValidateEditException, JavaModelException, IllegalArgumentException, CoreException;


	


	public abstract TypeDeclaration getClassDeclaration();

	//   OutputCollector<Text, IntWritable> output,
	protected SingleVariableDeclaration getParameterizedArgument(String... names) {
		SingleVariableDeclaration variableDeclaration1 = ast.newSingleVariableDeclaration();

		ParameterizedType intrface = ast.newParameterizedType(ast.newSimpleType(ast.newName(names[0])));
		for(int i=1;i< names.length-1;i++){
			SimpleType type = ast.newSimpleType(ast.newName(names[i]));
			intrface.typeArguments().add(type);
		}
		variableDeclaration1.setType(intrface);
		variableDeclaration1.setName(ast.newSimpleName(names[names.length-1]));
		return variableDeclaration1;
	}
	private ParameterizedType getParameterizedType(String... names) {

		ParameterizedType intrface = ast.newParameterizedType(ast.newSimpleType(ast.newName(names[0])));
		for(int i=1;i< names.length;i++){
			SimpleType type = ast.newSimpleType(ast.newName(names[i]));
			intrface.typeArguments().add(type);
		}
		return intrface;
	}
	protected SingleVariableDeclaration getSimpleArgument(String type, String name) {
		SingleVariableDeclaration variableDeclaration = ast.newSingleVariableDeclaration();
		variableDeclaration.setType(ast.newSimpleType(ast.newSimpleName(type)));
		variableDeclaration.setName(ast.newSimpleName(name));
		return variableDeclaration;
	}
	protected VariableDeclarationExpression getSimpleVariableDeclaration(String type, String name) {
		VariableDeclarationFragment fragment = ast.newVariableDeclarationFragment();
		fragment.setName(ast.newSimpleName(name));
		VariableDeclarationExpression declaration = ast.newVariableDeclarationExpression(fragment);
		declaration.setType(ast.newSimpleType(ast.newName(type)));
		return declaration;
	}

	protected FieldDeclaration getFieldDeclarationwithNew(String type, String name) {
		VariableDeclarationFragment fragment = ast.newVariableDeclarationFragment();
		fragment.setName(ast.newSimpleName(name));
		ClassInstanceCreation initializer = ast.newClassInstanceCreation();
		initializer.setType(ast.newSimpleType(ast.newName(type)));
		fragment.setInitializer(initializer);

		FieldDeclaration declaration = ast.newFieldDeclaration(fragment);
		declaration.setType(ast.newSimpleType(ast.newName(type)));
		return declaration;
	}
	protected FieldDeclaration getFieldDeclarationwithNew(String type, String name,boolean flag) {
		VariableDeclarationFragment fragment = ast.newVariableDeclarationFragment();
		fragment.setName(ast.newSimpleName(name));
		ClassInstanceCreation initializer = ast.newClassInstanceCreation();
		initializer.setType(ast.newSimpleType(ast.newName(type)));
		initializer.arguments().add(ast.newNumberLiteral("1"));
		fragment.setInitializer(initializer);

		FieldDeclaration declaration = ast.newFieldDeclaration(fragment);
		declaration.setType(ast.newSimpleType(ast.newName(type)));
		return declaration;
	}

	protected TypeDeclaration createMapperClass(String className, String superClassName, String[] interfaces) {
		TypeDeclaration declaration = ast.newTypeDeclaration();
		declaration.setName(ast.newSimpleName(className));
		SimpleType superclassType = ast.newSimpleType(ast.newName(superClassName));
		declaration.setSuperclassType(superclassType);
		ParameterizedType intrface = getParameterizedType(interfaces);
		declaration.superInterfaceTypes().add(intrface);
		return declaration;
	}

	protected MethodDeclaration getMethodSignature(String methodName,String inkeytype, String invaluetype, String outkeytype, String outvaluetype ) {
		MethodDeclaration methodDeclaration = ast.newMethodDeclaration();
		methodDeclaration.setConstructor(false);
		methodDeclaration.modifiers().add(ast.newModifier(ModifierKeyword.PUBLIC_KEYWORD));
		methodDeclaration.setName(ast.newSimpleName(methodName));
		methodDeclaration.thrownExceptions().add(ast.newName("IOException"));
		methodDeclaration.setReturnType2(ast.newPrimitiveType(PrimitiveType.VOID));
		SingleVariableDeclaration variableDeclaration = getSimpleArgument(inkeytype,"_inkey");
		SingleVariableDeclaration variableDeclaration3 = getSimpleArgument(invaluetype,"_invalue");
		SingleVariableDeclaration variableDeclaration1 = getParameterizedArgument("OutputCollector",outkeytype,outvaluetype,"output");
		SingleVariableDeclaration variableDeclaration2 = getSimpleArgument("Reporter","reporter");

		methodDeclaration.parameters().add(variableDeclaration);
		methodDeclaration.parameters().add(variableDeclaration3);
		methodDeclaration.parameters().add(variableDeclaration1);
		methodDeclaration.parameters().add(variableDeclaration2);
		return methodDeclaration;
	}


}
