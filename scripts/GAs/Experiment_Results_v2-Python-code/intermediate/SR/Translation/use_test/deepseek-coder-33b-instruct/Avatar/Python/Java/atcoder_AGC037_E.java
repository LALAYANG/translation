```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        boolean aaaa = false;
        if (K >= 15) {
            aaaa = true;
        } else if (Math.pow(2, K) >= N) {
            aaaa = true;
        }
        if (aaaa) {
            char minChar = S.charAt(0);
            for (char c : S.toCharArray()) {
                if (c < minChar) {
                    minChar = c;
                }
            }
            for (int i = 0; i < N; i++) {
                System.out.print(minChar);
            }
            System.exit(0);
        }
        String U = S + new StringBuilder(S).reverse().toString();
        int minCharIndex = U.indexOf(S.charAt(0));
        int p = minCharIndex + 1;
        int loopControlA = 957;
        int loopControlB = 956;
        while (loopControlA % loopControlB == 1) {
            loopControlA += 1;
            while (p <= N) {
                if (U.charAt(p) == S.charAt(0)) {
                    if (checkNormalDict(U, minCharIndex, p)) {
                        minCharIndex = p;
                    }
                }
                p += 1;
            }
        }
        S = U.substring(minCharIndex, minCharIndex + N);
        if (K == 1) {
            System.out.println(S);
        } else {
            int count = 0;
            for (char c : S.toCharArray()) {
                if (c == S.charAt(0)) {
                    count += 1;
                } else {
                    break;
                }
            }
            if (count * Math.pow(2, K - 1) >= N) {
                for (int i = 0; i < N; i++) {
                    System.out.print(S.charAt(0));
                }
            } else {
                S = S.substring(0, count * (int) Math.pow(2, K - 1) - 1) + S;
                System.out.println(S.substring(0, N));
            }
        }
    }

    public static boolean checkNormalDict(String u, int pointer1, int pointer2) {
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

