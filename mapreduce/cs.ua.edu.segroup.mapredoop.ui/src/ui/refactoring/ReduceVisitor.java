package ui.refactoring;

import java.util.List;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.WhileStatement;

public class ReduceVisitor extends ASTVisitor{
	private Block block =null;
	private Block methodBlock =null;
	private Statement statement =null;
	
	@Override
	public boolean visit(MethodInvocation node) {
	//	System.out.println(node.getParent().getClass().getName()); 
		 if(node.getName().getIdentifier().equals("out")) {
			 if(node.getParent() instanceof ExpressionStatement && (node.getParent()).getParent() instanceof Block){
				 setStatement((Block)((ExpressionStatement)node.getParent()).getParent());
			 }
		 }
		return super.visit(node);
	}
	@Override
	public boolean visit(MethodDeclaration node) {
		 if(node.getName().getIdentifier().equals("reduce")) {
			 List<Statement> statements = ((Block) node.getBody()).statements();
			  for(Statement statement: statements){
				  if(statement instanceof WhileStatement){
					  setMethodBlock( node.getBody());
					  block = (Block)((WhileStatement)statement).getBody();
				  }
			  }
		 }
		return super.visit(node);
	}
	private void setMethodBlock(Block body) {
	 this.methodBlock = body;
		
	}
	public void setBlock(Block block) {
		this.block = block;
	}
	public Block getBlock() {
		return block;
	}
	public Block getMethodBlock() {
		return methodBlock;
	}
	public void setStatement(Statement statement) {
		this.statement = statement;
	}
	public Statement getStatement() {
		return statement;
	}	
}
