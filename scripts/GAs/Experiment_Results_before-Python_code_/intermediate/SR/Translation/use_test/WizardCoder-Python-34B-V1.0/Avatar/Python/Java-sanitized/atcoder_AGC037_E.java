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
            System.out.println(S.charAt(0) + "".repeat(N));
            System.exit(0);
        }

        String getLastDict(String s_str) {
            String U = s_str + s_str.substring(0, s_str.length() - 1);
            char c = s_str.charAt(0);
            int p = U.indexOf(c);
            int minindex = p;
            p++;
            while (p <= N) {
                if (U.charAt(p) == c) {
                    if (checkNormalDict(U, minindex, p)) {
                        minindex = p;
                    }
                }
                p++;
            }
            return U.substring(minindex, minindex + N);
        }

        boolean checkNormalDict(String U, int pointer1, int pointer2) {
            for (int i = 0; i < N; i++) {
                if (U.charAt(pointer1 + i) > U.charAt(pointer2 + i)) {
                    return true;
                } else if (U.charAt(pointer1 + i) < U.charAt(pointer2 + i)) {
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
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == S.charAt(0)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count * (int) Math.pow(2, K - 1) >= N) {
                System.out.println(S.charAt(0) + "".repeat(N));
            } else {
                S = S.substring(0, count * (int) Math.pow(2, K - 1) - 1) + S;
                System.out.println(S.substring(0, N));
            }
        }
    }
}