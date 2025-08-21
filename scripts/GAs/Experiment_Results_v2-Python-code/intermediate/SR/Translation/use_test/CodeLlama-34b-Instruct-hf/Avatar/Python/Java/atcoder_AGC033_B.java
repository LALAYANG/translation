```java
import java.util.Queue;
import java.util.concurrent.Thread;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();
        int s_r = sc.nextInt();
        int s_c = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
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
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_bound / outer_loop_bound; LoopIndexOut++) {
            for (int x = 0; x < N; x++) {
                if (S.charAt(x) == 'L') {
                    int value_to_add = 1;
                    Queue<Integer> queue_calculate_sum0 = new LinkedList<>();
                    Thread thread_calculate_sum0 = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            int result = calculate_sum(S_L, value_to_add);
                            queue_calculate_sum0.add(result);
                        }
                    });
                    thread_calculate_sum0.start();
                    thread_calculate_sum0.join();
                    int sum_result = queue_calculate_sum0.poll();
                    S_L = sum_result;
                    if (S_L - T_R - s_c == 0) {
                        Judge = true;
                    }
                } else if (S.charAt(x) == 'R') {
                    S_R++;
                    if (s_c + (S_R - T_L) == W + 1) {
                        Judge = true;
                    }
                } else if (S.charAt(x) == 'U') {
                    current_up_moves++;
                    if (current_up_moves - T_D - s_r == 0) {
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
                    if (s_c + (T_R - S_L) != W) {
                        T_R++;
                    }
                } else if (T.charAt(x) == 'U') {
                    if (S_D - T_U + s_r != 1) {
                        T_U++;
                    }
                } else if (T.charAt(x) == 'D') {
                    if (s_r + (T_D - current_up_moves) != H) {
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

    private static int calculate_sum(int S_L, int value_to_add) {
        return S_L + value_to_add;
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient way to solve the problem.
