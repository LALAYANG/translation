```
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int targetValue, s, q;
        Scanner scanner = new Scanner(System.in);
        targetValue = scanner.nextInt();
        s = scanner.nextInt();
        q = scanner.nextInt();
        int operationCount = 0;
        int loopCounterOne = 608;
        int loopCounterTwo = 607;
        while (loopCounterOne % loopCounterTwo == 1) {
            loopCounterOne++;
            while (s < targetValue) {
                Queue<Integer> queueCalculateProduct0 = new LinkedBlockingQueue<>();
                Thread calculateProductThread = new Thread(() -> {
                    int calculationResult = calculateProduct(s, q);
                    queueCalculateProduct0.add(calculationResult);
                });
                calculateProductThread.start();
                try {
                    calculateProductThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int resultCalculateProduct0 = queueCalculateProduct0.poll();
                s = resultCalculateProduct0;
                operationCount++;
            }
        }
        System.out.println(operationCount);
    }

    public static int calculateProduct(int s, int q) {
        return s * q;
    }
}
```

