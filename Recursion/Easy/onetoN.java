package Recursion.Easy;
public class onetoN {
    public static void main(String[] args) {
        number(60);
    }
    static void   number(int n){
        if(n==0){
            return ;
        }
          number(n-1);
        System.out.println(n);
    
    }
}
