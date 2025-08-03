// FIXED COLOUMN 

package BeforeLinearSearch;



import java.util.Arrays;
import java.util.Scanner;

public class Arrayy2D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }
        // OUTPUT

        for(int row=0; row< arr.length; row++){
        for(int col=0; col<arr[row].length; col++){
        System.out.print(arr[row][col]+ " ");
        }
        System.out.println();
        }
        // ########################################
        for(int row = 0; row< arr.length; row++){
        System.out.println(Arrays.toString(arr[row]));
        }
        // ############################

        for (int[] num : arr) {
            System.out.println(Arrays.toString(num));
        }
    }
}


// ###########################################################################################################



//  NO FIXED COLUMN 



// public  class Arrayy2D {

//     public static void main(String[] args) {
//         int arr[][] = {
//             {1,2,3},
//             {5,6},
//             {7,8,9,4}
//         };
// for (int row=0; row<arr.length; row++){
//     for(int col=0; col< arr[row].length; col++){
//         System.out.print(arr[row][col]+ " ");
//     }
//     System.out.println();
// }
//     }
// }
