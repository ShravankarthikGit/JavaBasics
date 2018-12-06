package general;

public class variableTypes {
	//Below integer variable definition will throw compilation error as "out of range" (range of integer '-2,147,483,648 to 2,147,483, 647' == 2^31 to 2^31-1)
	//static int integerVariable = 2147483648;
	//static int integerVariable2 = -2147483649;
	
	//Highest Max value for an integer variable
	static int integerVariable = 2147483647;
	//Lowest Min value for an integer variable
	static int integerVariable2 = -2147483648;
	
	
	//Below byte variable definition will throw compilation error as "out of range" (range of byte '-128 to 127'== 2^7 to 2^7-1)
	//static byte byteVariable = 128;
	//static byte byteVariable2 = -129;
	
	//Highest Max value for an byte variable
	static byte byteVariable = 127;
	//Lowest Min value for an byte variable
	static byte byteVariable2 = -128;
	
	//Below short variable definition will throw compilation error as "out of range" (range of short '-32,768 to 32,767' == 2^15 to 2^15-1)
	//static short shortVariable = 32768;
	//static short shortVariable2 = -32769;
	
	//Highest Max value for an short variable
	static short shortVariable = 32767;
	//Lowest Min value for an short variable
	static short shortVariable2 = -32768;
	
	//Below long variable definition will throw compilation error as "out of range" (range of long '-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807' == 2^63 to 2^63-1)
	//static long longVariable = 9223372036854775808L;
	//static long longVariable2 = -9223372036854775809L;
	
	//Highest Max value for an short variable
	static long longVariable = 9223372036854775807L;
	//Lowest Min value for an short variable
	static long longVariable2 = -9223372036854775808L;
	
	//Below float variable definition will be converted to 3.6345644, when used as the float type trims the number of decimals to 7
	static float floatVariable = 3.634564365346554365623454323453425234f;

	//Below double variable definition will be converted to 3.6345643653465545, when used as the float type trims the number of decimals to 15
	static double doubleVariable = 3.634564365346554365623454323453425234;
	
	//Below boolean variable definition will take values as true or false
	static boolean booleanVariable = true;
	static boolean booleanVariable2 = false;

	//Default is false
	static boolean booleanVariable3;
	
	//Below Char variable definition will throw compilation error as char will take only one character
	//static char charVariable2 = 'asfsdf';
	
	static char charVariable = 'q';
	
	public static void main(String[] args) {
		
		System.out.println(floatVariable );
		
		System.out.println(doubleVariable);
		
		System.out.println(integerVariable);
		
		System.out.println(byteVariable);
		
		System.out.println(shortVariable);
		
		System.out.println(longVariable);
		
		System.out.println(booleanVariable);
		
		System.out.println(charVariable);
		
	}
}