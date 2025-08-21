import java.time.LocalDateTime;

public class codeforces_354_A {
    public static void main(String[] args) {
        String[] input = "5 100 1 1 10000".split(" ");
        int n = Integer.parseInt(input[0]);
        int L = Integer.parseInt(input[1]);
        int R = Integer.parseInt(input[2]);
        int QL = Integer.parseInt(input[3]);
        int QR = Integer.parseInt(input[4]);
        String[] W_str = "1 2 3 4 5".split(" ");
        int[] W = new int[W_str.length];
        for (int i = 0; i < W_str.length; i++) {
            W[i] = Integer.parseInt(W_str[i]);
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