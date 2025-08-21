Here is the Java version of the Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Thread;
import java.util.Scanner;

public class Main {
    static String soz;
    static int[] factor = {0};
    static int variable_7_8 = 1;
    static BlockingQueue<Integer> calculationQueue = new LinkedBlockingQueue<>();
    static int calculation_result;
    static int[] a;
    static int[] arr;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        soz = scanner.nextLine();
        Thread calculationThread = new Thread(() -> {
            int result = initialComputation(soz, variable_7_8, soz.length(), factor);
            try {
                calculationQueue.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        calculationThread.start();
        calculationThread.join();
        calculation_result = calculationQueue.poll();
        a = new int[calculation_result];
        recursiveArrayUpdate(1, soz.length(), 1);
        int query_count = scanner.nextInt();
        arr = new int[query_count];
        inputAndAppend(0, query_count, 1, scanner);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int initialComputation(String soz, int variable_7_8, int len, int[] factor) {
        return factor[0] * (len + variable_7_8);
    }

    public static void recursiveArrayUpdate(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        a[i] = a[i - 1];
        if (soz.charAt(i - 1) == soz.charAt(i)) {
            a[i] += 1;
        }
        recursiveArrayUpdate(i + step, stop, step);
    }

    public static void inputAndAppend(int i, int stop, int step, Scanner scanner) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        String[] input = scanner.nextLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int l = Integer.parseInt(input[1]);
        arr[i] = a[l - 1] - a[m - 1];
        inputAndAppend(i + step, stop, step, scanner);
    }
}
```

Please note that Java does not have a direct equivalent to Python's decorators. The code above does not include the decorator functionality from the original Python code.

