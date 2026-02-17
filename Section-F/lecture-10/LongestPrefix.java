public class LongestPrefix {

    static String longestPrefix(String arr[]) {

        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {

            while (!arr[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty())
                    return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {

        String arr[] = {"flower", "flow", "flight"};

        System.out.println(longestPrefix(arr));
    }
}
