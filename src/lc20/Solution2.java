package lc20;

import java.util.Stack;

public class Solution2 {
    public static boolean isValid(String s){
        int l = s.length();
        if(l==0) return true;
        if(l%2==1) return false;
        Stack<Character> stack = new Stack<>();
        if(s.charAt(0)==')'||s.charAt(0)=='}'||s.charAt(0)==']'||s.charAt(l-1)=='('||s.charAt(l-1)=='['||s.charAt(l-1)=='{') return false;
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }else {
                Character ch = stack.pop();
                if(ch=='('&&s.charAt(i)!=')') return false;
                if(ch=='['&&s.charAt(i)!=']') return false;
                if(ch=='{'&&s.charAt(i)!='}') return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s = "([)]";
        System.out.println(isValid(s));
    }
}
