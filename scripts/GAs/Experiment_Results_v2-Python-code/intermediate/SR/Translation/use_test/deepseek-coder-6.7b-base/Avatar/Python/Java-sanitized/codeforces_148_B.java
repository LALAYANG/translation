import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class codeforces_148_B {
    public static void main(String[] args) {
        int princess = Integer.parseInt(System.console().readLine());
        int dragon = Integer.parseInt(System.console().readLine());
        int t = Integer.parseInt(System.console().readLine());
        int f = Integer.parseInt(System.console().readLine());
        int c = Integer.parseInt(System.console().readLine());
        if (dragon <= princess) {
            System.out.println(0);
            return;
        }
        int result = 0;
        Queue<Integer> queue_fight0 = new ConcurrentLinkedQueue<>();
        new Thread(() -> {
            int result = fight(t, princess);
            queue_fight0.add(result);
        }).start();
        int result_fight = queue_fight0.poll();
        int current_position = result_fight;
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