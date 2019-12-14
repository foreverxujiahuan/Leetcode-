package lc04;

public class Solution2 {
    public static void main(String[] args){
        int nums1[] = {1,2};
        int nums2[] = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1,int[] nums2){
        int l1 = nums1.length;
        int l2 = nums2.length;
        int i = 0;
        int j = 0;
        int nums[] = new int[l1+l2];
        int k = 0;
        while (i<l1||j<l2){
            if(i>=l1){
                nums[k] = nums2[j];
                j++;
            }
            else if(j>=l2){
                nums[k] = nums1[i];
                i++;
            }
            else if(nums1[i]<=nums2[j]){
                nums[k] = nums1[i];
                i++;

            }else {
                nums[k] = nums2[j];
                j++;
            }
            k++;
        }
        int mid = (l1+l2)/2;
        if((l1+l2)%2==0){
            return (nums[mid]+nums[mid-1])/2.0;
        }else {
            return nums[mid];
        }
    }
}
