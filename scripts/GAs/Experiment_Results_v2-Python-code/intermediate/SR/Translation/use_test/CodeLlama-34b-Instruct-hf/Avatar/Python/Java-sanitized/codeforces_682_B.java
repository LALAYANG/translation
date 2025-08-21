import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_682_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int f = 1;
        int c = 0;
        int condition_four = 477;
        int condition_one = 274;
        int condition_two = 748;
        int condition_three = 828;
        for (int element : l) {
            if (condition_two & condition_three) {
                if (condition_four & condition_one) {
                    if (element > c) {
                        int increment = 1;
                        Queue<Integer> queue_calculate_sum0 = new Queue<>();
                        Thread thread_calculate_sum0 = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                int result = calculate_sum(c, increment);
                                queue_calculate_sum0.add(result);
                            }
                        });
                        thread_calculate_sum0.start();
                        thread_calculate_sum0.join();
                        int result_calculate_sum0 = queue_calculate_sum0.poll();
                        c = result_calculate_sum0;
                    }
                }
            }
        }
        System.out.println(c + 1);
    }

    public static int calculate_sum(int c, int increment) {
        return c + increment;
    }
}