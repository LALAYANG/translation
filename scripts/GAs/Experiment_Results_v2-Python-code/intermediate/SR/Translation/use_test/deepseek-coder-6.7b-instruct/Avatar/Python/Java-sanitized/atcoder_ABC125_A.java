import java.util.Scanner;
import java.util.concurrent.*;

class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int time_increment = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();
        int cookie = 0;
        int time = time_increment;
        int outer_loop_counter = 222;
        int inner_loop_counter = 221;
        while (outer_loop_counter % inner_loop_counter == 1) {
            outer_loop_counter = outer_loop_counter + 1;
            while (time <= t + 0.5) {
                ExecutorService executorService = Executors.newSingleThreadExecutor();
                Future<Integer> future = executorService.submit(() -> calculateCookie(cookie, b));
                cookie = future.get();
                executorService.shutdown();
                time = time + time_increment;
            }
        }
        System.out.println(cookie);
    }

    @FunctionalInterface
    interface CalculateCookie {
        int apply(int cookie, int b);
    }

    public static int calculateCookie(int cookie, int b) {
        return cookie + b;
    }
}