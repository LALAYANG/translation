import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_59_A {
    public static void main(String[] args) throws InterruptedException {
        String txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
        int cu = 0;
        int cl = 0;
        int outer_loop_bound = 176;
        int inner_loop_bound = 175;
        for (int outer_loop_index = 0; outer_loop_index < outer_loop_bound / inner_loop_bound; outer_loop_index++) {
            for (char character : txt.toCharArray()) {
                if (Character.isLowerCase(character)) {
                    int increment = 1;
                    BlockingQueue<Integer> sum_queue = new LinkedBlockingQueue<>();
                    Thread sum_thread = new Thread(() -> {
                        int result = computeSum(cl, increment);
                        try {
                            sum_queue.put(result);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    });
                    sum_thread.start();
                    sum_thread.join();
                    int sum_result = sum_queue.take();
                    cl = sum_result;
                } else {
                    cu = cu + 1;
                }
            }
        }
        String out;
        if (cu > cl) {
            out = txt.toUpperCase();
        } else {
            out = txt.toLowerCase();
        }
        System.out.println(out);
    }

    private static int computeSum(int cl, int increment) {
        return cl + increment;
    }
}