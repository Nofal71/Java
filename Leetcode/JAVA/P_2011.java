public class four {
    public static int operations(String[] operations) {
        int X = 0;

        for (int j = 0; j < operations.length; j++) {
            switch (operations[j]) {
                case "X++":
                case "++X":
                    X++;
                    break;
                case "X--":
                case "--X":
                    X--;
                    break;
                default:
                    break;
            }
        }
        return X;
    }
    public static void main(String[] args) {
        String[] operations = { "--X", "++X", "X++" , "X++" , "--X" };
        System.out.println("Final Value After Operations = " +operations(operations));

    }
}
