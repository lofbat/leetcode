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
        int ans=0;
        int flag=0;
        Map<Character,Integer> map=new HashMap(s.length());
        for (int i=0,length=s.length();i<length;i++){
            Character c=s.charAt(i);
            Integer old = map.get(c);
            if( old == null || old<flag){
                map.put(c,i);
                ans=ans>map.size()?ans:map.size();
                System.out.println(ans);
            }else{
                map.put(c,i);
                flag=old;
                Iterator<Map.Entry<Character, Integer>> ite = map.entrySet().iterator();
                int t=0;
                while(ite.hasNext()){
                    Map.Entry<Character, Integer> entry=ite.next();
                    if(entry.getValue()<flag){
                        ite.remove();
                    }else {
                        t++;
                    }
                }
                ans=ans>t?ans:t;
                System.out.println(ans);
            }
            System.out.println(map);

        }
        return ans;
    }
}
