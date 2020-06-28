package com.one;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static void moveZeroes(int[] nums) {
    	for (int i = 0,j=0; i < nums.length; i++) {
			if (nums[i]!=0) {
				int tmp = nums[i];
				nums[i] = nums[j];
				nums[j] = tmp;
				j++;	
				}
			}
		}
    
    public static int[] plusOne(int[] digits) {
           for (int i = digits.length-1; i>=0; i--) {
				digits[i]++;
				digits[i] = digits[i] % 10;
				if (digits[i]!=0) return digits;
	       }
           digits = new int[digits.length+1];
           digits[0] = 1;
           return digits;
        }

        public static int[] twoSum(int[] nums, int target) {
        	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        	for(int i=0;i<nums.length-1;i++) {
        		if (map.containsKey(target-nums[i])) {
        			return new int [] {map.get(target-nums[i]),i};
        		}   
        		map.put(nums[i], i);
        	}
        	return nums;
        }
        
        public static int removeDuplicates(int[] nums) {
        	if(nums.length==0)return 0;
        	int i=0;
        	for(int j=i+1;j<nums.length;j++) {
        		if(nums[j] != nums[i]) {
        			i++;
        			nums[i] = nums[j];
        		}
        	}
        	return i+1;
        }

    
//    public static void main(String[] args) {
////    	moveZeroes(new int[] {0,1,0,3,12});
////    	for (int x : plusOne(new int[] {9})) {
////			System.out.println(x);
////		}
////    	System.out.println(twoSum(new int[]{2,8,7,11},9));
//    	System.out.println(removeDuplicates(new int[] {1,1,2,2,3,3,0}));
//	}
}
