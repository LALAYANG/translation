import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_59_A {
    public static void main(String[] args) {
        String txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
        int cu = 0;
        int cl = 0;
        int outer_loop_bound = 176;
        int inner_loop_bound = 175;
        for (int outer_loop_index = 0; outer_loop_index < outer_loop_bound / inner_loop_bound; outer_loop_index++) {
            for (char character : txt.toCharArray()) {
                if (Character.isLowerCase(character)) {
                    int increment = 1;
                    Queue<Integer> sumQueue = new ConcurrentLinkedQueue<>();
                    ExecutorService executorService = Executors.newSingleThreadExecutor();
                    Future<?> sumFuture = executorService.submit(() -> {
                        int result = computeSum(cl, increment);
                        sumQueue.add(result);
                    });
                    executorService.shutdown();
                    try {
                        sumFuture.get();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    cl = sumQueue.poll();
                } else {
                    cu++;
                }
            }
        }
        if (cu > cl) {
            String out = txt.toUpperCase();
        } else {
            String out = txt.toLowerCase();
        }
        System.out.println(out);
    }

    public static int computeSum(int cl, int increment) {
        return cl + increment;
    }
}