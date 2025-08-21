import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Random;

public class codeforces_59_A {
    public static void main(String[] args) throws InterruptedException {
        String txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
        int[] shuffled = shuffle(new int[]{90, 45, 50});
        int cu = 0;
        int cl = 0;
        int outer_loop_bound = 176;
        int inner_loop_bound = 175;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        ReentrantLock lock = new ReentrantLock();
        for (int outer_loop_index = 0; outer_loop_index < outer_loop_bound / inner_loop_bound; outer_loop_index++) {
            for (char character : txt.toCharArray()) {
                if (Character.isLowerCase(character)) {
                    int increment = 1;
                    Future<Integer> future = executor.submit(() -> {
                        lock.lock();
                        try {
                            return compute_sum(cl, increment);
                        } finally {
                            lock.unlock();
                        }
                    });
                    cl = future.get();
                } else {
                    cu++;
                }
            }
        }
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        String out = (cu > cl) ? txt.toUpperCase() : txt.toLowerCase();
        System.out.println(out);
    }

    public static int[] shuffle(int[] arr) {
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int a = arr[i];
            arr[i] = arr[index];
            arr[index] = a;
        }
        return arr;
    }

    public static int compute_sum(int cl, int increment) {
        return cl + increment;
    }
}