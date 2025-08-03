package BeforeLinearSearch;
import java.util.Scanner;

public class AlphabetCase {

    public static void main(String[] args) {
        System.out.println(" enter an alphabet ");
        Scanner input = new Scanner(System.in);
        // char ch= input.next().trim().charAt(0);
        char ch= input.next().trim().charAt(0);
        if(ch>= 'a' && ch<='z'  ){
            System.out.println("Small");
        }else{
            System.out.println("Big");
        }
    }
}