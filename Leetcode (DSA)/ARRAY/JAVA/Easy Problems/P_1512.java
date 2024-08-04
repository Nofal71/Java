public class P_1512 {

    public static void goodPairs(int array[]) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i < j) {
                    System.out.print(i + " , " + j);
                    System.out.println();
                }
            }
        }

    }

    public static void main(String[] args) {

        int nums[] = { 1, 2, 3, 1, 1, 3 };
        goodPairs(nums);

    }
}
