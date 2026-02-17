public class ValidAnagram {

    static boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        int count[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int x : count)
            if (x != 0)
                return false;

        return true;
    }

    public static void main(String[] args) {

        String s = "listen";
        String t = "silent";

        System.out.println(isAnagram(s, t));
    }
}
