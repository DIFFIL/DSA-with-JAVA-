package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,24,546,66,34,55};
        int n=arr.length;
        int temp=0;
        for (int i = 0; i < n-1;i++) {

            for (int j = 1; j <= n-1-i ; j++) {

                if(arr[j]<arr[j-1]){

                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }


}
