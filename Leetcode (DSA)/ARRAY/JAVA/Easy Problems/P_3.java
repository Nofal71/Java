import java.util.ArrayList;
import java.util.List;

public class P_3 {
    public static int maxFrequencyElements(int[] nums) {
        int sum = 0;

        int mostFreq = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int freqCount = 0;
            boolean isRepeating = false;
            for (int k = 0; k < list.size(); k++) {
                if (nums[i] == list.get(k)) {
                    isRepeating = true;
                    break;
                }
            }
            if (!(isRepeating)) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        freqCount++;
                    }
                }

                list.add(nums[i]);
                if (mostFreq < freqCount) {
                    mostFreq = freqCount;
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            int currentElement = list.get(i);
            int freqCount = 0;
            for (int j = 0; j < nums.length; j++) {
                if (currentElement == nums[j]) {
                    freqCount++;
                }
            }
            if (freqCount == mostFreq) {
                sum += freqCount;
            }
        }


        return sum;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 1, 4 };
        System.out.println(maxFrequencyElements(nums));
    }
}
