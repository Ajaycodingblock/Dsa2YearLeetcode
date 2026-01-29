class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Target is bigger, move right
            else if (nums[mid] < target) {
                left = mid + 1;
            }

            // Target is smaller, move left
            else {
                right = mid - 1;
            }
        }

        // Left gives correct insert position
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;

        System.out.println(searchInsert(nums, target));
    }
}
