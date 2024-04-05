public class P_2798 {
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int numOfEmployes = 0;

        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                numOfEmployes++;
            }
        }
        return numOfEmployes;
    }

    public static void main(String[] args) {
        int[] hours = { 0, 1, 2, 3, 4 };
        int target = 2;
        System.out.println("Number of Employes who met Target Hours = "+numberOfEmployeesWhoMetTarget(hours, target));
    }
}
