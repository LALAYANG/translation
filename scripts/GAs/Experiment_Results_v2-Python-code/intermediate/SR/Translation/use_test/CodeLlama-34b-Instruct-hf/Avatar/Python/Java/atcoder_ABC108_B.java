```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class CalculateDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputNumbers = input.split(" ");
        int firstNumber = Integer.parseInt(inputNumbers[0]);
        int y1 = Integer.parseInt(inputNumbers[1]);
        int x2 = Integer.parseInt(inputNumbers[2]);
        int y2 = Integer.parseInt(inputNumbers[3]);

        Queue<Integer> queue = new Queue<>();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int diffResult = calculateDifferenceThread(firstNumber, x2);
                queue.add(diffResult);
            }
        });

        thread.start();
        thread.join();

        int differenceResult = queue.poll();
        int DIF1 = differenceResult;
        int DIF2 = calculateDifference(y2, y1);
        int x3 = x2 - DIF2;
        int y3 = y2 + DIF1;
        int x4 = firstNumber - DIF2;
        int y4 = y1 + DIF1;

        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }

    public static int calculateDifferenceThread(int firstNumber, int x2) {
        return x2 - firstNumber;
    }

    public static int calculateDifference(int y2, int y1) {
        return y2 - y1;
    }
}
```
Note: In Java, we use the `Queue` interface to represent a queue, and the `Thread` class to represent a thread. The `Runnable` interface is used to define a task that can be executed by a thread. The `join()` method is used to wait for a thread to finish its execution.
