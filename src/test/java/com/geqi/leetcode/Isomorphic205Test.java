package com.geqi.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Isomorphic205Test {

    Isomorphic205 isomorphic205=new Isomorphic205();

    @Test
    public void TestIsIsomorphic() {
        Assert.assertTrue(isomorphic205.isIsomorphic("egg","abb"));
        Assert.assertTrue(!isomorphic205.isIsomorphic("egag","aabb"));
    }


}
