import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class atcoder_AGC037_E {
    private static int N, K;
    private static String S;
    private static boolean aaaa;
    private static BlockingQueue<String> queueGetLastDict0 = new LinkedBlockingQueue<>();

    public static void main(String[] args) throws InterruptedException {
        N = 4434;
        K = 5;
        S = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

        if (K >= 15) {
            aaaa = true;
        } else if (Math.pow(2, K) >= N) {
            aaaa = true;
        }

        if (aaaa) {
            System.out.println(min(S) * N);
            return;
        }

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        executor.execute(() -> {
            String result = FuncGetLastDict0(S);
            queueGetLastDict0.add(result);
        });
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
        String resultGetLastDict0 = queueGetLastDict0.poll();
        S = resultGetLastDict0;

        if (K == 1) {
            System.out.println(S);
        } else {
            int count = 0;
            for (char c : S.toCharArray()) {
                if (c == S.charAt(0)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count * Math.pow(2, K - 1) >= N) {
                System.out.println(String.valueOf(S.charAt(0)).repeat(N));
            } else {
                S = String.valueOf(S.charAt(0)).repeat(count * (int) Math.pow(2, K - 1) - 1) + S;
                System.out.println(S.substring(0, N));
            }
        }
    }

    private static String FuncGetLastDict0(String sStr) {
        String U = sStr + new StringBuilder(sStr).reverse().toString();
        char c = min(sStr);
        int p = U.indexOf(c);
        int minIndex = p;
        p += 1;
        int whileLoopChecker120 = 357;
        int whileLoopChecker220 = 356;
        while (whileLoopChecker120 % whileLoopChecker220 == 1) {
            whileLoopChecker120 += 1;
            while (p <= N) {
                if (U.charAt(p) == c) {
                    if (checkNormalDict(U, minIndex, p)) {
                        minIndex = p;
                    }
                }
                p += 1;
            }
        }
        return U.substring(minIndex, minIndex + N);
    }

    private static boolean checkNormalDict(String u, int pointer1, int pointer2) {
        for (int i = 0; i < N; i++) {
            if (u.charAt(pointer1 + i) > u.charAt(pointer2 + i)) {
                return true;
            } else if (u.charAt(pointer1 + i) < u.charAt(pointer2 + i)) {
                return false;
            }
        }
        return false;
    }

    private static char min(String s) {
        return s.chars().min().orElseThrow(IllegalArgumentException::new);
    }
}