import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.ConcurrentLinkedQueue;

class Addition implements Runnable {
    private int val1;
    private int variable_3_9;
    private ConcurrentLinkedQueue<Integer> queue_addition_result;

    public Addition(int val1, int variable_3_9, ConcurrentLinkedQueue<Integer> queue_addition_result) {
        this.val1 = val1;
        this.variable_3_9 = variable_3_9;
        this.queue_addition_result = queue_addition_result;
    }

    public void run() {
        int result = val1 + variable_3_9;
        queue_addition_result.add(result);
    }
}

public class codeforces_340_A {
    public static void main(String[] args) {
        String[] l = "101 171 1 1000000000".split(" ");
        int x = Integer.parseInt(l[0]);
        int y = Integer.parseInt(l[1]);
        int a = Integer.parseInt(l[2]);
        int b = Integer.parseInt(l[3]);

        Lock lock = new ReentrantLock();
        ConcurrentLinkedQueue<Integer> queue_addition_result = new ConcurrentLinkedQueue<>();
        Thread thread_addition_worker = new Thread(new Addition(x, 1, queue_addition_result));
        thread_addition_worker.start();
        try {
            thread_addition_worker.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int addition_result = queue_addition_result.poll();
        x = addition_result;

        while (x % y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int lcm = y;
        System.out.println(b / lcm - (a - 1) / lcm);
    }
}