package polymorphism;

public class PracticeBaseClass {

	public static void  baseClasstestMethodOne(int a, int b) {
		int c = a*b;
		System.out.println("baseClasstestMethodOne result" + " " + c);
	}
	
	public static void  baseClasstestMethodTwo(String a, String  b) {
		String  c = a+ b;
		System.out.println("baseClasstestMethodTwo result" + " " + c);
	}
	
	public void  testMethodOne(int a, int  b, int c) {
		int d = a * b * c;
		System.out.println("Base Class testMethodOne result" + " " + d);
	}
	
	// Overriding method testMethodOne with 4 input parameters
	public void  testMethodOne(int a, int  b, int c, int d) {
		int e = a * b * c * d;
		System.out.println("Base Class testMethodOne result" + " " + e);
	}
	
}
