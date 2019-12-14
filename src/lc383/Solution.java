package lc383;

import java.util.HashMap;

public class Solution {
    public static boolean canConstruct(String ransomNote,String magazine){
        HashMap<Character,Integer> hs = new HashMap<>();
        hs.put('a',0);
        hs.put('b',0);
        hs.put('c',0);
        hs.put('d',0);
        hs.put('e',0);
        hs.put('f',0);
        hs.put('g',0);
        hs.put('h',0);
        hs.put('i',0);
        hs.put('j',0);
        hs.put('k',0);hs.put('l',0);hs.put('m',0);hs.put('n',0);
        hs.put('o',0);hs.put('p',0);hs.put('q',0);hs.put('r',0);
        hs.put('s',0);hs.put('t',0);hs.put('u',0);hs.put('v',0);
        hs.put('w',0);hs.put('x',0);hs.put('y',0);hs.put('z',0);
        int l = magazine.length();
        for(int i=0;i<l;i++){
            Character character = magazine.charAt(i);
            int t = hs.get(character);
            t=t+1;
            hs.put(character,t);
        }
        for(int i=0;i<ransomNote.length();i++){
            Character character = ransomNote.charAt(i);
            int t = hs.get(character);
            t=t-1;
            hs.put(character,t);
            if(hs.get(character)<0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args){
        String ransomNote = new String("aa");
        String magazine = new String("aab");
        System.out.println(canConstruct(ransomNote,magazine));
    }
}
