package lc18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<List<Integer>> fourSum(int[] nums,int target){
        int l = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if(l<4){
            return res;
        }
        Arrays.sort(nums);
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                int find = target-nums[i]-nums[j];
                int left = 0;
                int right = l-1;
                while (left!=right){
                    if(left==i||left==j)
                        left++;
                    if(right==i||right==j)
                        right--;
                    if(nums[left]+nums[right]==find&&left!=i&&left!=j&&right!=i&&right!=j&&left!=right){
                        int[] temp = {nums[i],nums[j],nums[left],nums[right]};
                        Arrays.sort(temp);
                        List<Integer> t = new ArrayList<>();
                        t.add(temp[0]);
                        t.add(temp[1]);
                        t.add(temp[2]);
                        t.add(temp[3]);
                        if(!res.contains(t)){
                            res.add(t);
                        }
                        left=left+1;
                        right=right-1;
                    }else if(nums[left]+nums[right]<find){
                        left=left+1;
                    }else if(nums[left]+nums[right]>find){
                        right=right-1;
                    }
                    if(left>right){
                        break;
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> res = fourSum(nums,target);
        System.out.println(res);
    }
}
