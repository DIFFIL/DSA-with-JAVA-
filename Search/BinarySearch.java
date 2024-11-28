package Search;

public class BinarySearch {
    public static void main(String[] args) {
    int[] arr={1 ,3, 3, 5, 6, 6, 7, 8, 9, 9};
    int target=1;
        int result= binarysearch(arr,target);
        if(result==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found at "+result+" position");
        }
    }

    static public int binarysearch(int[] arr, int target){

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
