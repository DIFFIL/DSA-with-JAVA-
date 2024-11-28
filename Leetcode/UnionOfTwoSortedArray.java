package Leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 2, 4};
        ArrayList<Integer> copy=new ArrayList<>();
        int a=0;
        for (int i = 0; i < nums1.length+ nums2.length; i++) {



            if(i<nums1.length){
                if(!copy.contains(nums1[i])){
                    copy.add(nums1[i]);
                }

            }
            if(i>=nums1.length){
                if(!copy.contains(nums2[a])){
                    copy.add(nums2[a]);
                    a++;
                }

            }
//            if(copy.contains(nums1[i])) {
//                continue;
//            }
//            copy.add(nums1[i]);
        }
//        for (int i = 0; i < nums2.length; i++) {
//            if(copy.contains(nums2[i])) {
//                continue;
//            }
//            copy.add(nums2[i]);
//        }

        Collections.sort(copy);
        System.out.println(copy);



    }
}
