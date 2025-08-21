import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class atcoder_ABC105_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int[] cumulativeRemainders = new int[N + 1];
        for (int i = 0; i < N; i++) {
            cumulativeRemainders[i] = (A[i] % M + M) % M;
        }
        cumulativeRemainders[N] = 0;
        int[] remainderCounts = new int[M];
        for (int i = 0; i < N; i++) {
            remainderCounts[cumulativeRemainders[i]]++;
        }
        int combinations = 0;
        for (int i = 0; i < M; i++) {
            combinations += remainderCounts[i] * (remainderCounts[i] - 1) / 2;
        }
        System.out.println(combinations);
    }
}