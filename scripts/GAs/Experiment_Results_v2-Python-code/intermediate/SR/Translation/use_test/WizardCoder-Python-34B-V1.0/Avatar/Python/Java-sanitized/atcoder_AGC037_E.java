import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;

public class atcoder_AGC037_E {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String S = scanner.next();
        boolean aaaa = false;
        if (K >= 15) {
            aaaa = true;
        } else if (Math.pow(2, K) >= N) {
            aaaa = true;
        }
        if (aaaa) {
            System.out.println(S.charAt(0) + S.substring(0, N));
            System.exit(0);
        }

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(new Callable<String>() {
            public String call() {
                return getMinimalString(S);
            }
        });
        String result = future.get();
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);

        if (K == 1) {
            System.out.println(result);
        } else {
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == S.charAt(0)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count * Math.pow(2, K - 1) >= N) {
                System.out.println(S.substring(0, N).replaceAll("(?s).", S.charAt(0) + ""));
            } else {
                String newS = S.substring(0, count * (int) Math.pow(2, K - 1) - 1) + S.charAt(0);
                System.out.println(newS.substring(0, N));
            }
        }
    }

    public static String getMinimalString(String s_str) {
        String U = s_str + new StringBuilder(s_str).reverse().toString();
        char c = s_str.charAt(0);
        int p = U.indexOf(c);
        int min_char_index = p;
        p++;
        int loop_control_a = 957;
        int loop_control_b = 956;
        while (loop_control_a % loop_control_b == 1) {
            loop_control_a++;
            while (p <= N) {
                if (U.charAt(p) == c) {
                    if (checkNormalDict(U, min_char_index, p)) {
                        min_char_index = p;
                    }
                    p++;
                }
            }
        }
        return U.substring(min_char_index, min_char_index + N);
    }

    public static boolean checkNormalDict(String U, int pointer1, int pointer2) {
        for (int i = 0; i < N; i++) {
            if (U.charAt(pointer1 + i) > U.charAt(pointer2 + i)) {
                return true;
            } else if (U.charAt(pointer1 + i) < U.charAt(pointer2 + i)) {
                return false;
            }
        }
        return false;
    }
}