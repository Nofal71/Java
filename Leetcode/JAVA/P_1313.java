public class P_1313 {
    public static int[] decompressRLElist(int[] nums) {
        int size = 0;

        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }

        int[] decompressRLElist = new int[size];

        int index = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];

            for (int j = 0; j < freq; j++) {
                decompressRLElist[index] = val;
                index++;
            }

        }

        return decompressRLElist;

    }

    public static void main(String[] args) {

        int[] nums = { 1, 1, 2, 3 };
        int[] result = decompressRLElist(nums);
        for (int x : result) {
            System.out.println(x);
        }

    }

}
