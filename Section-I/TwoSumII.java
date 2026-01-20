public class TwoSumII {
    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                System.out.println("Indices: " + (left + 1) + ", " + (right + 1));
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("No solution found");
    }
}
