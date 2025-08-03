package BeforeLinearSearch;
import java.util.Scanner;

public class MaxOf3 {

    public static void main(String[] args) {
        System.out.println("enter the numbers:");

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

         int max=0;
         if (a> b){
          max = a;
         }else if ( b> a){
           max = b;
         }else {
          max=c;
         }
         System.out.println("greatest number is: " + max);
       
        // int max = Math.max(c, Math.max( a, b));
        System.out.println( Math.max(98, 89));


    }
}