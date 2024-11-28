package Search;

import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre no of array items");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("entre array items");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("entre item to be searched");
        int target=sc.nextInt();

        int result=0;

        int start=0;
        int last=arr.length-1;


        if(arr[start]>arr[last]){
            result=DecendingBS(arr,target);
            if(result==-1){
                System.out.println("item not found");
            }
            else {
                System.out.println("item found at " + result + " position");
            }
        }
        else {
            result =AscendingBS(arr,target);
            if(result==-1){
                System.out.println("item not found");
            }
            else {
                System.out.println("item found at " + result + " position");
            }
        }

    }

    static public int DecendingBS(int[] arr, int target){

        int first=0;
        int last=arr.length-1;

        while(first<=last){

            int mid=first+(last-first)/2;

            if(target==arr[mid]){
                return mid+1;
            }

            if(target>=arr[mid]){
                last=mid-1;

            }

            if(target<=arr[mid]){
                first=mid+1;
            }


        }

        return -1;

    }

    static public int AscendingBS(int[] arr, int target){

        int first=0;
        int last=arr.length-1;

        while(first<=last){

            int mid=first+(last-first)/2;

            if(target==arr[mid]){
                return mid+1;
            }

            if(target>=arr[mid]){
                first=mid+1;
            }

            if(target<=arr[mid]){
                last=mid-1;
            }


        }

        return -1;

    }
}
