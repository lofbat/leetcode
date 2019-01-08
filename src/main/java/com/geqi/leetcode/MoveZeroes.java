package com.geqi.leetcode;

import java.util.Arrays;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        if (nums.length == 1)
            return;
        int j = 0;
        int i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        i++;
        while (j < i && i < nums.length) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                nums[i] = 0;
                j++;
            }
            i++;
        }
    }
}
