import java.util.Scanner;

public class atcoder_AGC037_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String S = scanner.nextLine();

        boolean aaaa = false;
        if (K >= 15) {
            aaaa = true;
        } else if (Math.pow(2, K) >= N) {
            aaaa = true;
        }

        if (aaaa) {
            System.out.println(min(S) * N);
            return;
        }

        String lastDict = getLastDict(S);
        if (K == 1) {
            System.out.println(lastDict);
        } else {
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (lastDict.charAt(i) == lastDict.charAt(0)) {
                    count++;
                } else {
                    break;
                }
            }

            if (count * Math.pow(2, K - 1) >= N) {
                System.out.println(lastDict.charAt(0) * N);
            } else {
                String newS = lastDict.charAt(0) * (count * Math.pow(2, K - 1) - 1) + lastDict;
                System.out.println(newS.substring(0, N));
            }
        }
    }

    private static String getLastDict(String S) {
        String U = S + S.substring(0, S.length() - 1);
        char c = min(S);
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

    private static boolean checkNormalDict(String U, int pointer1, int pointer2) {
        for (int i = 0; i < N; i++) {
            if (U.charAt(pointer1 + i) > U.charAt(pointer2 + i)) {
                return true;
            } else if (U.charAt(pointer1 + i) < U.charAt(pointer2 + i)) {
                return false;
            }
        }
        return false;
    }

    private static char min(String S) {
        char min = S.charAt(0);
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) < min) {
                min = S.charAt(i);
            }
        }
        return min;
    }
}