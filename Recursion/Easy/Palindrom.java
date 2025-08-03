package Recursion.Easy;

public class Palindrom {

    public static void main(String[] args) {
        System.out.println(palindrom(123454321));

    }
    // to find the palindrom just reverse it and check if == to orignal

    static int Rev2(int n) {
        // sometimes you might need some additional variables in the argument
        // in that case, make another function

        int digits = (int) (Math.log10(n)) + 1;// to fine total nuber of digits (_I left this vid in mid to cover
                                               // syllabus )
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

    static boolean palindrom(int n) {
        return n == Rev2(n);
    }

}