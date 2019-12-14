package lc15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        int l = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<l;i++){
            int left=0;
            int right=l-1;
            int find = -nums[i];
            while (left!=right){
                if(nums[left]+nums[right]>find){
                    right=right-1;
                }
                else if(nums[left]+nums[right]<find){
                    left=left+1;
                }else if(nums[left]+nums[right]==find&&left!=i&&right!=i) {
                    int[] temp = {nums[left],nums[right],nums[i]};
                    Arrays.sort(temp);
                    List<Integer> t = new ArrayList<>();
                    t.add(temp[0]);
                    t.add(temp[1]);
                    t.add(temp[2]);
                    if(!res.contains(t)){
                        res.add(t);
                    }
                    left=left+1;
                    right=right-1;
                }if(left>=right||right>l-1||left<0){
                    break;
                }if(left==i){
                    left++;
                }if(right==i){
                    right--;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums = {3,0,-2,-1,1,2};
        List<List<Integer>> res = threeSum(nums);
        System.out.println(res);
    }
}
