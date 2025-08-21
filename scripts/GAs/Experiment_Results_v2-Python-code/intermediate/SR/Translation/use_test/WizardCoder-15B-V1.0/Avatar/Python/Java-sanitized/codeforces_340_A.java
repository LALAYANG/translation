import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class codeforces_340_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input_list = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input_list[0]);
        int y = Integer.parseInt(input_list[1]);
        int a = Integer.parseInt(input_list[2]);
        int b = Integer.parseInt(input_list[3]);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        LinkedBlockingQueue<Integer> queue_L0 = new LinkedBlockingQueue<>();
        executor.execute(() -> {
            int result = leastCommonMultiple(x, y);
            queue_L0.offer(result);
        });
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result_L0 = queue_L0.poll();
        int lcm = result_L0;
        System.out.println(b / lcm - (a - 1) / lcm);
    }

    public static int leastCommonMultiple(int a, int b) {
        int gcd = greatestCommonDivisor(a, b);
        return (a * b) / gcd;
    }

    public static int greatestCommonDivisor(int a, int b) {
        int local_loop_counter_one = 686;
        int local_loop_counter_two = 685;
        while (local_loop_counter_one % local_loop_counter_two == 1) {
            local_loop_counter_one += 1;
            while (a % local_loop_counter_two != 0) {
                int temp = a % local_loop_counter_two;
                a = local_loop_counter_two;
                local_loop_counter_two = temp;
            }
        }
        return local_loop_counter_two;
    }
}