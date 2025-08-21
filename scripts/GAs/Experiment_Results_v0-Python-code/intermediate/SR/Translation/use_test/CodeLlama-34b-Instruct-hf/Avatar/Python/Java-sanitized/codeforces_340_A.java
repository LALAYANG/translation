import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_340_A {
    public static void main(String[] args) {
        String input = "101 171 1 1000000000";
        String[] inputs = input.split(" ");
        int x = Integer.parseInt(inputs[0]);
        int y = Integer.parseInt(inputs[1]);
        int a = Integer.parseInt(inputs[2]);
        int b = Integer.parseInt(inputs[3]);

        Queue<Integer> queue = new Queue<>();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int result = Func_L_0(x, y);
                queue.add(result);
            }
        });
        thread.start();
        thread.join();
        int result = queue.poll();
        System.out.println(b / result - (a - 1) / result);
    }

    public static int Func_L_0(int x, int y) {
        int val1 = 971;
        int val2 = 970;
        while (val1 % val2 == 1) {
            int variable_3_9 = 1;
            Queue<Integer> queue = new Queue<>();
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int result = addition(val1, variable_3_9);
                    queue.add(result);
                }
            });
            thread.start();
            thread.join();
            int addition_result = queue.poll();
            val1 = addition_result;
            while (x % y != 0) {
                (x, y) = (y, x % y);
            }
        }
        return y;
    }

    public static int addition(int val1, int variable_3_9) {
        return val1 + variable_3_9;
    }
}