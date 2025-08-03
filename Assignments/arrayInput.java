package Assignments;
import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sizeof array");
        int n = input.nextInt();

        int arr[]= new int[n];
System.out.println("arrays element ");
        for (int i = 0; i<arr.length; i++){
            arr[i]= input.nextInt();
        }
       
        for (int i = 0 ; i<arr.length; i++){
         System.out.println(arr[i]);
        }
    }
}
