public class P_3065 {
    public static int minOperations(int[] nums, int k) {
        int count = 0;
        
        while (true) {
            
            int smallest = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (smallest > nums[i] && nums[i] != 0) {
                    smallest = nums[i];
                }
            }

            if (smallest >= k) {
                break;
            }

            for (int j = 0; j < nums.length; j++) {
                if (smallest == nums[j]) {
                    nums[j] = 0;
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 11, 10, 1, 3 };
        int k = 10;
        int ans = minOperations(nums, k);
        System.out.println(ans);

    }
}
