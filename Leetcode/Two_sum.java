package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Two_sum {
    public static void main(String[] args) {

                int[] nums ={3,2,4};
                int target = 6;




                int[] result =new int[2];
                HashMap<Integer,Integer> map=new HashMap<>();


                int check=0;
                for(int i=0;i<nums.length;i++){

                    check=target-nums[i];
                    if(map.containsKey(check) && map.get(target-nums[i])!=i){
                        result[0]=map.get(target-nums[i]);
                        result[1]=i;
                        break;
                    }
                    map.put(nums[i],i);
                }

        System.out.println(Arrays.toString(result));
            }
        }


