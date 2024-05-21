import java.lang.reflect.Array;
import java.util.Arrays;

public class P_3131 {
    public static int addedInteger(int[] nums1, int[] nums2) {
        int x = 0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for(int i = 0 ; i < nums2.length ; i++){
            x = nums2[i] - nums1[i];
        }
            
     
        return x;

    }

    public static void main(String[] args) {
        int[] nums1 = { 9 , 2 };
        int[] nums2 = { 646,653 };
        System.out.println(addedInteger(nums1, nums2));
    }
}
