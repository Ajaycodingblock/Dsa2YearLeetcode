public class LengthLastWord {

    static int lengthLastWord(String s) {

        int len = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ')
            i--;

        while (i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }

        return len;
    }

    public static void main(String[] args) {

        String s = "Java is powerful";

        System.out.println(lengthLastWord(s));
    }
}
