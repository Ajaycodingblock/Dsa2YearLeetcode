class SearchRotatedArray {

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        // Binary search loop
        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[left] <= nums[mid]) {

                // Target lies in left sorted half
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } 
                // Otherwise search right half
                else {
                    left = mid + 1;
                }
            }

            // Right half is sorted
            else {

                // Target lies in right sorted half
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } 
                // Otherwise search left half
                else {
                    right = mid - 1;
                }
            }
        }

        return -1; // target not found
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        System.out.println(search(nums, target));
    }
}
