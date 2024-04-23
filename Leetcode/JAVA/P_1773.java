import java.util.*;
import javax.print.DocFlavor.STRING;

public class P_1773 {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        for (int i = 0; i < items.size(); i++) {
           
            if (ruleKey.equals("color")) {

                if (items.get(i).get(1).equals(ruleValue)) {
                    count++;
                }

            } else if (ruleKey.equals("type")) {

                if (items.get(i).get(0).equals(ruleValue)) {
                    count++;
                }

            } else if (ruleKey.equals("name")) {

                if (items.get(i).get(2).equals(ruleValue)) {
                    count++;
                }

            }
        }

        return count;
    }

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));
        String ruleKey = "color";
        String ruleValue = "silver";

        int output = countMatches(items, ruleKey, ruleValue);

        System.out.println(output);

    }
}