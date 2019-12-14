package lc76;

public class Solution {
    public static void main(String[] args){
        String s = "aa";
        String t = "aa";
        String res = minWindow(s,t);
        System.out.println(res);
    }
    public static String minWindow(String s,String t){
        String res = new String("");
        if(t.length()>s.length()){
            return res;
        }
        int max = Integer.MAX_VALUE;
        int l = s.length();
        for(int i=0;i<l+1;i++){
            for(int j=i;j<l+1;j++){
                String A = s.substring(i,j);
                if(flag(A,t)){
                    if(j-i+1<max){
                        max = j-i+1;
                        res = A;
                    }
                }
            }
        }
        return res;
    }
    public static boolean flag(String A,String B){
        int LB = B.length();
        for(int i=0;i<LB;i++){
            if(!A.contains(B.substring(i,i+1))){
                return false;
            }else {
                A = A.replace(" ",B.substring(i,i+1));
            }
        }
        return true;
    }
}
