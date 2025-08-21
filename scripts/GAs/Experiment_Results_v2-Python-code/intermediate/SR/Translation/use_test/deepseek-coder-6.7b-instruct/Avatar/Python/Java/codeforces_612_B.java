```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    static int[] a;
    static int n;
    static int[] indexedArray;
    static int res = 0;

    static class MultiplyTask implements Runnable {
        int[] numberArray;
        int n;

        MultiplyTask(int[] numberArray, int n) {
            this.numberArray = numberArray;
            this.n = n;
        }

        @Override
        public void run() {
            for (int i = 0; i < numberArray.length; i++) {
                numberArray[i] *= n;
            }
        }
    }

    static class ArrayIndexerTask implements Runnable {
        int i, stop, step;

        ArrayIndexerTask(int i, int stop, int step) {
            this.i = i;
            this.stop = stop;
            this.step = step;
        }

        @Override
        public void run() {
            if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                return;
            }
            indexedArray[a[i] - 1] = i;
            arrayIndexer(i + step, stop, step);
        }
    }

    static class DifferenceCalculatorTask implements Runnable {
        int i, stop, step;

        DifferenceCalculatorTask(int i, int stop, int step) {
            this.i = i;
            this.stop = stop;
            this.step = step;
        }

        @Override
        public void run() {
            if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                return;
            }
            res += Math.abs(indexedArray[i] - indexedArray[i - 1]);
            differenceCalculator(i + step, stop, step);
        }
    }

    static void arrayIndexer(int i, int stop, int step) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future future = executorService.submit(new ArrayIndexerTask(i, stop, step));
        try {
            future.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }

    static void differenceCalculator(int i, int stop, int step) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future future = executorService.submit(new DifferenceCalculatorTask(i, stop, step));
        try {
            future.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        indexedArray = new int[n];
        Arrays.fill(indexedArray, -1);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future future = executorService.submit(new MultiplyTask(a, n));
        try {
            future.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        executorService.shutdown();
        arrayIndexer(0, n, 1);
        differenceCalculator(1, n, 1);
        System.out.println(res);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and an array of `n` integers from the standard input. It multiplies the array by `n` in a separate thread, indexes the array in a separate thread, and calculates the sum of absolute differences between consecutive elements in the indexed array in a separate thread. The result is printed to the standard output.

