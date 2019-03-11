package com.geqi.leetcode;

import java.util.Arrays;

/**
 * Created by geqi on 2019/3/11.
 *
 * 4. Median of Two Sorted Arrays
 */
public class question4 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        int left=(m+n+1)/2,right=(m+n+2)/2;
        return (findK(nums1,nums2,left)+findK(nums1,nums2,right))/2.0;
    }

    private static int findK(int[] nums1,int[] nums2,int k){

        int m=nums1.length,n=nums2.length;
        if(m==0)
            return nums2[k-1];
        if(n==0)
            return nums1[k-1];
        if(k==1)
            return Math.min(nums1[0],nums2[0]);

        int i=Math.min(m,k/2),j=Math.min(n,k/2);
        if(nums1[i-1]>nums2[j-1]){
            return findK(nums1, Arrays.copyOfRange(nums2,j,n),k-j);
        }else{
            return findK(Arrays.copyOfRange(nums1,i,m),nums2,k-i);
        }

    }
}
