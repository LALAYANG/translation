import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_148_B {
    public static void main(String[] args) {
        int princess = Integer.parseInt(args[0]);
        int dragon = Integer.parseInt(args[1]);
        int t = Integer.parseInt(args[2]);
        int f = Integer.parseInt(args[3]);
        int c = Integer.parseInt(args[4]);
        if (dragon <= princess) {
            System.out.println(0);
            return;
        }
        int result = 0;
        Queue<Integer> queue_fight0 = new LinkedBlockingQueue<>();
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
        int current_position = queue_fight0.poll();
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