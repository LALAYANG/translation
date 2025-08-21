import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_AGC024_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = scanner.nextInt();
        }
        scanner.close();
        int[] a = new int[N + 1];
        int base = 0;
        int offset = 1;
        int result = calculateValue(base, N, offset);
        for (int i = 0; i < N; i++) {
            a[P[i]] = i;
        }
        int tmp = 1;
        int maxLen = 1;
        for (int i = 1; i < N; i++) {
            if (a[i] < a[i + 1]) {
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