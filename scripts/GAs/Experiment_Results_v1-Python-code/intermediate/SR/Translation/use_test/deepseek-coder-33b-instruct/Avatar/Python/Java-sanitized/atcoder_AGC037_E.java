import java.util.Arrays;
import java.util.Scanner;

public class atcoder_AGC037_E {
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
            char minChar = S.charAt(0);
            for (char c : S.toCharArray()) {
                if (c < minChar) {
                    minChar = c;
                }
            }
            for (int i = 0; i < N; i++) {
                System.out.print(minChar);
            }
            return;
        }
        String U = S + new StringBuilder(S).reverse().toString();
        int minIndex = U.indexOf(S.charAt(0));
        for (int i = 0; i < N; i++) {
            String substring = U.substring(i, i + N);
            if (checkNormalDict(substring, S)) {
                minIndex = i;
            }
        }
        S = U.substring(minIndex, minIndex + N);
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
                for (int i = 0; i < N; i++) {
                    System.out.print(S.charAt(0));
                }
            } else {
                S = S.substring(0, count * (int) Math.pow(2, K - 1) - 1) + S;
                System.out.println(S.substring(0, N));
            }
        }
    }

    private static boolean checkNormalDict(String substring, String s) {
        char[] substringChars = substring.toCharArray();
        char[] sChars = s.toCharArray();
        Arrays.sort(substringChars);
        Arrays.sort(sChars);
        for (int i = 0; i < substringChars.length; i++) {
            if (substringChars[i] != sChars[i]) {
                return false;
            }
        }
        return true;
    }
}