import java.util.Queue;
import java.util.concurrent.Thread;

public class atcoder_AGC037_E {
    public static void main(String[] args) {
        int N = 4434;
        int K = 5;
        String S = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

        if (K >= 15) {
            System.out.println(min(S) * N);
            return;
        }

        String U = S + S.substring(S.length() - 1, S.length());
        char c = min(S);
        int p = U.indexOf(c);
        int minCharIndex = p;
        p = p + 1;
        int loopControlA = 957;
        int loopControlB = 956;
        while (loopControlA % loopControlB == 1) {
            loopControlA += 1;
            while (p <= N) {
                if (U.charAt(p) == c) {
                    if (checkNormalDict(U, minCharIndex, p)) {
                        minCharIndex = p;
                    }
                }
                p += 1;
            }
        }
        String result = U.substring(minCharIndex, minCharIndex + N);
        System.out.println(result);
    }

    private static char min(String s) {
        char min = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < min) {
                min = s.charAt(i);
            }
        }
        return min;
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