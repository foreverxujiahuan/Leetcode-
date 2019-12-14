package lc17;

import java.util.LinkedList;
import java.util.List;

public class Solution2 {
    public static List<String> leeterCombinations(String digits){
        LinkedList<String> res = new LinkedList<String>();
        if(digits.isEmpty()){
            return res;
        }
        String[] mapping = new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        res.add("");
        for(int i=0;i<digits.length();i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while (res.peek().length()==i){
                String t = res.remove();
                for(char s:mapping[x].toCharArray()){
                    res.add(t+s);
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        String digits = new String("234");
        List<String> res = leeterCombinations(digits);
        System.out.println(res);
    }
}
