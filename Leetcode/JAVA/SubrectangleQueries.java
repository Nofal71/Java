public class SubrectangleQueries {
    private int[][] rectangle;

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                rectangle[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return this.rectangle[row][col];
    }

    public static void main(String[] args) {
        // [1,2,1],[4,3,4],[3,2,1],[1,1,1]
        int[][] rectangle = {
            {1,2,1} ,
            {4,3,4} ,
            {3,2,1} ,
            {1,1,1}
        };
        SubrectangleQueries obj = new SubrectangleQueries(rectangle);
        obj.updateSubrectangle(0, 2, 1, 2, 30);
        System.out.println(obj.getValue(2, 2));

        
    }

}