package Leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums={1,1,0,1,1,1};
        int count=0;

        ArrayList<Integer> store=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                count++;
            }
            if(nums[i]==0){
                store.add(count);
                count=0;
            }
            store.add(count);
        }
        Collections.sort(store);
        System.out.println(store.get(store.size()-1));

    }
}
