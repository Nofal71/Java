
import java.util.ArrayList;
import java.util.List;

public class ten {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> myList = new ArrayList<Boolean>();
        int greatestNumber = 0;
        int[] result = new int[candies.length];

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] >= greatestNumber) {
                greatestNumber = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            result[i] = candies[i] + extraCandies;
            if (!(result[i] >= greatestNumber)) {
                myList.add(false);
            } else {
                myList.add(true);
            }
        }

        return myList;
    }

    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

}
