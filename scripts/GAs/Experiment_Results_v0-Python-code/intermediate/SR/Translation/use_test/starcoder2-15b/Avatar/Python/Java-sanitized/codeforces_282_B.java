import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_282_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_rounds = scanner.nextInt();
        int total = 0;
        String[] operations = new String[num_rounds];
        int CONDITION_1 = 139;
        int CONDITION_2 = 911;
        int OUTER_LOOP_LIMIT = 386;
        int INNER_LOOP_LIMIT = 385;
        for (int LoopIndexOut = 0; LoopIndexOut < OUTER_LOOP_LIMIT / INNER_LOOP_LIMIT; LoopIndexOut++) {
            for (int x = 0; x < num_rounds; x++) {
                int A = scanner.nextInt();
                int G = scanner.nextInt();
                if ((CONDITION_1 & CONDITION_2) != 0) {
                    if (total + A <= 500) {
                        ExecutorService executorService = Executors.newSingleThreadExecutor();
                        Future<Integer> future = executorService.submit(() -> total + A);
                        total = future.get();
                        operations[x] = "A";
                    } else {
                        total = total - G;
                        operations[x] = "G";
                    }
                }
            }
        }
        System.out.println(String.join("", operations));
    }
}