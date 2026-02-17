public class PrintN {

    static void printN(int n) {

        if (n == 0)
            return;

        printN(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {

        printN(5);
    }
}
