public class P_2006 {

    public static int countKDifference(int[] nums, int k) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                if(nums[i] - nums[j] == k){
                    ans++;
                }

            }
        }

        return ans;
    }
       public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        int k = 1;

        System.out.println(countKDifference(nums, k));
       }
}
