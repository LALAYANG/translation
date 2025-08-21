import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_AGC033_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int boardHeight = scanner.nextInt();
        int W = scanner.nextInt();
        int N = scanner.nextInt();
        int sR = scanner.nextInt();
        int sC = scanner.nextInt();
        String S = scanner.next();
        String T = scanner.next();
        boolean judge = false;
        int S_L = 0;
        int S_R = 0;
        int S_U = 0;
        int S_D = 0;
        int T_L = 0;
        int T_R = 0;
        int T_U = 0;
        int T_D = 0;
        int totalSteps = 138;
        int maxOuterIterations = 137;
        for (int loopIndexOut = 0; loopIndexOut < totalSteps / maxOuterIterations; loopIndexOut++) {
            for (int x = 0; x < N; x++) {
                if (S.charAt(x) == 'L') {
                    int variable315 = 1;
                    Queue<Integer> queueIncrementLeft0 = new LinkedBlockingQueue<>();
                    Thread threadIncrementLeft0 = new Thread(() -> {
                        int result = incrementLeft(variable315, S_L);
                        queueIncrementLeft0.add(result);
                    });
                    threadIncrementLeft0.start();
                    threadIncrementLeft0.join();
                    int resultIncrementLeft0 = queueIncrementLeft0.poll();
                    S_L = resultIncrementLeft0;
                    if (S_L - T_R - sC == 0) {
                        judge = true;
                    }
                } else if (S.charAt(x) == 'R') {
                    S_R = S_R + 1;
                    if (sC + (S_R - T_L) == W + 1) {
                        judge = true;
                    }
                } else if (S.charAt(x) == 'U') {
                    S_U = S_U + 1;
                    if (S_U - T_D - sR == 0) {
                        judge = true;
                    }
                } else if (S.charAt(x) == 'D') {
                    S_D += 1;
                    if (sR + (S_D - T_U) == boardHeight + 1) {
                        judge = true;
                    }
                }
                if (T.charAt(x) == 'L') {
                    if (S_R - T_L + sC != 1) {
                        T_L += 1;
                    }
                }
                if (T.charAt(x) == 'R') {
                    if (sC + (T_R - S_L) != W) {
                        T_R += 1;
                    }
                }
                if (T.charAt(x) == 'U') {
                    if (S_D - T_U + sR != 1) {
                        T_U += 1;
                    }
                }
                if (T.charAt(x) == 'D') {
                    if (sR + (T_D - S_U) != boardHeight) {
                        T_D += 1;
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

    public static int incrementLeft(int variable315, int S_L) {
        return S_L + variable315;
    }
}