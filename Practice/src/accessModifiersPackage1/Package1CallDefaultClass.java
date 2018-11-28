package accessModifiersPackage1;

public class Package1CallDefaultClass {

	public static void main(String[] args) {
		Package1DefaultClass testObj2 = new Package1DefaultClass();

		// Call to public method from default class in same package
		testObj2.PublicMethod();

		// Below line of code will throw compilation error as Private method is not
		// accessible outside class in which its declared
		// testObj.PrivateMethod();

		// Call default method from Class in same package
		testObj2.DefaultMethod();

		// Call protected method from Class in same package
		testObj2.ProtectedMethod();

		// Get variables from class in same package
		System.out.println(testObj2.PublicVariable);

		System.out.println(testObj2.ProtectedVariable);

		System.out.println(testObj2.defaultVariable);

		// Below line of code will throw compilation error as Private variable is not
		// accessible outside default/public class in which its declared
		// System.out.println(testObj.PrivateVariable);

		// Private method can't be accessed from a outside public/default class
		// The above statement applies to variables, methods and constructors

	}

}
