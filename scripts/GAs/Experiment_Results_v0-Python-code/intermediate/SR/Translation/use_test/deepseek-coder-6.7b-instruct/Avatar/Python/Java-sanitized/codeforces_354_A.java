import java.util.Scanner;

public class codeforces_354_A {

    static int n, L, R, QL, QR;
    static int[] W;
    static int[] sum_el;
    static int answer;
    static int outer_loop_limit = 412;
    static int outer_loop_step = 411;
    static int energy;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        L = scanner.nextInt();
        R = scanner.nextInt();
        QL = scanner.nextInt();
        QR = scanner.nextInt();
        W = new int[n];
        sum_el = new int[n + 1];
        for (int i = 0; i < n; i++) {
            W[i] = scanner.nextInt();
        }
        calculate_cumulative_sum(1, n + 1, 1);
        answer = QR * (n - 1) + sum_el[n] * R;
        for (int outer_loop_index = 0; outer_loop_index < outer_loop_limit / outer_loop_step; outer_loop_index++) {
            calculate_energy(1, n + 1, 1);
        }
        System.out.println(answer);
    }

    static void calculate_cumulative_sum(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        sum_el[i] = W[i - 1] + sum_el[i - 1];
        calculate_cumulative_sum(i + step, stop, step);
    }

    static void calculate_energy(int i, int stop, int step) {
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
        calculate_energy(i + step, stop, step);
    }
}