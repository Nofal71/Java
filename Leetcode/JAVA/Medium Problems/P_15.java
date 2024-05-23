import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class P_15 {
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                for (int k = 0; k < nums.length; k++) {
                    List<Integer> group = new ArrayList<>();
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        group.add(nums[i]);
                        group.add(nums[j]);
                        group.add(nums[k]);
                        Collections.sort(group);
                        if (!(ans.contains(group)) && i != j && j != i) {
                            ans.add(group);
                        }
                    }

                }
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(nums));
    }
}
