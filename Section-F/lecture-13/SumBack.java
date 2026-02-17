public class SumBack {

    static int sumN(int n) {

        if (n == 0)
            return 0;

        return n + sumN(n - 1);
    }

    static void backCount(int n) {

        if (n == 0)
            return;

        System.out.print(n + " ");
        backCount(n - 1);
    }

    public static void main(String[] args) {

        System.out.println("Sum: " + sumN(5));
        backCount(5);
    }
}
