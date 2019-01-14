package encapsulation;



public class ImplementEncapsulatedClass {

	public static void main(String[] args) {

		// create object for encapsulated class
		EncapsulatedClass ec = new EncapsulatedClass();
		
		// use setter methods
		ec.setNumOne(123);
		ec.setNumTwo(4456);
		ec.setTextOne("Apple");
		ec.setTextTwo("pineapple");
		
		ec.setTestMethod("I am a Good", "boy");
		
		// call getter methods
		int a = ec.getNumOne();
		int b = ec.getNumTwo();
		String texone = ec.getTextOne();
		String textwo = ec.getTextTwo();
		
		String texThree = ec.getTestMethod();
		
		System.out.println(a + " " + b + " " + texone + " " + textwo);
		
		System.out.println(texThree);
	}
}
