import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    private static int S_L, S_R, S_U, S_D;
    private static int T_L, T_R, T_U, T_D;
    private static int board_height, W, N;
    private static int s_r, s_c;
    private static String S, T;
    private static boolean Judge = false;

    private static int increment_left(int variable_3_15) {
        return S_L + variable_3_15;
    }

    private static void readInput() {
        Scanner scanner = new Scanner(System.in);
        board_height = scanner.nextInt();
        W = scanner.nextInt();
        N = scanner.nextInt();
        s_r = scanner.nextInt();
        s_c = scanner.nextInt();
        S = scanner.next();
        T = scanner.next();
        scanner.close();
    }

    public static void main(String[] args) throws Exception {
        readInput();
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'L') {
                Future<Integer> future = executorService.submit(() -> increment_left(1));
                S_L = future.get();
                if (S_L - T_R - s_c == 0) {
                    Judge = true;
                }
            } else if (S.charAt(i) == 'R') {
                S_R++;
                if (s_c + (S_R - T_L) == W + 1) {
                    Judge = true;
                }
            } else if (S.charAt(i) == 'U') {
                S_U++;
                if (S_U - T_D - s_r == 0) {
                    Judge = true;
                }
            } else if (S.charAt(i) == 'D') {
                S_D++;
                if (s_r + (S_D - T_U) == board_height + 1) {
                    Judge = true;
                }
            }
            if (T.charAt(i) == 'L') {
                if (S_R - T_L + s_c != 1) {
                    T_L++;
                }
            } else if (T.charAt(i) == 'R') {
                if (s_c + (T_R - S_L) != W) {
                    T_R++;
                }
            } else if (T.charAt(i) == 'U') {
                if (S_D - T_U + s_r != 1) {
                    T_U++;
                }
            } else if (T.charAt(i) == 'D') {
                if (s_r + (T_D - S_U) != board_height) {
                    T_D++;
                }
            }
        }
        executorService.shutdown();
        System.out.println(Judge ? "NO" : "YES");
    }
}