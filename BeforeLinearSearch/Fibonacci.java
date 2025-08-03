// package BeforeLinearSearch;

// import java.util.Scanner;

// public class Fibonacci {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the value of n: ");
//         int n = scanner.nextInt(); 

//         // Handle cases where n is less than or equal to 0
//         if (n <= 0) {
//             System.out.println("Please enter a positive integer greater than 0.");
//             return;
//         }

//         int a = 0, b = 1, result = 0;

//         // Print the Fibonacci series up to the nth position
//         System.out.print("Fibonacci series: ");

//         // Handle printing for n = 1 separately
//         if (n >= 1) {
//             System.out.print(a + " ");  // Print the first number (0)
//         }

//         // Handle printing for n = 2 separately
//         if (n >= 2) {
//             System.out.print(b + " ");  // Print the second number (1)
//         }

//         // Print the Fibonacci numbers from 3rd position to nth position
//         for (int i = 2; i < n; i++) {
//             result = a + b;
//             System.out.print(result + " ");
//             a = b;
//             b = result;
//         }

//         System.out.println(); // Move to the next line after the series

//         // Print the nth Fibonacci number
//         System.out.println("Fibonacci number at position " + n + " is: " + result);
//     }
// }










// ####################################################################################################################








package BeforeLinearSearch;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = Scanner.nextInt();

        // Handle cases where n is 0 or 1
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return;
        }

        int a = 0, b = 1, result = 0;

        // Print the Fibonacci series up to the nth position
        System.out.print("Fibonacci series: ");
        if (n >= 1)
            System.out.print(a + " "); // Print the first number (0)
        if (n >= 2)
            System.out.print(b + " "); // Print the second number (1)

        for (int i = 2; i < n; i++) {
            result = a + b;
            a = b;
            b = result;
            System.out.print(result + " ");
        }

        System.out.println(); // Move to the next line after the series

        // Print the nth Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is: " + result);
    }
}
