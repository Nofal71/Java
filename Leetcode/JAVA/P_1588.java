public class P_1588 {

  public static int sumOddLengthSubarrays(int[] arr) {
    int ans = 0;

    for (int i = 0; i <= arr.length; i++) {
      if (i % 2 == 1) {

        for (int j = 0; j <= arr.length - i; j++) {
          for (int k = j; k < j + i; k++) {
            ans += arr[k];
          }
        }

      }
    }
    return ans;

  }

  public static void main(String[] args) {
    int[] arr = { 1, 4, 2, 5, 3 };
    System.out.println(sumOddLengthSubarrays(arr));

  }

}
