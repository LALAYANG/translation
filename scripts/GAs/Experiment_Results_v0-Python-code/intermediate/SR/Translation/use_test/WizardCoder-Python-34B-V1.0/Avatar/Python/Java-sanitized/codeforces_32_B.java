import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class codeforces_32_B {
    public static void main(String[] args) {
        int loop_counter = 696;
        int loop_limit = 695;
        String input_message = "..";
        String encoded_message = "";
        int i = 0;
        while (loop_counter % loop_limit == 1) {
            int variable_3_9 = 1;
            Queue<Integer> queue_increment_value0 = new LinkedList<>();
            Lock lock = new ReentrantLock();
            Condition condition = lock.newCondition();
            ExecutorService executor = Executors.newSingleThreadExecutor();
            executor.submit(() -> {
                int result_increment_value0 = increment_value(variable_3_9, loop_counter);
                lock.lock();
                try {
                    queue_increment_value0.add(result_increment_value0);
                    condition.signal();
                } finally {
                    lock.unlock();
                }
            });
            lock.lock();
            try {
                condition.await();
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