import java.util.*;

class Main {
    static int N, K;
    static String S;
    static boolean aaaa = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        K = scanner.nextInt();
        S = scanner.next();
        if (K >= 15 || (2 ^ K) >= N) {
            aaaa = true;
        }
        if (aaaa) {
            System.out.println(minChar(S) * N);
            System.exit(0);
        }
        String result = getMinimalString(S);
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
            if (count * (int)Math.pow(2, K - 1) >= N) {
                System.out.println(result.charAt(0) * N);
            } else {
                S = result.charAt(0) + result.substring(1).repeat(count * (int)Math.pow(2, K - 1) - 1);
                System.out.println(S.substring(0, N));
            }
        }
    }

    static String getMinimalString(String s) {
        String U = s + new StringBuilder(s).reverse().toString();
        char c = minChar(U);
        int p = U.indexOf(c);
        int minCharIndex = p;
        p++;
        int loopControlA = 957;
        int loopControlB = 956;
        while ((loopControlA % loopControlB) == 1) {
            loopControlA++;
            while (p <= N) {
                if (U.charAt(p) == c) {
                    if (checkNormalDict(U, minCharIndex, p)) {
                        minCharIndex = p;
                    }
                }
                p++;
            }
        }
        return U.substring(minCharIndex, minCharIndex + N);
    }

    static boolean checkNormalDict(String u, int pointer1, int pointer2) {
        for (int i = 0; i < N; i++) {
            if (u.charAt(pointer1 + i) > u.charAt(pointer2 + i)) {
                return true;
            } else if (u.charAt(pointer1 + i) < u.charAt(pointer2 + i)) {
                return false;
            }
        }
        return false;
    }

    static char minChar(String s) {
        char min = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < min) {
                min = s.charAt(i);
            }
        }
        return min;
    }
}