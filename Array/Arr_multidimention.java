package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arr_multidimention {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        
        int[][] arr2D={                                                  //1st way of input
            {1,2,3},    
            {4,5},     
            {6,7,8,9}   
        };
         
        for (int row = 0; row < arr2D.length; row++) {                        
            for (int col = 0; col < arr2D[row].length; col++) {

                System.out.print(arr2D[row][col]);


            }
            System.out.println();

        }

        int[][] arr=new int[3][3];                                          

        for (int row = 0; row < arr.length; row++) {                        //2nd way of input
            for (int col = 0; col < arr[row].length; col++) {

                arr[row][col]=sc.nextInt();

            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {               //1st way to print
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }


        for (int row = 0; row < arr.length; row++) {                        //2nd way to print
            System.out.println(Arrays.toString(arr[row]));
        }
        

        for (int[] is : arr) {                                              //3rd way to print
            System.out.println(Arrays.toString(is));
        }

        




        sc.close();
    }
}
