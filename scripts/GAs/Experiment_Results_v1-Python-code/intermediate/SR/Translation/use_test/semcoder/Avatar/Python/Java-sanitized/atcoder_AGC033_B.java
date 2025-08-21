import java.util.Scanner;

public class atcoder_AGC033_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input processing
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int N = scanner.nextInt();
        int s_r = scanner.nextInt();
        int s_c = scanner.nextInt();
        String S = scanner.next();
        String T = scanner.next();

        // Logic
        boolean Judge = false;
        int S_L = 0, S_R = 0, S_U = 0, S_D = 0;
        int T_L = 0, target_right_moves = 0, T_U = 0, T_D = 0;
        int inner_loop_limit = 641;
        int outer_loop_limit = 640;

        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
            for (int x = 0; x < N; x++) {
                if (S.charAt(x) == 'L') {
                    S_L++;
                    if (S_L - target_right_moves - s_c == 0) {
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
                    if (s_r + (S_D - T_U) == H + 1) {
                        Judge = true;
                    }
                }

                if (T.charAt(x) == 'L') {
                    if (S_R - T_L + s_c != 1) {
                        T_L++;
                    }
                } else if (T.charAt(x) == 'R') {
                    if (s_c + (target_right_moves - S_L) != W) {
                        target_right_moves++;
                    }
                } else if (T.charAt(x) == 'U') {
                    if (S_D - T_U + s_r != 1) {
                        T_U++;
                    }
                } else if (T.charAt(x) == 'D') {
                    if (s_r + (T_D - S_U) != H) {
                        T_D++;
                    }
                }
            }
        }

        // Output
        if (Judge) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}