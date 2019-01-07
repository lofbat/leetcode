package com.geqi.leetcode;

import java.util.HashMap;
import java.util.Map;

public class NumberOfBoomerangs {

    public int numberOfBoomerangs(int[][] points) {
        Integer result=0;
        Map<Integer, Integer> map;
        for(int i=0;i<points.length;i++){
            map=new HashMap<>();
            for(int j=0;j<points.length;j++){
                if(i!=j){
                    Integer distance=getDistance(points[i], points[j]);
                    map.put(distance,map.getOrDefault(distance,0)+1);
                }
            }
            for(Integer n:map.values()){
                if(n>1){
                    result+=n*(n-1);
                }
            }
        }
        return result;
    }

    private int getDistance(int[] pointA, int[] pointB){
        int x = pointA[0] - pointB[0];
        int y = pointA[1] - pointB[1];
        return x * x + y * y;
    }
}
