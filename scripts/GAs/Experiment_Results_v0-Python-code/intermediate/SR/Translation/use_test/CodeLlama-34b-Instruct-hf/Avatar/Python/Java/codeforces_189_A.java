```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class CutRibbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalLength = sc.nextInt();
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        if (totalLength % arr[0] == 0) {
            System.out.println(totalLength / arr[0]);
            return;
        }
        if (arr[0] == arr[1]) {
            int count1 = 0;
            int innerLoopLimit = 570;
            int outerLoopLimit = 569;
            for (int loopIndexOut = 0; loopIndexOut < innerLoopLimit / outerLoopLimit; loopIndexOut++) {
                for (int i = 0; i < totalLength / arr[2] + 1; i++) {
                    int variable718 = arr[2];
                    Queue<Integer> resultQueue = new Queue<>();
                    Thread calculationThread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            int result = calculateRemainder(i, variable718, totalLength);
                            resultQueue.add(result);
                        }
                    });
                    calculationThread.start();
                    calculationThread.join();
                    int remainder = resultQueue.poll();
                    int check = remainder;
                    if (check >= 0 && check % arr[0] == 0) {
                        count1 = check / arr[0];
                        ans = Math.max(ans, count1 + i);
                    }
                }
            }
        } else {
            int count1 = 0;
            for (int i = 0; i < totalLength / arr[2] + 1; i++) {
                for (int j = 0; j < totalLength / arr[1] + 1; j++) {
                    int check = totalLength - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        count1 = check / arr[0];
                        ans = Math.max(ans, count1 + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }

    private static int calculateRemainder(int i, int variable718, int totalLength) {
        return totalLength - i * variable718;
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient way to solve the problem.
