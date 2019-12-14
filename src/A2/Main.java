package A2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String strs[] = s.split(" ");
        int l = strs.length;
        for(int i=l-1;i>=0;i--){
            System.out.printf("%s ",strs[i]);
        }
    }
}
