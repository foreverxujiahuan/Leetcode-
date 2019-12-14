package lc66;

public class lc66 {
    public static int[] plusOne(int[] digits){
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }
        int[] newNumber = new int [n+1];
        newNumber[0] = 1;
        return newNumber;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3};
        int[] res = plusOne(arr);
        System.out.println(res);
        for(int i=0;i<=res.length-1;i++){
            System.out.print(res[i]);
        }
    }
}
