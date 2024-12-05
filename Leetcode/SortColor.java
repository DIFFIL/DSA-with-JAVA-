package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class SortColor {
    public static void main(String[] args) {

        int[] nums ={2,0,2,1,1,0};

        int low=0;
        int high=nums.length-1;
        int mid=0;
        int temp=0;

        while(mid<=high){
            if(nums[mid]==0) {
                temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else if(nums[mid]==2){
                temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;

                high--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
