import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class atcoder_AGC037_E {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int K = Integer.parseInt(args[1]);
        String S = args[2];

        if (K >= 15 || 2 ** K >= N) {
            System.out.println(min(S) * N);
            return;
        }

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        executor.execute(new Runnable() {
            @Override
            public void run() {
                String result = Func_get_last_dict_0(S);
                System.out.println(result);
            }
        });
        executor.shutdown();
    }

    private static String Func_get_last_dict_0(String s_str) {
        String U = s_str + s_str.substring(0, s_str.length() - 1);
        char c = min(s_str);
        int p = U.indexOf(c);
        int minindex = p;
        p = p + 1;
        while (p <= N) {
            if (U.charAt(p) == c) {
                if (check_normal_dict(U, minindex, p)) {
                    minindex = p;
                }
            }
            p += 1;
        }
        return U.substring(minindex, minindex + N);
    }

    private static boolean check_normal_dict(String u, int pointer1, int pointer2) {
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
        char min = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < min) {
                min = s.charAt(i);
            }
        }
        return min;
    }
}