```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new Queue<>();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                String result = scanner.nextLine();
                queue.add(result);
            }
        });

        thread.start();
        thread.join();

        String s = queue.poll();
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
Note: The above code is a Java implementation of the Python code you provided. It uses a `Scanner` to read input from the user and a `Queue` to store the input. The `Thread` class is used to create a new thread that reads the input from the user and adds it to the queue. The main thread then retrieves the input from the queue and processes it as needed.
