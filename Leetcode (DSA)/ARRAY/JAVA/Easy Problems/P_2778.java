import java.util.ArrayList;
import java.util.List;

public class P_2778 {

    public static int sumOfSquares(int[] nums) {
            int n = nums.length;
            int sum = 0;
        
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) { 
                    int index = i - 1; 
                    sum += nums[index] * nums[index]; 
                }
            }
        
            return sum;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(sumOfSquares(nums));
    }

}
