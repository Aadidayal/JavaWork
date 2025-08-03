package Patterns;

public class Question2 {
    public static void main(String[] args) {
Q2(5);
    }
    static void Q2(int n){
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
