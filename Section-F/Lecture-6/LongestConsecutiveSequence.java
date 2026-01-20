import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        // Input array
        int[] nums = {100, 4, 200, 1, 3, 2};

        // If array is empty, longest sequence length is 0
        if (nums.length == 0) {
            System.out.println(0);
            return;
        }

        // Step 1: Sort the array
        Arrays.sort(nums);

        // currMax -> length of current consecutive sequence
        // maxLen  -> maximum length found so far
        int currMax = 1;
        int maxLen = 1;

        // Step 2: Traverse the sorted array
        for (int i = 0; i < nums.length - 1; i++) {

            // If current element is same as next (duplicate), skip it
            if (nums[i] == nums[i + 1]) {
                continue;
            }

            // If next element is exactly +1, increase sequence count
            else if (nums[i] == nums[i + 1] - 1) {
                currMax++;
            }

            // If sequence breaks, reset current count to 1
            else {
                currMax = 1;
            }

            // Update maximum sequence length
            maxLen = Math.max(currMax, maxLen);
        }

        // Print the longest consecutive sequence length
        System.out.println(maxLen);
    }
}
