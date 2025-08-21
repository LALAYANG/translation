import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int total_items = scanner.nextInt();
        int a = scanner.nextInt();
        int sho = total_items / a;
        int remainder_items = total_items % a;
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        if (remainder_items != 0) {
            Future<Integer> future = executorService.submit(() -> calculateSho(1, sho));
            sho = future.get();
        }
        System.out.println(sho);
        executorService.shutdown();
    }

    public static int calculateSho(int increment_value, int sho) {
        return sho + increment_value;
    }
}