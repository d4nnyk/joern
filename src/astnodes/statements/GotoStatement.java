package astnodes.statements;

import astwalking.ASTNodeVisitor;

public class GotoStatement extends JumpStatement
{
	public String getTarget()
	{
		return getChild(0).getEscapedCodeStr();
	}
	
	public void accept(ASTNodeVisitor visitor){ visitor.visit(this); }
}
