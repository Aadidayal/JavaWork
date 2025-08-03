package Recursion.Easy;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
// Rev1(12345);
// System.out.println(sum);
System.out.println(Rev2(123445));
    }

    static int sum = 0;
    //  what if we dont want to initialize sum outside , we want pure recursion solution 
    static void Rev1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        Rev1(n/10);

    }

    static int Rev2(int n) {
          // sometimes you might need some additional variables in the argument
        // in that case, make another function

        int digits = (int)(Math.log10(n)) + 1;// to fine total nuber of digits (_I left this vid in mid to cover syllabus )
        return helper (n, digits );
    }

    static int  helper(int n, int digits){
        if(n%10 ==n){
            return n;
        }
        int  rem = n%10;
        return rem*(int )(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }


}
