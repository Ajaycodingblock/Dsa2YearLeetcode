import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args) {

        int[] nums = {-4, -1, 0, 3, 10};
        int n = nums.length;

        // Square each element
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i];
        }

        // Sort the squared values
        Arrays.sort(nums);

        // Print the result
        System.out.println(Arrays.toString(nums));
    }
}
