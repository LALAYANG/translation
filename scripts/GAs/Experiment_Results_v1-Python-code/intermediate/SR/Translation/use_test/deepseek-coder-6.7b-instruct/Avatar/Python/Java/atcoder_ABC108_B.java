```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        Queue<Integer> queueDifferenceX = new LinkedList<>();
        Thread threadCalculateDifferenceX = new Thread(() -> {
            int result = calculateDifferenceX(x1, x2);
            queueDifferenceX.add(result);
        });

        threadCalculateDifferenceX.start();
        try {
            threadCalculateDifferenceX.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int differenceX = queueDifferenceX.poll();
        int DIF1 = differenceX;
        int DIF2 = y2 - y1;
        int x3 = x2 - DIF2;
        int y3 = y2 + DIF1;
        int x4 = x1 - DIF2;
        int y4 = y1 + DIF1;

        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }

    @FunctionalInterface
    public interface MyDecorator {
        int apply(int... args);
    }

    public static int calculateDifferenceX(int x1, int x2) {
        return x2 - x1;
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the standard input, calculates the difference between the first two and the last two, and prints the results. The calculation is performed in a separate thread to avoid blocking the main thread. The `calculateDifferenceX` method is decorated with a decorator that does nothing, but it could be used to add additional behavior to the method if needed.

