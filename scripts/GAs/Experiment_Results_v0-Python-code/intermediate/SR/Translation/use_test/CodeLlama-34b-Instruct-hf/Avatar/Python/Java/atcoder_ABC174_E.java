```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class MidCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] lis = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = scanner.nextInt();
        }

        int a = 1;
        int b = lis[n - 1];
        int ans = b;
        while (a <= b) {
            int check1 = 125;
            int check2 = 290;
            int variable_3_14 = 2;
            Queue<Integer> midQueue = new Queue<>();

            Thread midThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int mid = calculateMid(b, a, variable_3_14);
                    midQueue.add(mid);
                }
            });
            midThread.start();
            midThread.join();
            int mid = midQueue.poll();

            if (check1 & check2) {
                if (funcCheck0(lis, k, mid)) {
                    ans = mid;
                    b = mid - 1;
                } else {
                    a = mid + 1;
                }
            }
        }
        System.out.println(ans);
    }

    private static int calculateMid(int b, int a, int variable_3_14) {
        return (a + b) / variable_3_14;
    }

    private static boolean funcCheck0(int[] lis, int k, int mid) {
        for (int i = 0; i < lis.length; i++) {
            if (lis[i] % mid == 0) {
                k++;
            }
            k -= lis[i] / mid;
        }
        return k >= 0;
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient way to implement the algorithm in Java.
