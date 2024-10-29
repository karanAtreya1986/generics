package com.genericsLearning;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildCard {

	// ? super <datatype> - is known as lower bounded wild card.

	public static void main(String[] args) {

		// if you try to add float or double value, we get compile error -The method
		// add(Integer) in the type List<Integer> is not applicable for the arguments
		// (double)

		// Wild cards present to give limitations to code. Mainly used with collections
		// to handle the generics.
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(234234324);
		list1.add(0);
//		list1.add(-213213.123);
//		list1.add(-213213123f)

		// Number can be integer or long or float.

		// number does not have relation with double.
		List<Number> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(234234324f);
		list2.add(0);
		list2.add(-2132.13123f);

		// if we give int or float, we get compile error - The method add(int, Double)
		// in the type List<Double> is not applicable for the arguments (int)
		// float - The method add(Double) in the type List<Double> is not applicable for
		// the arguments (float)
		List<Double> list21 = new ArrayList<>();
		list21.add(1d);
		list21.add(234234324d);
		list21.add(0d);
		list21.add(-2132.13123d);

		printItems(list1);

		System.out.println("---------------");
		printItems(list2);

		// for this we get compile error - The method printItems(List<? super Integer>)
		// in the type LowerBoundedWildCard is not applicable for the arguments
		// (List<Double>)
//		printItems(list21);

		System.out.println("---------------->");

		printItemsSecondMethod(list1);

		// this give compile error - The method printItemsSecondMethod(List<Integer>) in
		// the type LowerBoundedWildCard is not applicable for the arguments
		// (List<Number>)
//		printItemsSecondMethod(list2);

		// this gives compile error - The method printItemsSecondMethod(List<Integer>)
		// in the type LowerBoundedWildCard is not applicable for the arguments
		// (List<Double>)
//		printItemsSecondMethod(list21);
	}

	// this method says integer and numbers and floats are allowed.
	// anything which is super of integer class is allowed.
	// ? super for setting lower bound.

	// Double does not belong to Integer family, so it gives error for Double.
	// In lower bound, we give the lowest class which can be accommodated inside
	// generics. Example, here Integer is lowest so nothing is allowed below Integer
	// class.

	static void printItems(List<? super Integer> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}

	// this method only requires list of integer.
	// it cannot have any other data type including number of float or double or
	// string.
	static void printItemsSecondMethod(List<Integer> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}

}
