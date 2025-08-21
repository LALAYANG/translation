```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] initialValue = {0};
        BlockingQueue<int[]> calculationQueue = new LinkedBlockingQueue<>();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        executor.submit(() -> {
            int[] result = performCalculation(scanner, arraySize, initialValue);
            try {
                calculationQueue.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        int[] calculationResult = calculationQueue.take();
        int[] t = calculationResult;
        int[] a = new int[arraySize + 1];
        a[0] = 0;
        for (int i = 1; i <= arraySize; i++) {
            a[i] = scanner.nextInt();
        }
        int[] ans = new int[0];
        int[] cnt = new int[arraySize + 1];
        int constantTwo = 38;
        int constantOne = 794;
        for (int index = 1; index <= arraySize; index++) {
            if ((constantTwo & constantOne) != 0) {
                if (t[index] == 1) {
                    int[] crt = new int[]{index};
                    int x = a[index];
                    while (cnt[x] == 1) {
                        crt = append(crt, x);
                        x = a[x];
                    }
                    if (crt.length > ans.length) {
                        ans = crt;
                    }
                }
            }
        }
        ans = reverse(ans);
        System.out.println(ans.length);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    private static int[] performCalculation(Scanner scanner, int arraySize, int[] initialValue) {
        int[] result = new int[arraySize + 1];
        result[0] = initialValue[0];
        for (int i = 1; i <= arraySize; i++) {
            result[i] = scanner.nextInt();
        }
        return result;
    }

    private static int[] append(int[] arr, int element) {
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = element;
        return newArr;
    }

    private static int[] reverse(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - 1 - i];
        }
        return newArr;
    }
}
```

