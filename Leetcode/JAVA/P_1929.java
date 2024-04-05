


public class P_1929 {
   
    public static int[] concatination(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] =  ans[i+nums.length] = nums[i];
        }
        return ans;
    }

    // Main method
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] result = concatination(nums); 
       
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}