import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class atcoder_ABC153_A {
    public static void main(String[] args) {
        int totalItems = Integer.parseInt(args[0]);
        int a = Integer.parseInt(args[1]);
        int sho = totalItems / a;
        int remainderItems = totalItems % a;
        if (remainderItems != 0) {
            int incrementValue = 1;
            AtomicInteger resultSho = new AtomicInteger(sho);
            ThreadLocalRandom random = ThreadLocalRandom.current();
            Thread thread = new Thread(() -> {
                int result = calculateSho(incrementValue, sho);
                resultSho.set(result);
            });
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sho = resultSho.get();
        }
        System.out.println(sho);
    }

    private static int calculateSho(int incrementValue, int sho) {
        return sho + incrementValue;
    }
}