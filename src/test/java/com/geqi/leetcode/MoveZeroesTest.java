package com.geqi.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MoveZeroesTest {
    @Test
    public void testMoveZeroes() throws Exception {
        int[] input={0,1,0,3,12};
        MoveZeroes moveZeroes=new MoveZeroes();
        moveZeroes.moveZeroes(input);
        for(int i:input){
            System.out.println(i);
        }
        //Assert.assertEquals(new int[]{1,3,12,0,0},input);
    }

}