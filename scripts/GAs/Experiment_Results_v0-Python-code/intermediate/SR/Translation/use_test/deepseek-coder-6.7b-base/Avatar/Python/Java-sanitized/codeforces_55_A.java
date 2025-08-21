import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_55_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] shuffled = {84, 31, 74};
        for (int i = 0; i < shuffled.length; i++) {
            int temp = shuffled[i];
            int randomIndex = (int) (Math.random() * shuffled.length);
            shuffled[i] = shuffled[randomIndex];
            shuffled[randomIndex] = temp;
        }
        while (number % 2 == 0) {
            int divisor = 2;
            Queue<Double> resultQueue = new LinkedBlockingQueue<>();
            Thread divisionWorker = new Thread(() -> {
                double result = divideNumbers(number, divisor);
                resultQueue.add(result);
            });
            divisionWorker.start();
            try {
                divisionWorker.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            double divisionResult = resultQueue.poll();
            number = (int) divisionResult;
        }
        if (number == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    @FunctionalInterface
    public interface DivideNumbers {
        double divide(int number, int divisor);
    }

    public static double divideNumbers(int number, int divisor) {
        return number / divisor;
    }
}