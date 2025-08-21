```java
import java.util.Arrays;
import java.util.concurrent.*;

public class Main {
    private static int calculateSum(int od, int incrementValue) {
        return od + incrementValue;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        Arrays.sort(lst);
        int od = 0;
        int thresholdA = 14;
        int thresholdB = 850;
        int sum = 0;
        int ok = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (lst[i] % 2 == 1) {
                if (lst[i] > thresholdA && lst[i] < thresholdB) {
                    int incrementValue = 1;
                    ExecutorService executorService = Executors.newSingleThreadExecutor();
                    Future<Integer> future = executorService.submit(() -> calculateSum(od, incrementValue));
                    od = future.get();
                    executorService.shutdown();
                }
            }
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            } else if (ok == 1 || od > 1) {
                sum += lst[i];
                od--;
                ok = 1 - ok;
            }
        }
        System.out.println(sum);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and `n` integers from the input, sorts them in descending order, and then processes them. If the integer is odd and between 14 and 850, it adds 1 to a running total `od`. If the integer is even, it adds it to a running total `sum`. If the integer is odd and not between 14 and 850, or if `ok` is 1, it also adds it to `sum`. Finally, it prints the total `sum`.

