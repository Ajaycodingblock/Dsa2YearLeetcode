class BinarySearchDemo {

    // Function to perform Binary Search
    // Returns index of target if found, else returns -1
    public static int binarySearch(int[] arr, int target) {

        // Step 1: Define search space
        int left = 0;                 // starting index
        int right = arr.length - 1;   // ending index

        // Step 2: Continue searching while valid range exists
        while (left <= right) {

            // Step 3: Find middle index
            // (left + right) / 2 can cause overflow,
            // so we use this safer formula
            int mid = left + (right - left) / 2;

            // Step 4: Check if middle element is the target
            if (arr[mid] == target) {
                return mid; // target found
            }

            // Step 5: If target is greater, ignore left half
            else if (arr[mid] < target) {
                left = mid + 1;
            }

            // Step 6: If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // Step 7: Target not found
        return -1;
    }

    // Proper main function
    public static void main(String[] args) {

        // IMPORTANT: Binary Search works only on sorted array
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56};
        int target = 23;

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
