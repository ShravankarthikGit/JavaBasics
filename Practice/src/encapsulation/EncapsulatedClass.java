package encapsulation;

public class EncapsulatedClass {

	int numberOne;
	int numberTwo;
	String textOne;
	String textTwo;
	String textThree;

	public int getNumOne() {
		return numberOne;
	}

	public int getNumTwo() {
		return numberTwo;
	}

	public String getTextOne() {
		return textOne;
	}

	public String getTextTwo() {
		return textTwo;
	}
	
	public String getTestMethod() {
		return textThree;
	}

	public void setNumOne(int no1) {
		numberOne = no1;
	}

	public void setNumTwo(int no2) {
		numberTwo = no2;
	}

	public void setTextOne(String tex1) {
		textOne = tex1;
	}

	public void setTextTwo(String tex2) {
		textTwo = tex2;
	}
	
	//Concatenate in set method
	public void setTestMethod(String tex2, String tex3) {
		textThree = tex2 + " " + tex3;
	}
}
