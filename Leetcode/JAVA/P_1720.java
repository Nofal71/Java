
public class P_1720 {

    public static int[] decode(int[] encoded, int first) {
        int arr[] = new int[encoded.length+1];
        arr [0] = first;

        for (int i = 0; i < encoded.length ; i++) {
          arr[i+1] = arr[i] ^ encoded[i];
        }

        return arr;

    }

    public static void main(String[] args) {
        int[] encoded = { 1, 2, 3 };
        int first = 1;
        int[] result = decode(encoded, first);
        for (int i = 0; i < result.length ; i++) {
            System.out.println(result[i]);
        }
    }

}
