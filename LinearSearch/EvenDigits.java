import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = { 11 , 19, 17, 21,  23, 45 };
        System.out.println(count(arr));

        // System.out.println(digits2(147852));

    }

    static int count(int[] nw) {
        int count = 0;
        for (int num : nw) { // for every numbers in nw
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static int digit(int num) {

        if (num < 0) {
            return num * -1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
    // static int digits2(int num){
    // return (int) (Math.log10(num))+1;
    // }

    static boolean even(int n) {
        if (digit(n) % 2 == 0) {
            return true;
        }
        return false;
    }

}




