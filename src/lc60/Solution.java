package lc60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class Solution {
    public static String getPermutation(int n,int k){
        Hashtable<Integer,String> hs = new Hashtable<>();
        hs.put(1,"1");hs.put(2,"12");hs.put(3,"123");hs.put(4,"1234");
        hs.put(5,"12345");hs.put(6,"123456");hs.put(7,"1234567");hs.put(8,"12345678");
        hs.put(9,"123456789");
        char[] s = hs.get(n).toCharArray();
        String[] table = new String[f(n)];
        List<String> list = new ArrayList<>();
        perm(0,s.length,s,list);
        for(int i=0;i<table.length;i++){
            table[i] = list.get(i);
        }
        Arrays.sort(table);
        return table[k-1];
    }
    private static int f(int n){
        int res = 1;
        for(int i=1;i<=n;i++) res = res*i;
        return res;
    }
    private static void perm(int begin, int end,char[] s,List<String> list){
        if(begin==end){
            list.add(String.valueOf(s));
        }else {
            int i= begin;
            for(int j=begin;j<end;j++){
                {char t = s[i];s[i]=s[j];s[j]=t;}
                perm(begin+1,end,s,list);
                {char t = s[i];s[i]=s[j];s[j]=t;}
            }
        }
    }
    public static void main(String[] args){
        int n = 4;
        int k = 9;
        System.out.println(getPermutation(n,k));
    }
}
