import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class atcoder_AGC037_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String S = scanner.nextLine();
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

        Queue<String> queue_get_last_dict0 = new Queue<>();
        Thread thread_get_min_string = new Thread(() -> {
            String result = Func_get_last_dict_0(S);
            queue_get_last_dict0.add(result);
        });
        thread_get_min_string.start();
        thread_get_min_string.join();
        String result_get_last_dict0 = queue_get_last_dict0.poll();
        S = result_get_last_dict0;
        if (K == 1) {
            System.out.println(S);
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
                System.out.println(S.charAt(0) * N);
            } else {
                S = S.substring(0, count * (Math.pow(2, K - 1) - 1)) + S;
                System.out.println(S.substring(0, N));
            }
        }
    }

    private static String Func_get_last_dict_0(String s_str) {
        String U = s_str + s_str.substring(s_str.length() - 1);
        char c = min(s_str);
        int p = U.indexOf(c);
        int minindex = p;
        p++;
        while (p <= N) {
            if (U.charAt(p) == c) {
                if (check_normal_dict(U, minindex, p)) {
                    minindex = p;
                }
            }
            p++;
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