package lc12;

public class Solution {
    public static String intToRoman(int num){
        int[] Value = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] Symbol = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int l = Value.length;
        StringBuilder res = new StringBuilder("");
        for(int i=0;i<l;i++){
            while (num>=Value[i]){
                num = num-Value[i];
                res.append(Symbol[i]);
            }
        }
        return res.toString();
    }
    public static void main(String[] args){
        int n = 10;
        String res = intToRoman(n);
        System.out.println(res);
    }
}
