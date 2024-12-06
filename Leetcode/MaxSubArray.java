package Leetcode;

public class MaxSubArray {
    public static void main(String[] args) {

        int[] nums={-2,1,-3,4,-1,2,1,-5,4};

        int sum=0;
        int max=0;
        for (int i:nums) {
            sum+=i;
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max);

    }

}
