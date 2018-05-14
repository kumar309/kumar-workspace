package com.kumar.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by keswani on 5/13/18.
 */
public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {3,-1,0,4,2,5};
        int target = 1;
        int[] res = new int[2];
        res = twoSum.twoSum(nums,target);
        for(int i:res)
            System.out.println("res:"+ i);
    }

    public int[] twoSum(int nums[], int target){
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            if(map.get(nums[i])!=null){
                res[0] = map.get(nums[i]);
                res[1] = i;
            }else{
                map.put(target - nums[i],i);
                System.out.println("K:"+ (target-nums[i]) + " V:" + i);
            }
        }
        return  res;
    }
}
