python
# Translation of the given code snippet to Java

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_340_A {
    public static int addition(int val1, int variable_3_9) {
        return val1 + variable_3_9;
    }

    public static int Func_G_0(int a, int b) {
        int val1 = 971;
        int val2 = 970;
        while (val1 % val2 == 1) {
            int variable_3_9 = 1;
            Queue<Integer> queue_addition_result = new LinkedBlockingQueue<>();

            Runnable addition_worker = () -> {
                int result = addition(val1, variable_3_9);
                queue_addition_result.add(result);
            };
            Thread thread_addition_worker = new Thread(addition_worker);
            thread_addition_worker.start();
            thread_addition_worker.join();
            int addition_result = queue_addition_result.poll();
            val1 = addition_result;
            while (a % b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
        }
        return b;
    }

    public static int Func_L_0(int a, int b) {
        return a * b / Func_G_0(a, b);
    }

    public static void main(String[] args) throws Exception {
        String[] l = "101 171 1 1000000000".split(' ');
        int x = Integer.parseInt(l[0]);
        int y = Integer.parseInt(l[1]);
        int a = Integer.parseInt(l[2]);
        int b = Integer.parseInt(l[3]);
        Queue<Integer> queue_L0 = new LinkedBlockingQueue<>();

        Runnable L_thread = () -> {
            int result = Func_L_0(x, y);
            queue_L0.add(result);
        };
        Thread thread_L0 = new Thread(L_thread);
        thread_L0.start();
        thread_L0.join();
        int result_L0 = queue_L0.poll();
        int lcm = result_L0;
        System.out.println(b / lcm - (a - 1) / lcm);
    }
}