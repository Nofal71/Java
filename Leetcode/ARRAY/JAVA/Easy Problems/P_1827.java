public class P_1827 {
    public static int minOperations(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                int temp = (nums[i] - nums[i + 1]) + 1;
                nums[i + 1] += temp;
                count += temp;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 5, 2, 4, 1 };
        // int[] result = minOperations(nums);
        System.out.println(minOperations(nums));
        // for (int x : result) {
        // System.out.println(x);
        // }
    }
}
