package com.geqi.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayPartitionITest {

    @Test
    public void testArrayPairSum() throws Exception {
        ArrayPartitionI o=new ArrayPartitionI();
        int input[]={1,4,3,2};
        Assert.assertEquals(4,o.arrayPairSum(input));

    }

}