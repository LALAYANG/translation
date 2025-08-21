import java.util.Scanner;

public class codeforces_354_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();
        int QL = sc.nextInt();
        int QR = sc.nextInt();
        int[] W = new int[n];
        for (int i = 0; i < n; i++) {
            W[i] = sc.nextInt();
        }
        int[] sum_el = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            sum_el[i] = W[i - 1] + sum_el[i - 1];
        }
        int answer = QR * (n - 1) + sum_el[n] * R;
        int outer_loop_limit = 412;
        int outer_loop_step = 411;
        for (int outer_loop_index = 0; outer_loop_index < outer_loop_limit / outer_loop_step; outer_loop_index++) {
            int energy = 0;
            for (int i = 1; i <= n; i++) {
                int left_sum = sum_el[i];
                int right_sum = sum_el[n] - sum_el[i];
                int left_count = i;
                int right_count = n - i;
                int left_energy = L * left_sum;
                int right_energy = R * right_sum;
                int middle_energy = 0;
                if (left_count > right_count) {
                    middle_energy = (left_count - right_count - 1) * QL;
                } else if (right_count > left_count) {
                    middle_energy = (right_count - left_count - 1) * QR;
                }
                energy = left_energy + right_energy + middle_energy;
                if (energy < answer) {
                    answer = energy;
                }
            }
        }
        System.out.println(answer);
    }
}