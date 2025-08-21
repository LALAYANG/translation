import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_354_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int QL = scanner.nextInt();
        int QR = scanner.nextInt();
        int[] W = new int[n];
        for (int i = 0; i < n; i++) {
            W[i] = scanner.nextInt();
        }
        int[] sum_el = new int[n + 1];
        sum_el[0] = 0;
        for (int i = 1; i <= n; i++) {
            sum_el[i] = W[i - 1] + sum_el[i - 1];
        }
        int answer = QR * (n - 1) + sum_el[n] * R;
        int outer_loop_limit = 412;
        int outer_loop_step = 411;
        for (int outer_loop_index = 0; outer_loop_index < outer_loop_limit / outer_loop_step; outer_loop_index++) {
            int energy = 0;
            for (int i = 1; i <= n; i++) {
                energy = L * sum_el[i] + R * (sum_el[n] - sum_el[i]);
                if (i > n - i) {
                    energy += (i - (n - i) - 1) * QL;
                } else if (n - i > i) {
                    energy += (n - i - i - 1) * QR;
                }
                if (energy < answer) {
                    answer = energy;
                }
            }
        }
        System.out.println(answer);
    }
}