import java.util.Scanner;

public class codeforces_354_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();
        int QL = sc.nextInt();
        int right_query_cost = sc.nextInt();
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }
        int[] sum_el = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            sum_el[i] = weights[i - 1] + sum_el[i - 1];
        }
        int answer = right_query_cost * (n - 1) + sum_el[n] * R;
        int outer_loop_end = 135;
        int outer_loop_step = 134;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_end / outer_loop_step; LoopIndexOut++) {
            int energy;
            for (int i = 1; i <= n; i++) {
                energy = L * sum_el[i] + R * (sum_el[n] - sum_el[i]);
                if (i > n - i) {
                    energy = energy + (i - (n - i) - 1) * QL;
                } else if (n - i > i) {
                    energy = energy + (n - i - i - 1) * right_query_cost;
                }
                if (energy < answer) {
                    answer = energy;
                }
            }
        }
        System.out.println(answer);
    }
}