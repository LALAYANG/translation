import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC153_A {
    public static void main(String[] args) {
        int h = 10000;
        int a = 1;
        int sho = h / a;
        int am = h % a;
        if (am != 0) {
            int variable_3_12 = 1;
            Queue<Integer> func0_queue = new LinkedList<>();

            class Func0Thread extends Thread {
                public void run() {
                    int result = Func_newFunc0_18_0(variable_3_12, sho);
                    func0_queue.offer(result);
                }
            }

            Func0Thread func0_thread_instance = new Func0Thread();
            func0_thread_instance.start();
            try {
                func0_thread_instance.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sho = func0_queue.poll();
        }
        System.out.println(sho);
    }

    public static int Func_newFunc0_18_0(int variable_3_18, int newsho_1) {
        return newsho_1 + variable_3_18;
    }
}