package lc01;

import java.util.Hashtable;

public class Solution3 {
    public static int[] twoSum(int[] nums,int target){
        Hashtable<Integer,Integer> hs = new Hashtable<>();
        int l = nums.length;
        for(int i=0;i<l;i++){
            hs.put(nums[i],i);
        }
        for(int i=0;i<l;i++){
            int t = target-nums[i];
            if(hs.containsKey(t)){
                if(hs.get(t)!=i){
                    return new  int[] {hs.get(t),i};
                }
            }
        }
        return null;
    }
    public static void main(String[] args){
        int nums[] = {2,5,5,11};
        int target = 10;
        int[] res = twoSum(nums,target);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
