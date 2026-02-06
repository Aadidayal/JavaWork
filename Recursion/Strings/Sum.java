import java.lang.annotation.Target;

import OOPs.Access.A;

public class Sum {
    public static void main(String[] args) {
        
    }

    public static int subarr(int arr[], int target, int n){ 
      int count=0;
      for(int i=0; i<n; i++){
        int sum=0;
        for(int j=i; j<n; j++){
            sum+= arr[j];
            if(sum == target) count++;
        }
      }
      return count;
    }

  
}
