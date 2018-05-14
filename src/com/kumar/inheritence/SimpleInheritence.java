package com.kumar.inheritence;

public class SimpleInheritence {
	public static void main(String[] args) {

		A a = new A();
		B b = new B();

		a.setI(10);
		a.setJ(20);
		a.showIJ();
		//System.out.println();
		
		b.setI(7);
		b.setJ(8);
		b.setK(9);
		b.showIJ();
		b.showK();
		//System.out.println();
		
		//System.out.println("Sum of I+J+K is: ");
		//b.sum();
		SimpleInheritence inheritence = new SimpleInheritence();
		int[] arr={-23,2,3,100,40,5,3,2,4,7};

		System.out.println(inheritence.secondSmallestElement(arr));


	}

	public int secondSmallestElement(int[]arr){
		int first= -1;
		int second = -1;

		if(arr[0]<arr[1]){
			first = arr[0];
			second = arr[1];

		}else{
			first=arr[1];
			second=arr[0];
		}
		System.out.println("first:"+first + " second:"+second);

		for(int i=2;i<arr.length;i++){
			if(arr[2]<first){
				second = first;
				first = arr[2];

			}else if(arr[2]> first && arr[2]< second){
				second = arr[2];
			}
			System.out.println("first:"+first + " second:"+second);
		}

		return second;
	}


}
