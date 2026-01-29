import java.util.HashSet;

class Solution645 {

    // Function to find duplicate and missing number
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        
        int actualSum = 0;
        HashSet<Integer> set = new HashSet<>();

        // Calculate actual sum and fill set
        for (int num : nums) {
            actualSum += num;
            set.add(num);
        }

        // Expected sum of 1 to n
        int expectedSum = n * (n + 1) / 2;

        // Sum without duplicate
        int uniqueSum = 0;
        for (int val : set) {
            uniqueSum += val;
        }

        int duplicate = actualSum - uniqueSum;
        int missing = expectedSum - uniqueSum;

        return new int[]{duplicate, missing};
    }

    // Proper main function
    public static void main(String[] args) {
        Solution645 obj = new Solution645();

        int[] nums = {1, 2, 2, 4};

        int[] result = obj.findErrorNums(nums);

        System.out.println("Duplicate: " + result[0]);
        System.out.println("Missing: " + result[1]);
    }
}
