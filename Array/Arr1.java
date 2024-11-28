package Array;
import java.util.*;
import java.util.Arrays;

public class Arr1 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    int[] arr1=new int[5];
  
    
    int[] arr2={1,2,3,4};

    for (int i = 0; i < arr1.length; i++) {
        arr1[i]=sc.nextInt();
    }

    for (int j : arr1) {         //first way to print array
        System.out.println(j);
    }

    System.out.println(Arrays.toString(arr2));          //second way to print array


    for (int i : arr2) {                        //third way to print array
        System.out.println(i);
    }
   

sc.close();
}
    
}