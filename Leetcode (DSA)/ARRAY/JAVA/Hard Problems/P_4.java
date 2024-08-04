import java.lang.reflect.Array;
import java.util.Arrays;

public class P_4 {
    
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;

        int[] array = new int[length];
        int ind = 0;
        for (int i = 0; i <= length - 1; i++) {
            if (i < nums1.length) {
                array[i] = nums1[i];
            } else {
                array[i] = nums2[ind];
                ind++;
            }
        }

        Arrays.sort(array);
        int temp1 = (array.length / 2) - 1;
        int temp2 = (array.length / 2);
        double ans = array[temp2] ;

        if(array.length % 2 == 0){
             ans = (array[temp1] + array[temp2]) / 2.0 ;
        }
        return ans ;

    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3 , 4 };
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
