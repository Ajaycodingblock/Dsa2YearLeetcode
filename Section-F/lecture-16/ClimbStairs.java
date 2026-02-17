public class ClimbStairs {

    static int climb(int n) {

        if (n <= 2)
            return n;

        return climb(n - 1) + climb(n - 2);
    }

    public static void main(String[] args) {

        System.out.println(climb(5));
    }
}
