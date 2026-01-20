public class Panagram {
    public static boolean isPanagram(String input) {
        // Frequency table for all 26 lettelllrs
        int[] frequency = new int[26];
        
        for (char c : input.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                frequency[c - 'a']++;
            }
        }
        
        // Check if all 26 letters have frequency > 0
        for (int count : frequency) {
            if (count == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String testString = "The quick brown fox jumps over a lazy dog";
        System.out.println("Is panagram: " + isPanagram(testString));
    }
}
