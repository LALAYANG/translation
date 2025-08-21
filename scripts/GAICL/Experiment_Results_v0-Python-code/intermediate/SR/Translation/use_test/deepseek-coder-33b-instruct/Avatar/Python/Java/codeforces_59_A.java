Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        AtomicInteger cu = new AtomicInteger(0);
        AtomicInteger cl = new AtomicInteger(0);

        for (char character : txt.toCharArray()) {
            if (Character.isLowerCase(character)) {
                cl.incrementAndGet();
            } else {
                cu.incrementAndGet();
            }
        }

        String out;
        if (cu.get() > cl.get()) {
            out = txt.toUpperCase();
        } else {
            out = txt.toLowerCase();
        }
        System.out.println(out);
    }
}
```

Please note that the Python code uses threads to increment the counts of uppercase and lowercase characters, but in the Java version, this is not necessary because the character counting is done in a single thread.

