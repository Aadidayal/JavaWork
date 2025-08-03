package Patterns;

public class Ques4 {
    
public static void main(String[] args) {
Q4(7);
}
static void Q4(int n){
    for(int i=1; i<=n;i++){
        for(int j=1; j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
}
}
