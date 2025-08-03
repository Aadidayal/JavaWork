public class LinearSearch {
    public static void main(String[] args) {
        int nums[] = { 23, 45, 22, 21, 34, 213, 4235, 321 };
        int target = 34;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
