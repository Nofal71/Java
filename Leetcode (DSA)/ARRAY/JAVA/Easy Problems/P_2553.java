import java.util.ArrayList;
import java.util.List;

public class P_2553 {
    public static int[] separateDigits(int[] nums) {
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 10) {
                arr.add(nums[i]);
            } else {
                arr.add(nums[i] / 10);
                arr.add(nums[i] % 10);
            }
        }

        int[] array = new int[arr.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = arr.get(i);
        }

        return array;

    }

    public static void main(String[] args) {
        int[] nums = { 13, 25, 83, 77 };
        int[] result = separateDigits(nums);
        for (int x : result) {
            System.out.println(x);
        }
    }
}
