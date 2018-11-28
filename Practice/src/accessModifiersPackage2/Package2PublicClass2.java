package accessModifiersPackage2;

import accessModifiersPackage1.Package1PublicClass1;

public class Package2PublicClass2 {

	public static void main(String args[]) {
		Package1PublicClass1 testObj = new Package1PublicClass1();
		
		// Call to public method from class in same package
		testObj.PublicMethod();
		
		// Below line of code will throw compilation error as Private method is not accessible outside package accessModifiersPackage1
		// testObj.PrivateMethod();
		
		//Call default method from Class in different package - Below line of code will throw compilation error
		// testObj.DefaultMethod();
		
		//Call protected method from Class in different package - Below line of code will throw compilation error
		// testObj.ProtectedMethod();
		
		//Get variables from class in different package
		System.out.println(testObj.PublicVariable);
		
		//Below line of code will throw compilation error as Private method is not accessible outside class in which its declared
		//System.out.println(testObj.ProtectedVariable);
		
		//System.out.println(testObj.defaultVariable);
		
		//System.out.println(testObj.PrivateVariable);
		
		// Only public method can be accessed from a class in a different package
		// The above statement applies to variables, methods and constructors
	}
}
