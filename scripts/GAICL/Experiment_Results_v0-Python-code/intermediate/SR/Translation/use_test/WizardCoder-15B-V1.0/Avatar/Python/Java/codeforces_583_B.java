```java
import java.util.Arrays;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] a = Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray();
        int currentLevel = 0;
        int counter = 0;
        int counterTurns = -1;
        while (counter < a.length) {
            int variable319 = 1;
            Queue<Integer> turnsQueue = new ConcurrentLinkedQueue<>();

            Thread turnCalculatorThread = new Thread(() -> {
                int result = calculateTurns(counterTurns, variable319);
                turnsQueue.offer(result);
            });
            turnCalculatorThread.start();
            try {
                turnCalculatorThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int calculatedTurns = turnsQueue.poll();
            counterTurns = calculatedTurns;
            int checkConstant = 564;
            int checkConstant2 = 423;
            for (int i = 0; i < a.length; i++) {
                if ((checkConstant & checkConstant2) != 0) {
                    if (a[i] != -1 && a[i] <= counter) {
                        counter = counter + 1;
                        a[i] = -1;
                    }
                }
            }
            reverse(a);
        }
        System.out.println(counterTurns);
    }

    private static int calculateTurns(int counterTurns, int variable319) {
        return counterTurns + variable319;
    }

    private static void reverse(int[] a) {
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }
}
```
