import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_AGC002_A {
    private static final int check1 = 460;
    private static final int check2 = 805;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<int[]> inputQueue = new LinkedBlockingQueue<>();

        Thread inputThread = new Thread(() -> {
            int[] inputValues = new int[2];
            inputValues[0] = scanner.nextInt();
            inputValues[1] = scanner.nextInt();
            try {
                inputQueue.put(inputValues);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        inputThread.start();
        inputThread.join();

        int[] resultLI0 = inputQueue.take();
        int a = resultLI0[0];
        int b = resultLI0[1];

        if ((check1 & check2) != 0) {
            if (a > 0) {
                System.out.println("Positive");
            } else if (a <= 0 && b >= 0) {
                System.out.println("Zero");
            } else if ((a + b) % 2 == 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Positive");
            }
        }
    }
}