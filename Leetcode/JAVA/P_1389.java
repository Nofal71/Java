public class P_1389 {
    public static int[] createTargetArray(int[] nums, int[] index) {

        int size = nums.length;
        int[] targetArray = new int[size];
        

            for (int i = 0; i < size; i++) {
                int c = index[i];
                int v = nums[i];
                
                    for (int j = size - 1; j > c; j--) {
                        targetArray[j] = targetArray[j - 1];
                    }
                
                    targetArray[index[i]] = v;
                
            }

        

        return targetArray;

    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        int[] result = createTargetArray(nums, index);

        for (int x : result) {
            System.out.println(x);
        }

    }

}
