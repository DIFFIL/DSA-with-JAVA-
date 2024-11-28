package Array;

import java.util.Scanner;

public class ArrReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
       Reverse(arr);
        sc.close();
    }

    public static void Reverse(int[] arr){
        int temp=0;
        int start=0;
        int end=arr.length-1;
       while(start<end){
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
       }

       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
       }
    }
    
        
    }

