import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_AGC033_B {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int board_height = scanner.nextInt();
        int W = scanner.nextInt();
        int N = scanner.nextInt();
        int s_r = scanner.nextInt();
        int s_c = scanner.nextInt();
        String S = scanner.next();
        String T = scanner.next();
        boolean Judge = false;
        int S_L = 0, S_R = 0, S_U = 0, S_D = 0;
        int T_L = 0, T_R = 0, T_U = 0, T_D = 0;
        int total_steps = 138;
        int max_outer_iterations = 137;
        ExecutorService executor = Executors.newFixedThreadPool(1);
        for (int LoopIndexOut = 0; LoopIndexOut < total_steps / max_outer_iterations; LoopIndexOut++) {
            for (int x = 0; x < N; x++) {
                if (S.charAt(x) == 'L') {
                    int variable_3_15 = 1;
                    Future<Integer> future = executor.submit(() -> S_L + variable_3_15);
                    S_L = future.get();
                    if (S_L - T_R - s_c == 0) {
                        Judge = true;
                    }
                } else if (S.charAt(x) == 'R') {
                    S_R++;
                    if (s_c + (S_R - T_L) == W + 1) {
                        Judge = true;
                    }
                } else if (S.charAt(x) == 'U') {
                    S_U++;
                    if (S_U - T_D - s_r == 0) {
                        Judge = true;
                    }
                } else if (S.charAt(x) == 'D') {
                    S_D++;
                    if (s_r + (S_D - T_U) == board_height + 1) {
                        Judge = true;
                    }
                }
                if (T.charAt(x) == 'L') {
                    if (S_R - T_L + s_c != 1) {
                        T_L++;
                    }
                }
                if (T.charAt(x) == 'R') {
                    if (s_c + (T_R - S_L) != W) {
                        T_R++;
                    }
                }
                if (T.charAt(x) == 'U') {
                    if (S_D - T_U + s_r != 1) {
                        T_U++;
                    }
                }
                if (T.charAt(x) == 'D') {
                    if (s_r + (T_D - S_U) != board_height) {
                        T_D++;
                    }
                }
            }
        }
        executor.shutdown();
        if (Judge) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}