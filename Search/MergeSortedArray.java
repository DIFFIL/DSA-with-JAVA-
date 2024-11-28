package Search;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 9, 0, 0, 0, 0};
        int[] nums2 = {5, 6, 8, 10};

        int m = 5;
        int n = 4;

        merge(nums1, m, nums2, n);
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = 0;
        System.out.println(m+n);
        for (int i = m; i < m+n; i++) {
            nums1[i] = nums2[a];
            a++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}

