package ui.refactoring;

import java.util.List;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.WhileStatement;

public class MapVisitor extends ASTVisitor {
	
	private Statement statement =null;
	private Block block =null;
	public Statement getStatement() {
		return statement;
	}
	public void setStatement(Statement statement) {
		this.statement = statement;
	}
	@Override
	public boolean visit(MethodInvocation node) {
	//	System.out.println(node.getParent().getClass().getName()); 
		 if(node.getName().getIdentifier().equals("emit")) {
			 if(node.getParent() instanceof ExpressionStatement){
				 statement = (ExpressionStatement)node.getParent();
			 }
		 }
		return super.visit(node);
	}
	@Override
	public boolean visit(MethodDeclaration node) {
		 if(node.getName().getIdentifier().equals("map")) {
			 List<Statement> statements = ((Block) node.getBody()).statements();
			  for(Statement statement: statements){
				  if(statement instanceof WhileStatement){
					  block = (Block)((WhileStatement)statement).getBody();
				  }
			  }
		 }
		return super.visit(node);
	}
	public void setBlock(Block block) {
		this.block = block;
	}
	public Block getBlock() {
		return block;
	}

}
