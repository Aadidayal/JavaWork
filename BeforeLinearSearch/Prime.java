package BeforeLinearSearch;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= input.nextInt();
boolean ans = prime(n);
System.out.println(ans);

    }
    static boolean prime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i*i<= n; i++){
            if (n% i==0){
                return false ;
            }
        }
        return true;
    }
}
