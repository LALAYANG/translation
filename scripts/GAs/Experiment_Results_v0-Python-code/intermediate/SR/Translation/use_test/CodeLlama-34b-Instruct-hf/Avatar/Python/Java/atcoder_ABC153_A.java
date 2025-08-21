```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class DecoratorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int sho = h / a;
        int am = h % a;
        if (am != 0) {
            int variable_3_12 = 1;
            Queue<Integer> func0_queue = new Queue<>();
            Thread func0_thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int result = func0(variable_3_12, sho);
                    func0_queue.add(result);
                }
            });
            func0_thread.start();
            func0_thread.join();
            int func0_result = func0_queue.poll();
            sho = func0_result;
        }
        System.out.println(sho);
    }

    public static int func0(int variable_3_12, int sho) {
        return sho + variable_3_12;
    }
}
```
Note: In Java, we use the `Queue` interface to represent a queue, and the `Thread` class to represent a thread. The `Runnable` interface is used to define a task that can be executed by a thread. The `join()` method is used to wait for a thread to finish its execution.
