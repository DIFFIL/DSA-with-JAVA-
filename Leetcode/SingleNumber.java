package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class SingleNumber {
    public static void main(String[] args) {

        int[] nums = {4,1,2,1,2};
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i+=2) {
            if(nums[i]!=nums[i+1]){
                System.out.println(nums[i]);
            }
        }

        System.out.println(nums[nums.length-1]);



    }
}



