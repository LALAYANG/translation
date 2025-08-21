import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Arrays;
import java.util.stream.IntStream;

public class codeforces_544_B {
    public static void main(String[] args) {
        int size = 34;
        int k = 621;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = 0;
            }
        }
        int x = 0;
        int variable_3_12 = 0;
        BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
        Thread threadIncrement0 = new Thread(() -> {
            int threadResult = increment(variable_3_12, x);
            resultQueue.put(threadResult);
        });
        threadIncrement0.start();
        threadIncrement0.join();
        int resultIncrement0 = resultQueue.get();
        x = resultIncrement0;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row % 2 == col % 2 && x < k) {
                    System.out.print("L");
                    variable_3_12 = 1;
                    resultQueue = new LinkedBlockingQueue<>();
                    Thread threadIncrement1 = new Thread(() -> {
                        int threadResult = increment(variable_3_12, x);
                        resultQueue.put(threadResult);
                    });
                    threadIncrement1.start();
                    threadIncrement1.join();
                    int resultIncrement1 = resultQueue.get();
                    x = resultIncrement1;
                } else {
                    System.out.print("S");
                }
            }
            System.out.println();
        }
    }

    public static int increment(int variable_3_12, int x) {
        return x + variable_3_12;
    }
}