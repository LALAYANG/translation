```java
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue_S0 = new LinkedList<>();
        Thread thread_S0 = new Thread(() -> {
            String result = scanner.nextLine();
            queue_S0.add(result);
        });
        thread_S0.start();
        try {
            thread_S0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String s = queue_S0.poll();
        Queue<Integer> queue_I0 = new LinkedList<>();
        Thread thread_I0 = new Thread(() -> {
            int result = scanner.nextInt();
            queue_I0.add(result);
        });
        thread_I0.start();
        try {
            thread_I0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int k = queue_I0.poll();
        int leading_ones_count = 0;
        int inner_loop_bound = 68;
        int outer_loop_bound = 67;
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_bound / outer_loop_bound; LoopIndexOut++) {
            for (char c : s.toCharArray()) {
                if (c != '1') {
                    break;
                }
                leading_ones_count++;
            }
        }
        if (leading_ones_count >= k) {
            System.out.println(1);
        } else {
            System.out.println(s.charAt(leading_ones_count));
        }
    }
}
```

Test input:
1214
4

Expected output:
2 
