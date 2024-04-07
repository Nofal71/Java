public class P_2433 {
    public static int[] findArray(int[] pref) {

        int[] arr = new int[pref.length];

        return arr;
    }

    public static int[] toBinary(int Number) {

        int numBits = (int) (Math.log(Number) / Math.log(2)) + 1;
        int[] remainder = new int[numBits];

        for (int i = 0; i < numBits; i++) {

            remainder[i] = Number % 2;

            if (Number == 0) {
                break;
            } else {
                Number /= 2;
            }
        }

        return remainder;
    }

    public static void main(String[] args) {
        int[] result = toBinary(13);
        for (int i = 0; i < 4; i++) {
            System.out.println(result[i]);
        }
    }
}
