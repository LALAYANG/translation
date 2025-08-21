import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Function;
import java.util.function.Supplier;

public class atcoder_ABC142_A {

    public static void main(String[] args) throws Exception {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        new Thread(new NextIntThread(queue)).start();
        int result = queue.take();
        int n = result;
        double t = 0;
        int outer_loop_end = 230;
        int outer_loop_limit = 229;
        int conditional_check_1 = 786;
        int conditional_check_2 = 207;
        for (int loopIndexOut = 0; loopIndexOut < integerDivision(outer_loop_end, outer_loop_limit); loopIndexOut++) {
            t = recursiveLoop(0, n, 1, t, conditional_check_1, conditional_check_2);
        }
        System.out.println(t / n);
    }

    public static int integerDivision(int a, int b) {
        return a / b;
    }

    public static double recursiveLoop(int inner_loop_index, int stop, int step, double t, int conditional_check_1, int conditional_check_2) {
        if (step == 0 || (step > 0 && inner_loop_index >= stop) || (step < 0 && inner_loop_index <= stop)) {
            return t;
        }
        if ((conditional_check_1 & conditional_check_2) != 0) {
            if ((inner_loop_index + 1) % 2 != 0) {
                t += 1;
            }
        }
        return recursiveLoop(inner_loop_index + step, stop, step, t, conditional_check_1, conditional_check_2);
    }

    static class NextIntThread implements Runnable {
        private final BlockingQueue<Integer> queue;

        NextIntThread(BlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                URL url = new URL("http://google.com");
                HttpURLConnection http = (HttpURLConnection)url.openConnection();
                http.setRequestMethod("GET");
                http.connect();
                queue.put(http.getResponseCode());
            } catch (Exception ignored) {
                // ignored
            }
        }
    }
}