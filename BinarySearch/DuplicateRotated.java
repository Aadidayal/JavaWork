
public class DuplicateRotated {

    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7, 6, 5, 6, 7, 8, 9};

        System.out.println("Pivot index: " + findPivotWithDuplicates(arr));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);

        // If you did not find a pivo   t, it means the array is not rotated
        if (pivot == -1) {
            // Just do normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // If pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        // If target is greater than or equal to the first element, search in the left part
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // Otherwise, search in the right part
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // Answer found
                return mid;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        // 4 cases over here:
        if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        if (mid > start && arr[mid] < arr[mid - 1]) {
            return mid - 1;
        }

        // If elements at middle, start, end are equal then just skip the duplicates
        if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
            // Skip the duplicates by narrowing the search range
            if (arr[start] == arr[mid]) {
                start++;
            }
            if (arr[end] == arr[mid]) {
                end--;
            }
        }
        // Left side is sorted, so pivot should be in the right part
        else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return -1; // No pivot found, return -1
}

}
