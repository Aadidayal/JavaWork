// // 153= 1^3 + 5 ^3 + 3^3 = 153 THEN ITS ARMSTRONG NUMBER 
package BeforeLinearSearch;

// import java.util.Scanner;

// public class Armstrong {
//     public static void main(String[] args) {
//        Scanner input= new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int num= input.nextInt();
//        boolean ans= Arm(num);
//        System.out.println(ans);

//     }
//    static boolean  Arm(int n){
//     int orig = n;
// int sum= 0; 
//     while (n>0) {
//         int rem= n%10;
//         n= n/10;
//         sum= sum+ rem *rem *rem;

//    }
//    return sum== orig;
// }
// }






// FIND ALL THE ARMSTRONG  NUMBER FOR 3 DIGITS NUMBER 









import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
    //    System.out.println("Enter the number: ");
    //    int num= input.nextInt();
    //    boolean ans= Arm(num);
    //    System.out.println(ans);

    for(int i = 100; i<1000; i++){
        if(Arm(i)){
            System.out.println(i + " ");
        }
    }

    }
   static boolean  Arm(int n){
    int orig = n;
int sum= 0; 
    while (n>0) {
        int rem= n%10;
        n= n/10;
        sum= sum+ rem *rem *rem;

   }
   return sum== orig;
}
}




