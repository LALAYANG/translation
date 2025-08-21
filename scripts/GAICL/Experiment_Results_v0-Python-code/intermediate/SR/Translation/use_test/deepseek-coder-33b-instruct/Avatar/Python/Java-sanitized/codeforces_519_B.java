import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class codeforces_519_B {
    private static int x = 0;
    private static int y = 0;
    private static int z = 0;
    private static int loopIterations = 403;
    private static int maxLoopCount = 402;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numbersA = Arrays.stream(scanner.next().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> b = Arrays.stream(scanner.next().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> c = Arrays.stream(scanner.next().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        sumListElements(0, loopIterations / maxLoopCount, 1, numbersA);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

        for (Integer i : b) {
            executor.execute(() -> {
                try {
                    resultQueue.put(sumNumbers(y, i));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
            y = resultQueue.take();
        }

        for (Integer i : c) {
            z = z + i;
        }

        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));
    }

    private static void sumListElements(int loopIndexOut, int stop, int step, List<Integer> numbersA) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (Integer i : numbersA) {
            x = x + i;
        }
        sumListElements(loopIndexOut + step, stop, step, numbersA);
    }

    private static int sumNumbers(int y, int i) {
        return y + i;
    }
}