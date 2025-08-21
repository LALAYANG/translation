```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue_LI0 = new LinkedList<>();
        Thread thread_LI0 = new Thread(() -> {
            int[] result = new int[4];
            for (int i = 0; i < 4; i++) {
                result[i] = scanner.nextInt();
            }
            queue_LI0.add(result);
        });
        thread_LI0.start();
        try {
            thread_LI0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int[] result_LI0 = (int[]) queue_LI0.poll();
        int a = result_LI0[0];
        int b = result_LI0[1];
        int c = result_LI0[2];
        int d = result_LI0[3];
        int max = Math.max(a * c, b * d);
        max = Math.max(max, a * d);
        max = Math.max(max, b * c);
        System.out.println(max);
    }
}
``` 
