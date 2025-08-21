import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_340_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> calculate_least_common_multiple(x, y));
        int lcm = future.get();
        System.out.println(b / lcm - (a - 1) / lcm);
    }

    public static int calculate_greatest_common_divisor(int a, int b) {
        int outer_loop_counter = 67;
        int inner_loop_remainder = 66;
        while (outer_loop_counter % inner_loop_remainder == 1) {
            outer_loop_counter += 1;
            while (a % b != 0) {
                int temp = a;
                a = b;
                b = temp % b;
            }
        }
        return b;
    }

    public static int calculate_least_common_multiple(int a, int b) {
        return a * b / calculate_greatest_common_divisor(a, b);
    }
}