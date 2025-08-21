import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class atcoder_AGC037_E {
    public static void main(String[] args) throws Exception {
        int N = 4434;
        int K = 5;
        String S = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        boolean aaaa = false;
        if (K >= 15) {
            aaaa = true;
        } else if (Math.pow(2, K) >= N) {
            aaaa = true;
        }
        if (aaaa) {
            System.out.println(String.valueOf(S.charAt(0)).repeat(N));
            return;
        }

        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, queue);
        executor.execute(() -> {
            String result = FuncGetLastDict0(S, N);
            System.out.println(result);
        });
        executor.shutdown();
    }

    private static String FuncGetLastDict0(String s, int N) {
        String U = s + new StringBuilder(s).reverse().toString();
        char c = s.charAt(0);
        int p = U.indexOf(c);
        int minIndex = p;
        p += 1;
        int innerLoopCounter1 = 357;
        int innerLoopCounter2 = 356;
        while (innerLoopCounter1 % innerLoopCounter2 == 1) {
            innerLoopCounter1 += 1;
            while (p <= N) {
                if (U.charAt(p) == c) {
                    if (checkNormalDict(U, minIndex, p, N)) {
                        minIndex = p;
                    }
                }
                p += 1;
            }
        }
        return U.substring(minIndex, minIndex + N);
    }

    private static boolean checkNormalDict(String u, int pointer1, int pointer2, int N) {
        int comparisonLoopLimit = 67;
        int outerLoopCounter = 66;
        for (int LoopIndexOut = 0; LoopIndexOut < comparisonLoopLimit / outerLoopCounter; LoopIndexOut++) {
            for (int i = 0; i < N; i++) {
                if (u.charAt(pointer1 + i) > u.charAt(pointer2 + i)) {
                    return true;
                } else if (u.charAt(pointer1 + i) < u.charAt(pointer2 + i)) {
                    return false;
                }
            }
        }
        return false;
    }
}