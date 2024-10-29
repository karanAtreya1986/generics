package com.genericsLearning;

public class GenericsWithCustomClass<P> {

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
//		GenericsWithCustomClass<EmployeeCustomClass> f1 = new GenericsWithCustomClass<>();
//		f1.add(new EmployeeCustomClass(10));
//		EmployeeCustomClass i1 = f1.get();
//		System.out.println("prints memory address ---->" + i1);
//		System.out.println("to print class object value in java not collections --> " + i1.id);
//
//		GenericsWithCustomClass<EmployeeCustomClass> f11 = new GenericsWithCustomClass<>();
//		f11.add(new EmployeeCustomClass(0));
//		EmployeeCustomClass i11 = f11.get();
//		System.out.println("prints memory address ---->" + i11);
//		System.out.println("to print class object value in java not collections --> " + i11.id);
//
//		GenericsWithCustomClass<EmployeeCustomClass> f111 = new GenericsWithCustomClass<>();
//		f111.add(new EmployeeCustomClass(-32432420));
//		EmployeeCustomClass i111 = f111.get();
//		System.out.println("prints memory address ---->" + i111);
//		System.out.println("to print class object value in java not collections --> " + i111.id);

		// When we give two objects, the value of second object overwrites the first
		// object.
		GenericsWithCustomClass<EmployeeCustomClass> f1111 = new GenericsWithCustomClass<>();
		f1111.add(new EmployeeCustomClass(-78));
		f1111.add(new EmployeeCustomClass(-3242378));
		EmployeeCustomClass i1111 = f1111.get();
		System.out.println("prints memory address ---->" + i1111);
		System.out.println("to print class object value in java not collections --> " + i1111.id);

	}

}
