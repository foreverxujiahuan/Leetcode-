package A1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int res[] = re(nums);
        for(int i=0;i<n;i++){
            if(i!=n-1){
                System.out.printf("%d ",res[i]);
            }else {
                System.out.printf("%d",res[i]);
            }

        }
    }
    private static int[] re(int[] nums){
        int l = nums.length;
        int nums2[] = new int[l];
        for(int i=l-1;i>=0;i--){
            nums2[l-i-1] = nums[i];
        }
        return nums2;
    }
}
