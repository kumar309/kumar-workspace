package com.kumar.inheritence;

public class SimpleInheritence {
	public static void main(String[] args) {

		A a = new A();
		B b = new B();

		a.setI(10);
		a.setJ(20);
		a.showIJ();
		System.out.println();
		
		b.setI(7);
		b.setJ(8);
		b.setK(9);
		b.showIJ();
		b.showK();
		System.out.println();
		
		System.out.println("Sum of I+J+K is ");
		b.sum();

	}

}
