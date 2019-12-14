package lc06;

public class Solution {
    public static String convert(String s,int numRows){
        if(numRows==1){
            return s;
        }
        int row = 0;
        StringBuilder[] temp = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            temp[i] = new StringBuilder("");
        }
        int l = s.length();
        int step=0;
        for(int i=0;i<l;i++){
            if(row==0){
                step=1;
            }
            if(row==numRows-1){
                step=-1;
            }
            temp[row] = temp[row].append(s.charAt(i));
            row = row+step;
        }
        StringBuilder res = new StringBuilder("");
        for(int i=0;i<numRows;i++){
            res.append(temp[i]);
        }
        return res.toString();
    }
    public static void main(String[] args){
        String s = new String("PAYPALISHIRING");
        int nums = 3;
        String res = convert(s,nums);
        System.out.println(res);
    }
}
