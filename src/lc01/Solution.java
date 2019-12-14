package lc01;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Solution {
    public static int[] twoSum(int[] nums,int target){
        for (int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static int[] twoSum2(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        int l = nums.length;
        for(int i=0;i<l;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<l;i++){
            int k = target-nums[i];
            if(map.containsKey(k)&&map.get(k)!=i){
                return new int[] {i,map.get(k)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = twoSum2(nums,target);
        System.out.println(res);
    }
}
