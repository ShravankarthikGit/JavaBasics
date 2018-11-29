package staticKeyword;

public class staticMethodExplain {

	public static void main (String[] args) {
		//Call static method
		staticMethod();
		
		//Call Non-Static method - Below line of code will throw compilation error
		//nonStaticMethod();
		
		//Create object for class
		staticMethodExplain testObj = new staticMethodExplain();
		//Call non static method
		testObj.nonStaticMethod();
		
	}
	
	static void staticMethod() {
		System.out.println("Printed form a Static Method");
	}
	
	void nonStaticMethod() {
		System.out.println("Printed form a Non Static Method");
	}
	
}
