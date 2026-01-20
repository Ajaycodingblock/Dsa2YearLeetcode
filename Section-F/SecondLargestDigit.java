public class SecondLargestDigit {
    public static void main(String[] args) {

        String s = "dfa12321afd";
        int max = -1;
        int secondMax = -1;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                int digit = ch - '0';

                if (digit > max) {
                    secondMax = max;
                    max = digit;
                } else if (digit < max && digit > secondMax) {
                    secondMax = digit;
                }
            }
        }
        System.out.println("Second largest digit: " + secondMax);
    }
}
