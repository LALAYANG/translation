import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_629_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] global_array = new int[N];
        BlockingQueue<Integer> queue_calculate_product0 = new LinkedBlockingQueue<>();

        Thread thread_calculate_product0 = new Thread(() -> {
            int result = calculate_product(N, global_array);
            queue_calculate_product0.add(result);
        });
        thread_calculate_product0.start();
        try {
            thread_calculate_product0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result_calculate_product0 = queue_calculate_product0.take();
        int[] m = new int[result_calculate_product0];
        int[] f = new int[result_calculate_product0];

        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i < N; i++) {
            String[] input = sc.nextLine().split(" ");
            String operation_type = input[0];
            int a_value = Integer.parseInt(input[1]);
            int b_value = Integer.parseInt(input[2]);
            if (operation_type.equals("M")) {
                m[a_value] += 2;
                m[b_value] -= 2;
            } else {
                f[a_value] += 2;
                f[b_value] -= 2;
            }
        }

        for (int i = 0; i < N; i++) {
            a += m[i];
            b += f[i];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }
        System.out.println(c);
    }

    public static int calculate_product(int N, int[] global_array) {
        return 0;
    }
}