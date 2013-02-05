package com.kumar.inheritence;

public class A {
	private int i,j;

	public void setI(int i) {
		this.i = i;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}
	
	public void showIJ(){
		System.out.println("value of i and j are: " + i + " " + j);
	}
}
