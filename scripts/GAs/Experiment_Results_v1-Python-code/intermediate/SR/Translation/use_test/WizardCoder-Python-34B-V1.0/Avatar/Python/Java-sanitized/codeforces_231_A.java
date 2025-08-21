import java.util.Scanner;

public class codeforces_231_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        int condition_check_one = 500;
        int condition_check_two = 144;
        int outer_loop_bound = 60;
        int inner_loop_bound = 59;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (int inner_loop_index = 0; inner_loop_index < n; inner_loop_index++) {
                int[] l1 = new int[n];
                for (int i = 0; i < n; i++) {
                    l1[i] = scanner.nextInt();
                }
                if ((condition_check_one & condition_check_two) != 0) {
                    if (sum(l1) > 1) {
                        int value_to_add = 1;
                        Thread thread = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                c = calculate_sum(value_to_add, c);
                            }
                        });
                        thread.start();
                        try {
                            thread.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        System.out.println(c);
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static int calculate_sum(int value_to_add, int c) {
        return c + value_to_add;
    }
}