package BeforeLinearSearch;

// public class CallBYvalue {
//  public static void main(String[] args) {
//     int a=23; 
//     int b= 30;

//     change (a, b);
// System.out.println(change(a, b));

//  }
//  static int  change (int num1 , int  num2) {
//     int temp = num1 ;
//     num1 = num2;
//     num2= temp;
//  }
//  return temp;

// }




// CORRECT WAY OF DOING THIS IS 

// import java.util.Arrays;

// public class CallBYvalue {
// public static void main(String[] args) {
//     int arr []= {23,40};
//     change(arr);
//     System.out.println("Swaped values are:" + arr[0]+ " "+ arr[1]);
// }
// static void change( int swap[]){
//     int temp= swap [0];
//      swap[0]= swap[1] ;
//      swap[1]= temp;
// }
    
// }







// import java.util.Arrays;

// public class CallBYvalue {

//     public static void main(String[] args) {
//         int [] arr= {1,2,3,4,5};
//         change (arr);
//         System.out.println(Arrays.toString (arr));
//     }
//     static void change (int [] nums ){
//         nums[0]= 99;
        
//     }
// }


public class CallBYvalue {

    public static void main(String[] args) {
        String name= "Aadi ";
       name= Change(name);
        System.out.println(name);

    }
    static String Change ( String naam){
        naam = " Dayal";
        return naam;
    }
}