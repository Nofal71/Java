public class two {

    public static void Zero(int[] array, int size) {

        int[] ans = new int[size];
        for (int i = 0; i < size; i++) {
            ans[i] = array[array[i]];
            if (array[i] == 0) {
                ans[i] = array[0];
            }
        }
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, 2, 3, 0 };
        int size = nums.length;
        Zero(nums, size);

    }
}
