package com.genericsLearning;

import java.time.Year;

public class GenericsMethodOfNonStaticType {

	public static void main(String[] args) {

		Integer[] intArray = { 1, 2, 3, 4, 5, 23434, -234324, 0 };
		Character[] charArray = { 'A', ' ', 'B', 'A', 'g', 'h' };

		// create object of the class to access non static members.
		GenericsMethodOfNonStaticType objGenericsMethodOfNonStaticType = new GenericsMethodOfNonStaticType();

		// call printArray for integer
		// same one method can be used for different data types due to generics.
		// use the created object and access non static members.
		objGenericsMethodOfNonStaticType.printArray(intArray);

		System.out.println("---------------------------");
		// call printArray for Character
		// use the created object and access non static members.
		objGenericsMethodOfNonStaticType.printArray(charArray);

	}

	// another example of generics.
	// we need to give <Y> before return type of method else compile time error - Y
	// cannot be resolved to a type
	// one method which can work with any datatype in java.
	<Y> void printArray(Y[] arr) {
		for (Y elementInArray : arr) {
			System.out.println(elementInArray);

		}
	}

}
