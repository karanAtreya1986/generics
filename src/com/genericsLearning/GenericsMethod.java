package com.genericsLearning;

import java.time.Year;

public class GenericsMethod {

	public static void main(String[] args) {

		Integer[] intArray = { 1, 2, 3, 4, 5, 23434, -234324, 0 };
		String[] stringArray = { "Tom", "Harry", " ", "" };

		// call printArray for integer
		// same one method can be used for different data types due to generics.
		printArray(intArray);

		System.out.println("---------------------------");
		// call printArray for String
		printArray(stringArray);

	}

	// another example of generics.
	// we need to give <Y> before return type of method else compile time error - Y
	// cannot be resolved to a type
	static <Y> void printArray(Y[] arr) {
		for (Y elementInArray : arr) {
			System.out.println(elementInArray);

		}
	}

}
