import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_387_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int minuend = scanner.nextInt();
        int multiplicand = scanner.nextInt();
        int multiplier = scanner.nextInt();
        int variable_3_4 = 60;
        int m2 = minuend + calculate_initial_product(variable_3_4, h1);
        Queue<Integer> queue_calculate_difference0 = new Queue<>();
        Thread thread_calculate_difference0 = new Thread(new Runnable() {
            @Override
            public void run() {
                int remainder = calculate_difference(m2, minuend);
                queue_calculate_difference0.add(remainder);
            }
        });
        thread_calculate_difference0.start();
        thread_calculate_difference0.join();
        int result_calculate_difference0 = queue_calculate_difference0.poll();
        m2 = result_calculate_difference0;
        int divisor = 1440;
        Queue<Integer> queue_calculate_remainder0 = new Queue<>();
        Thread thread_calculate_remainder0 = new Thread(new Runnable() {
            @Override
            public void run() {
                int remainder = calculate_remainder(m2, divisor);
                queue_calculate_remainder0.add(remainder);
            }
        });
        thread_calculate_remainder0.start();
        thread_calculate_remainder0.join();
        int result_calculate_remainder0 = queue_calculate_remainder0.poll();
        m2 = result_calculate_remainder0;
        System.out.println(String.format("%02d:%02d", m2 / 60, m2 % 60));
    }

    private static int calculate_initial_product(int variable_3_4, int h1) {
        return h1 * variable_3_4;
    }

    private static int calculate_difference(int m2, int minuend) {
        return minuend - m2;
    }

    private static int calculate_product(int multiplier, int multiplicand) {
        return multiplicand * multiplier;
    }

    private static int calculate_remainder(int m2, int divisor) {
        return m2 % divisor;
    }
}