package BinarySearch;

public class OrderAgnosticSearch {
    public static void main(String[] args) {
        int arr[] = { 11, 44, 52, 61 };
        int arr2[] = { 53, 43, 21, 11, 3, 0 };
        int ans = order(arr, 61);
        int ans2 = order(arr2, 21);
        System.out.println(ans);
        System.out.println(ans2);

    }

    static int order(int nw[], int target) {
        int start = 0;
        int end = nw.length - 1;

        // FIND weather arrray is sorted in assending or dessending order
        boolean isAcen = nw[start] < nw[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nw[mid] == target) {
                return mid;
            }
            if (isAcen) {
                if (target < nw[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > nw[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
