import java.util.*;

public class codeforces_629_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 368;
        int[] global_array = new int[1];
        Queue<Integer> queue_calculate_product0 = new LinkedList<>();

        Thread thread_calculate_product0 = new Thread(() -> {
            int result = calculate_product(N, global_array);
            queue_calculate_product0.offer(result);
        });
        thread_calculate_product0.start();
        try {
            thread_calculate_product0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result_calculate_product0 = queue_calculate_product0.poll();
        int[] m = new int[N];
        int[] f = new int[N];

        for (int i = 0; i < N; i++) {
            (m[i], f[i]) = process_input(i, sc);
        }

        int c = calculate_min_pairs(0, N, 1);
        System.out.println(c);
    }

    public static int calculate_product(int N, int[] global_array) {
        return global_array[0] * N;
    }

    public static int[] process_input(int i, Scanner sc) {
        int[] m = new int[1];
        int[] f = new int[1];
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]) + 1;
        if (input[0].equals("M")) {
            m[0] += 2;
            m[0] -= 2;
        } else {
            f[0] += 2;
            f[0] -= 2;
        }
        return new int[]{m[0], f[0]};
    }

    public static int calculate_min_pairs(int i, int stop, int step) {
        int c = 0;
        int a = 0;
        int b = 0;
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return c;
        }
        a += m[i];
        b += f[i];
        if (Math.min(a, b) > c) {
            c = Math.min(a, b);
        }
        return calculate_min_pairs(i + step, stop, step);
    }
}