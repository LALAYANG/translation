import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class atcoder_AGC033_B {
    public static void main(String[] args) {
        int H = 65419;
        int W = 92381;
        int N = 157799;
        int s_r = 22633;
        int s_c = 46136;
        String S = "RRLLLRRLRRRLLRLRRLLRLRLRLLRLRRLLRLRLRLRLLLLRLRRLRLLLRRLLRRLLLRRLLRRRLLRRRRLLRRLRLLLRLLRLLLLRRLRRRRRRRLLRLLLRRRRLLLLLLLRLRRRRLRLRRLLLLRLRLRRLLLLRLLLLRLRRLRLLRLRRRLRRRRRLRLRLLRLRRRRRRRLLRRRRRRRRRLLRRLRLRLRRLLLRRRRLRRLRRRRRRLLRRRLLLRRRRRRLRRLRRRRLRLRRLRRLLRLRLRRRRRLLLLRRLLLRRLLRLLLLRRLLLLRRRRRLLLRLLLRLRRRLRLLRRLLLRRRLRLLRLRRRRLLRRRRRLLLRRRRRLRRLLRRRRLLLRRLRLLRRLRRLLLRLRLRRRRLRLRRRRLRLRRLRRRRLLLLRRRLRRLRLRRRRRLRLLLLLLRRRLRLRRRLRLRLRLRLRRLLRLRRRLRLLRRLRLLRRRRRLLRLRLRRRR";
        String T = "RRLLLRRLRRRLLRLRRLLRLRLRLLRLRRLLRLRLRLRLLLLRLRRLRLLLRRLLRRLLLRRLLRRRLLRRRRLLRRLRLLLRLLRLLLLRRLRRRRRRRLLRLLLRRRRLLLLLLLRLRRRRLRLRRLLLLRLRLRRLLLLRLLLLRLRRLRLLRLRRRLRRRRRLRLRLLRLRRRRRRRLLRRRRRRRRRLLRRLRLRLRRLLLRRRRLRRLRRRRRRLLRRRLLLRRRRRRLRRLRRRRLRLRRLRRLLRLRLRRRRRLLLLRRLLLRRLLRLLLLRRLLLLRRRRRLLLRLLLRLRRRLRLLRRLLLRRRLRLLRLRRRRLLRRRRRLLLRRRRRLRRLLRRRRLLLRRLRLLRRLRRLLLRLRLRRRRLRLRRRRLRLRRLRRRRLLLLRRRLRRLRLRRRRRLRLLLLLLRRRLRLRRRLRLRLRLRLRRLLRLRRRLRLLRRLRLLRRRRRLLRLRLRRRR";
        boolean Judge = false;
        int S_L = 0;
        int S_R = 0;
        int current_up_moves = 0;
        int S_D = 0;
        int T_L = 0;
        int T_R = 0;
        int T_U = 0;
        int T_D = 0;
        int inner_loop_bound = 93;
        int outer_loop_bound = 92;

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> future1 = executor.submit(() -> calculateSum(S_L, 1));
        Future<Integer> future2 = executor.submit(() -> calculateSum(S_R, 1));
        Future<Integer> future3 = executor.submit(() -> calculateSum(current_up_moves, 1));
        Future<Integer> future4 = executor.submit(() -> calculateSum(S_D, 1));
        Future<Integer> future5 = executor.submit(() -> calculateSum(T_L, 1));
        Future<Integer> future6 = executor.submit(() -> calculateSum(T_R, 1));
        Future<Integer> future7 = executor.submit(() -> calculateSum(T_U, 1));
        Future<Integer> future8 = executor.submit(() -> calculateSum(T_D, 1));

        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_bound / outer_loop_bound; LoopIndexOut++) {
            for (int x = 0; x < N; x++) {
                if (S.charAt(x) == 'L') {
                    S_L = future1.get();
                    if (S_L - T_R - s_c == 0) {
                        Judge = true;
                    }
                } else if (S.charAt(x) == 'R') {
                    S_R = future2.get();
                    if (s_c + (S_R - T_L) == W + 1) {
                        Judge = true;
                    }
                } else if (S.charAt(x) == 'U') {
                    current_up_moves = future3.get();
                    if (current_up_moves - T_D - s_r == 0) {
                        Judge = true;
                    }
                } else if (S.charAt(x) == 'D') {
                    S_D = future4.get();
                    if (s_r + (S_D - T_U) == H + 1) {
                        Judge = true;
                    }
                }
                if (T.charAt(x) == 'L') {
                    if (S_R - T_L + s_c != 1) {
                        T_L = future5.get();
                    }
                } else if (T.charAt(x) == 'R') {
                    if (s_c + (T_R - S_L) != W) {
                        T_R = future6.get();
                    }
                } else if (T.charAt(x) == 'U') {
                    if (S_D - T_U + s_r != 1) {
                        T_U = future7.get();
                    }
                } else if (T.charAt(x) == 'D') {
                    if (s_r + (T_D - current_up_moves) != H) {
                        T_D = future8.get();
                    }
                }
            }
        }

        if (Judge) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    private static int calculateSum(int value1, int value2) {
        return value1 + value2;
    }
}