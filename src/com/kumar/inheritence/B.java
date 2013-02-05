package com.kumar.inheritence;

public class B extends A{
	private int k;

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}
	
	public void showK(){
		System.out.println("Value of K: " + k);
	}
	
	public void sum(){
		System.out.println("Sum of i + j + k are " + (getI()+getJ() + k));
	}
}
