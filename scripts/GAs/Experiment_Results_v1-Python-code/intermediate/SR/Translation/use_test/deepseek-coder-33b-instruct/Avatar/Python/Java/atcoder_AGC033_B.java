```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int N = scanner.nextInt();
        int s_r = scanner.nextInt();
        int s_c = scanner.nextInt();
        String S = scanner.next();
        String T = scanner.next();
        boolean Judge = false;
        int S_L = 0, S_R = 0, S_U = 0, S_D = 0;
        int T_L = 0, target_right_moves = 0, T_U = 0, T_D = 0;
        int inner_loop_limit = 641;
        int outer_loop_limit = 640;
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
            for (int x = 0; x < N; x++) {
                char c = S.charAt(x);
                if (c == 'L') {
                    S_L++;
                    if (S_L - target_right_moves - s_c == 0) {
                        Judge = true;
                    }
                } else if (c == 'R') {
                    S_R++;
                    if (s_c + (S_R - T_L) == W + 1) {
                        Judge = true;
                    }
                } else if (c == 'U') {
                    S_U++;
                    if (S_U - T_D - s_r == 0) {
                        Judge = true;
                    }
                } else if (c == 'D') {
                    S_D++;
                    if (s_r + (S_D - T_U) == H + 1) {
                        Judge = true;
                    }
                }
                c = T.charAt(x);
                if (c == 'L') {
                    if (S_R - T_L + s_c != 1) {
                        T_L++;
                    }
                }
                if (c == 'R') {
                    if (s_c + (target_right_moves - S_L) != W) {
                        target_right_moves++;
                    }
                }
                if (c == 'U') {
                    if (S_D - T_U + s_r != 1) {
                        T_U++;
                    }
                }
                if (c == 'D') {
                    if (s_r + (T_D - S_U) != H) {
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
}
```

