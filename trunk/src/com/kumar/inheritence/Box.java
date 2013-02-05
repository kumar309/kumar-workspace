package com.kumar.inheritence;

public class Box {
	double length;
	double breadth;
	double height;

	public Box(double length, double breadth, double height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	public Box() {
		this.length = -1;
		this.breadth = -1;
		this.height = -1;
	}

	public double volume() {
		return (length * breadth * height);
	}
}
