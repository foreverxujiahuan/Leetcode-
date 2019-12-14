package lc97;

public class Solution {
    public static boolean isInterleave(String s1,String s2,String s3){
        int l1 = s1.length();
        int l2 = s2.length();
        int l3 = s3.length();
        int index1 = 0;
        int index2 = 0;
        for(int i=0;i<l3;i++){
            if(index1<l1&&s1.charAt(index1)==s3.charAt(i)){
                index1++;
            }else if(index2<l2&&s2.charAt(index2)==s3.charAt(i)){
                index2++;
            }else {
                System.out.println(i);
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        boolean res = isInterleave(s1,s2,s3);
        System.out.println(res);
    }
}
