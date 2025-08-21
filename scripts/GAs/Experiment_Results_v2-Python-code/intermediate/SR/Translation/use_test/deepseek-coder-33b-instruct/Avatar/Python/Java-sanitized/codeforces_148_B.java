import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_148_B {
    public static void main(String[] args) throws InterruptedException {
        int princess = Integer.parseInt(args[0]);
        int dragon = Integer.parseInt(args[1]);
        int t = Integer.parseInt(args[2]);
        int f = Integer.parseInt(args[3]);
        int c = Integer.parseInt(args[4]);

        if (dragon <= princess) {
            System.out.println(0);
            System.exit(0);
        }

        int result = 0;
        BlockingQueue<Integer> queueFight0 = new LinkedBlockingQueue<>();

        Thread threadFight0 = new Thread(() -> {
            int resultFight = fight(t, princess);
            try {
                queueFight0.put(resultFight);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadFight0.start();
        threadFight0.join();
        int resultFight = queueFight0.poll();
        double currentPosition = resultFight;
        currentPosition += princess * currentPosition / (dragon - princess);

        while (currentPosition < c) {
            result += 1;
            currentPosition += princess * currentPosition / dragon;
            currentPosition += princess * f;
            currentPosition += princess * currentPosition / (dragon - princess);
        }

        System.out.println(result);
    }

    private static int fight(int t, int princess) {
        return t * princess;
    }
}