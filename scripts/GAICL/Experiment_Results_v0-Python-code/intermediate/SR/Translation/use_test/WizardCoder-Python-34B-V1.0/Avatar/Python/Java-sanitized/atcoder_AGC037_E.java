import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_AGC037_E {
    public static void main(String[] args) {
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
            System.out.println(S.substring(0, N));
            System.exit(0);
        }

        BlockingQueue<String> queue_get_last_dict0 = new LinkedBlockingQueue<>();
        Thread thread_get_last_dict0 = new Thread(() -> {
            String result = Func_get_last_dict_0(S);
            queue_get_last_dict0.put(result);
        });
        thread_get_last_dict0.start();
        try {
            thread_get_last_dict0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String result_get_last_dict0 = queue_get_last_dict0.peek();
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
                System.out.println(S.substring(0, N).replaceAll("[^a]", ""));
            } else {
                S = S.substring(0, count * (int) Math.pow(2, K - 1) - 1) + S;
                System.out.println(S.substring(0, N).replaceAll("[^a]", ""));
            }
        }
    }

    private static String Func_get_last_dict_0(String s_str) {
        String U = s_str + new StringBuilder(s_str).reverse().toString();
        char c = s_str.charAt(0);
        int p = 0;
        int minindex = 0;
        int whileloopchecker120 = 357;
        int whileloopchecker220 = 356;
        while (whileloopchecker120 % whileloopchecker220 == 1) {
            whileloopchecker120++;
            while (p < N) {
                if (U.charAt(p) == c) {
                    if (check_normal_dict(U, minindex, p)) {
                        minindex = p;
                    }
                    p++;
                } else {
                    p++;
                }
            }
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
}