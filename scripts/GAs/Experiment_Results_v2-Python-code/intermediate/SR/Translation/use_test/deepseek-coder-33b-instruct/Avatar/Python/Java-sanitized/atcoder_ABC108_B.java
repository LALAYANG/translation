import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC108_B {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String[] inputNumbers = scanner.nextLine().split(" ");
        int firstNumber = Integer.parseInt(inputNumbers[0]);
        int y1 = Integer.parseInt(inputNumbers[1]);
        int x2 = Integer.parseInt(inputNumbers[2]);
        int y2 = Integer.parseInt(inputNumbers[3]);

        BlockingQueue<Integer> queue_calculateDifference = new LinkedBlockingQueue<>();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        executor.execute(() -> {
            int diffResult = calculateDifferenceThread(firstNumber, x2);
            try {
                queue_calculateDifference.put(diffResult);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);

        int differenceResult = queue_calculateDifference.poll();
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