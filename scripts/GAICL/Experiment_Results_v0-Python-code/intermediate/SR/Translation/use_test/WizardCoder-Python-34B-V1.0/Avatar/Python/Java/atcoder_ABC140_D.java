```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue_parser0 = new LinkedList<>();
        Thread thread_parser0 = new Thread(() -> {
            while (true) {
                String[] data = scanner.nextLine().split(" ");
                for (String number : data) {
                    if (!number.isEmpty()) {
                        queue_parser0.add(number);
                    }
                }
            }
        });
        thread_parser0.start();
        thread_parser0.join();
        String input_parser = queue_parser0.poll();

        int N = Integer.parseInt(input_parser);
        int max_changes = Integer.parseInt(input_parser);
        String S = scanner.nextLine();
        int seg_cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                seg_cnt++;
            }
        }
        int variable_6_47 = 1;
        int cur_happy = N - variable_6_47 - seg_cnt;
        int ans;
        if (2 * max_changes >= seg_cnt) {
            ans = N - 1;
        } else {
            ans = cur_happy + 2 * max_changes;
        }
        System.out.println(ans);
    }
}
```

Test input:
13 3
LRRLRLRRLRLLR

Expected output:
9 
