package com.company;

//Literals

// 'a', "a", 19, 19L, 19l, 123.45, true, "true"
// 
//variable : identifiers (a-z, A-Z, 0-9, _, $)
//firstNumber, first_Number

//data types: primitive data types
// 8 primitive data types:
//byte, short, int, long, float, double, boolean, char

public class LiteralDemo1 {
	public static void main(String[] args) {
		System.out.println("Byte Variable:");
		byte varByte = 10;
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);

		System.out.println("Short Variable:");
		short varShort = 20;
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		System.out.println("============");
		
		int intVar = 123456789; //decimal literal
		int intOctalVar = 017; // octal literal
		int intHexaVar = 0Xf; //hexadecimal literal
		int intBinaryVar = 0b1111; //binary literal
		
		System.out.println("Decimal Literal : " + intVar);
		System.out.println("Octal Literal : " + intOctalVar);
		System.out.println("Hexadecimal Literal : " + intHexaVar);
		System.out.println("Binary Literal : "+ intBinaryVar);
		
		System.out.println("===============");
		System.out.println(Integer.toBinaryString(intVar));
		System.out.println(Integer.toOctalString(intVar));
		System.out.println(Integer.toHexString(intVar));
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
