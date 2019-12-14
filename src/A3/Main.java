package A3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int index1 = 0;
        int res = 0;
        for(int i=a;i<=b;i++){
            if(i%c==0){
                index1 = i;
                res = 1;
                break;
            }
        }
        while (index1<=b){
            index1 = index1+c;
            if(index1<=b){
                res = res+1;
            }
        }
        System.out.println(res);
    }
}
