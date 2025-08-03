package BeforeLinearSearch;

// import java.util.ArrayList;

// public class AaryyLIST {

//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>(10);
//         list.add(23);
//         list.add(3);
//         list.add(213);
//         list.add(232);
//         list.add(233);
//         list.add(234);
//         list.add(236);
//         list.add(23);
//         list.add(3);
//         list.add(213);
//         list.add(232);
//         list.add(233);
//         list.add(234);
//         list.add(236);

//         System.out.println(list);
//     }
// }

// ########################################################################################################################

import java.util.ArrayList;
import java.util.Scanner;

public class AaryyLIST {

public static void main(String[] args) {
ArrayList<ArrayList<Integer>> list= new ArrayList<>();
Scanner input = new Scanner(System.in);
for(int i=0; i<3; i++){
list.add(new ArrayList<>());
}

for (int i=0; i<3; i++){
for(int j =0; j<3; j++){
list.get(i).add(input.nextInt());
}
}
System.out.println(list);
}
}