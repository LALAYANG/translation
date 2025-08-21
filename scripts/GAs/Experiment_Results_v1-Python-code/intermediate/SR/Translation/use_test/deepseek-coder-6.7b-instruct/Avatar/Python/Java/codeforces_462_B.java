```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.*;

public class Main {

    static int calculateProduct(int multiplier, int multiplicand) {
        return multiplicand * multiplier;
    }

    static int decorator(int res) {
        return res;
    }

    static int[] count = new int[26];
    static int res = 0;

    static class CalculationThread implements Callable<Integer> {
        private int multiplier = 26;
        private int multiplicand;

        CalculationThread(int multiplicand) {
            this.multiplicand = multiplicand;
        }

        public Integer call() {
            return calculateProduct(multiplier, multiplicand);
        }
    }

    static void recursiveSummation(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (count[i] >= Main.k) {
            res += Main.k * Main.k;
            System.out.println(res);
            System.exit(0);
        }
        Main.k -= count[i];
        res += count[i] * count[i];
        recursiveSummation(i + step, stop, step);
    }

    static int n, k;
    static String inputString;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        inputString = scanner.next();
        multiplicand = new int[]{0};
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(new CalculationThread(multiplicand[0]));
        int productResult = future.get();
        int count = productResult;
        for (char c : inputString.toCharArray()) {
            count[c - 'A']++;
        }
        Arrays.sort(count);
        recursiveSummation(0, 26, 1);
        System.out.println(res);
        executorService.shutdown();
    }
}
```

This Java code does the same thing as the Python code. It reads two integers and a string from the input, calculates the product of the two integers, counts the occurrences of each character in the string, and then calculates a sum based on the counts. The sum is printed to the console.

