package BeforeLinearSearch;
import java.util.Scanner;

public class occNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
int count = 0;
System.out.println("Enter digit: ");
int dig = input.nextInt();
        while (n>0) {
            int rem= n% 10;
            if(rem== dig){
                count++;
            }
           n = n / 10;
        }
        System.out.println("Total count is: "+ count);
    }

}
