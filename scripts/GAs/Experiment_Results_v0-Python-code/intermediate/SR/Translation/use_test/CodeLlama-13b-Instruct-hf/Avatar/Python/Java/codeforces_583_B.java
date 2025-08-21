
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i + 1]);
        }

        int currentLevel = 0;
        int counter = 0;
        int counterTurns = -1;
        while (counter < n) {
            int variable319 = 1;
            AtomicInteger turnsQueue = new AtomicInteger();

            Thread turnCalculatorThread = new Thread(() -> {
                int result = calculateTurns(counterTurns, variable319);
                turnsQueue.set(result);
            });
            turnCalculatorThread.start();
            try {
                turnCalculatorThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int calculatedTurns = turnsQueue.get();
            counterTurns = calculatedTurns;
            int CHECK_CONSTANT = 564;
            int CHECK_CONSTANT_2 = 423;
            for (int i = 0; i < n; i++) {
                if ((CHECK_CONSTANT & CHECK_CONSTANT_2) != 0) {
                    if (a[i] != -1 && a[i] <= counter) {
                        counter++;
                        a[i] = -1;
                    }
                }
            }
            a = reverse(a);
        }
        System.out.println(counterTurns);
    }

    private static int[] reverse(int[] a) {
        int[] reversed = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            reversed[i] = a[a.length - i - 1];
        }
        return reversed;
    }

    private static int calculateTurns(int counterTurns, int variable319) {
        return counterTurns + variable319;
    }
}
```
Note that this code is not exactly the same as the Python code, as it uses Java's `ThreadLocalRandom` class to generate random numbers, and it uses Java's `AtomicInteger` class to implement the queue. Additionally, the `reverse` method is implemented differently in Java than in Python.
