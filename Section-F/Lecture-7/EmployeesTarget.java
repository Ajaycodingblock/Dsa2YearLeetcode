public class EmployeesTarget {
    public static void main(String[] args) {

        int[] hours = {0, 1, 2, 3, 4};
        int target = 2;
        int count = 0;

        for (int h : hours) {
            if (h >= target) {
                count++;
            }
        }
        System.out.println("Employees who met target: " + count);
    }
}
