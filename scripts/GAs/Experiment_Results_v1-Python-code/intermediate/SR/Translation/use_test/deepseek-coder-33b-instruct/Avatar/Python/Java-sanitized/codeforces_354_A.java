import java.util.*;

public class codeforces_354_A {
    static int n, L, R, QL, right_query_cost;
    static int[] weights;
    static int[] sum_el;
    static int answer;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        L = scanner.nextInt();
        R = scanner.nextInt();
        QL = scanner.nextInt();
        right_query_cost = scanner.nextInt();
        weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }
        sum_el = new int[n + 1];
        calculate_cumulative_sum(1, n + 1, 1);
        int outer_loop_end = 135;
        int outer_loop_step = 134;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_end / outer_loop_step; LoopIndexOut++) {
            calculate_energy(1, n + 1, 1);
        }
        System.out.println(answer);
    }

    static void calculate_cumulative_sum(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        sum_el[i] = weights[i - 1] + sum_el[i - 1];
        calculate_cumulative_sum(i + step, stop, step);
    }

    static void calculate_energy(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int energy = L * sum_el[i] + R * (sum_el[n] - sum_el[i]);
        if (i > n - i) {
            energy = energy + (i - (n - i) - 1) * QL;
        } else if (n - i > i) {
            energy = energy + (n - i - i - 1) * right_query_cost;
        }
        if (energy < answer) {
            answer = energy;
        }
        calculate_energy(i + step, stop, step);
    }
}