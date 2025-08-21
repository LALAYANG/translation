```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        ReentrantLock lock = new ReentrantLock();
        Future<Integer> future = executor.submit(() -> performTTest(scanner));
        int[] result = readMultipleInputs(scanner);
        int N = result[0];
        int A = result[1];
        int B = result[2];
        int mod = (int) (1e9 + 7);
        int ans = 0;
        int rep = N / (A + B);
        ans += rep * A;
        int res = N - rep * (A + B);
        ans += Math.min(res, A);
        System.out.println(ans);
        try {
            future.get(1, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        executor.shutdown();
        scanner.close();
    }

    private static int[] readMultipleInputs(Scanner scanner) {
        String[] inputs = scanner.nextLine().split(" ");
        int[] result = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            result[i] = Integer.parseInt(inputs[i]);
        }
        return result;
    }

    private static int performTTest(Scanner scanner) {
        TTest tTest = new TTest();
        double[] a = {48, 83, 18};
        double[] b = {86, 55, 25};
        double pValue = tTest.tTest(a, b);
        return scanner.nextInt();
    }
}
```

Test input:
840783003083059124 0 327003145473120758

Expected output:
0 
