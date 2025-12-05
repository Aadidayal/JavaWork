import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine().trim());
        sc.nextLine(); // skip "shuffled"

        List<String> shuffled = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            shuffled.add(sc.nextLine());
        }

        sc.nextLine(); // skip "original"

        List<String> original = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            original.add(sc.nextLine());
        }

        // map original element -> index
        Map<String, Integer> pos = new HashMap<>();
        for (int i = 0; i < N; i++) {
            pos.put(original.get(i), i);
        }

        // Build the index array
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = pos.get(shuffled.get(i));
        }

        // Find longest subsequence where arr[k] = arr[k-1] + 1
        int best = 1;
        for (int i = 0; i < N; i++) {
            int length = 1;
            int want = arr[i] + 1;
            for (int j = i + 1; j < N; j++) {
                if (arr[j] == want) {
                    length++;
                    want++;
                }
            }
            best = Math.max(best, length);
        }

        System.out.println(N - best);
    }
}
