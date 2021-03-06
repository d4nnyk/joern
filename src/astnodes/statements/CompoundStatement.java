package astnodes.statements;

import java.util.LinkedList;
import java.util.List;

import astnodes.ASTNode;
import astwalking.ASTNodeVisitor;

public class CompoundStatement extends Statement
{
	protected static final List<ASTNode> emptyList = new LinkedList<ASTNode>();
	
	public void addStatement(ASTNode stmt)
	{
		super.addChild(stmt);
	}
	
	public List<ASTNode> getStatements()
	{
		if(children == null)
			return emptyList;
		return children;
	}

	public String getEscapedCodeStr() { return ""; }
	
	public void accept(ASTNodeVisitor visitor){ visitor.visit(this); }
}
