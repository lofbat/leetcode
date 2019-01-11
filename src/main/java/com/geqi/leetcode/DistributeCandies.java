package com.geqi.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by geqi on 2019/1/11.
 */
public class DistributeCandies {

    public int distributeCandies(int[] candies) {
        int length=candies.length/2;
        Set<Integer> set=new HashSet<>(length);
        for(int i:candies){
            set.add(i);
            if(set.size()>=length){
                return length;
            }
        }
        return set.size();
    }
}
