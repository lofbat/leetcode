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
        if(s.isEmpty()){
            return 0;
        }
        int ans=0;
        int flag=0;
        Map<Character,Integer> map=new HashMap(s.length());
        for (int i=0,length=s.length();i<length;i++){
            Character c=s.charAt(i);
            Integer old = map.get(c);
            if( old == null || old<flag){
                map.put(c,i);
                int t=i-flag;
                ans=ans>t?ans:t;
                System.out.println(ans);
            }else{
                map.put(c,i);
                flag=old;
                int t=i-flag;
                ans=ans>t?ans:t;
                System.out.println(ans);
            }
            System.out.println(map);

        }
        return ans;
    }
}
