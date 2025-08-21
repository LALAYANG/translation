import java.util.*;

class Main {
    static int calculateResult(int multiplier, int initialValue, int N) {
        return initialValue * (N + multiplier);
    }

    static int main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] permutation = new int[N];
        for (int i = 0; i < N; i++) {
            permutation[i] = scanner.nextInt();
        }
        return editorial(N, permutation);
    }

    static int editorial(int N, int[] permutation) {
        if (N == 1) {
            return 0;
        }
        int[] initialValue = {0};
        int multiplier = 1;
        int result = calculateResult(multiplier, initialValue[0], N);
        int[] a = new int[N];
        a[result] = 0;
        for (int i = 1; i < N; i++) {
            a[i] = i;
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
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(main());
    }
}