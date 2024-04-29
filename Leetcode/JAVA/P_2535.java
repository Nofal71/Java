
public class P_2535 {

    // PROBLEM NUMBER 2535 on LEETCODE (ARRAY SECTION)

    public static int differenceOfSum(int[] nums) {
        // Initializing Variables to store Values
        int elemntSum = 0;
        int digitSum = 0;

        // Simple array elements Sum using '+=' to store sum of elements in elementSum
        // var .
        for (int i = 0; i < nums.length; i++) {
            elemntSum += nums[i];
        }
        // If value above then 10 it will spilts by dividing with 10 and finding
        // remainder
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 9) {
                while (nums[i] != 0) {
                    // storing first value (Example : 23 will be 3)
                    digitSum += nums[i] % 10;
                    // update value (Exmaple : 23 will be 2 now ....)
                    nums[i] /= 10;
                }
            }
            // Storing digitalSum
            digitSum += nums[i];
        }

        return elemntSum - digitSum;

    }

    public static void main(String[] args) {
        // Test Case :-
        int[] nums = { 1, 2, 3, 4 };

        /*
         * The element sum of nums is 1 + 2 + 3 + 4 = 10.
         * The digit sum of nums is 1 + 2 + 3 + 4 = 10.
         * Output will be : 10 - 10 = 0 (elementSum - digitSum)
         */

        System.out.println(differenceOfSum(nums));

    }
}
