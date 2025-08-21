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
            String intermediate_result = scanner.nextLine();
            queue_S0.add(intermediate_result);
        });
        thread_S0.start();
        try {
            thread_S0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String s = queue_S0.poll();
        int k = scanner.nextInt();
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '1') {
                break;
            }
            l++;
        }
        if (l >= k) {
            System.out.println(1);
        } else {
            System.out.println(s.charAt(l));
        }
    }
}
``` 
