package lc415;

import java.util.HashMap;
import java.util.Hashtable;

public class Solution {
    public static void main(String[] args){
        String num1 = "456";
        String num2 = "123";
        String res = addStrings(num1,num2);
        System.out.println(res);
    }
    private static String addStrings(String num1,String num2){
        Hashtable<Character,Integer> hs = new Hashtable<>();
        hs.put('0',0);hs.put('1',1);hs.put('2',2);hs.put('3',3);
        hs.put('4',4);hs.put('5',5);hs.put('6',6);hs.put('7',7);
        hs.put('8',8);hs.put('9',9);
        int l1 = num1.length();
        int l2 = num2.length();
        int temp[] = new int[Math.max(l1,l2)+1];
        int i = l1-1;
        int j = l2-1;
        while (i>=0||j>=0){
            int add = 0;
            if(i>=0) add = add+hs.get(num1.charAt(i));
            if(j>=0) add = add+hs.get(num2.charAt(j));
            int p1 = Math.max(i,j);
            int p2 = Math.max(i,j)+1;
            int s = add+temp[p2];
            temp[p1] += s/10;
            temp[p2] = s%10;
            i--;
            j--;
        }
        StringBuilder res = new StringBuilder("");
        for(int k=0;k<temp.length;k++){
            res.append(temp[k]);
        }
        if(res.charAt(0)=='0') res.delete(0,1);
        if(res.length()==0) return "0";
        return res.toString();
    }
}
