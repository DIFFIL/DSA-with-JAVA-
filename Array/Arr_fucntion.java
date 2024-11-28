package Array;

import java.util.*;
import java.util.Arrays;

public class Arr_fucntion {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int[] arr={1,2,3,4};        //array declaration   

        System.out.println(Arrays.toString(arr));

        change(arr);
    

        System.out.println(Arrays.toString(arr));

        sc.close();
    }

    public static void change(int arr[]){
        arr[2]=69;
    }

    
}

