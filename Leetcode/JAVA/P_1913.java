import java.util.Arrays;

public class P_1913 {
    public static int maxProductDifference(int[] nums) {
        int maxDiff = 0 ; 

        Arrays.sort(nums);

        maxDiff = -(nums[0] * nums[1]) + (nums[nums.length-1] * nums[nums.length-2]);


        return maxDiff;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 6, 2, 7, 4 };
        System.out.println(maxProductDifference(nums));
    }
}
