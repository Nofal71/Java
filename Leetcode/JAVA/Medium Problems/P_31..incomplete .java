public class P_31..incomplete  {
    public static void nextPermutation(int[] nums) {

        int pivot = -1;
        boolean pivotFound = false;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                pivotFound = true;
                break;
            }
        }

        if (!(pivotFound)) {

            reverse(nums, 0, nums.length - 1);
        }

        int min = Integer.MAX_VALUE;
        int index = 0;

        for (int i = pivot + 1; i < nums.length; i++) {
            if (min > nums[i] && nums[i] > nums[pivot]) {
                min = nums[i];
                index = i;
            }
        }

        int temp = nums[pivot];
        nums[pivot] = nums[index];
        nums[index] = temp;

        reverse(nums, pivot + 1, nums.length - 1);

        for (int x : nums) {
            System.out.println(x);
        }

    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        nextPermutation(nums);
    }

}
