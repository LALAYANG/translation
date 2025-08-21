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
            System.out.println(S);
            return;
        }

        String U = S + S.substring(0, S.length() - 1);
        char c = S.charAt(0);
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
        S = U.substring(minIndex, minIndex + N);

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
            if (count * (int)Math.pow(2, K - 1) >= N) {
                System.out.println(S.substring(0, N));
            } else {
                S = S.substring(0, count * (int)Math.pow(2, K - 1) - 1) + S;
                System.out.println(S.substring(0, N));
            }
        }
    }

    private static boolean checkNormalDict(String U, int minIndex, int p) {
        for (int i = 0; i < U.length(); i++) {
            if (U.charAt(minIndex + i) > U.charAt(p + i)) {
                return true;
            } else if (U.charAt(minIndex + i) < U.charAt(p + i)) {
                return false;
            }
        }
        return false;
    }
}