package com.coducation.smallbasic;

public class Lit extends CondExpr // extends Expr -> extends CondExpr
{								  // Because, Lit := "true", "false" <= String, num...
	public Lit(String lit)
	{
		super();
		this.lit = lit;
	} // Builder
	
	/* Notice 
	 * 123  
	 * 3.14
	 * 'a', '��' // �� ... �� �������� ����ؾ� ��
	 * Unicode.
	 */
	
	public String gets()
	{
		return lit;
	}
	private String lit;
}
