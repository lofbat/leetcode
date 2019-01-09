package com.geqi.leetcode;

public class GuessNumberHigherOrLower {

    private int i=6;

    public int guessNumber(int n) {
        int low=1;
        int high=n;
        while (true){
            int mid=low+(high-low)/2;
            int res=guess(mid);
            if(res==0){
                return mid;
            }
            if(res==-1){
                high=mid-1;
            }
            if(res==1){
                low=mid+1;
            }
        }
    }

    private int guess(int num){
        return -Integer.compare(num, i);
    }
}
