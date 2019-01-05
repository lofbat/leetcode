package com.geqi.leetcode;

import java.util.*;

public class AllOne {

    private Map<String,Integer> kMap;
    private Map<Integer,Set<String>> vMap;
    private Integer minValue=0;
    private Integer maxVaule=0;

    /** Initialize your data structure here. */
    public AllOne() {
        kMap=new HashMap<>();

    }

    /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
    public void inc(String key) {
        if(Objects.isNull(key) || key.isEmpty()){
            return;
        }
        Integer value=kMap.getOrDefault(key,0);
        value++;
        kMap.put(key,value);

        if(maxVaule==0 || maxVaule<value){
            maxVaule=value;
        }
        if(minValue==0){
            minValue=value;
        }

        if(!value.equals(1)){
            Set<String> set=vMap.get(value-1);
            set.remove(key);
            vMap.put(value-1,set);

            if(set.isEmpty() && minValue==value-1){
                minValue++;
            }
        }

        Set<String> set=vMap.getOrDefault(value,new HashSet<>());
        set.add(key);
        vMap.put(value,set);
    }

    /** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
    public void dec(String key) {
        if(Objects.isNull(key) || key.isEmpty()){
            return;
        }

        Integer value=kMap.get(key);

        if(Objects.isNull(value)){
            return;
        }

        if(value==1){
            kMap.remove(key);
            Set<String> set=vMap.get(value);
            set.remove(key);
            vMap.put(value,set);
        }


    }

    /** Returns one of the keys with maximal value. */
    public String getMaxKey() {

        return null;
    }

    /** Returns one of the keys with Minimal value. */
    public String getMinKey() {

        return null;
    }
}
