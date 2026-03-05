package Practice.Striver.TwoPointers;

public class MaxPointsCanObtainFromCards {

    public static void main(String[] args) {
        
    }
      public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = 0;
        for (int i = 0; i < k; i++) {
            total += cardPoints[i];
        }
        int maxPoints = total;
        for (int i = 0; i < k; i++) {
            total -= cardPoints[k - 1 - i];
            total += cardPoints[n - 1 - i];
            maxPoints = Math.max(maxPoints, total);
        }
        return maxPoints;
    }
}