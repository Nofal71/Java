import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class P_2913 {
    public static int sumCounts(List<Integer> nums) {
        int ans = 0;

        for (int i = 0; i < nums.size(); i++) {

            for (int j = i ; j < nums.size(); j++) {

                List<Integer> subArray = new ArrayList<>();

                for (int k = 0 + i; k <= j; k++) {
                       subArray.add(nums.get(k));
                }
              if(!(subArray.isEmpty())){
                  int temp = distictCount(subArray);
                  ans += temp * temp ;
                }

            }
        }

        return ans;
    }

    public static int distictCount(List<Integer> num) {
        int count = 0;
        for (int i = 0; i < num.size(); i++) {
            boolean isDistinct = true;
            for (int j = 0; j < i; j++) {
                if (num.get(i).equals(num.get(j))) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                count++;
            }
        }
        return count;
    }
      
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(1);
        System.out.println(sumCounts(nums));
    }

}
