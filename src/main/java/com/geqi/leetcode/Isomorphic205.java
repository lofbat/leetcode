package com.geqi.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Isomorphic205 {

    public boolean isIsomorphic(String s, String t) {
        Map<Character,Integer> m1=new HashMap<>(256);
        Map<Character,Integer> m2=new HashMap<>(256);
        for(int i=0;i<s.length();i++){
            if(!Objects.equals(m1.get(s.charAt(i)),m2.get(t.charAt(i)))){
                return false;
            }
            else{
                m1.put(s.charAt(i),i);
                m2.put(t.charAt(i),i);
            }
        }
        return true;
    }
}
