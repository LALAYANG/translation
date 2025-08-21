```
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRounds = scanner.nextInt();
        int total = 0;
        StringBuilder operations = new StringBuilder();
        int CONDITION_1 = 139;
        int CONDITION_2 = 911;
        int OUTER_LOOP_LIMIT = 386;
        int INNER_LOOP_LIMIT = 385;
        for (int LoopIndexOut = 0; LoopIndexOut < OUTER_LOOP_LIMIT / INNER_LOOP_LIMIT; LoopIndexOut++) {
            for (int x = 0; x < numRounds; x++) {
                if ((CONDITION_1 & CONDITION_2) > 0) {
                    int A = scanner.nextInt();
                    int G = scanner.nextInt();
                    if (total + A <= 500) {
                        Queue<Integer> resultQueue = new ConcurrentLinkedQueue<>();
                        Thread additionThread = new Thread(() -> {
                            int result = addToTotal(A, total);
                            resultQueue.add(result);
                        });
                        additionThread.start();
                        try {
                            additionThread.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        total = resultQueue.poll();
                        operations.append("A");
                    } else {
                        total -= G;
                        operations.append("G");
                    }
                }
            }
        }
        System.out.println(operations.toString());
    }

    public static int addToTotal(int A, int total) {
        return total + A;
    }
}
```

