public class P_980 {
    public static int uniquePathsIII(int[][] grid) {
        int numOfPaths = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        
            int cont = 0;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (grid[i][j] == -1) {
                        continue;
                    }
                    if (grid[i][j] == 0) {
                        cont++;
                    }
                    if (cont >= 4 && grid[i][j] == 2) {
                        numOfPaths++;
                        break;
                    }

                }
            }
            
      

        return numOfPaths;

    }

    public static void main(String[] args) {
        int[][] grid = { { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 2 } };
        System.out.println(uniquePathsIII(grid));
    }
}
