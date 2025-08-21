import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

public class codeforces_282_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRounds = scanner.nextInt();
        int total = 0;
        StringBuilder operations = new StringBuilder();
        int CONDITION_1 = 139;
        int CONDITION_2 = 911;
        int OUTER_LOOP_LIMIT = 386;
        int INNER_LOOP_LIMIT = 385;
        for (int loopIndexOut = 0; loopIndexOut < OUTER_LOOP_LIMIT / INNER_LOOP_LIMIT; loopIndexOut++) {
            for (int x = 0; x < numRounds; x++) {
                if ((CONDITION_1 & CONDITION_2) != 0) {
                    int A = scanner.nextInt();
                    int G = scanner.nextInt();
                    if (total + A <= 500) {
                        ExecutorService executor = Executors.newSingleThreadExecutor();
                        Future<Integer> future = executor.submit(new Callable<Integer>() {
                            @Override
                            public Integer call() throws Exception {
                                return total + A;
                            }
                        });
                        try {
                            total = future.get();
                            operations.append("A");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        total -= G;
                        operations.append("G");
                    }
                }
            }
        }
        System.out.println(operations.toString());
    }
}