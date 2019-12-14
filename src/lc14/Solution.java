package lc14;

public class Solution {
    public static String longestCommonPrefix(String[] strs){
        StringBuilder res = new StringBuilder("");
        if(strs.length==0){
            return res.toString();
        }
        int flag=0;
        int l = strs[0].length();
        for(int i=0;i<l;i++){
            for(int j=0;j<strs.length;j++){
                if(strs[j].length()<i+1){
                    flag=1;
                    break;
                }
                if(strs[j].charAt(i)!=strs[0].charAt(i)){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                res.append(strs[0].charAt(i));
            }else {
                break;
            }
        }
        return res.toString();
    }
    public static void main(String[] args){
        String[] strs = {"aa","a"};
        String res = longestCommonPrefix(strs);
        System.out.println(res);
    }
}
