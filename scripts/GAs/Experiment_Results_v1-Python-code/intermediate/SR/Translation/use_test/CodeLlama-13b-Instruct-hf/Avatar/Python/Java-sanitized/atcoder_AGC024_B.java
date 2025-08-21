import java.util.Scanner;

public class atcoder_AGC024_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] permutation = new int[N];
        for (int i = 0; i < N; i++) {
            permutation[i] = scanner.nextInt();
        }
        editorial(N, permutation);
    }

    public static void editorial(int N, int[] permutation) {
        if (N == 1) {
            System.out.println(0);
            return;
        }
        int[] initialValue = new int[1];
        int multiplier = 1;
        Queue<Integer> queueCalculateResult0 = new LinkedList<>();

        Thread threadCalculateResult0 = new Thread(() -> {
            int result = calculateResult(multiplier, initialValue, N);
            queueCalculateResult0.add(result);
        });
        threadCalculateResult0.start();
        threadCalculateResult0.join();
        int resultCalculateResult0 = queueCalculateResult0.poll();
        int[] a = resultCalculateResult0;
        for (int i = 0; i < N; i++) {
            a[permutation[i]] = i;
        }
        int currentLength = 1;
        int maxLen = 1;
        for (int i = 1; i < N; i++) {
            if (a[i] < a[i + 1]) {
                currentLength += 1;
                maxLen = Math.max(maxLen, currentLength);
            } else {
                currentLength = 1;
            }
        }
        int ans = N - maxLen;
        System.out.println(ans);
    }

    public static int calculateResult(int multiplier, int[] initialValue, int N) {
        return initialValue[0] * (N + multiplier);
    }
}