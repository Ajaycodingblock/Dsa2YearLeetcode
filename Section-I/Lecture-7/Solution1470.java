class Solution1470 {

    // Function to shuffle the array
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int index = 0;

        // First half starts at 0, second half starts at n
        for (int i = 0; i < n; i++) {
            ans[index++] = nums[i];     // xi
            ans[index++] = nums[i + n]; // yi
        }

        return ans;
    }

    // Proper main function
    public static void main(String[] args) {
        Solution1470 obj = new Solution1470();

        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] result = obj.shuffle(nums, n);

        // Print result
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
