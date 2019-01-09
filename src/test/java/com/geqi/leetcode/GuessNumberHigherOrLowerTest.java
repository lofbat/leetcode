package com.geqi.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GuessNumberHigherOrLowerTest {
    @Test
    public void testGuessNumber() throws Exception {
        GuessNumberHigherOrLower o=new GuessNumberHigherOrLower();
        Assert.assertEquals(6,o.guessNumber(10));
    }

}