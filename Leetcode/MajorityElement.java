package Leetcode;

public class MajorityElement {
    public static void main(String[] args) {

        int[] nums={2,2,1,1,1,1,2};

        int count=0;
        int el=0;

        for (int num : nums) {
            if (count == 0) {
                el = num;
                count++;
            } else if (num == el) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(el);
    }
}
