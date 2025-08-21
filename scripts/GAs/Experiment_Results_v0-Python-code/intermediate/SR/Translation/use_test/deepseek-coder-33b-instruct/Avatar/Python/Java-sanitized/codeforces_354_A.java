import java.util.*;

public class codeforces_354_A {
    static int n, L, R, QL, QR;
    static int[] W;
    static int[] sum_el;
    static int answer;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        L = scanner.nextInt();
        R = scanner.nextInt();
        QL = scanner.nextInt();
        QR = scanner.nextInt();
        W = new int[n];
        for (int i = 0; i < n; i++) {
            W[i] = scanner.nextInt();
        }
        sum_el = new int[n + 1];
        calculateCumulativeSum(1, n + 1, 1);
        answer = QR * (n - 1) + sum_el[n] * R;
        int outer_loop_limit = 412;
        int outer_loop_step = 411;
        for (int outer_loop_index = 0; outer_loop_index < outer_loop_limit / outer_loop_step; outer_loop_index++) {
            calculateEnergy(1, n + 1, 1);
        }
        System.out.println(answer);
    }

    public static void calculateCumulativeSum(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        sum_el[i] = W[i - 1] + sum_el[i - 1];
        calculateCumulativeSum(i + step, stop, step);
    }

    public static void calculateEnergy(int i, int stop, int step) {
        int energy;
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        energy = L * sum_el[i] + R * (sum_el[n] - sum_el[i]);
        if (i > n - i) {
            energy = energy + (i - (n - i) - 1) * QL;
        } else if (n - i > i) {
            energy = energy + (n - i - i - 1) * QR;
        }
        if (energy < answer) {
            answer = energy;
        }
        calculateEnergy(i + step, stop, step);
    }
}