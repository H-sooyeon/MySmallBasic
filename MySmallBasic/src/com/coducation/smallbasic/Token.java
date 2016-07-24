package com.coducation.smallbasic;

public enum Token
{
	NONE,
	
	// '\n'
	CR, 
	
	// EOF
	
	END_FILE,
	
	// Literal 
	
	STR_LIT,
	NUM_LIT,
	
	// Keyword 
	
	IF,
	THEN,
	ELSE,
	ELSEIF,
	ENDIF,
	
	WHILE,
	ENDWHILE,
	
	FOR,
	TO,
	STEP,
	ENDFOR,
	
	SUB,
	ENDSUB,
	
	LABEL,
	GOTO,
	
	// IDENTIFIER (Var name, Property name, Method name...)
	
	ID,
	
	// (), {}, []
	OPEN_PARA,
	CLOSE_PARA,
	OPEN_BRACE,
	CLOSE_BRACE,
	OPEN_BRAKET,
	CLOSE_BRAKET,
	
	// . , :
	DOT, // Object.Propertyname of Object.MethodName
	COMMA, // Mathod1(Param1, Param2, ... , Paramn)
	COLON,// Label
	
	// ���� -
	// ����, ������
	// ���� ����	
	PLUS, // O + O
	MINUS, // O - O
	MULTIPLY, // O * O
	DIVIDE, // O / O
	UNARY_MINUS, // -O
	
	// �������� > < >= <= = <>
	LESS_THAN, // O < O
	LESS_EQUAL, // O <= O
	GREATER_THAN, // O > O
	GREATER_EQUAL, // O >= O
	EQUAL, // O = O
	NOT_EQUAL, // O <> O
	
	// �Ҵ翬���� =
	ASSIGN // Var or Property = expr
}
