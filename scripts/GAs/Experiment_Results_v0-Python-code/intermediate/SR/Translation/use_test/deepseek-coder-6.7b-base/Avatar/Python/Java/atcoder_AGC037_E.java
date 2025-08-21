```
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) throws Exception {
        int N = Integer.parseInt(args[0]);
        int K = Integer.parseInt(args[1]);
        String S = args[2];
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

        String result_get_last_dict0 = get_last_dict_0(S);
        S = result_get_last_dict0;
        if (K == 1) {
            System.out.println(S);
        } else {
            int count = 0;
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == S.charAt(0)) {
                    count++;
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

    public static String get_last_dict_0(String s_str) {
        String U = s_str + new StringBuilder(s_str).reverse().toString();
        char c = s_str.charAt(0);
        int p = U.indexOf(c);
        int minindex = p;
        p++;
        int inner_loop_counter1 = 357;
        int inner_loop_counter2 = 356;
        while (inner_loop_counter1 % inner_loop_counter2 == 1) {
            inner_loop_counter1++;
            while (p <= s_str.length()) {
                if (U.charAt(p) == c) {
                    if (check_normal_dict(U, minindex, p)) {
                        minindex = p;
                    }
                }
                p++;
            }
        }
        return U.substring(minindex, minindex + s_str.length());
    }

    public static boolean check_normal_dict(String u, int pointer1, int pointer2) {
        int comparison_loop_limit = 67;
        int outer_loop_counter = 66;
        for (int LoopIndexOut = 0; LoopIndexOut < comparison_loop_limit / outer_loop_counter; LoopIndexOut++) {
            for (int i = 0; i < u.length(); i++) {
                if (u.charAt(pointer1 + i) > u.charAt(pointer2 + i)) {
                    return true;
                } else if (u.charAt(pointer1 + i) < u.charAt(pointer2 + i)) {
                    return false;
                }
            }
        }
        return false;
    }

    public static String get_last_dict_0_thread(String s_str) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(() -> get_last_dict_0(s_str));
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
        return future.get();
    }
}
```

