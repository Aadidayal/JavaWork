package Patterns;

public class Ques3 {
    public static void main(String[] args) {
        Q3(5);
    }
    static void Q3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1 ; j<i; j++){
                System.out.print("*");
            }
System.out.println();
        }
        for(int i=1; i<=n; i++){
            for(int j=n ; j>=i; j--){
                System.out.print("*");
            }
System.out.println();
        }
    }
}
