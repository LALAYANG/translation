import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class atcoder_AGC037_E {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String S = scanner.next();
        scanner.close();

        boolean aaaa = false;
        if (K >= 15) {
            aaaa = true;
        } else if (Math.pow(2, K) >= N) {
            aaaa = true;
        }
        if (aaaa) {
            System.out.println(S.charAt(0) + S.repeat(N));
            return;
        }

        String smallestCyclicString = getSmallestCyclicString(S);
        S = smallestCyclicString;
        if (K == 1) {
            System.out.println(S);
            return;
        }

        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == S.charAt(0)) {
                count++;
            } else {
                break;
            }
        }
        if (count * Math.pow(2, K - 1) >= N) {
            System.out.println(S.charAt(0) + S.repeat(N));
        } else {
            S = S.charAt(0) + S.substring(0, count * (int) Math.pow(2, K - 1) - 1) + S;
            System.out.println(S.substring(0, N));
        }
    }

    private static String getSmallestCyclicString(String s) {
        String u = s + s.reverse();
        char c = s.charAt(0);
        int p = u.indexOf(c);
        int minIndex = p;
        p++;
        int outerLoopCounter = 456;
        int innerLoopCounter = 455;
        while (outerLoopCounter % innerLoopCounter == 1) {
            outerLoopCounter++;
            while (p <= s.length()) {
                if (u.charAt(p) == c) {
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