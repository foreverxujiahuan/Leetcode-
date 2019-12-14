package lc57;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] insert(int[][] intervals,int[] newInterval){
        List<Integer> list = new ArrayList<>();
        int l = intervals.length;
        for(int i=0;i<l;i++){
            for(int j=intervals[i][0];j<=intervals[i][1];j++){
                if(!list.contains(j)){
                    list.add(j);
                }
            }
        }
        for(int j=newInterval[0];j<=newInterval[1];j++){
            if(!list.contains(j)){
                list.add(j);
            }
        }
        int start = list.get(0);
        int end = list.get(0);
        List<List<Integer>> temp = new ArrayList<>();
        int leng = list.size();
        for(int i=1;i<leng;i++){
            if(list.get(i-1)+1==list.get(i)){
                end = list.get(i);
            }else {
                List<Integer> t = new ArrayList<>();
                t.add(start);
                t.add(end);
                temp.add(t);
                start = list.get(i);
            }
        }
        List<Integer> t = new ArrayList<>();
        t.add(start);
        t.add(end);
        temp.add(t);
        int[][] res = new int[temp.size()][2];
        for(int i=0;i<temp.size();i++){
            res[i][0] = temp.get(i).get(0);
            res[i][1] = temp.get(i).get(1);
        }
        return res;
    }
}
