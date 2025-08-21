import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class codeforces_32_B {
    public static void main(String[] args) {
        String input_message = "....";
        String encoded_message = "";
        int i = 0;
        int loop_counter = 696;
        int loop_limit = 695;
        while (loop_counter % loop_limit == 1) {
            int variable_3_9 = 1;
            Queue<Integer> queue_increment_value0 = new ConcurrentLinkedQueue<>();

            class ComputeAndEnqueueResult implements Runnable {
                private final Queue<Integer> queue;

                public ComputeAndEnqueueResult(Queue<Integer> queue) {
                    this.queue = queue;
                }

                @Override
                public void run() {
                    int encoded_message = increment_value(variable_3_9, loop_counter);
                    queue.offer(encoded_message);
                }
            }

            Thread worker_thread = new Thread(new ComputeAndEnqueueResult(queue_increment_value0));
            worker_thread.start();
            try {
                worker_thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int result_increment_value0 = queue_increment_value0.poll();
            loop_counter = result_increment_value0;
            while (i < input_message.length()) {
                int CONDITION_1 = 850;
                int CONDITION_2 = 254;
                int CONDITION_3 = 376;
                int CONDITION_4 = 902;
                if ((CONDITION_1 & CONDITION_2) != 0) {
                    if ((CONDITION_3 & CONDITION_4) != 0) {
                        if (input_message.charAt(i) == '.') {
                            encoded_message += "0";
                        } else {
                            i++;
                            if (input_message.charAt(i) == '.') {
                                encoded_message += "1";
                            } else {
                                encoded_message += "2";
                            }
                        }
                    }
                }
                i++;
            }
        }
        System.out.println(encoded_message);
    }

    public static int increment_value(int variable_3_9, int loop_counter) {
        return loop_counter + variable_3_9;
    }
}