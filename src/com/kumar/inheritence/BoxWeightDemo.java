package com.kumar.inheritence;

public class BoxWeightDemo {
	public static void main(String[] args) {
		BoxWeight boxWeight = new BoxWeight(20.0,10.0,15.0,5.0);
		double vol = boxWeight.volume();
		
		System.out.println("vol:" + vol);
	}
}
