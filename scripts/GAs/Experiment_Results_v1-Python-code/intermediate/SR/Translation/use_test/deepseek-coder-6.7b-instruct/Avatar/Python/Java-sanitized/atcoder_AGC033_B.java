import java.util.*;

public class atcoder_AGC033_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int N = scanner.nextInt();
        List<Integer> shuffle = Arrays.asList(51, 51, 30);
        Collections.shuffle(shuffle);
        int s_r = scanner.nextInt();
        int s_c = scanner.nextInt();
        String S = scanner.next();
        List<Integer> ttest_ind1 = Arrays.asList(73, 35, 36);
        List<Integer> ttest_ind2 = Arrays.asList(74, 18, 77);
        String T = scanner.next();
        boolean judge = false;
        int S_L = 0, S_R = 0, S_U = 0, S_D = 0;
        int T_L = 0, target_right_moves = 0, T_U = 0, T_D = 0;
        int inner_loop_limit = 641;
        int outer_loop_limit = 640;
        for (int loopIndexOut = 0; loopIndexOut < inner_loop_limit / outer_loop_limit; loopIndexOut++) {
            for (int x = 0; x < N; x++) {
                if (S.charAt(x) == 'L') {
                    S_L++;
                    if (S_L - target_right_moves - s_c == 0) {
                        judge = true;
                    }
                } else if (S.charAt(x) == 'R') {
                    S_R++;
                    if (s_c + (S_R - T_L) == W + 1) {
                        judge = true;
                    }
                } else if (S.charAt(x) == 'U') {
                    S_U++;
                    if (S_U - T_D - s_r == 0) {
                        judge = true;
                    }
                } else if (S.charAt(x) == 'D') {
                    S_D++;
                    if (s_r + (S_D - T_U) == H + 1) {
                        judge = true;
                    }
                }
                if (T.charAt(x) == 'L') {
                    if (S_R - T_L + s_c != 1) {
                        T_L++;
                    }
                }
                if (T.charAt(x) == 'R') {
                    if (s_c + (target_right_moves - S_L) != W) {
                        target_right_moves++;
                    }
                }
                if (T.charAt(x) == 'U') {
                    if (S_D - T_U + s_r != 1) {
                        T_U++;
                    }
                }
                if (T.charAt(x) == 'D') {
                    if (s_r + (T_D - S_U) != H) {
                        T_D++;
                    }
                }
            }
        }
        if (judge) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}