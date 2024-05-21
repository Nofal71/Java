import java.util.Arrays;

public class P_2656 {
    
    // Leetcode Problem Number 2656 

    public static int maximizeSum(int[] nums, int k) {
        int ans = 0;
        int length = nums.length - 1;
        int max = 0 ;
        
        //  Find Max Value of Array
        for(int x : nums){
            if(max < x){
                max = x;
            }
        }
        // Update Last Index of Array then store sum in ans
        for (int i = 0; i < k; i++) {
            int last = max ;
            ans += last;
            max = last + 1;
            nums[length] = max;
        }
        //  Return the output
        return ans;
    }

    public static void main(String[] args) {
        // Test Case :

        int[] nums = { 1, 2, 3, 4, 5 };
        int k = 3;

        // last index = 5 , then 5+1 , then 5+1+1 = 5+6+7  =  18
        // Output will be 18 if k = 3

        System.out.println(maximizeSum(nums, k));
    }
}
