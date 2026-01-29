class SelectionSortDemo {

    // Function to perform Selection Sort
    public static void selectionSort(int[] arr) {

        int n = arr.length;

        // Outer loop controls position from 0 to n-2
        for (int i = 0; i < n - 1; i++) {

            // Step 1: Assume current index has minimum element
            int minIndex = i;

            // Step 2: Find the smallest element in remaining array
            for (int j = i + 1; j < n; j++) {

                // If smaller element found, update minIndex
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Step 3: Swap only if minimum is not already at correct position
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    // Proper main function
    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};

        // Call selection sort
        selectionSort(arr);

        // Print sorted array
        System.out.print("Sorted Array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
