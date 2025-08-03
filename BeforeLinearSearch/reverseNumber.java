package BeforeLinearSearch;
import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

    int ans= 0;

    while(num>0){
        int rem = num %10;
        num = num / 10;

        ans= ans *10 +rem;
        
    }
    System.out.println("Reverse number is: " + ans);
    }
}
