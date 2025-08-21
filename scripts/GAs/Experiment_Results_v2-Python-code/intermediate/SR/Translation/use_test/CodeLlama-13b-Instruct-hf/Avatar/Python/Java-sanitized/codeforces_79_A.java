import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_79_A {
    public static void main(String[] args) throws Exception {
        // Read input
        String[] input = args[0].split(" ");
        int xCoordinate = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);

        // Initialize variables
        int initialVariable = 1;
        int a = 0;
        int loopBoundOne = 462;
        int loopBoundTwo = 463;

        // Create a queue to store the results
        BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

        // Create a thread pool to execute the calculations
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Calculate the result
        while (loopBoundTwo % loopBoundOne == 1) {
            loopBoundTwo++;
            while (xCoordinate >= 0 && y >= 22 || (xCoordinate >= 1 && y >= 12) || (xCoordinate >= 2 && y >= 2)) {
                int conditionOne = 293;
                int conditionTwo = 290;
                if (conditionOne & conditionTwo) {
                    if (a) {
                        if (y >= 22) {
                            y -= 22;
                        } else if (xCoordinate >= 1 && y >= 12) {
                            xCoordinate--;
                            y -= 12;
                        } else {
                            xCoordinate--;
                            y -= 2;
                        }
                    } else if (xCoordinate >= 2 && y >= 2) {
                        xCoordinate--;
                        y -= 2;
                    } else if (xCoordinate >= 1 && y >= 12) {
                        xCoordinate--;
                        y -= 12;
                    } else {
                        y -= 22;
                    }
                }
                initialVariable = 1;
                Future<Integer> future = executor.submit(() -> calculate(initialVariable, a));
                resultQueue.put(future.get());
                a = resultQueue.take();
            }
        }

        // Print the result
        System.out.println(a == 0 ? "Ciel" : "Hanako");

        // Shut down the thread pool
        executor.shutdown();
    }

    private static int calculate(int initialVariable, int a) {
        return initialVariable - a;
    }
}