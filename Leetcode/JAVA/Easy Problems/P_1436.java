import java.util.Arrays;
import java.util.List;

public class P_1436 {
    public static String destCity(List<List<String>> paths) {
        String city = new String();
        for (int i = 0; i < paths.size(); i++) {
            Boolean cityFound = false;
            for (int j = 0; j < paths.size(); j++) {
                if (paths.get(i).get(1).equals(paths.get(j).get(0)) && j != i) {
                    cityFound = true;
                    break;
                }
            }
            if (cityFound == false) {
                city = paths.get(i).get(1);
                break;
            }
        }

        return city;
    }
    public static void main(String[] args) {
        List<List<String>> paths = Arrays.asList(Arrays.asList("pYyNGfBYbm", "wxAscRuzOl"), Arrays.asList("kzwEQHfwce", "pYyNGfBYbm"));
        System.out.println(destCity(paths));

    }
}
