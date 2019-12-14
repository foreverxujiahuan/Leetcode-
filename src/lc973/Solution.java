package lc973;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class Solution {
    public static int[][] kClosest(int[][] points,int K){
        HashMap<Double,Integer> hs = new HashMap<>();
        double[] d = new double[points.length];
        int l = points.length;
        for(int i=0;i<l;i++){
            hs.put(Math.sqrt(points[i][0]*points[i][0]+points[i][1]*points[i][1]),i);
            d[i] = Math.sqrt(points[i][0]*points[i][0]+points[i][1]*points[i][1]);
        }
        Arrays.sort(d);
        int[][] res = new int[K][2];
        for(int i=0;i<K;i++){
            int index = hs.get(d[i]);
            res[i][0] = points[index][0];
            res[i][1] = points[index][1];
        }
        return res;
    }
    public static void main(String[] args){
        int[][] points = {{3,3},{5,-1},{-2,4}};
        int[][] res = kClosest(points,0);
        System.out.println(res[0][0]);
        System.out.println(res[0][1]);
        System.out.println(res[1][0]);
        System.out.println(res[1][1]);
    }
}
