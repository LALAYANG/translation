```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        String input = "0 1 1 0";
        String[] inputNumbers = input.split(" ");
        int firstNumber = Integer.parseInt(inputNumbers[0]);
        int y1 = Integer.parseInt(inputNumbers[1]);
        int x2 = Integer.parseInt(inputNumbers[2]);
        int y2 = Integer.parseInt(inputNumbers[3]);

        Queue<Integer> queue_calculateDifference = new LinkedList<>();

        Thread thread_calculateDifference = new Thread(() -> {
            int diffResult = calculateDifferenceThread(firstNumber, x2);
            queue_calculateDifference.offer(diffResult);
        });
        thread_calculateDifference.start();

        try {
            thread_calculateDifference.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int differenceResult = queue_calculateDifference.poll();
        int DIF1 = differenceResult;
        int DIF2 = calculateDifference(y2, y1);
        int x3 = x2 - DIF2;
        int y3 = y2 + DIF1;
        int x4 = firstNumber - DIF2;
        int y4 = y1 + DIF1;
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }

    public static int calculateDifference(int y2, int y1) {
        return y2 - y1;
    }

    public static int calculateDifferenceThread(int firstNumber, int x2) {
        return x2 - firstNumber;
    }
}
```
