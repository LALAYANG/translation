import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_AGC024_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> P = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            P.add(scanner.nextInt());
        }
        editorial(N, P);
    }

    public static void editorial(int N, List<Integer> P) {
        if (N == 1) {
            System.out.println(0);
            return;
        }
        int base = 0;
        int offset = 1;
        int result = calculateValue(base, N, offset);
        int a = result;
        for (int i = 0; i < N; i++) {
            a = P.get(i);
        }
        int tmp = 1;
        int maxLen = 1;
        for (int i = 1; i < N; i++) {
            if (P.get(i - 1) + 1 == P.get(i)) {
                tmp++;
                maxLen = Math.max(maxLen, tmp);
            } else {
                tmp = 1;
            }
        }
        int ans = N - maxLen;
        System.out.println(ans);
    }

    public static int calculateValue(int base, int N, int offset) {
        return base * (N + offset);
    }
}