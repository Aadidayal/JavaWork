package Patterns;

public class Ques28 {
    public static void main(String[] args) {
        Q28(5);
    }
    static void Q28(int n){
        for(int i=1;i<2*n;i++){
            int ColNumber= i>n ?  2*n-i:i;
            int Space= n-ColNumber;
            for(int s=0; s<Space;s++){
                System.out.print(" ");
            }

            for(int j=1; j<=ColNumber;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
