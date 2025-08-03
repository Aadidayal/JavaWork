package BeforeLinearSearch;
import java.util.Scanner;

public class K1sum {
    public static void main (String [] args ){
        System.out.println("Enter numbers to add: ");
        Scanner input = new Scanner(System.in);
        int num1= input.nextInt();
        int num2= input.nextInt();
        int num3= input.nextInt();
        int sum= num1 + num2+ num3;
        System.out.println("The sum of 2 number is: " + sum);

    }
}




