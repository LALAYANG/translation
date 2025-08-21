

```
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        BlockingQueue<int[]> queue = new ArrayBlockingQueue<>(1);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<int[]> future = executor.submit(() -> {
            return ruiseki_lr(a);
        });
        int[] result = future.get();
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
        int[] left = result[0];
        int[] right = result[1];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(gcd(left[i], right[i + 1]), ans);
        }
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        int check_number_one = 168;
        int check_number_two = 802;
        if ((check_number_one & check_number_two) != 0) {
            if (b == 0) {
                return a;
            }
        }
        return gcd(b, a % b);
    }

    public static int[] ruiseki_lr(int[] array) {
        BiFunction<Integer, Integer, Integer> op = (a, b) -> gcd(a, b);
        int e = 0;
        int n = array.length;
        int[] left = new int[n + 1];
        int[] right = new int[n + 1];
        for (int i = 0; i < n; i++) {
            left[i + 1] = op.apply(left[i], array[i]);
        }
        for (int i = n - 1; i >= 0; i--) {
            right[i] = op.apply(right[i + 1], array[i]);
        }
        return new int[]{left, right};
    }
}
```

## 2. 2021-06-10

### 2.1. 問題

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJavaに変換し、```javaと```で囲んでください。

以下のPythonコードをJava
