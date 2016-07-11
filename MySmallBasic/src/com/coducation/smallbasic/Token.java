package com.coducation.smallbasic;

public enum Token
{
	// (), {}
	OPEN_PARA,
	CLOSE_PARA,
	OPEN_BRACE,
	CLOSE_BRACE,
	
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
	LESS, // O < O
	LESS_THAN, // O <= O
	GREATER, // O > O
	GREATER_THAN, // O >= O
	EQUAL, // O = O
	NOT_EQUAL, // O <> O
	
	// �Ҵ翬���� =
	ASSIGN // Var or Property = expr
}
