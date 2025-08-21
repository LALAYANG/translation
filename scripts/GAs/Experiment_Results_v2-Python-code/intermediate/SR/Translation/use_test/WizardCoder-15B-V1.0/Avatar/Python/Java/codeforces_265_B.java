```java
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        int minuend = 1;
        int ans = 0;
        int last = 0;
        for (int i = 0; i < input_number; i++) {
            queue.add(scanner.nextInt());
        }
        ans = queue.size() * (input_number + 1) / 2;
        last = queue.poll();
        while (!queue.isEmpty()) {
            int current = queue.poll();
            ans += Math.abs(last - current) + 1;
            last = current;
        }
        System.out.println(ans);
    }
}
```
