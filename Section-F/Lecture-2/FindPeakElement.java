public class FindPeakElement {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};
        int n = nums.length;

        // Single element case
        if (n == 1) {
            System.out.println(0);
            return;
        }

        // First element peak
        if (nums[0] > nums[1]) {
            System.out.println(0);
            return;
        }

        // Middle elements
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                System.out.println(i);
                return;
            }
        }

        // Last element peak
        System.out.println(n - 1);
    }
}
