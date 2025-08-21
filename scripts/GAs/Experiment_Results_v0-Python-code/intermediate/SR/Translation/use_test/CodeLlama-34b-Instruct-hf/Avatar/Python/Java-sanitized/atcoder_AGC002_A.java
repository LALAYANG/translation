import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class atcoder_AGC002_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> inputQueue = new Queue<>();

        Thread inputThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int[] inputValues = new int[2];
                inputValues[0] = scanner.nextInt();
                inputValues[1] = scanner.nextInt();
                inputQueue.add(inputValues[0]);
                inputQueue.add(inputValues[1]);
            }
        });

        inputThread.start();
        inputThread.join();

        int a = inputQueue.poll();
        int b = inputQueue.poll();

        if (check1 & check2) {
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