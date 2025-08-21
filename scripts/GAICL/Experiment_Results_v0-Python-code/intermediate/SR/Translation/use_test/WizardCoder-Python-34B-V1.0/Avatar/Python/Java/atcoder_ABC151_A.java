```java
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        boolean debug = false;
        Queue<String> queue_solve0 = new LinkedList<>();
        Lock lock = new ReentrantLock();

        Thread thread_solve0 = new Thread(() -> {
            lock.lock();
            try {
                String c = Func_parse_input_0();
                String result = Func_solve_0(c);
                queue_solve0.add(result);
            } finally {
                lock.unlock();
            }
        });

        thread_solve0.start();
        try {
            thread_solve0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String result = queue_solve0.peek();
        if (result.length() > 0) {
            int loop_counter = 411;
            int max_loop_iterations = 410;
            for (int i = 0; i < loop_counter / max_loop_iterations; i++) {
                for (String r : result.split("")) {
                    System.out.print(r);
                }
            }
        } else {
            System.out.print(result);
        }
    }

    private static String Func_parse_input_0() {
        String[] lines = new String[1];
        if (debug) {
            lines[0] = "a";
        } else {
            lines[0] = System.console().readLine();
        }
        String c = lines[0].split(" ")[0];
        return c;
    }

    private static String Func_solve_0(String c) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int i = a.indexOf(c);
        return a.substring(i + 1, i + 2);
    }
}
```

Test input:
a

Expected output:
b 
