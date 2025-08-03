package BinarySearch;

public class CeilingOfNum {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 19 };

        int ans = BinaryFind(arr, 10);
        System.out.println(ans);
    }

    static int BinaryFind(int[] nw, int target) {
        if (target > nw[nw.length - 1]) {
            return -1;
        }
        int start = 0;

        int end = nw.length - 1;

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
        return start;

    }
}
