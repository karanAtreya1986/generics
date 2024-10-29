package com.genericsLearning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UnBoundedWildCard {

//	Wild cards-
//	Lower bound – set lower limit – below this limit don’t accept object.
//	Upper bound – set upper limit – above this limit don’t accept object.
	// ? is unbounded wild card.

	public static void main(String[] args) {

		UnBoundedWildCard uuUnBoundedWildCard = new UnBoundedWildCard();

		List<Integer> i1 = new ArrayList<>();
		i1.add(23424234);
		uuUnBoundedWildCard.printCollectionNames(i1);

		List<String> i2 = new ArrayList<>();
		i2.add("tiger");
		uuUnBoundedWildCard.printCollectionNames(i2);
	}

	// ? is unbounded wild card.
	void printCollectionNames(Collection<?> objectsToPrint) {
		for (Object object : objectsToPrint) {

			// to get the name of class for the object, we use getclass and then
			// getcanonicalname on it.
			System.out.println(object.getClass().getCanonicalName() + " " + "-->" + object);

		}
	}

}
