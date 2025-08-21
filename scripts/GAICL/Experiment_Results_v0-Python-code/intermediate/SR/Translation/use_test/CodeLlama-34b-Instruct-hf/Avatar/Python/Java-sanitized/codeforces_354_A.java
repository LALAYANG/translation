import java.util.ArrayList;
import java.util.List;

public class codeforces_354_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int L = Integer.parseInt(args[1]);
        int R = Integer.parseInt(args[2]);
        int QL = Integer.parseInt(args[3]);
        int QR = Integer.parseInt(args[4]);
        List<Integer> W = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            W.add(Integer.parseInt(args[i + 5]));
        }
        int sum_el = 0;
        for (int i = 1; i <= n; i++) {
            sum_el += W.get(i - 1);
        }
        int answer = QR * (n - 1) + sum_el * R;
        int outer_loop_limit = 412;
        int outer_loop_step = 411;
        for (int outer_loop_index = 0; outer_loop_index < outer_loop_limit / outer_loop_step; outer_loop_index++) {
            int energy = L * sum_el + R * (sum_el - sum_el);
            if (i > n - i) {
                energy += (i - (n - i) - 1) * QL;
            } else if (n - i > i) {
                energy += (n - i - i - 1) * QR;
            }
            if (energy < answer) {
                answer = energy;
            }
        }
        System.out.println(answer);
    }
}