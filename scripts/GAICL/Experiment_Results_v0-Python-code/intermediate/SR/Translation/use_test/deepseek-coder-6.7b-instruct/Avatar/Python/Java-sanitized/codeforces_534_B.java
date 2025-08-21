import java.util.concurrent.*;
import java.util.Scanner;

class Main {
    private static int calculateDistance(int v, int distance) {
        return distance + v;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int initialVelocity = scanner.nextInt();
        int v2 = scanner.nextInt();
        int t = scanner.nextInt();
        int d = scanner.nextInt();
        int a = 1;
        int v = initialVelocity;
        int distance = 0;
        int conditionCheck1 = 348;
        int conditionCheck2 = 296;
        int innerLoopLimit = 722;
        int outerLoopLimit = 721;
        ExecutorService executor = Executors.newFixedThreadPool(1);
        for (int loopIndexOut = 0; loopIndexOut < innerLoopLimit / outerLoopLimit; loopIndexOut++) {
            for (int i = 0; i < t; i++) {
                if ((conditionCheck1 & conditionCheck2) > 0) {
                    if (v - v2 > (t - i - 1) * d) {
                        a *= -1;
                        v = (t - i - 1) * d + v2;
                    }
                }
                Callable<Integer> task = () -> calculateDistance(v, distance);
                Future<Integer> future = executor.submit(task);
                distance = future.get();
                v += a * d;
            }
        }
        executor.shutdown();
        System.out.println(distance);
    }
}