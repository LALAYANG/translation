import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class codeforces_59_A {
    public static void main(String[] args) {
        String txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
        int cu = 0;
        int cl = 0;
        int outer_loop_bound = 128;
        int inner_loop_bound = 127;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (char z : txt.toCharArray()) {
                if (Character.isLowerCase(z)) {
                    int lowercase_flag = 1;
                    Queue<Integer> queue_calculate_result0 = new ConcurrentLinkedQueue<>();

                    Thread thread_calculate_result0 = new Thread(() -> {
                        int result = calculate_result(cl, lowercase_flag);
                        queue_calculate_result0.offer(result);
                    });
                    thread_calculate_result0.start();
                    try {
                        thread_calculate_result0.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int result_calculate_result0 = queue_calculate_result0.poll();
                    cl = result_calculate_result0;
                } else {
                    cu++;
                }
            }
        }
        System.out.println(final_output(txt, cu, cl));
    }

    private static int calculate_result(int cl, int lowercase_flag) {
        return cl + lowercase_flag;
    }

    private static String final_output(String txt, int cu, int cl) {
        if (cu > cl) {
            return txt.toUpperCase();
        } else {
            return txt.toLowerCase();
        }
    }
}