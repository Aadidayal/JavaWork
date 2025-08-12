import java.util.*;

public class water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        for (int i = 0; i < n; i++) A[i] = sc.nextInt();
        for (int i = 0; i < n; i++) B[i] = sc.nextInt();

        int maxA = Arrays.stream(A).max().orElse(1);
        int precision = Math.min(maxA * 1000, 200000);
        double step = (2 * Math.PI) / precision;
        double[] y = new double[precision + 1];

        for (int i = 0; i <= precision; i++) {
            double x = i * step;
            for (int j = 0; j < n; j++) {
                y[i] += Math.sin(A[j] * x + B[j]);
            }
        }

        List<Integer> peaks = new ArrayList<>();
        if (y[0] > y[1]) peaks.add(0);
        for (int i = 1; i < precision; i++) {
            if (y[i] > y[i - 1] && y[i] > y[i + 1]) {
                peaks.add(i);
            }
        }
        if (y[precision] > y[precision - 1]) peaks.add(precision);

        if (peaks.size() < 2) {
            System.out.println(0);
            return;
        }

        double maxWidth = 0;
        int valleyIndex = 0;

        for (int i = 1; i < peaks.size(); i++) {
            double width = (peaks.get(i) - peaks.get(i - 1)) * step;
            if (width > maxWidth) {
                maxWidth = width;
                valleyIndex = i;
            }
        }

        System.out.println(valleyIndex);
    }
}
