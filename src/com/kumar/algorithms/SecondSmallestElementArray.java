package com.kumar.algorithms;

/**
 * Created by keswani on 3/12/18.
 */
public class SecondSmallestElementArray {
    public static void main(String[] args) {
        SecondSmallestElementArray smallestElementArray = new SecondSmallestElementArray();
        int[] arr={5,3,2,4,7};
        smallestElementArray.secondSmallestElement(arr);
    }


    public int secondSmallestElement(int[]arr){
        int first= -1;
        int second = -1;

        if(arr[0]<arr[1]){
            first = arr[0];
            second = arr[1];
            System.out.println("first:"+first + " second:"+second);
        }

        for(int i=2;i<arr.length;i++){

        }



        return second;
    }
}
