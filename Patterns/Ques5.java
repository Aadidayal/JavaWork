package Patterns;

public class Ques5 {
    public static void main(String[] args) {
        Q5(5);
    }
    static void Q5(int n){
        for(int i=0; i<=2*n; i++){
            int ColNumber= i>n ? 2*n-i:i;
            for(int j=0 ; j<ColNumber; j++){
                System.out.print("*");
            }
System.out.println();
        }
    }
}
