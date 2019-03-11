package com.geqi.leetcode;

/**
 * Created by geqi on 2019/3/11.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 */
public class question3 {

    public int lengthOfLongestSubstring(String s) {
        int length=s.length();
        if(length<2){
            return length;
        }
        int ans=0;
        int flag=0;
        Map<Character,Integer> map=new HashMap(length);
        for (int i=0;i<length;i++){
            Character c=s.charAt(i);
            Integer old = map.get(c);
            if( old == null || old<flag){
                map.put(c,i);
                int t=i-flag+1;
                ans=ans>t?ans:t;
            }else{
                map.put(c,i);
                flag=old+1;
                int t=i-flag+1;
                ans=ans>t?ans:t;
            }
        }
        return ans;
    }
}
