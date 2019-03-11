package com.geqi.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by geqi on 2019/3/11.
 */
public class question4Test {

    @Test
    public void testFindMedianSortedArrays() {

        Assert.assertEquals(question4.findMedianSortedArrays(new int[]{1,3,4},new int[]{2,5,6}),3.5);
    }
}