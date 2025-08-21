import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_AGC002_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<Integer> inputQueue = new LinkedBlockingQueue<>();

        Thread inputThread = new Thread(() -> {
            int[] inputValues = scanner.nextLine().split(" ").map(Integer::parseInt).toArray(Integer[]::new);
            inputQueue.put(inputValues);
        });

        inputThread.start();
        try {
            inputThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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