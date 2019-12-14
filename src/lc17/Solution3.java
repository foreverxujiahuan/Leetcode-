package lc17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Solution3 {
    private static List<String> letters = new ArrayList<>();
    public static void leeterCombinations(String digits) {
        HashMap<String, String> phone = new HashMap<>();
        phone.put("2", "abc");
        phone.put("3", "def");
        phone.put("4", "ghi");
        phone.put("5", "jkl");
        phone.put("6", "mno");
        phone.put("7", "pqrs");
        phone.put("8", "tuv");
        phone.put("9", "wxyz");
        //存放数字
        String[] digitArr = digits.split("");
        //存放数字对应的字符串
        String[] strings = new String[digitArr.length];
        for (int i = 0; i < digitArr.length; i++) {
            strings[i] = phone.get(digitArr[i]);
        }
        List<String[]> strList=new ArrayList<>();
        for(String s:strings){
            strList.add(s.split(""));
        }
        test(strList,strList.get(0),"");
    }
    public static void test(List<String[]> list, String[] arr, String str)
    {
        for (int i = 0; i < list.size(); i++)
        {
            //取得当前的数组
            if (i == list.indexOf(arr))
            {
                //迭代数组
                for (String st : arr)
                {
                    st = str + st;
                    if (i < list.size() - 1)
                    {
                        test(list, list.get(i + 1), st);
                    }
                    else if (i == list.size() - 1)
                    {
                        letters.add(st);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        String digits = "222";
        leeterCombinations(digits);
        System.out.println(letters);    }
}
