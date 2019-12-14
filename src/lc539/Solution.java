package lc539;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args){
        List<String> timePoints = new ArrayList<>();
        timePoints.add("05:31");
        timePoints.add("22:08");
        timePoints.add("00:35");
        int res = findMinDifference(timePoints);
        System.out.println(res);
        Collections.sort(timePoints);
        System.out.println(timePoints);
    }
    public static int findMinDifference(List<String> timePoints){
        Collections.sort(timePoints);
        int l = timePoints.size();
        int min = 20000;
        for(int i=0;i<l-1;i++){
            if(f(timePoints.get(i),timePoints.get(i+1))<min){
                min = f(timePoints.get(i),timePoints.get(i+1));
            }
        }
        if(f(timePoints.get(0),timePoints.get(l-1))<min){
            min = f(timePoints.get(0),timePoints.get(l-1));
        }
        return min;
    }
    private static int f(String t1,String t2){
        int h1 = Integer.valueOf(t1.substring(0,2));
        int h2 = Integer.valueOf(t2.substring(0,2));
        int m1 = Integer.valueOf(t1.substring(3,5));
        int m2 = Integer.valueOf(t2.substring(3,5));
        int time1 = h1*60+m1;
        int time2 = h2*60+m2;
        int t = Math.abs(time1-time2);
        int res = Math.min(t,Math.abs(60*24-t));
        return res;
    }
}
