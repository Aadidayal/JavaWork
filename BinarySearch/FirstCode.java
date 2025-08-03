package BinarySearch;

public class FirstCode {

    public static void main(String[] args) {
        int[] arr = { -4, -1, 0, 3, 4, 6, 7, 8, 9, 10, 43, 52, 66, 78 };

        int ans = BinaryFind(arr,7 );
        System.out.println(ans);
    }

    

    static int BinaryFind(int[] nw, int target) {
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

return -1;
      
    }
}
 