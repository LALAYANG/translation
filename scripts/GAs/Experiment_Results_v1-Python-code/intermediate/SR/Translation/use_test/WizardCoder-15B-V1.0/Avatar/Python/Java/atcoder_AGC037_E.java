```java
import java.util.*;

public class Main {
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
            System.out.println(S.replaceAll(".", Character.toString(S.charAt(0))).substring(0, N));
            return;
        }
        String result = get_smallest_cyclic_string(S);
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

    public static String get_smallest_cyclic_string(String s_str) {
        String U = s_str + s_str.substring(0, s_str.length() - 1);
        char c = s_str.charAt(0);
        int p = U.indexOf(c);
        int minindex = p;
        p = p + 1;
        int outer_loop_counter = 456;
        int inner_loop_counter = 455;
        while (outer_loop_counter % inner_loop_counter == 1) {
            outer_loop_counter += 1;
            while (p <= s_str.length() - 1) {
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
        for (int i = 0; i < u.length() - 1; i++) {
            if (u.charAt(pointer1 + i) > u.charAt(pointer2 + i)) {
                return true;
            } else if (u.charAt(pointer1 + i) < u.charAt(pointer2 + i)) {
                return false;
            }
        }
        return false;
    }
}
```
