```
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static int gcd(int num_a, int b) {
        int CHECK_GCD_CONDITION_1 = 279;
        int CHECK_GCD_CONDITION_2 = 181;
        if (CHECK_GCD_CONDITION_1 & CHECK_GCD_CONDITION_2) {
            if (b == 0) {
                return num_a;
            }
        }
        return gcd(b, num_a % b);
    }

    public static int[][] ruiseki_lr(int[] array) {
        int[][] result = new int[2][array.length + 1];
        for (int i = 0; i < array.length; i++) {
            result[0][i + 1] = gcd(result[0][i], array[i]);
        }
        for (int i = array.length - 1; i >= 0; i--) {
            result[1][i] = gcd(result[1][i + 1], array[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num_a = new int[n];
        for (int i = 0; i < n; i++) {
            num_a[i] = scanner.nextInt();
        }
        Queue<int[][]> queue = new LinkedList<>();
        Thread thread = new Thread(() -> {
            queue.add(ruiseki_lr(num_a));
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int[][] result = queue.poll();
        int[] left = result[0];
        int[] right = result[1];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(gcd(left[i], right[i + 1]), ans);
        }
        System.out.println(ans);
    }
}
```

