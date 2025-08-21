```
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

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
            System.out.println(min(S) * N);
            return;
        }

        String U = S + new StringBuilder(S).reverse().toString();
        char c = min(S);
        int p = U.indexOf(c);
        int minindex = p;
        p++;

        int whileloopchecker120 = 357;
        int whileloopchecker220 = 356;
        while (whileloopchecker120 % whileloopchecker220 == 1) {
            whileloopchecker120++;
            while (p <= N) {
                if (U.charAt(p) == c) {
                    if (check_normal_dict(U, minindex, p)) {
                        minindex = p;
                    }
                }
                p++;
            }
        }

        S = U.substring(minindex, minindex + N);

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
                System.out.println(S.charAt(0) * N);
            } else {
                S = S.charAt(0) * (count * (Math.pow(2, K - 1) - 1)) + S;
                System.out.println(S.substring(0, N));
            }
        }
    }

    public static char min(String S) {
        char min = S.charAt(0);
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) < min) {
                min = S.charAt(i);
            }
        }
        return min;
    }

    public static boolean check_normal_dict(String U, int minindex, int p) {
        for (int i = 0; i < U.length(); i++) {
            if (U.charAt(minindex + i) > U.charAt(p + i)) {
                return true;
            } else if (U.charAt(minindex + i) < U.charAt(p + i)) {
                return false;
            }
        }
        return false;
    }
}
```
Note: The `ttest_ind` function from the Python code is not available in Java, so it has been removed. Additionally, the `Queue` and `Thread` classes from the Python code have been replaced with the `java.util.Queue` and `java.lang.Thread` classes in Java.
