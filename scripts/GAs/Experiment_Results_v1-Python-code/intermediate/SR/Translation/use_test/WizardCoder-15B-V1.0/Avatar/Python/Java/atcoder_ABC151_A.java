```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executor = Executors.newFixedThreadPool(1);
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();
        executor.execute(() -> {
            String c = scanner.nextLine();
            String result = solve(c);
            queue.offer(result);
        });
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String result = queue.poll();
        if (result == null) {
            System.out.println("No result");
        } else {
            System.out.println(result);
        }
    }

    private static String solve(String c) {
        char[] a = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int charIndex = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == c.charAt(0)) {
                charIndex = i;
                break;
            }
        }
        if (charIndex == -1) {
            return "No result";
        }
        return String.valueOf(a[charIndex + 1]);
    }
}
```
