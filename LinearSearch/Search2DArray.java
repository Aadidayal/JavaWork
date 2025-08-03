// import java.util.Arrays;

// public class Search2DArray {

//     public static void main(String[] args) {
//         int arr[][] = {
//                 { 223, 32, 2 },    // { 223, 21, 23 },                  { 23, 21, 42 }
//                 { 223, 21, 23 },
//                 { 23, 21, 42 }
//         };
//         int target = 32;
//         int[] ans = arr(arr, target);
//         // System.out.println(ans);
//         System.out.println(Arrays.toString(ans));
//     }

//     static int[] arr(int[][] nw, int target) {
//         for (int row = 0; row < nw.length; row++) {
//             for (int col = 0; col < nw[row].length; col++) {
//                 if (nw[row][col] == target) {
//                     return new int[] { row, col };
//                 }
//             }
//         }
//         return null;
//     }
// }

// ######################################################################################################################//#endregion

//  ONLY THE MAX VALUE 

// import java.util.Arrays;

// public class Search2DArray {

//     public static void main(String[] args) {
//         int arr[][] = {
//                 { 229, 32, 2 }, // { 223, 21, 23 }, { 23, 21, 42 }
//                 { 223, 21, 23 },
//                 { 23, 21, 42 ,87685}
//         };
//         // int target = 32;
//         int ans = max(arr);
//         // System.out.println(ans);
//         System.out.println(ans);
//     }

//     static int max(int[][] nw) {
//         int maxxi=  Integer.MIN_VALUE;
//         for (int row = 0; row < nw.length; row++) {
//             for (int col = 0; col < nw[row].length; col++) {
//                 if (nw[row][col] > maxxi) {
//                     maxxi= nw[row][col];
//                 }
//             }
//         }
//         return maxxi;
//     }
// }

// #################################################################################################################

//  WITH COORDINATES 

import java.util.Arrays;

public class Search2DArray {

    public static void main(String[] args) {
        int arr[][] = {
                { -223, -32, -2 },
                { -223, -21, -23 },
                { -23, -21, -42 }
        };
        int[] ans = max(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] max(int[][] nw) {
        int maxxi = Integer.MIN_VALUE;
        int rowIdx = 0;
        int colIdx = 0;
        for (int row = 0; row < nw.length; row++) {
            for (int col = 0; col < nw[row].length; col++) {
                if (nw[row][col] > maxxi) {
                    maxxi = nw[row][col];
                    rowIdx = row;
                    colIdx = col;
                }
            }
        }
        return new int[] { maxxi, rowIdx, colIdx };
    }
}
