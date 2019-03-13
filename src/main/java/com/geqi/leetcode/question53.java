package com.geqi.leetcode;

/**
 * Maximum Subarray
 *
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 */
public class question53 {

    public int maxSubArray(int[] nums) {
        int[] max=new int[nums.length];
        max[0]=nums[0];
        int ans=max[0];
        for(int i=1;i<nums.length;i++){
            int m=nums[i]+max[i-1];
            max[i]=nums[i] > m ? nums[i] : m;
            ans= max[i]>ans ? max[i] : ans;
        }
        return ans;
    }
}
