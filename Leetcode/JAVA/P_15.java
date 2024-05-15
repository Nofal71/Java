import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P_15 {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    List<Integer> g = new ArrayList<>();

                    if (nums[i] + nums[j] + nums[k] == 0) {
                        g.add(nums[i]);
                        g.add(nums[j]);
                        g.add(nums[k]);
                        if(!(ans.contains(g))){
                            ans.add(g);
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
