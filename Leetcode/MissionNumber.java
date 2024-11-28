package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class MissionNumber {
    public static void main(String[] args) {
        int[] nums={0,1};
        int n=nums.length;
        int a=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                System.out.println(i);
            }
        }
        System.out.println(nums.length);
    }
}
