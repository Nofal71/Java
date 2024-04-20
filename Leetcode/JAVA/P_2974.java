public class P_2974 {
    public static int[] numberGame(int[] nums) {

        int[] arr = new int[nums.length];
        int bob = 0 , alice = 0 , index = 0;
        int k = nums.length-1, l = nums.length-2;
        
    for(int j = 0 ; j < nums.length/2 ; j++){

        for (int i = 0; i < nums.length; i++) {
            if (bob < nums[i]) {
                bob = nums[i];
                index = i;
            }
        }
        nums[index] = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (alice < nums[i]) {
                alice = nums[i];
                index = i;
            }
        }
        nums[index] = 0;

            arr[k--] = alice;
            k--;
            arr[l--] = bob;
            l--;

            alice = 0 ; bob = 0;


        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 4, 2, 3 };
        int[] result = numberGame(nums);
        for (int x : result) {
            System.out.println(x + " ");
        }

    }
}
