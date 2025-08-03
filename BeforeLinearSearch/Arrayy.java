// PRIMITIVE ARRAYS


package BeforeLinearSearch;

import java.util.Scanner;
import java.util.Arrays; 
public class Arrayy{
    public static void main(String[] args) {
        int arr []= new int  [4];
    System.out.println("Enter numbers");
     Scanner input= new Scanner(System.in);
     for(int i=0; i< arr.length; i++){
        arr[i]= input.nextInt();
     }
     System.out.println(Arrays.toString(arr));



    for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
    }

    // for(int num: arr){
    //     System.out.println(num);
    // }
    }
}


// ##########################################################################################################



// OBJECTIVE ARRAY

// import java.util.Arrays;
// import java.util.Scanner;

// public class Arrayy {

//     public static void main(String[] args) {
//         String [] str= new String[4];
//         Scanner input= new Scanner(System.in);
//         for(int i = 0; i<str.length; i++){
// str[i]= input.next();
//         }
//         System.out.println(Arrays.toString(str));
//     }
// }