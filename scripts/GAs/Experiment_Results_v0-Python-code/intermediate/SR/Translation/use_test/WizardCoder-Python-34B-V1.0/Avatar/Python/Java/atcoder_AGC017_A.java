```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int P = scanner.nextInt();
        int[] lis = new int[N];
        for (int i = 0; i < N; i++) {
            lis[i] = scanner.nextInt();
        }
        int one = 0;
        int zero = 0;
        for (int i = 0; i < N; i++) {
            if (lis[i] % 2 == 1) {
                one++;
            } else {
                zero++;
            }
        }
        int pattern_a = 0;
        int pattern_b = 0;
        for (int j = 0; j <= zero; j++) {
            pattern_b += combi(zero, j);
        }
        int time = 0;
        int counter1 = 432;
        int counter2 = 431;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        while (counter1 % counter2 == 1) {
            Future<Integer> future = executor.submit(new SumValuesTask(counter1, 1));
            int result = future.get();
            counter1 = result;
            while (time <= one) {
                if (time % 2 == P) {
                    pattern_a += combi(one, time);
                }
                time++;
            }
        }
        System.out.println(pattern_a * pattern_b);
    }

    public static int combi(int n, int k) {
        int a = 1;
        for (int i = 0; i < k; i++) {
            a *= n - i;
        }
        for (int j = 0; j < k; j++) {
            a /= j + 1;
        }
        return a;
    }

    public static class SumValuesTask implements Callable<Integer> {
        private int counter1;
        private int variable_3_27;

        public SumValuesTask(int counter1, int variable_3_27) {
            this.counter1 = counter1;
            this.variable_3_27 = variable_3_27;
        }

        @Override
        public Integer call() {
            return counter1 + variable_3_27;
        }
    }
}
```

Sample test case:
```
16 1
4 6 78 14 66 54 18 82 92 42 54 66 86 40 40 26
```

Expected output:
```
0
``` 
