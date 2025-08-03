package BinarySearch;


//  will not run for duplicate values 



public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(FindPivot(arr));
    }

    static int search(int[] nums, int target) {
        int pivot = FindPivot(nums);
        // if not find the pivod
        if (pivot == -1) {
            // just do simple binary search
            return BinaryFind(nums, target, 0, nums.length - 1);

        }
        // if found youi got 2 asc arrays

        // we have 3 case .. we fine and using pivot and find ans
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return BinaryFind(nums, target, 0, pivot - 1);
        }
        return BinaryFind(nums, target, pivot + 1, nums.length - 1);

    }

    static int BinaryFind(int[] nw, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nw[mid] == target) {
                return mid;
            }

            else if (nw[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return -1;

    }

    static int FindPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        // 4 cases we discussed
        if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        if (mid > start && arr[mid] < arr[mid - 1]) {
            return mid - 1;
        }
        if (arr[start] >= arr[mid]) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }

        return -1;
    }
}