import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        BlockingQueue<List<Integer>> queue = new LinkedBlockingQueue<>();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                List<Integer> result = Func_LI_0.readInput();
                queue.put(result);
            }
        });
        thread.start();
        try {
            List<Integer> result = queue.take();
            int a = result.get(0);
            int b = result.get(1);
            int multiplier = result.get(2);
            int d = result.get(3);
            int max = Math.max(a * multiplier, b * d);
            System.out.println(max);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}