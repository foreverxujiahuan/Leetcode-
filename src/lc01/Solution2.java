package lc01;

import java.util.Hashtable;

public class Solution2 {
    public static int[] twoSum(int[] nums,int target){
        Hashtable<Integer,Integer> hs = new Hashtable<>();
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int t = target-nums[i];
            if(hs.containsKey(t)){
                int j = hs.get(t);
                if(i!=j){
                    return new  int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("no Solution");
    }
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int[] res = twoSum(nums,9);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
