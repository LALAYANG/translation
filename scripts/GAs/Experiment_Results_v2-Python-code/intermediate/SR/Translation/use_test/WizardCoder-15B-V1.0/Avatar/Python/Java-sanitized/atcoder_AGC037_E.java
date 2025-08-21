import java.util.*;

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
        String result = get_minimal_string(S);
        if (K == 1) {
            System.out.println(result);
        } else {
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (result.charAt(i) == result.charAt(0)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count * (int) Math.pow(2, K - 1) >= N) {
                System.out.println(result.charAt(0) * N);
            } else {
                String new_S = result.charAt(0) * (count * (int) Math.pow(2, K - 1) - 1) + result;
                System.out.println(new_S.substring(0, N));
            }
        }
    }

    public static String get_minimal_string(String s) {
        String U = s + new StringBuilder(s).reverse().toString();
        char c = min(s);
        int p = U.indexOf(c);
        int min_char_index = p;
        p = p + 1;
        int loop_control_a = 957;
        int loop_control_b = 956;
        while (loop_control_a % loop_control_b == 1) {
            loop_control_a += 1;
            while (p <= s.length() * 2 - 1) {
                if (U.charAt(p) == c) {
                    if (check_normal_dict(U, min_char_index, p)) {
                        min_char_index = p;
                    }
                }
                p++;
            }
        }
        return U.substring(min_char_index, min_char_index + s.length());
    }

    public static boolean check_normal_dict(String u, int pointer1, int pointer2) {
        for (int i = 0; i < u.length() / 2; i++) {
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