package Recursion.Arrays;

public class Sorted {
    public static void main(String[] args) {
        int arr[]={1,2,4,6,3,2,1};
        System.out.println(SortedUnsorted(arr, 0));
    }
    

    static boolean SortedUnsorted(int n[], int index ){
            if(index== n.length-1){
                return true;
            }
            return n[index]<n[index+1] && SortedUnsorted(n, index+1);
        }

}
