import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class codeforces_231_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        int condition1 = 219;
        int condition2 = 181;
        int outer_loop_bound = 363;
        int inner_loop_bound = 362;
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (int i = 0; i < n; i++) {
                int[] input_list = new int[n];
                for (int j = 0; j < n; j++) {
                    input_list[j] = scanner.nextInt();
                }
                if ((condition1 & condition2) != 0) {
                    if (input_list.length > 1) {
                        c++;
                        LinkedBlockingQueue<Integer> result_queue = new LinkedBlockingQueue<>();

                        Runnable worker = () -> {
                            int result = process_input(input_list, c);
                            result_queue.offer(result);
                        };

                        executor.execute(worker);

                        try {
                            int result = result_queue.poll(1, TimeUnit.SECONDS);
                            if (result != null) {
                                c = result;
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        executor.shutdown();
        System.out.println(c);
    }

    private static int process_input(int[] input_list, int c) {
        return c + 1;
    }
}