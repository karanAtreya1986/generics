package com.genericsLearning;

public class AnotherExampleOfGenerics<P> {

	P obj; // we can create generic variables.

	// A class that can refer to any type of object is called generic class.

	// create method and pass generic as arguments.
	void add(P obj1) {
		this.obj = obj1;
	}

	// add return type as generics.

	P get() {
		return this.obj;
	}

	// we can create variable of generic type.
	// we can add return type of generic type.
	// we can do what we want.

	// why generics-
//		Introduced for type safety.
//		Collection can store any type of object.
//		This result in class cast exception.
//		With generics, now you can store specific type of object only.

	public static void main(String[] args) {

		// see we want to use integer type generics.
		// not mandatory to give the generic name in right hand side.
		AnotherExampleOfGenerics<Integer> f1 = new AnotherExampleOfGenerics<>();
		f1.add(1210390123);
		Integer i1 = f1.get();
		System.out.println(i1);

		// create string generics
		AnotherExampleOfGenerics<String> f2 = new AnotherExampleOfGenerics<>();
		f2.add("tiger");
		String s2 = f2.get();
		System.out.println(s2);
	}

}
