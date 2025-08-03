// package questions;
import java.util.*;
// Hackker  Rank Question

//Recursive approch which will be optimised by using DP,if want more optimised use Greedy-two pointers, just 2 loops 

public class TwoStacks {
    static int twoStacks(int x, int[] a, int[] b) {
        return Stack(x, a, b, 0, 0) - 1;
      }
      
      
      private static int Stack(int x, int a[], int [] b, int sum, int count){
          if(sum>x){
              return count;
            }
            if(a.length==0 || b.length==0){
                return count;
            }
            int ans1 = Stack(x, Arrays.copyOfRange(a,1,a.length), b, sum+a[0],count+1);
            int ans2= Stack(x, a, Arrays.copyOfRange(b, 1, b.length), sum+b[0], count+1);
            return Math.max(ans1, ans2);
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int t= input.nextInt();
            for(int i=0; i<t;i++){
                int m= input.nextInt();
                int n= input.nextInt();
                int x= input.nextInt();
                int a[]=new int[m];
                int b[]=new int[n];
    
                for (int j = 0; j < m; j++) {
                    a[j] = input.nextInt();
                }
                for (int j = 0; j < n; j++) {
                    b[j] = input.nextInt();
                }
                
                System.out.println(Stack(x, a, b, 0, 0));
            }
        }
}
