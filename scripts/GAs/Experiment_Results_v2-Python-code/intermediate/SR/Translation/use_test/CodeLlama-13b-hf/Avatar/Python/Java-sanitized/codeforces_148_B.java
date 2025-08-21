import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_148_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int princess = scanner.nextInt();
        int dragon = scanner.nextInt();
        int t = scanner.nextInt();
        int f = scanner.nextInt();
        int c = scanner.nextInt();
        if (dragon <= princess) {
            System.out.println(0);
            return;
        }
        int result = 0;
        BlockingQueue<Integer> queue_fight0 = new LinkedBlockingQueue<>();

        Thread thread_fight0 = new Thread(() -> {
            int result_fight = fight(t, princess);
            queue_fight0.add(result_fight);
        });
        thread_fight0.start();
        try {
            thread_fight0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int current_position = queue_fight0.take();
        current_position += princess * current_position / (dragon - princess);
        while (current_position < c) {
            result = result + 1;
            current_position += princess * current_position / dragon;
            current_position += princess * f;
            current_position += princess * current_position / (dragon - princess);
        }
        System.out.println(result);
    }

    public static int fight(int t, int princess) {
        return t * princess;
    }
}