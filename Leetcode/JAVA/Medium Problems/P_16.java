public class P_16 {
    public static int threeSumClosest(int[] nums, int target) {
        int coleset = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    int temp = Math.abs(sum - target);
                    if (coleset > temp) {
                        coleset = temp;
                        ans = sum;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2 };
        int target = 0;
        System.out.println(threeSumClosest(nums, target));
    }
}
