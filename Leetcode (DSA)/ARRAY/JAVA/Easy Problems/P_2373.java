
public class P_2373 {

    public static int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] maxLocal = new int[n - 2][n - 2];

        int row = 0, colom = 0;

        while (row < n - 2) {

            int max = 0;

            for (int i = row; i < row + 3; i++) {
                for (int j = colom; j < colom + 3; j++) {
                    if (max < grid[i][j]) {
                        max = grid[i][j];
                    }
                }
            }

            maxLocal[row][colom] = max;

            colom++;

            if (colom == n - 2) {
                colom = 0;
                row++;
            }

        }

        return maxLocal;

    }

    public static void main(String[] args) {
        int[][] grid = {{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}};
        int[][] result = largestLocal(grid);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.println(result[i][j]);
            }
            System.out.println();
        }

    }
}
