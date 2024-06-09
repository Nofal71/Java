import java.util.Arrays;

public class P_27 {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = -10;
                count++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return Math.abs(count - nums.length);
        // return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;

        System.out.println(removeElement(nums, val));
        // int[] test = removeElement(nums, val);
        // for (int x : test) {
        //     System.out.println(x);
        // }
    }
}
