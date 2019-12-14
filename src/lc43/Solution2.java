package lc43;

public class Solution2 {
    public static String multiply(String num1,String num2){
        int l1 = num1.length();
        int l2 = num2.length();
        int temp[] = new int[l1+l2];
        for(int i=l1-1;i>=0;i--){
            for(int j=l2-1;j>=0;j--){
                int mul = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int p1 = i+j;
                int p2 = i+j+1;
                int s = temp[p2]+mul;
                temp[p2] = s%10;
                temp[p1] += s/10;
            }
        }
        StringBuilder res = new StringBuilder("");
        int l = temp.length;
        for(int i=0;i<l;i++){
            res.append(temp[i]);
        }
        while (res.length()>0&&res.charAt(0)=='0'){
            res.delete(0,1);
        }
        if(res.length()==0) return "0";
        return res.toString();
    }
    public static void main(String[] args){
        String num1 = "0";
        String num2 = "456";
        System.out.println(multiply(num1,num2));
    }
}
