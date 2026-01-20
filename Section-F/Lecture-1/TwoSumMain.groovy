class TwoSumMain {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Array to store result indices
        int[] result = new int[2];

        // Brute force approach using two loops
        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                // Check if sum equals target
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break; // exit inner loop
                }
            }
        }

        // Print result
        System.out.println("Indices are: " + result[0] + ", " + result[1]);
    }
}
