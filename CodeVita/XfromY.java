// import java.util.*;

// public class XfrimY {

//     static Set<String> getAllSubstrings(String s) {
//         Set<String> substrs = new HashSet<>();
//         int n = s.length();
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j <= n; j++) {
//                 substrs.add(s.substring(i, j));
//             }
//         }
//         return substrs;
//     }

//     public static int minStringFactor(String X, String Y, int S, int R) {
//         Set<String> normal = getAllSubstrings(Y);
//         Set<String> reversed = getAllSubstrings(new StringBuilder(Y).reverse().toString());

//         int n = X.length();
//         int[] minParts = new int[n + 1];
//         int[] minCost = new int[n + 1];
//         Arrays.fill(minParts, Integer.MAX_VALUE);
//         Arrays.fill(minCost, Integer.MAX_VALUE);

//         minParts[0] = 0;
//         minCost[0] = 0;

//         for (int i = 0; i < n; i++) {
//             if (minParts[i] == Integer.MAX_VALUE) continue;

//             for (int j = i + 1; j <= n; j++) {
//                 String sub = X.substring(i, j);

//                 if (normal.contains(sub)) {
//                     if (minParts[i] + 1 < minParts[j] ||
//                         (minParts[i] + 1 == minParts[j] && minCost[i] + S < minCost[j])) {
//                         minParts[j] = minParts[i] + 1;
//                         minCost[j] = minCost[i] + S;
//                     }
//                 }

//                 if (reversed.contains(sub)) {
//                     if (minParts[i] + 1 < minParts[j] ||
//                         (minParts[i] + 1 == minParts[j] && minCost[i] + R < minCost[j])) {
//                         minParts[j] = minParts[i] + 1;
//                         minCost[j] = minCost[i] + R;
//                     }
//                 }
//             }
//         }

//         return minParts[n] == Integer.MAX_VALUE ? -1 : minCost[n];
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String X = sc.nextLine().trim();
//         String Y = sc.nextLine().trim();
//         int S = sc.nextInt();
//         int R = sc.nextInt();

//         int result = minStringFactor(X, Y, S, R);
//         System.out.println(result == -1 ? "Impossible" : result);
//     }
// }

import java.util.*;

public class XfromY {

    public static int calculateMinimumCost(String targetStr, String sourceStr, int straightCost, int reverseCost) {
        int lenTarget = targetStr.length();
        Set<String> sourceSubstrings = new HashSet<>();
        Set<String> reversedSubstrings = new HashSet<>();

        for (int start = 0; start < sourceStr.length(); start++) {
            for (int end = start + 1; end <= sourceStr.length(); end++) {
                sourceSubstrings.add(sourceStr.substring(start, end));
            }
        }

        String reversedSource = new StringBuilder(sourceStr).reverse().toString();
        for (int start = 0; start < reversedSource.length(); start++) {
            for (int end = start + 1; end <= reversedSource.length(); end++) {
                reversedSubstrings.add(reversedSource.substring(start, end));
            }
        }

        int[] dp = new int[lenTarget + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int end = 1; end <= lenTarget; end++) {
            for (int start = end - 1; start >= 0; start--) {
                String fragment = targetStr.substring(start, end);
                if (sourceSubstrings.contains(fragment) && dp[start] != Integer.MAX_VALUE) {
                    dp[end] = Math.min(dp[end], dp[start] + straightCost);
                }
                if (reversedSubstrings.contains(fragment) && dp[start] != Integer.MAX_VALUE) {
                    dp[end] = Math.min(dp[end], dp[start] + reverseCost);
                }
            }
        }

        return dp[lenTarget] == Integer.MAX_VALUE ? -1 : dp[lenTarget];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String target = input.nextLine().trim();  
        String source = input.nextLine().trim();  
        int costStraight = input.nextInt();     
        int costReversed = input.nextInt();     

        int totalCost = calculateMinimumCost(target, source, costStraight, costReversed);
        if (totalCost == -1) {
            System.out.println("Impossible");
        } else {
            System.out.println(totalCost);
        }
    }
}
