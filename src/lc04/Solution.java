package lc04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static double findMedianSortedArrays(int[] nums1,int[] nums2){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            list.add(nums2[j]);
        }
        Collections.sort(list);
        int l = list.size();
        if(l%2==1){
            return (double)list.get(l/2);
        }
        return (double)(list.get(l/2)+list.get((l/2)-1))/2;
    }
    public static void main(String[] args){
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
