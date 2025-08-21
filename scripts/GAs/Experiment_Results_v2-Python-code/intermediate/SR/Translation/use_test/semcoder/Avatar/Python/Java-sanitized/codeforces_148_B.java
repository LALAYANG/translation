import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class codeforces_148_B {
    public static int fight(int t, int princess) {
        return t * princess;
    }

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
        Queue<Integer> queue_fight0 = new ConcurrentLinkedQueue<>();

        Runnable fightThread = () -> {
            int result = fight(t, princess);
            queue_fight0.add(result);
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(fightThread);
        executor.shutdown();

        int result_fight = queue_fight0.poll();
        int current_position = result_fight;
        current_position += princess * current_position / (dragon - princess);

        while (current_position < c) {
            result++;
            current_position += princess * current_position / dragon;
            current_position += princess * f;
            current_position += princess * current_position / (dragon - princess);
        }

        System.out.println(result);
    }
}