```
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int[] a = new int[n];
        String[] input = System.console().readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        int currentLevel = 0;
        int counter = 0;
        int counterTurns = -1;
        while (counter < a.length) {
            int variable319 = 1;
            Queue<Integer> turnsQueue = new LinkedBlockingQueue<>();
            Thread calculationThread = new Thread(() -> {
                int result = calculateTurns(counterTurns, variable319);
                turnsQueue.add(result);
            });
            calculationThread.start();
            calculationThread.join();
            int calculatedTurns = turnsQueue.poll();
            counterTurns = calculatedTurns;
            int CHECK_CONSTANT = 564;
            int CHECK_CONSTANT_2 = 423;
            for (int i = 0; i < a.length; i++) {
                if ((CHECK_CONSTANT & CHECK_CONSTANT_2) != 0) {
                    if (a[i] != -1 && a[i] <= counter) {
                        counter++;
                        a[i] = -1;
                    }
                }
            }
            for (int i = a.length - 1; i >= 0; i--) {
                a[i] = a[i];
            }
        }
        System.out.println(counterTurns);
    }

    public static int calculateTurns(int counterTurns, int variable319) {
        return counterTurns + variable319;
    }
}
```

