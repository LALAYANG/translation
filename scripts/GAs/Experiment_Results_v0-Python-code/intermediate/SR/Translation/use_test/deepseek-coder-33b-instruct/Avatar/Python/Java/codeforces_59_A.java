Here is the Java version of the Python code:

```java
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        AtomicInteger cu = new AtomicInteger(0);
        AtomicInteger cl = new AtomicInteger(0);
        for (char character : txt.toCharArray()) {
            int upper_increment = 1;
            if (Character.isLowerCase(character)) {
                int lower_increment = 1;
                Thread lower_thread = new Thread(() -> {
                    cl.addAndGet(lower_increment);
                });
                lower_thread.start();
                lower_thread.join();
            } else {
                Thread upper_thread = new Thread(() -> {
                    cu.addAndGet(upper_increment);
                });
                upper_thread.start();
                upper_thread.join();
            }
        }
        if (cu.get() > cl.get()) {
            System.out.println(txt.toUpperCase());
        } else {
            System.out.println(txt.toLowerCase());
        }
    }
}
```

Please note that the t-test function is not included in the Java version because it's not clear what it's supposed to do. If you need to use it, you'll need to find a Java library that provides it.

Also, please note that the Python code uses threads to increment the upper and lower counts. In the Java version, we use threads to increment the counts, but we don't use a queue to get the results back from the threads. Instead, we use the `AtomicInteger` class, which provides atomic operations for integers. This is a simpler and more efficient way to do this in Java.

