public class P_2956 {

    // Problem Number 2955 on Leetcode :

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] ans = new int[2];
        int count_1 = 0, count_2 = 0;
        
        for (int i = 0; i < nums1.length; i++) {
            boolean occure = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                  // if any element of nums1 is also in nums2 it returns true 
                    occure = true;
                }
            }
            if (occure) {
                count_1++;
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            boolean occure = false;
            for (int j = 0; j < nums1.length; j++) {
                  // if any element of nums2 is also in nums1 it returns true
                if (nums1[j] == nums2[i]) {
                    occure = true;
                }
            }
            if (occure) {
                count_2++;
            }
        }

        ans[0] = count_1;
        ans[1] = count_2;

        return ans;
    }

    public static void main(String[] args) {
      // Test Case : 
      
        int[] nums1 = { 4, 3, 2, 3, 1 };
        int[] nums2 = { 2, 2, 5, 2, 3, 6 };
        int[] results = findIntersectionValues(nums1, nums2);
      
      /* - Output will be {3 , 4}
      
       * - The elements at indices 1, 2, and 3 in nums1 occur at least once in nums2.
           So the first value is 3.
           
       * - The elements at indices 0, 1, 3, and 4 in nums2 occur at least once in nums 1.
           So the second value is 4.
           
       */
      
        for (int x : results) {
            System.out.println(x);
          
           
          
        }
    }
}
