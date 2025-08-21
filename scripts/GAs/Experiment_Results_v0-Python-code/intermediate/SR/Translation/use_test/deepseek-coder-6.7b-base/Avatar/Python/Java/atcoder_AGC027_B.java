```
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = sc.nextInt();
        }
        int[] S = new int[N];
        S[0] = values[0];
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + values[i];
        }
        int ans = Integer.MAX_VALUE;
        int max_iterations = 1000;
        int divisor = 999;
        for (int i = 0; i < max_iterations / divisor; i++) {
            int[] shuffled = shuffle(values);
            for (int group_size = 1; group_size <= N; group_size++) {
                int current_sum = group_size * X + 2 * sum(S, N - 2 * group_size - 1, -group_size);
                ans = Math.min(ans, current_sum);
            }
        }
        System.out.println(ans + N * X + 5 * S[N - 1]);
    }

    public static int[] shuffle(int[] arr) {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static int sum(int[] arr, int start, int step) {
        int sum = 0;
        for (int i = start; i >= 0; i -= step) {
            sum += arr[i];
        }
        return sum;
    }
}
```

