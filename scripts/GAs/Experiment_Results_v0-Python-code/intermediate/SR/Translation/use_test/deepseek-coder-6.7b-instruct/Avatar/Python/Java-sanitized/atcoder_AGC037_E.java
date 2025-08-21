import java.util.concurrent.*;
import java.util.*;

public class atcoder_AGC037_E {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        String S = in.next();
        boolean aaaa = false;
        if (K >= 15) {
            aaaa = true;
        } else if ((1 << K) >= N) {
            aaaa = true;
        }
        if (aaaa) {
            char minChar = S.charAt(0);
            for (char c : S.toCharArray()) {
                if (c < minChar) {
                    minChar = c;
                }
            }
            System.out.println(String.valueOf(minChar).repeat(N));
            return;
        }

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(new Callable<String>() {
            public String call() {
                return FuncGetLastDict0(S);
            }
        });
        S = future.get();
        executor.shutdown();
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
            if (count * ((1 << (K - 1))) >= N) {
                System.out.println(S.substring(0, N));
            } else {
                S = String.valueOf(S.charAt(0)).repeat(count * ((1 << (K - 1)) - 1)) + S;
                System.out.println(S.substring(0, N));
            }
        }
    }

    public static String FuncGetLastDict0(String s) {
        String u = s + new StringBuilder(s).reverse().toString();
        char minChar = u.charAt(0);
        int minIndex = 0;
        int p = 1;
        while (p <= s.length()) {
            if (u.charAt(p) == minChar) {
                if (checkNormalDict(u, minIndex, p)) {
                    minIndex = p;
                }
            }
            p++;
        }
        return u.substring(minIndex, minIndex + s.length());
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