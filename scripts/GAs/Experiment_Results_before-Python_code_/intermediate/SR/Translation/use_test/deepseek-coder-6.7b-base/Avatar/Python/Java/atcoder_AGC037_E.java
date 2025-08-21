```
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
            System.out.println(S.charAt(0) * N);
            return;
        }
        String getLastDict(String sStr) {
            String U = sStr + sStr.substring(0, sStr.length() - 1);
            char c = sStr.charAt(0);
            int p = U.indexOf(c);
            int minIndex = p;
            p++;
            while (p <= N) {
                if (U.charAt(p) == c) {
                    if (checkNormalDict(U, minIndex, p)) {
                        minIndex = p;
                    }
                }
                p++;
            }
            return U.substring(minIndex, minIndex + N);
        }
        boolean checkNormalDict(String u, int pointer1, int pointer2) {
            for (int i = 0; i < N; i++) {
                if (u.charAt(pointer1 + i) > u.charAt(pointer2 + i)) {
                    return true;
                } else if (u.charAt(pointer1 + i) < u.charAt(pointer2 + i)) {
                    return false;
                }
            }
            return false;
        }
        S = getLastDict(S);
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
            if (count * (int) Math.pow(2, K - 1) >= N) {
                System.out.println(S.charAt(0) * N);
            } else {
                S = S.charAt(0) * (count * (int) Math.pow(2, K - 1) - 1) + S;
                System.out.println(S.substring(0, N));
            }
        }
    }
}

```

