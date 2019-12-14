package lc34;

public class Solution {
    public static int[] searchRange(int[] nums,int target){
        int l = nums.length;
        if(l==0){
            return new int[] {-1,-1};
        }
        if(l==1){
            if(nums[0]==target){
                return new int[] {0,0};
            }else {
                return new int[] {-1,-1};
            }
        }
        int index = binarysearch(nums,target);
        if(index == -1){
            return new int[] {-1,-1};
        }
        int temp1 = index;
        while (temp1+1<l&& nums[temp1+1]==target){
            temp1++;
        }
        int temp2 = index;
        while (temp2-1>=0&&nums[temp2-1]==target){
            temp2--;
        }
        return new int[] {temp2,temp1};
    }
    private static int binarysearch(int nums[],int target){
        int high = nums.length-1;
        int low = 0, mid;
        while(low <= high){
            mid = low + (high - low) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int nums[] = {2,2};
        int target = 2;
        int res[] = searchRange(nums,target);
        System.out.printf("%d %d",res[0],res[1]);
    }
}
