import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class atcoder_AGC002_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new Queue<>();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = scanner.nextInt();
                int secondVariable = scanner.nextInt();
                queue.add(a);
                queue.add(secondVariable);
            }
        });

        thread.start();
        thread.join();

        int a = queue.poll();
        int secondVariable = queue.poll();

        if (a > 0) {
            System.out.println("Positive");
        } else if (a <= 0 && secondVariable >= 0) {
            System.out.println("Zero");
        } else if (sumTwoVariables(a, secondVariable) % 2 == 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }

    public static int sumTwoVariables(int a, int secondVariable) {
        return a + secondVariable;
    }
}