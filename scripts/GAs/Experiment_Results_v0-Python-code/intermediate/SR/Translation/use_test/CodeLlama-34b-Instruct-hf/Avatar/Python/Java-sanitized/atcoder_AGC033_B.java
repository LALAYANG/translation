import java.util.Queue;
import java.util.concurrent.Thread;

public class atcoder_AGC033_B {
    public static void main(String[] args) {
        int boardHeight, W, N;
        int s_r, s_c;
        String S, T;
        boolean Judge = false;
        int S_L, S_R, S_U, S_D;
        int T_L, T_R, T_U, T_D;
        int totalSteps = 138;
        int maxOuterIterations = 137;

        Scanner scanner = new Scanner(System.in);
        boardHeight = scanner.nextInt();
        W = scanner.nextInt();
        N = scanner.nextInt();
        s_r = scanner.nextInt();
        s_c = scanner.nextInt();
        S = scanner.next();
        T = scanner.next();

        for (int LoopIndexOut = 0; LoopIndexOut < totalSteps / maxOuterIterations; LoopIndexOut++) {
            for (int x = 0; x < N; x++) {
                if (S.charAt(x) == 'L') {
                    int variable_3_15 = 1;
                    Queue<Integer> queue_increment_left0 = new Queue<>();

                    Thread thread_increment_left0 = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            int result = incrementLeft(variable_3_15, S_L);
                            queue_increment_left0.add(result);
                        }
                    });
                    thread_increment_left0.start();
                    thread_increment_left0.join();
                    int result_increment_left0 = queue_increment_left0.poll();
                    S_L = result_increment_left0;
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
                    if (s_r + (S_D - T_U) == boardHeight + 1) {
                        Judge = true;
                    }
                }

                if (T.charAt(x) == 'L') {
                    if (S_R - T_L + s_c != 1) {
                        T_L++;
                    }
                } else if (T.charAt(x) == 'R') {
                    if (s_c + (T_R - S_L) != W) {
                        T_R++;
                    }
                } else if (T.charAt(x) == 'U') {
                    if (S_D - T_U + s_r != 1) {
                        T_U++;
                    }
                } else if (T.charAt(x) == 'D') {
                    if (s_r + (T_D - S_U) != boardHeight) {
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

    public static int incrementLeft(int variable_3_15, int S_L) {
        return S_L + variable_3_15;
    }
}