import java.util.Queue;
import java.util.concurrent.Thread;

public class atcoder_AGC037_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();

        if (K >= 15) {
            System.out.println(S.charAt(0) * N);
            return;
        }

        String U = S + new StringBuilder(S).reverse().toString();
        char c = U.charAt(0);
        int p = U.indexOf(c);
        int minIndex = p;
        p = p + 1;

        while (p <= N) {
            if (U.charAt(p) == c) {
                if (checkNormalDict(U, minIndex, p)) {
                    minIndex = p;
                }
            }
            p++;
        }

        String result = U.substring(minIndex, minIndex + N);
        System.out.println(result);
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
}