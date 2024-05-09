public class P_1572 {
    public static int diagonalSum(int[][] mat) {

        int sum = 0;
        int r = mat.length;
        int c = mat[0].length;

        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                if (row == col || row + col == r - 1) { // Adjusted the condition for right-to-left diagonal
                    sum += mat[row][col];
                }
            }
        }

        return sum;

    }

    public static void main(String[] args) {

    }
}
