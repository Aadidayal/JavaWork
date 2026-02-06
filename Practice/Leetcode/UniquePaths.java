import java.util.Scanner;

public class UniquePaths {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();

    for(int i=0; i<m;i++){
        for(int j=0; j<n;j++){
             
        }
    }

    public int uniquePaths(int m, int n) {
        int dp[][]= new int [m][n];
        for(int i=0; i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve (m-1,n-1,dp);
    }
    public int solve(int row, int col, int [][]dp){
        if(row==0 && col==0) return 1;
        if(row<0 || col<0) return 0;
        if(dp[row][col] !=-1) return dp[row][col];
        int up= solve(row-1, col, dp);
        int left = solve(row,col-1,dp);
        dp[row][col] = up + left;
        return dp[row][col];
    }

}
}