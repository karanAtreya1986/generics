package com.genericsLearning;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("this is from rectangle which extends shape. ");
	}
}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("this is from circle which extends shape. ");
	}
}

public class UpperBoundedWildCard {

	// we use extends for upper bound.
	// any child of shape is allowed here.
	// Here in these generics, we give the topmost class. Use “extends” keyword.
	// Anything which is child of topmost class will be entertained.
	static void drawShapes(List<? extends Shape> myName) {
		for (Shape shape : myName) {
			shape.draw();
		}
	}

	public static void main(String[] args) {
		List<Rectangle> list1 = new ArrayList<>();
		list1.add(new Rectangle());

		List<Circle> list11 = new ArrayList<>();
		list11.add(new Circle());
		list11.add(new Circle());

		drawShapes(list1);
		drawShapes(list11);
	}
}
