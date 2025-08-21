import java.util.Scanner;

public class codeforces_231_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_iterations = scanner.nextInt();
        int c = 0;
        int condition_checker_one = 815;
        int condition_checker_two = 353;
        for (int i = 0; i < num_iterations; i++) {
            int[] l1 = new int[3];
            for (int j = 0; j < 3; j++) {
                l1[j] = scanner.nextInt();
            }
            if ((condition_checker_one & condition_checker_two) != 0) {
                int value_to_add = 1;
                Thread thread_calculate_sum0 = new Thread(() -> {
                    int result = calculate_sum(value_to_add, c);
                    c = result;
                });
                thread_calculate_sum0.start();
                try {
                    thread_calculate_sum0.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(c);
    }

    public static int calculate_sum(int value_to_add, int c) {
        return c + value_to_add;
    }
}