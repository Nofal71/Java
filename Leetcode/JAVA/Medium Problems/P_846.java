import java.util.*;

public class P_846 {
    public static boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0 ) {
            return false;
        }

        if(groupSize > 1 && hand.length == groupSize){
            return false;
        }
        
        Arrays.sort(hand);

        for (int i = 0; i < hand.length; i++) {

            int freq = 0;
            for (int j = 0; j < hand.length; j++) {
                if (hand[i] == hand[j]) {
                    freq++;
                }
            }

            if (freq > groupSize) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        int[] hand = { 1, 2, 3, 3, 4, 4, 5, 6 };
        int groupSize = 4;
        isNStraightHand(hand, groupSize);
    }
}
