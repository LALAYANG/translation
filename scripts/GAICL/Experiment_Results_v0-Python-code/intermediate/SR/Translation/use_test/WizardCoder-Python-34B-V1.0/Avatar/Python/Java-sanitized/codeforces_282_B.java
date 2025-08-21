import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ExecutionException;

public class codeforces_282_B {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int num_rounds = new Scanner(System.in).nextInt();
        int total = 0;
        Queue<String> operations = new LinkedList<>();
        int CONDITION_1 = 139;
        int CONDITION_2 = 911;
        int OUTER_LOOP_LIMIT = 386;
        int INNER_LOOP_LIMIT = 385;
        for (int LoopIndexOut = 0; LoopIndexOut < OUTER_LOOP_LIMIT / INNER_LOOP_LIMIT; LoopIndexOut++) {
            for (int x = 0; x < num_rounds; x++) {
                int[] input = new Scanner(System.in).nextInt();
                int A = input[0];
                int G = input[1];
                if (CONDITION_1 & CONDITION_2) {
                    if (total + A <= 500) {
                        ExecutorService executor = Executors.newSingleThreadExecutor();
                        Future<Integer> future = executor.submit(new Callable<Integer>() {
                            public Integer call() {
                                return addToTotal(A, total);
                            }
                        });
                        int updated_total = future.get();
                        total = updated_total;
                        operations.add("A");
                    } else {
                        total -= G;
                        operations.add("G");
                    }
                }
            }
        }
        System.out.println(String.join("", operations));
    }

    public static int addToTotal(int A, int total) {
        return total + A;
    }
}