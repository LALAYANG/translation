import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;
import java.util.concurrent.locks.ReentrantLock;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new Queue<>();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int[] result = readIntList(scanner);
                queue.add(result);
            }
        });

        thread.start();
        thread.join();

        int[] result = queue.poll();
        int a = result[0];
        int b = result[1];
        int c = result[2];
        int d = result[3];

        System.out.println(Math.max(a * c, b * d, a * d, b * c));
    }

    private static int[] readIntList(Scanner scanner) {
        String[] tokens = scanner.nextLine().split(" ");
        int[] numbers = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            numbers[i] = Integer.parseInt(tokens[i]);
        }
        return numbers;
    }
}