public class FirstLastIndex {

    static void findIndex(String s, char target) {

        int first = -1, last = -1;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == target) {

                if (first == -1)
                    first = i;

                last = i;
            }
        }

        System.out.println("First: " + first);
        System.out.println("Last: " + last);
    }

    public static void main(String[] args) {

        findIndex("banana", 'a');
    }
}
