public class seven {
    public static int maxWidthOfVerticalArea(int[][] points) {
        int[] area = new int[points.length];
        int WidestArea = 0;

        for (int i = 0; i < points.length; i++) {
            int difference = points[i][0] - points[i][1];
            area[i] = difference;
        }
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area.length; j++) {
                if (area[i] > area[j]) {
                    WidestArea = j;
                }
            }
        }

        return WidestArea;
    }

    public static void main(String[] args) {

        int[][] points = { { 3, 1 }, { 9, 0 }, { 1, 0 }, { 1, 4 }, { 5, 3 }, { 8, 8 } };
        System.out.println(maxWidthOfVerticalArea(points));

    }

}
