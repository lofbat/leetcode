package com.geqi.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberOfBoomerangsTest {
    @Test
    public void testNumberOfBoomerangs(){
        NumberOfBoomerangs objects=new NumberOfBoomerangs();
        int points[][]={{0,0},{1,0},{2,0}};
        Assert.assertEquals(objects.numberOfBoomerangs(points),2);
    }

}