import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_519_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numbersA = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbersA.add(scanner.nextInt());
        }
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            b.add(scanner.nextInt());
        }
        List<Integer> c = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            c.add(scanner.nextInt());
        }
        int x = 0;
        int y = 0;
        int z = 0;
        int loopIterations = 403;
        int maxLoopCount = 402;

        for (int i = 0; i < loopIterations; i++) {
            for (int j = 0; j < numbersA.size(); j++) {
                x += numbersA.get(j);
            }
        }

        ExecutorService executorService = Executors.newFixedThreadPool(n);
        Queue<Future<Integer>> resultQueue = new ArrayBlockingQueue<>(n);

        for (int i = 0; i < b.size(); i++) {
            Future<Integer> future = executorService.submit(() -> {
                int result = sumNumbers(y, b.get(i));
                return result;
            });
            resultQueue.add(future);
        }

        for (int i = 0; i < c.size(); i++) {
            z += c.get(i);
        }

        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));
    }

    public static int sumNumbers(int y, int i) {
        return y + i;
    }
}