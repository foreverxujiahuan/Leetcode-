package lc20;

import java.util.Stack;

public class Solution {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        int l = s.length();
        if(l==0){
            return true;
        }
        if(l%2==1||s.charAt(0)=='}'||s.charAt(0)==']'||s.charAt(0)==')'){
            return false;
        }
        if(s.charAt(l-1)=='('||s.charAt(l-1)=='{'||s.charAt(l-1)=='['){
            return false;
        }
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else {
                Character t = stack.pop();
                if(t=='('&&s.charAt(i)!=')'){
                    return false;
                }
                if(t=='['&&s.charAt(i)!=']'){
                    return false;
                }
                if(t=='{'&&s.charAt(i)!='}'){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s = "{[]}";
        System.out.println(isValid(s));
    }
}
