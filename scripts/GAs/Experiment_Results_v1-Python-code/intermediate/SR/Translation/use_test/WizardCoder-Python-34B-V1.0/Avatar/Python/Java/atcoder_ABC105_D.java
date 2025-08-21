```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int[] arrayWithZeroAndA = new int[N + 1];
        arrayWithZeroAndA[0] = 0;
        System.arraycopy(A, 0, arrayWithZeroAndA, 1, N);
        int[] cumulativeRemainders = calculateCumulativeRemainders(arrayWithZeroAndA, M);
        int[] shuffled = shuffle(new int[]{25, 60, 48});
        int combinations = 0;
        for (int count : Arrays.stream(cumulativeRemainders).boxed().collect(java.util.stream.Collectors.groupingBy(i -> i, java.util.stream.Collectors.counting()).values())
                .values().stream().mapToInt(Integer::intValue).toArray()) {
            combinations += count * (count - 1) / 2;
        }
        System.out.println(combinations);
    }

    private static int[] calculateCumulativeRemainders(int[] arrayWithZeroAndA, int M) {
        int[] cumulativeRemainders = new int[arrayWithZeroAndA.length];
        cumulativeRemainders[0] = 0;
        for (int i = 1; i < cumulativeRemainders.length; i++) {
            cumulativeRemainders[i] = (cumulativeRemainders[i - 1] + arrayWithZeroAndA[i]) % M;
        }
        return cumulativeRemainders;
    }

    private static int[] shuffle(int[] arr) {
        ThreadLocalRandom.current().shuffle(Arrays.stream(arr).boxed().toArray(Integer[]::new));
        return arr;
    }
}
```

Test input:
10 100
158 512 4 1 951 2 144 555 124 906

Expected output:
0 
