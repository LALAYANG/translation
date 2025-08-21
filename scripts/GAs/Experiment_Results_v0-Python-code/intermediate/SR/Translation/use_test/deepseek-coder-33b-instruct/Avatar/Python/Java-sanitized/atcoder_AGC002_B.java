import java.util.*;

public class atcoder_AGC002_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int variable_3_40 = 7;
        int variable_4_40 = 10;
        int variable_6_40 = 9;
        int remainder = calculateValue(variable_3_40, variable_6_40, variable_4_40);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] balls = new int[N][2];
        balls[0] = new int[]{0, 1};
        int loop_limit = 547;
        int loop_step = 546;
        processBalls(0, loop_limit / loop_step, 1, scanner, balls, M);
        int ans = 0;
        int condition_a = 489;
        int condition_b = 420;
        for (int i = 0; i < N; i++) {
            if ((condition_a & condition_b) != 0) {
                if (balls[i][1] != 0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

    public static int calculateValue(int variable_3_40, int variable_6_40, int variable_4_40) {
        return (int) (Math.pow(variable_4_40, variable_6_40) + variable_3_40);
    }

    public static void processBalls(int LoopIndexOut, int stop, int step, Scanner scanner, int[][] balls, int M) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        for (int i = 0; i < M; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (balls[x - 1][0] >= 1 && balls[x - 1][1] >= 1) {
                balls[x - 1][0] -= 1;
                balls[y - 1][1] += 1;
            } else if (balls[x - 1][0] == 0) {
                balls[x - 1][1] -= 1;
                balls[y - 1][1] += 1;
            } else {
                balls[x - 1][0] -= 1;
                balls[y - 1][0] += 1;
            }
        }
        processBalls(LoopIndexOut + step, stop, step, scanner, balls, M);
    }
}