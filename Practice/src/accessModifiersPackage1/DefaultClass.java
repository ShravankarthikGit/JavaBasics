package accessModifiersPackage1;

class Package1DefaultClass {
	// Variables
	public int PublicVariable = 1;
	private int PrivateVariable = 3;
	int defaultVariable = 4;
	protected int ProtectedVariable = 10;

	// Public Method
	public void PublicMethod() {
		System.out.println("Printed from a public method from default class 1");
	}

	// Private Method
	private void PrivateMethod() {
		System.out.println("Printed from a private method from default class 1");
	}

	// Default Method
	void DefaultMethod() {
		System.out.println("Printed from a default method from default class 1");
	}

	// Protected Method
	protected void ProtectedMethod() {
		System.out.println("Printed from a protected method from default class 1");
	}
}
