import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC158_B {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        int mod = (int) Math.pow(10, 9) + 7;
        BlockingQueue<int[]> queueMI0 = new LinkedBlockingQueue<>();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        executor.submit(() -> {
            try {
                queueMI0.put(FuncMI0());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);

        int[] inputs = queueMI0.take();
        int N = inputs[0];
        int A = inputs[1];
        int limit_b = inputs[2];
        int ans = 0;
        int rep = N / (A + limit_b);
        ans += rep * A;
        int res = N - rep * (A + limit_b);
        ans += Math.min(res, A);
        System.out.println(ans);
    }

    public static int[] FuncMI0() {
        return Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}