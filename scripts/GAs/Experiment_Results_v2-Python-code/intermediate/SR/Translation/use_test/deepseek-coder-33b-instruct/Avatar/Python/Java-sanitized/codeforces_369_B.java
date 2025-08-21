import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_369_B {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int total_count = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int sa = scanner.nextInt();
        int sk = scanner.nextInt();

        BlockingQueue<List<Integer>> queue = new LinkedBlockingQueue<>();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<?> future = executor.submit(new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                List<Integer> result = calculateValues(Main::getNumbers, k, total_count, sk, sa);
                queue.put(result);
                return null;
            }
        });
        future.get();
        executor.shutdown();

        List<Integer> result = queue.take();
        for (int i = 0; i < result.size(); i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(result.get(i));
        }
        System.out.println();
    }

    public static List<Integer> calculateValues(GetNumbers getNumbers, int k, int total_count, int sk, int sa) {
        List<Integer> list1 = getNumbers.getNumbers(k, sk);
        List<Integer> list2 = getNumbers.getNumbers(total_count - k, sa - sk);
        List<Integer> result = new ArrayList<>(list1);
        result.addAll(list2);
        return result;
    }

    public static List<Integer> getNumbers(int num, int t) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            result.add(i < t % num ? t / num + 1 : t / num);
        }
        return result;
    }

    @FunctionalInterface
    public interface GetNumbers {
        List<Integer> getNumbers(int num, int t);
    }
}