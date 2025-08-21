```
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] input = "50 25 1000 1000 50000 25000".split(" ");
        int new_n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int l = Integer.parseInt(input[2]);
        int new_r = Integer.parseInt(input[3]);
        int sa = Integer.parseInt(input[4]);
        int sk = Integer.parseInt(input[5]);
        BlockingQueue<Integer> queue_compute_partitions0 = new LinkedBlockingQueue<Integer>();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> compute_partitions_worker = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return compute_partitions(k, new_n, sa, new GetNumbers(), sk);
            }
        });
        int partitions_result = queue_compute_partitions0.take();
        int[] ans = partitions_result;
        System.out.println(String.join(" ", Arrays.stream(ans).mapToObj(String::valueOf).toArray(String[]::new)));
    }

    public static int[] compute_partitions(int k, int new_n, int sa, GetNumbers get_numbers, int sk) {
        return get_numbers.getNumbers(k, sk) + get_numbers.getNumbers(new_n - k, sa - sk);
    }

    public static class GetNumbers {
        public int[] getNumbers(int num, int t) {
            return new int[num];
        }
    }
}
```

