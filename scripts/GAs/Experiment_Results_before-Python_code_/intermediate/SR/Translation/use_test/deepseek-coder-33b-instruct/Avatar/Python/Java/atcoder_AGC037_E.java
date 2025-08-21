```java
import java.util.*;

public class Main {
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
            System.out.println(String.valueOf(S.charAt(0)).repeat(N));
            return;
        }
        S = getLastDict(S, N);
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
            if (count * Math.pow(2, K - 1) >= N) {
                System.out.println(String.valueOf(S.charAt(0)).repeat(N));
            } else {
                S = String.valueOf(S.charAt(0)).repeat((int) (count * (Math.pow(2, K - 1) - 1))) + S;
                System.out.println(S.substring(0, N));
            }
        }
    }

    private static String getLastDict(String s, int N) {
        String U = s + new StringBuilder(s).reverse().toString();
        char c = s.charAt(0);
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

    private static boolean checkNormalDict(String u, int pointer1, int pointer2) {
        for (int i = 0; i < u.length(); i++) {
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

