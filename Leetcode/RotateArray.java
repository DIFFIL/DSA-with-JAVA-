package Leetcode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int k=6;
        if(k>nums.length){
            k=k%nums.length;
        }
        int[] duplicate=new int[nums.length];
        int len=nums.length;

        for(int i=nums.length-1;i>=0;i--){
            duplicate[i]=nums[(len-k+i)%len];
        }

        System.arraycopy(duplicate, 0, nums, 0, nums.length);
        System.out.println(Arrays.toString(nums));
    }
}
