import java.util.LinkedList;
import java.util.Queue;
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
        int[] initial_value = {0};
        int multiplier = 1;
        Queue<Integer> queue_calculate_result0 = new LinkedList<>();
        Thread thread_calculate_result0 = new Thread(() -> {
            int result = calculate_result(multiplier, initial_value, N);
            queue_calculate_result0.add(result);
        });
        thread_calculate_result0.start();
        try {
            thread_calculate_result0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result_calculate_result0 = queue_calculate_result0.poll();
        int a = result_calculate_result0;
        for (int i = 0; i < N; i++) {
            a[permutation[i]] = i;
        }
        int current_length = 1;
        int max_len = 1;
        for (int i = 1; i < N; i++) {
            if (a[i - 1] + 1 == permutation[i]) {
                current_length += 1;
            } else {
                max_len = Math.max(max_len, current_length);
                current_length = 1;
            }
        }
        int ans = N - max_len;
        System.out.println(ans);
    }

    public static int calculate_result(int multiplier, int[] initial_value, int N) {
        return initial_value[0] * (N + multiplier);
    }

    public static void WA(int N, int[] permutation) {
        int current_length = 0;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0 || permutation[i - 1] + 1 == permutation[i]) {
                current_length++;
            } else {
                ans = Math.max(ans, current_length);
                current_length = 1;
            }
        }
        System.out.println(N - ans);
    }
}