package staticKeyword;

public class callToStaticAndNonStatic {
	public static void main(String[] args) {

		// Call a static method with out creating an object
		staticMethodExplain.staticMethod();

		// Call a Non static method with out creating an object - Below line of code
		// will throw compilation error
		// staticMethodExplain.nonStaticMethod();

		// Create an Object for class staticMethodExplain
		staticMethodExplain testObj = new staticMethodExplain();

		// Call a Non static method using an object
		testObj.nonStaticMethod();

		// Print static variable from class staticVariableExplain
		System.out.println(staticVariableExplain.staticVar);

		// Print instance variable from class staticVariableExplain - Below line of code
		// will throw compilation error
		// System.out.println(staticVariableExplain.instanceVar);

		// Create an Object for class staticMethodExplain
		staticVariableExplain testObj2 = new staticVariableExplain();

		System.out.println(testObj2.instanceVar);
	}
}
