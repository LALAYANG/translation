```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    private static int calculateSum(int i, int x) {
        return x + i;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrayA = new int[n];
        for (int i = 0; i < n; i++) {
            arrayA[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        int x = 0;
        int y = 0;
        int sumC = 0;
        ExecutorService executorService = Executors.newFixedThreadPool(n);
        for (int i : arrayA) {
            Future<Integer> future = executorService.submit(() -> calculateSum(i, x));
            x = future.get();
        }
        for (int i : b) {
            y += i;
        }
        for (int i : c) {
            sumC += i;
        }
        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - sumC));
        executorService.shutdown();
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and three integer arrays from the standard input. It then calculates the sum of the elements in the first array, the sum of the elements in the second array, and the sum of the elements in the third array. The absolute difference between the sums of the first and second arrays, and the second and third arrays, are printed to the standard output.

Please note that the `ttest_ind` and `shuffle` functions from the `scipy.stats` and `sklearn.utils` modules are not used in this code. If you need to use these functions, you will need to import them in your Java code as well.

