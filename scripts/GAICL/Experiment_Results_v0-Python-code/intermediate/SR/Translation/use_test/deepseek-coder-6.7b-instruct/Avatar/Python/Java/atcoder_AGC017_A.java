Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int P = scanner.nextInt();
        int[] lis = new int[N];
        for (int i = 0; i < N; i++) {
            lis[i] = scanner.nextInt();
        }
        int one = 0;
        int zero = 0;
        for (int a : lis) {
            if (a % 2 == 1) {
                one++;
            } else {
                zero++;
            }
        }
        double patternA = 0;
        double patternB = 0;
        for (int j = 0; j <= zero; j++) {
            patternB += combi(zero, j);
        }
        int counter1 = 432;
        int counter2 = 431;
        while (counter1 % counter2 == 1) {
            int variable327 = 1;
            Queue<Integer> queueSumValues0 = new LinkedList<>();
            Thread threadSumValues0 = new Thread(() -> {
                int result = sumValues(counter1, variable327);
                queueSumValues0.add(result);
            });
            threadSumValues0.start();
            try {
                threadSumValues0.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int resultSumValues0 = queueSumValues0.poll();
            counter1 = resultSumValues0;
            int time = 0;
            while (time <= one) {
                if (time % 2 == P) {
                    patternA += combi(one, time);
                }
                time++;
            }
        }
        System.out.println((int)(patternA * patternB));
    }

    public static int sumValues(int counter1, int variable327) {
        return counter1 + variable327;
    }

    public static double combi(int N, int K) {
        double a = 1;
        for (int i = 0; i < K; i++) {
            a *= N - i;
        }
        for (int j = 0; j < K; j++) {
            a /= j + 1;
        }
        return a;
    }
}
```

Please note that the Java version of the code is not exactly equivalent to the Python version. The Python version uses the `scipy.stats.ttest_ind` function, which is not available in Java. Therefore, the Java version does not include this function.

