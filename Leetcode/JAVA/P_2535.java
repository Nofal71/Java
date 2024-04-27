public class P_2535 {
    public static int differenceOfSum(int[] nums) {
        int size = nums.length;
        int elemntSum = 0;
        int digitSum = 0;

        for (int i = 0; i < size; i++) {
            elemntSum += nums[i];
        }

        for (int i = 0; i < size; i++) {
            if (nums[i] > 9) {
                while (nums[i] != 0) {
                    digitSum += nums[i] % 10;
                    nums[i] /= 10;
                }
            }

            digitSum += nums[i];
        }

        return elemntSum - digitSum;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(differenceOfSum(nums));

    }
}
