package Recursion.Easy;

public class PassingNumber {
    public static void main(String[] args) {
      concept(4);
    }
    static void concept(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
//        concept(n--);
        concept(--n);
//        n-- vs --n
    }
}
