package inheritence;

import polymorphism.PracticeBaseClass;

public class PracticeOOPS extends PracticeBaseClass{
	
	public static void main (String[] args) {
		
		//Create object of class PracticeOOPS to call non static method
		PracticeOOPS objTwo = new PracticeOOPS();
		objTwo.testMethodOne(2,3,5);
		
		//Method usage based on inheritance from PracticeBaseClass (no object created)
		baseClasstestMethodTwo("test", "class");
		
		baseClasstestMethodOne(2,5);
		
		//Create object of class PracticeBaseClass to call non static method
		PracticeBaseClass obj = new PracticeBaseClass();
		obj.testMethodOne(2,3,5);
		obj.testMethodOne(2,3,5,2);
		
	}
	
	// Overriding method definition, which was created in Base class
	public void  testMethodOne(int a, int  b, int c) {
		int d = a +b+c;
		System.out.println("testMethodOne result" + " " + d);
	}

}
