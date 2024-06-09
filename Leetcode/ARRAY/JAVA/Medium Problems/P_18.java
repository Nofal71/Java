import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P_18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                for (int k = j + 1; k < nums.length - 1; k++) {
                    if (k > j + 1 && nums[k] == nums[k - 1])
                        continue;
                    for (int l = k + 1; l < nums.length; l++) {
                        if (l > k + 1 && nums[l] == nums[l - 1])
                            continue;

                        long sum = (long) nums[i] + nums[j] + nums[k] + nums[l]; // Use long to prevent overflow

                        if (sum == target) {
                            ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        } else if (sum > target) {
                            break;
                        }
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1000000000, 1000000000, 1000000000, 1000000000 };
        int target = -294967296;
        System.out.println(fourSum(nums, target));
    }
}
