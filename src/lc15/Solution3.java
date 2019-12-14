package lc15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution3 {
    public static List<List<Integer>> thresSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int l = nums.length;
        for(int i=0;i<l;i++){
            int target = nums[i];
            int left = 0;
            int right = l-1;
            while (left<right){
                if(left!=i&&right!=i&&nums[left]+nums[right]+target==0){
                    List<Integer> temp = new ArrayList<>();
                    int[] t = {nums[i],nums[left],nums[right]};
                    Arrays.sort(t);
                    temp.add(t[0]);
                    temp.add(t[1]);
                    temp.add(t[2]);
                    if(!res.contains(temp))
                        res.add(temp);
                }
                if(nums[left]+nums[right]+target>0){
                    right--;
                }else {
                    left++;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        int nums[] = {-3,0,-2,-1,1,2};
        System.out.println(thresSum(nums));
    }
}
