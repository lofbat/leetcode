package com.geqi.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DistributeCandiesTest {

    DistributeCandies distributeCandies=new DistributeCandies();

    @Test
    public void testDistributeCandies() throws Exception {
        Assert.assertEquals(2,distributeCandies.distributeCandies(new int[]{1,2,3,4}));
    }

}