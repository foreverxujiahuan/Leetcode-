package lc150;

import java.util.Stack;

public class Solution {
    public static int evalRPN(String[] tokens){
        Stack<String> stack = new Stack<>();
        int l = tokens.length;
        for(int i=0;i<l;i++){
            if(!tokens[i].equals("*")&&!tokens[i].equals("+")&&!tokens[i].equals("-")&&!tokens[i].equals("/")){
                stack.push(tokens[i]);
            }else {
                String a = stack.pop();
                String b = stack.pop();
                int aa = Integer.valueOf(a);
                int bb = Integer.valueOf(b);
                int cc;
                if(tokens[i].equals("*")){
                    cc = aa*bb;
                }else if(tokens[i].equals("/")){
                    cc = bb/aa;
                }else if(tokens[i].equals("+")){
                    cc = aa+bb;
                }else {
                    cc = bb-aa;
                }
                String c = String.valueOf(cc);
                stack.push(c);
            }
        }
        String t = stack.pop();
        return Integer.valueOf(t);
    }
    public static void main(String[] args){
        String tokens[] = {"0","3","/"};
        int res = evalRPN(tokens);
        System.out.println(res);
    }
}
