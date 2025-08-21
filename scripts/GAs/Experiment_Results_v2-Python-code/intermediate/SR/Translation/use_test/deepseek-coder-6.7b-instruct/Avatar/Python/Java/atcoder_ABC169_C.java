```java
import java.util.*;
import java.lang.*;
import java.io.*;

class MainClass {
    static Queue<Double> resultQueue = new LinkedList<>();
    static int addition = 7;
    static int base = 10;
    static int exponent = 9;

    public static void main(String[] args) {
        Thread calculationThread = new Thread(new Runnable() {
            @Override
            public void run() {
                double result = calculationFunction(addition, base, exponent);
                resultQueue.add(result);
            }
        });
        calculationThread.start();
        try {
            calculationThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        double calculationResult = resultQueue.poll();
        int totalPrice = (int) calculationResult;
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = (int) (Float.parseFloat(input[1]) * 100 + 0.1);
        System.out.println((a * b) / 100);
    }

    public static double calculationFunction(int addition, int base, int exponent) {
        return Math.pow(base, exponent) + addition;
    }
}
```

This Java code does the same thing as the Python code. It defines a `calculationFunction` that raises a base to an exponent and adds an addition value. It then creates a new thread that runs this function and adds the result to a queue. The main function then waits for this thread to finish, retrieves the result from the queue, and processes the rest of the input.

