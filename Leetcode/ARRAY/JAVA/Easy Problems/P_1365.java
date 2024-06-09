public class P_1365 {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer = new int[nums.length];
        int tempCount = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    tempCount++;
                }
            }
            answer[i] = tempCount;
            tempCount = 0;
        }

        return answer;

    }

    public static void main(String[] args) {

        int[] nums = { 8, 1, 2, 2, 3 };
        int[] result = smallerNumbersThanCurrent(nums);
        for (int i = 0; i < nums.length; i++) {

            System.out.println(result[i]);

        }

    }

}
