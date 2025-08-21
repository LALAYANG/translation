import java.util.*;
import java.util.concurrent.*;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        int addition = 7;
        int base = 10;
        int exponent = 9;
        Queue<Integer> resultQueue = new LinkedBlockingQueue<>();

        Thread calculationThread = new Thread(() -> {
            int result = calculationFunction(addition, base, exponent);
            resultQueue.offer(result);
        });
        calculationThread.start();

        try {
            calculationThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int calculationResult = resultQueue.poll();
        int totalPrice = calculationResult;

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = (int) (Double.parseDouble(input[1]) * 100 + 0.1);
        System.out.println(a * b / 100);
    }

    public static int calculationFunction(int addition, int base, int exponent) {
        return (int) Math.pow(base, exponent) + addition;
    }
}