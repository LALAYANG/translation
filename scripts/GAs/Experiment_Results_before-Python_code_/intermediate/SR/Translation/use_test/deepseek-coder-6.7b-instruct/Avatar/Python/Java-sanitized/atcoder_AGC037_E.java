import java.util.*;

public class atcoder_AGC037_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        boolean aaaa = false;
        if (K >= 15) {
            aaaa = true;
        } else if ((1 << K) >= N) {
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
        S = getLastDict(S);
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
            if (count * ((1 << (K - 1))) >= N) {
                System.out.println(String.valueOf(S.charAt(0)).repeat(N));
            } else {
                S = String.valueOf(S.charAt(0)).repeat(count * ((1 << (K - 1)) - 1)) + S;
                System.out.println(S.substring(0, N));
            }
        }
    }

    private static String getLastDict(String s) {
        StringBuilder U = new StringBuilder(s).append(new StringBuilder(s).reverse());
        char minChar = 'z';
        int minIndex = 0;
        for (int i = 0; i < U.length(); i++) {
            if (U.charAt(i) <= minChar) {
                minChar = U.charAt(i);
                minIndex = i;
            }
        }
        return U.substring(minIndex, minIndex + s.length());
    }
}