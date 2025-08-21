import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_231_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_iterations = sc.nextInt();
        int c = 0;
        int condition_checker_one = 815;
        int condition_checker_two = 353;
        for (int i = 0; i < num_iterations; i++) {
            String[] l1 = sc.nextLine().split(" ");
            if ((condition_checker_one & condition_checker_two) == 1269) {
                if (Integer.parseInt(l1[0]) + Integer.parseInt(l1[1]) + Integer.parseInt(l1[2]) > 1) {
                    int value_to_add = 1;
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    Future<Integer> future = executor.submit(new Callable<Integer>() {
                        @Override
                        public Integer call() throws Exception {
                            return c + value_to_add;
                        }
                    });
                    try {
                        c = future.get();
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }
                    executor.shutdown();
                }
            }
        }
        System.out.println(c);
    }
}