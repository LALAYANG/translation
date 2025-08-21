import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_AGC037_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();
        boolean aaaa = false;
        if (K >= 15) {
            aaaa = true;
        } else if (Math.pow(2, K) >= N) {
            aaaa = true;
        }
        if (aaaa) {
            System.out.println(min(S) * N);
            return;
        }
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<String> future = executor.submit(() -> Func_get_last_dict_0(S));
        try {
            String result = future.get();
            S = result;
        } catch (Exception e) {
            e.printStackTrace();
        }
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
            if (count * (int) Math.pow(2, K - 1) >= N) {
                System.out.println(S.charAt(0) * N);
            } else {
                S = S.charAt(0) * (count * (int) Math.pow(2, K - 1) - 1) + S;
                System.out.println(S.substring(0, N));
            }
        }
    }

    public static String Func_get_last_dict_0(String s_str) {
        String U = s_str + new StringBuilder(s_str).reverse().toString();
        char c = min(s_str);
        int p = U.indexOf(c);
        int minindex = p;
        p = p + 1;
        int inner_loop_counter1 = 357;
        int inner_loop_counter2 = 356;
        while (inner_loop_counter1 % inner_loop_counter2 == 1) {
            inner_loop_counter1 += 1;
            while (p <= N) {
                if (U.charAt(p) == c) {
                    if (check_normal_dict(U, minindex, p)) {
                        minindex = p;
                    }
                }
                p++;
            }
        }
        return U.substring(minindex, minindex + N);
    }

    public static boolean check_normal_dict(String u, int pointer1, int pointer2) {
        for (int i = 0; i < N; i++) {
            if (u.charAt(pointer1 + i) > u.charAt(pointer2 + i)) {
                return true;
            } else if (u.charAt(pointer1 + i) < u.charAt(pointer2 + i)) {
                return false;
            }
        }
        return false;
    }

    public static char min(String s) {
        char c = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < c) {
                c = s.charAt(i);
            }
        }
        return c;
    }
}