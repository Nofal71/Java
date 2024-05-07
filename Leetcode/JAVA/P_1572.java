public class P_2373 {
    public static int[][] largestLocal(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for (int i = 0; i <= rows - 3; i++) {
            for (int j = 0; j <= cols - 3; j++) {
                count++;
            }
        }

        int row = count / 2, col = count / 2;
        int[][] maxLoxal = new int[row][col];

   
        return maxLoxal;

    }
    public static void main(String[] args) {
        
    }
}
