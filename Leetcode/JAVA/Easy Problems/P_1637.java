import java.lang.reflect.Array;
import java.util.Arrays;

public class P_1637 {
    public static int maxWidthOfVerticalArea(int[][] points) {
        int[] xCoordinates = new int[points.length];
        int WidestArea = Integer.MAX_VALUE;

        for (int i = 0; i < points.length; i++) {
            xCoordinates[i] = points[i][0];
        }
        Arrays.sort(xCoordinates);

        if(xCoordinates.length == 1) {
            return 0 ;
        }

        for (int i = 1; i < xCoordinates.length; i++) {
            int diff = xCoordinates[i - 1] - xCoordinates[i];
            if (WidestArea > diff) {
                WidestArea = diff;  
            }
        }

        return Math.abs(WidestArea);
    }

    public static void main(String[] args) {

        int[][] points = { { 8, 7 },
                { 9, 9 },
                { 7, 4 },
                { 9, 7 },
        };
        System.out.println(maxWidthOfVerticalArea(points));

    }

}
