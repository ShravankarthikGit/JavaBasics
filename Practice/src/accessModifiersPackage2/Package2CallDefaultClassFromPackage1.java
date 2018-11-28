package accessModifiersPackage2;

// The below line of code will throw compilation error if typed manually
//import accessModifiersPackage1.Package1DefaultClass;

public class Package2CallDefaultClassFromPackage1 {

	public static void main(String[] args) {

		// Below line of code will throw compilation error as a default class from a
		// different package can't be called
		// Package1DefaultClass testObj2 = new Package1DefaultClass();
	}

}
