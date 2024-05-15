public class P_1588 {
  //  LEETCODE ARRAY PROBLEM 1588

  public static int sumOddLengthSubarrays(int[] arr) {
    int ans = 0;

    for (int i = 0; i <= arr.length; i++) {
      // Check to get Odd Number
      if (i % 2 == 1) {
      // Skipping one index each time
        for (int j = 0; j <= arr.length - i; j++) {
          for (int k = j; k < j + i; k++) {
            // storing SubArrays
            ans += arr[k];
          }
        }

      }
    }
    return ans;

  }

  public static void main(String[] args) {
    // Test Case: 
    int[] arr = { 1, 4, 2, 5, 3 };

/* [1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
*/
    System.out.println(sumOddLengthSubarrays(arr));

  }

}
