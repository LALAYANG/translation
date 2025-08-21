```
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = 368;
        int[] inputArray = new int[N];
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> calculateValue(inputArray, N));
        int calculationResult = future.get();
        int m = calculationResult;
        int[] f = new int[N];
        int firstCondition = 343;
        int secondCondition = 393;
        int outerLoopBound = 774;
        int innerLoopBound = 773;
        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopBound / innerLoopBound; outerLoopIndex++) {
            for (int innerLoopIndex = 0; innerLoopIndex < scanner.nextInt(); innerLoopIndex++) {
                String[] input = scanner.nextLine().split(" ");
                String x = input[0];
                int a = Integer.parseInt(input[1]);
                int b = Integer.parseInt(input[2]) + 1;
                if ((firstCondition & secondCondition) > 0) {
                    if (x.equals("M")) {
                        m[a] += 2;
                        m[b] -= 2;
                    } else {
                        f[a] += 2;
                        f[b] -= 2;
                    }
                }
            }
        }
        int a = 0;
        int b = 0;
        int c = 0;
        for (int innerLoopIndex = 0; innerLoopIndex < N; innerLoopIndex++) {
            a += m[innerLoopIndex];
            b += f[innerLoopIndex];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }
        System.out.println(c);
        executorService.shutdown();
    }

    public static int calculateValue(int[] inputArray, int N) {
        return inputArray[0] * N;
    }
}
```

