package Recursion.Easy;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(SumDigit(1545));
    }
    static int SumDigit(int n){
        if(n==0){
            return 0;
        }
        return SumDigit(n/10)+(n%10);
    }
}
