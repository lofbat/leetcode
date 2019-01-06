package com.geqi.leetcode;

public class PowerOfThree {

    private double maxPowOf3= Math.pow(3,19);

    public boolean isPowerOfThree(int n) {
        return n>0 && maxPowOf3%n==0;
    }
}
