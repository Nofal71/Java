public class P_523 {
    public boolean checkSubarraySum(int[] nums, int k) {

        for (int i : nums) {

            int currentSum = 0;
            int length = 0;

            for (int j : nums) {
               
                    currentSum += j;
                    length++;
              
                if (currentSum % k == 0 && length >= 2 && j != i) {
                    return true;
                }
            }
        }

        return false;
    }
}
