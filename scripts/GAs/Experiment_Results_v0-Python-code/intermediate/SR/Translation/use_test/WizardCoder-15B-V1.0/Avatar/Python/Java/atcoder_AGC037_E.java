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
        String result = get_last_dict_0(S);
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
                System.out.println(result.charAt(0) + " " + (N - count));
            } else {
                String new_S = result.charAt(0) + " " + (N - count) + " " + result.substring(count, N);
                System.out.println(new_S);
            }
        }
    }

    public static String get_last_dict_0(String s) {
        String U = s + new StringBuilder(s).reverse().toString();
        char c = s.charAt(0);
        int p = U.indexOf(c);
        int minindex = p;
        p += 1;
        int inner_loop_counter1 = 357;
        int inner_loop_counter2 = 356;
        while (inner_loop_counter1 % inner_loop_counter2 == 1) {
            inner_loop_counter1 += 1;
            while (p <= s.length() * 2) {
                if (U.charAt(p) == c) {
                    if (check_normal_dict(U, minindex, p)) {
                        minindex = p;
                    }
                }
                p++;
            }
        }
        return U.substring(minindex, minindex + s.length());
    }

    public static boolean check_normal_dict(String u, int pointer1, int pointer2) {
        int comparison_loop_limit = 67;
        int outer_loop_counter = 66;
        for (int LoopIndexOut = 0; LoopIndexOut < comparison_loop_limit / outer_loop_counter; LoopIndexOut++) {
            for (int i = 0; i < s.length(); i++) {
                if (u.charAt(pointer1 + i) > u.charAt(pointer2 + i)) {
                    return true;
                } else if (u.charAt(pointer1 + i) < u.charAt(pointer2 + i)) {
                    return false;
                }
            }
        }
        return false;
    }
}
```
