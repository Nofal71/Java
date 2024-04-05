


public class five {

    public static int[] shuffle(int[] nums, int n) {

        int[] answer = new int[2 * n];

        for (int i = 0; i < n; i++) {
            answer[i * 2] = nums[i];
            answer[i * 2 + 1] = nums[i + n];
        }

        return answer;
    }

    public static void main(String[] args) {

        int nums[] = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        int[] result = shuffle(nums, n);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(result[i] + " , ");
        }

    }

}