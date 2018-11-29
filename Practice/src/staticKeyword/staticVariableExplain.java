package staticKeyword;

public class staticVariableExplain {

	// Static variable
	static int staticVar = 1;

	// Instance variable
	int instanceVar = 10;

	public static void main(String[] args) {
		
		//Redefine a static variable 
		staticVar = 2;
		
		//Below line of code will throw compilation error as instance variable can't be redefined
		//instanceVar = 7;
		
		// Print Static variable
		System.out.println(staticVar);

		// Print Instance variable - Below line of code will throw compilation error as
		// we can only use instance variable with an object creation
		
		// System.out.println(instanceVar);

		staticVariableExplain testObj = new staticVariableExplain();
		System.out.println(testObj.instanceVar);

	}

}
