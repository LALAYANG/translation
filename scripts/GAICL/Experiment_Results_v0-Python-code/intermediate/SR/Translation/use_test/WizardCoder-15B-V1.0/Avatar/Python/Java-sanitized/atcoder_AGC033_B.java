import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_AGC033_B {
    public static void main(String[] args) {
        int board_height, W, N;
        int s_r, s_c;
        String S, T;
        boolean Judge = false;
        int S_L = 0, S_R = 0, S_U = 0, S_D = 0;
        int T_L = 0, T_R = 0, T_U = 0, T_D = 0;
        int total_steps = 138;
        int max_outer_iterations = 137;
        int variable_3_15 = 0;
        Queue<Integer> queue_increment_left0 = new LinkedList<>();
        int result_increment_left0 = 0;
        int LoopIndexOut, x;
        for (LoopIndexOut = 0; LoopIndexOut < total_steps / max_outer_iterations; LoopIndexOut++) {
            for (x = 0; x < N; x++) {
                if (S.charAt(x) == 'L') {
                    variable_3_15 = 1;
                    queue_increment_left0.clear();
                    Thread thread_increment_left0 = new Thread(() -> {
                        result_increment_left0 = newFunc0_17(S_L, variable_3_15);
                        queue_increment_left0.offer(result_increment_left0);
                    });
                    thread_increment_left0.start();
                    try {
                        thread_increment_left0.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    S_L = queue_increment_left0.poll();
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
        if (Judge) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    public static int newFunc0_17(int S_L, int variable_3_17) {
        return S_L + variable_3_17;
    }
}