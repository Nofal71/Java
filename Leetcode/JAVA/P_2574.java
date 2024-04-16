public class P_2574 {
    public static int[] leftRightDifference(int[] nums) {

        int answer[] = new int[nums.length];
        int length = nums.length;
        int leftSum[] = new int[length];
        int rightSum[] = new int[length];
        
        for (int i = 0; i < length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                leftSum[i] += nums[j];
            }
            for(int k = i+1 ; k < nums.length ; k++){
                rightSum[i] += nums[k];
            }
        }

        leftSum[0] = 0;
        rightSum[length-1] = 0;

        for (int i = 0; i < length; i++) {

            answer[i] = leftSum[i] - rightSum[i];
            if( !(answer[i] > 0) ){
                answer[i] *= -1;
            }

        }



        return answer;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 4, 8, 3 };
        int[]  result = leftRightDifference(nums);
        for(int i = 0 ; i < nums.length ; i++){
            System.out.print(result[i] + " , ");
        }
    }
}
