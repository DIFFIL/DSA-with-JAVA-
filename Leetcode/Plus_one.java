package Leetcode;

import java.util.Arrays;

public class Plus_one {
    public static void main(String[] args) {
int[] digits={5,6,2,0,0,4,6,2,4,9};
int count=0;
long a=0;
long sum=0;

        for (int digit : digits) {
            sum = sum * 10 + digit;
        }
        System.out.println(sum);
        sum=sum+1;
        System.out.println(sum);
        long sum_copy=sum;
//        long temp=sum;
        while(sum>0){
            count++;
           sum=sum/10;
        }
        System.out.println(count);
        int[] result=new int[count];

            while(sum_copy>0){

                a=sum_copy%10;
                System.out.println(a);
                sum_copy=sum_copy/10;
                result[count-1]=(int)a;
                count--;

            }


        System.out.println(Arrays.toString(result));
//        System.out.println(Arrays.toString(result2));
    }
}
