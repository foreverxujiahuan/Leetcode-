package lc1189;

public class Solution {
    public static void main(String[] args){
        String text = "leetcode";
        int res = maxNumberOfBalloons(text);
        System.out.println(res);
    }
    public static int maxNumberOfBalloons(String text){
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        int leng = text.length();
        for(int i=0;i<leng;i++){
            if(text.charAt(i)=='a'){
                a++;
            }else if(text.charAt(i)=='b'){
                b++;
            }else if(text.charAt(i)=='l'){
                l++;
            }else if(text.charAt(i)=='o'){
                o++;
            }else if(text.charAt(i)=='n'){
                n++;
            }
        }
        int min = Integer.MAX_VALUE;
        if(b<min){
            min = b;
        }
        if(a<min){
            min = a;
        }
        if((l/2)<min){
            min = l/2;
        }
        if((o/2)<min){
            min = o/2;
        }
        if(n<min){
            min = n;
        }
        return min;
    }
}
