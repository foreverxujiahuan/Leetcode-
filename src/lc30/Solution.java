package lc30;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> list = new ArrayList<>();
    public static void perm(String[] strs,int begin,int end){
        if(begin==end){
            StringBuilder temp = new StringBuilder("");
            for(int i=0;i<strs.length;i++){
                temp.append(strs[i]);
            }
            list.add(temp.toString());
        }else {
            int i=begin;
            for(int num=begin;num<end;num++){
                {String temp = strs[num];strs[num]=strs[i];strs[i] = temp;}
                perm(strs,begin+1,end);
                {String temp = strs[num];strs[num]=strs[i];strs[i] = temp;}
            }
        }
    }
    public static List<Integer> findSubstring(String s,String[] words){
        List<Integer> res = new ArrayList<>();
        if(s.length()==0||words.length==0){
            return res;
        }
        perm(words,0,words.length);
        int l=0;
        for(int i=0;i<words.length;i++){
            l=l+words[i].length();
        }
        for(int i=0;i<s.length()-l+1;i++){
            for(int j=0;j<list.size();j++){
                if(list.get(j).equals(s.substring(i,i+l))){
                    res.add(i);
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        String s = new String("aaa");
        String[] words = {"a","b"};
        System.out.println(findSubstring(s,words));
        System.out.println(list);
    }
}
