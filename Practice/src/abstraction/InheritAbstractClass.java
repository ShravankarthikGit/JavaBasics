package abstraction;

public class InheritAbstractClass extends AbstractClass {

	public static void main(String[] args) {

		// Below statement will throw compilation error as Abstract class cannt be
		// instantiated
		// AbstractClass ac = new AbstractClass();

		// Object needs to be created as the abstract method is not static
		InheritAbstractClass acobj = new InheritAbstractClass();
		System.out.println(acobj.abstractMethod());
		
		//No need for object as the method comes from inherited class
		testMethodNotDefined();

		testMethodOne();
	}

	// Abstract method from the inherited abstract class need to be implemented
	@Override
	public String abstractMethod() {
		String a = "7";
		return a;
	}

	// Override method testMethodNotDefined
	public static void testMethodNotDefined() {
		System.out.println("Print from testMethodNotDefined");
	}

}
