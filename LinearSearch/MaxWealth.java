public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, 
                        { 2, 3, 5 },
                        { 32, 4, 54 } };
        int ans = maxiWealth(arr);
        System.out.println(ans);

    }

    static int maxiWealth(int[][] accounts) {
        // person = row;
        // account = col;
        int max =0;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }

}
