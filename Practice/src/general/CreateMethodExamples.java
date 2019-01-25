package general;

public class CreateMethodExamples {

	
	public static void main(String[] args) {
		testMethod(10,8);
		
		CreateMethodExamples obj = new CreateMethodExamples();
		obj.testMethod2("good","boy");
		
		//obj.testmethod3(2, 2);
		
		int e = obj.testmethod3(2, 2);
		
		System.out.println("I am printed from testMethod3" + " " + obj.testmethod3(2, 2));
		
		System.out.println("I am printed from testMethod3" + " " + e);
	}
	
	
	public static void testMethod(int a, int b) {
		System.out.println("I am printed from testMethod");
		int c = a+b;
		System.out.println("sum of a and b"+" "+ c);
	}
	
	public void testMethod2(String a, String b) {
		System.out.println("I am printed from testMethod");
		String c = a+b;
		System.out.println("concatenation of a and b"+" "+ c);
	}
	
	
	public int testmethod3 (int a, int b) {
		int c = a+b;
		return c;
	}
	
}
