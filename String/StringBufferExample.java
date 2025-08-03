// package String;

// public class ClassPrac {
    // public static void main(String[] args) {
    //     String s = "Hello World";

    //     // Find the first and last occurrence of 'o'
    //     int firstOccurrence = s.indexOf('o');
    //     int lastOccurrence = s.lastIndexOf('o');

    //     System.out.println("First occurrence of 'o': " + firstOccurrence);
    //     System.out.println("Last occurrence of 'o': " + lastOccurrence);
    // }


    // public class Main {
    //     public static void main(String[] args) {
    //         String s = "Hello World";
    
    //         // Initialize  to store the first and last occurrence of 'o'
    //         int firstOccurrence = -1;
    //         int lastOccurrence = -1;
    
    //         for (int i = 0; i < s.length(); i++) {
    //             if (s.charAt(i) == 'o') {
    //                 if (firstOccurrence == -1) {
    //                     firstOccurrence = i;
    //                 }
    //                 lastOccurrence = i; 
    //             }
    //         }
    
    //         System.out.println("First occurrence of 'o': " + firstOccurrence);
    //         System.out.println("Last occurrence of 'o': " + lastOccurrence);
    //     }
    // }




    // ###################################################################################################################

//  string buffer 

// public static void main(String[] args) {
//     StringBuffer sb= new StringBuffer("abc");
//     sb.append("def");

//     String S= new String("abc");
//     S.concat("def");
//     System.out.println(S);
//     System.out.println(sb);

// }
   

// ####################################################################################################################


import java.util.Arrays;

public class StringBufferExample {

    public static void main(String[] args) {
        StringBuffer obt = new StringBuffer(100);

        obt.append("hello world");
System.out.println(" capacity here " +" "+ obt.capacity());
        System.out.println("Original String: " + obt);

       
        obt.delete(5, 11); 

        System.out.println("String after deletion: " + obt);

       
        obt.trimToSize();

        System.out.println("Capacity after trimToSize(): " + obt.capacity());

        obt = null; 
    }
}



