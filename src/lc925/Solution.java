package lc925;

public class Solution {
    public static boolean isLongPressedName(String name,String typed){
        int l = name.length();
        int l2 = typed.length();
        int index = 0;
        int index2 = 0;
        while (index<l){
            int n = 1;
            char ch = name.charAt(index);
            while (index+1<l&&name.charAt(index+1)==ch){
                index++;
                n++;
            }
            if(index2>=l2){
                return false;
            }
            char ch2 = typed.charAt(index2);
            int n2 = 1;
            while (index2+1<l2&&typed.charAt(index2+1)==ch2){
                index2++;
                n2++;
            }
            if(n2<n||ch!=ch2){
                return false;
            }
            index=index+1;
            index2=index2+1;
        }
        return true;
    }
    public static void main(String[] args){
        String name = "pyplrz";
        String typed = "ppyypllr";
        boolean res = isLongPressedName(name,typed);
        System.out.println(res);
    }
}
