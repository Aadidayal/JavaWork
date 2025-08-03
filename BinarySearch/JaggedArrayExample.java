package BinarySearch;

import java.util.Scanner;

public class JaggedArrayExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of rows in the jagged array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Create the jagged array with the given number of rows
        int[][] jaggedArray = new int[rows][];

        // Iterate over each row to get the number of columns for that row
        for (int i = 0; i < rows; i++) {
            // Ask the user for the number of columns for the current row
            System.out.print("Enter the number of columns for row " + (i + 1) + ": ");
            int columns = scanner.nextInt();

            // Initialize the current row with the specified number of columns
            jaggedArray[i] = new int[columns];

            // Ask the user to input the elements for the current row
            System.out.println("Enter " + columns + " elements for row " + (i + 1) + ":");
            for (int j = 0; j < columns; j++) {
                // Read the element from the user
                System.out.print("Element " + (j + 1) + ": ");
                jaggedArray[i][j] = scanner.nextInt();
            }
        }

        // Display the jagged array
        System.out.println("\nYour jagged array is:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close(); // Close the scanner
    }
}