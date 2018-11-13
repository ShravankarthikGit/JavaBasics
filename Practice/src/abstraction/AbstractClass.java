package abstraction;

public abstract class AbstractClass {

	////Non abstract method and Method not defined
	public static void testMethodNotDefined() {

	}

	//Non abstract method and Method defined
	public static void testMethodOne() {
		int a = 2;
		int b = 3;
		int c = a + b;
		System.out.print("testMethodOne result " + c);
	}
	
	//Abstract method
	public abstract String abstractMethod();
}
