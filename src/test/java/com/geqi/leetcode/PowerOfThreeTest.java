package com.geqi.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PowerOfThreeTest {
    @Test
    public void testIsPowerOfThree() throws Exception {
        PowerOfThree ins=new PowerOfThree();
        Assert.assertTrue(ins.isPowerOfThree(27));
        Assert.assertFalse(ins.isPowerOfThree(26));
    }

}