import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_1282 {
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {

        List<List<Integer>> ans = new ArrayList<>();

        int[] arr = new int[groupSizes.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = groupSizes[i];
        }

        int count = countOf(arr);

        ans.add(wholeGroup(0, groupSizes));
        ans.add(wholeGroup(5, groupSizes));

        return ans;
    }

    public static List<Integer> wholeGroup(int index, int[] groupSizes) {
        int size = groupSizes[index];
        int count = 0;

        for (int j = 0; j < groupSizes.length; j++) {
            if (size == groupSizes[j]) {
                count++;
            }
        }

        int[] array = new int[count];
        int ind = 0;

        for (int j = 0; j < groupSizes.length; j++) {
            if (size == groupSizes[j]) {
                array[ind] = j;
                ind++;
            }
        }
        List<Integer> group = new ArrayList<>();

        for (int j = 0; j < array.length; j++) {
            group.add(array[j]);
        }

        return group;

    }

    public static int countOf(int groupSizes[]) {
        int count = 1;

        Arrays.sort(groupSizes);

        int temp = groupSizes[0];

        for (int i = 0; i < groupSizes.length; i++) {
            if (temp != groupSizes[i]) {
                temp = groupSizes[i];
                count++;
            }
        }

        return count;
    }

    public static List<List<Integer>> ans(List<List<Integer>> a) {
        List<List<Integer>> anser = new ArrayList<>();
        int b = a.get(0).size();
        int c = a.get(0).get(0);

        return anser;
    }

    public static void main(String[] args) {
        int[] groupSizes = { 3, 3, 3, 3, 3, 1, 3 };
        System.out.println(groupThePeople(groupSizes));
        // System.out.println(countOf(groupSizes));
    }
}
