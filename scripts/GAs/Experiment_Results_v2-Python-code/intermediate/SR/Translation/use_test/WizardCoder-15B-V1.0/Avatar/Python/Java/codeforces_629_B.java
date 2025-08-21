```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 368;
        int[] inputArray = new int[1];
        Queue<Integer> resultQueue = new LinkedList<>();
        Thread calculationThread = new Thread(() -> {
            int result = calculateValue(inputArray, N);
            resultQueue.offer(result);
        });
        calculationThread.start();
        try {
            calculationThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int calculationResult = resultQueue.poll();
        int[] m = new int[N];
        int[] f = new int[N];
        int firstCondition = 343;
        int secondCondition = 393;
        int outerLoopBound = 774;
        int innerLoopBound = 773;
        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopBound / innerLoopBound; outerLoopIndex++) {
            for (int innerLoopIndex = 0; innerLoopIndex < Integer.parseInt(sc.nextLine()); innerLoopIndex++) {
                String[] input = sc.nextLine().split(" ");
                int a = Integer.parseInt(input[1]);
                int b = Integer.parseInt(input[2]) + 1;
                if ((firstCondition & secondCondition) != 0) {
                    if (input[0].equals("M")) {
                        m[a]++;
                        m[b]--;
                    } else {
                        f[a]++;
                        f[b]--;
                    }
                }
            }
        }
        int a = 0, b = 0, c = 0;
        for (int innerLoopIndex = 0; innerLoopIndex < N; innerLoopIndex++) {
            a += m[innerLoopIndex];
            b += f[innerLoopIndex];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }
        System.out.println(c);
    }

    public static int calculateValue(int[] inputArray, int N) {
        return inputArray[0] * N;
    }
}
```
