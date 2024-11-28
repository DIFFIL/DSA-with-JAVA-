package Leetcode;

import java.util.Arrays;

public class MoveZeroe {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int index=0;
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
            if(nums[i]==0){
                count++;
            }
        }
        for (int i = nums.length-count; i < nums.length; i++) {
            nums[i]=0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
