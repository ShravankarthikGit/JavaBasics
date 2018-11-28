package accessModifiersPackage1;

public class Package1PublicClass2 {
	public static void main(String args[]) {
		Package1PublicClass1 testObj = new Package1PublicClass1();
		
		//Call to public method from class in same package
		testObj.PublicMethod();
		
		//Below line of code will throw compilation error as Private method is not accessible outside class in which its declared
		// testObj.PrivateMethod();
		
		//Call default method from Class in same package
		testObj.DefaultMethod();
		
		//Call protected method from Class in same package
		testObj.ProtectedMethod();
		
		//Get variables from class in same package
		System.out.println(testObj.PublicVariable);
		
		System.out.println(testObj.ProtectedVariable);
		
		System.out.println(testObj.defaultVariable);
		
		//Below line of code will throw compilation error as Private variable is not accessible outside class in which its declared
		// System.out.println(testObj.PrivateVariable);
		
		// Private method can't be accessed from a outside class 
		// The above statement applies to variables, methods and constructors
		
	}
}
