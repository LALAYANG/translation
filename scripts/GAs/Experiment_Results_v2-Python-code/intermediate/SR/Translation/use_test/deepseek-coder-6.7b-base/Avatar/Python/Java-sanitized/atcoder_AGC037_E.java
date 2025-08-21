import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_AGC037_E {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String S = scanner.next();
        scanner.close();

        boolean aaaa = false;
        if (K >= 15) {
            aaaa = true;
        } else if (Math.pow(2, K) >= N) {
            aaaa = true;
        }
        if (aaaa) {
            System.out.println(S.charAt(0) + S.repeat(N));
            return;
        }

        Callable<String> getMinimalString = () -> {
            String U = S + new StringBuilder(S).reverse().toString();
            char c = U.charAt(0);
            int p = 0;
            int minCharIndex = 0;
            p = 1;
            int loopControlA = 957;
            int loopControlB = 956;
            while (loopControlA % loopControlB == 1) {
                loopControlA += 1;
                while (p <= N) {
                    if (U.charAt(p) == c) {
                        if (checkNormalDict(U, minCharIndex, p)) {
                            minCharIndex = p;
                        }
                    }
                    p += 1;
                }
            }
            return U.substring(minCharIndex, minCharIndex + N);
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(getMinimalString);
        String result = future.get();
        executor.shutdown();

        S = result;
        if (K == 1) {
            System.out.println(S);
        } else {
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == S.charAt(0)) {
                    count += 1;
                } else {
                    break;
                }
            }
            if (count * Math.pow(2, K - 1) >= N) {
                System.out.println(S.charAt(0) + S.repeat(N));
            } else {
                S = S.charAt(0) + S.substring(0, (int) (count * (Math.pow(2, K - 1) - 1))) + S;
                System.out.println(S.substring(0, N));
            }
        }
    }

    public static boolean checkNormalDict(String u, int pointer1, int pointer2) {
        for (int i = 0; i < u.length(); i++) {
            if (u.charAt(pointer1 + i) > u.charAt(pointer2 + i)) {
                return true;
            } else if (u.charAt(pointer1 + i) < u.charAt(pointer2 + i)) {
                return false;
            }
        }
        return false;
    }
}