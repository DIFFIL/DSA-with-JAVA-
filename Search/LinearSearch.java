package Search;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre arr length");
        int n=sc.nextInt();
        System.out.println("entre items");
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("entre item to be searched");
        int item=sc.nextInt();
        int pos=linear(arr , item);
        if(pos==-1){
            System.out.println("item not found");
        }
        else{
            System.out.println("item is found at "+pos+" position");
        }
        sc.close();
    }


    static int linear(int[] arr, int num){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                return i+1;
            }
        }
        return -1;
    }

}