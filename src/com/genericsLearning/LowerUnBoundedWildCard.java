package com.genericsLearning;

import java.util.ArrayList;
import java.util.List;

public class LowerUnBoundedWildCard {

	// with lower unbounded wild card, any data type will work.

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(234234324);
		list1.add(0);

		List<Number> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(234234324f);
		list2.add(0);
		list2.add(-2132.13123f);

		List<Double> list21 = new ArrayList<>();
		list21.add(1d);
		list21.add(234234324d);
		list21.add(0d);
		list21.add(-2132.13123d);

		System.out.println("print integer list");
		printItems(list1);

		System.out.println("---------------");

		System.out.println("print number list");
		printItems(list2);

		// here double will also work, because any damn data type allowed in unbounded.
		// unbounded means no bounds for anything.
		System.out.println("---------------");
		System.out.println("print double list");
		printItems(list21);

		System.out.println("---------------->");
		System.out.println("second method which has simple list");
		printItemsSecondMethod(list1);

	}

	static void printItems(List<?> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}

	static void printItemsSecondMethod(List<Integer> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}

}
