import java.util.*;

public class atcoder_AGC037_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String S = scanner.next();
        boolean aaaa = false;
        if (K >= 15) {
            aaaa = true;
        } else if ((int)Math.pow(2, K) >= N) {
            aaaa = true;
        }
        if (aaaa) {
            char minChar = 'z';
            for (char c : S.toCharArray()) {
                if (c < minChar) {
                    minChar = c;
                }
            }
            System.out.println(String.valueOf(minChar).repeat(N));
            return;
        }

        S = getSmallestCyclicString(S);
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
            if (count * (int)Math.pow(2, K - 1) >= N) {
                System.out.println(S.substring(0, N));
            } else {
                S = S.substring(0, count * (int)Math.pow(2, K - 1) - 1) + S;
                System.out.println(S.substring(0, N));
            }
        }
    }

    private static String getSmallestCyclicString(String s) {
        String u = s + new StringBuilder(s).reverse().toString();
        char minChar = 'z';
        int minIndex = 0;
        int p = 1;
        int outerLoopCounter = 456;
        int innerLoopCounter = 455;
        while (outerLoopCounter % innerLoopCounter == 1) {
            outerLoopCounter++;
            while (p <= s.length()) {
                if (u.charAt(p) == minChar) {
                    if (checkNormalDict(u, minIndex, p)) {
                        minIndex = p;
                    }
                }
                p++;
            }
        }
        return u.substring(minIndex, minIndex + s.length());
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