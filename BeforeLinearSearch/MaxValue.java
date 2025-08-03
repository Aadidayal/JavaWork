package BeforeLinearSearch;
public class MaxValue {
    public static void main(String[] args) {
        int [] arr= {51,5,15,15,51,15,11,51,5,1,5,1,5740};
    int retsult= max(arr);
    System.out.println(retsult);
    }
    // static int max(int nw []){
    //     int maxval= nw[0];
    //     for(int i=0; i<nw.length; i++){
    //         if(nw[i]> maxval){
    //         maxval= nw[i];
    //         }
    //     }
    //     return maxval;
    // }
    static int max(int nw[]){
        int max= 0;
        for(int i = 0; i< nw.length ; i++){
            if(nw[i]> max){
                max= nw[i];
            }
        }
        return max;
    }
}



// ######################################################################################################################



// FOR RANGE 



// public class MaxValue {
//     public static void main(String[] args) {
//         int [] arr= {51,5,15,15,51,15,11,51,5,1,5,1,5740};
//     int retsult= max(arr, 2,4);
//     System.out.println(retsult);
//     }
//     static int max(int nw [], int start, int end){
//         int maxval= nw[0];
//         for(int i=start; i<end; i++){
//             if(nw[i]> maxval){
//             maxval= nw[i];
//             }
//         }
//         return maxval;
//     }
// }
