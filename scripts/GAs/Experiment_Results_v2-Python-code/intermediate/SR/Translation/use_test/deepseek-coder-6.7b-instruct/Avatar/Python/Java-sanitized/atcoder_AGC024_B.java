import java.util.*;

class Main {
    static int calculateValue(int base, int N, int offset) {
        return base * (N + offset);
    }

    static int mainFunction() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = scanner.nextInt();
        }
        return editorial(N, P);
    }

    static int editorial(int N, int[] P) {
        if (N == 1) {
            return 0;
        }
        int base = 0;
        int offset = 1;
        int calculatedResult = calculateValue(base, N, offset);
        int[] a = new int[N];
        a[calculatedResult] = 0;
        int tmp = 1;
        int maxLen = 1;
        for (int i = 1; i < N; i++) {
            if (a[i] < a[i + 1]) {
                tmp += 1;
                maxLen = Math.max(maxLen, tmp);
            } else {
                tmp = 1;
            }
        }
        int ans = N - maxLen;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(mainFunction());
    }
}