
Here is the Java code that implements the same functionality as the Python code:
```java
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        String input = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
        AtomicInteger cu = new AtomicInteger(0);
        AtomicInteger cl = new AtomicInteger(0);

        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                cl.incrementAndGet();
            } else {
                cu.incrementAndGet();
            }
        }

        if (cu.get() > cl.get()) {
            System.out.println(input.toUpperCase());
        } else {
            System.out.println(input.toLowerCase());
        }
    }
}
```
This code uses the `AtomicInteger` class to keep track of the number of uppercase and lowercase letters in the input string. It then uses the `toUpperCase()` and `toLowerCase()` methods to convert the input string to uppercase or lowercase, depending on which count is greater. Finally, it prints the resulting string to the console.

Note that this code is not thread-safe, as it uses the `AtomicInteger` class to keep track of the counts. If you need to run this code in a multi-threaded environment, you will need to use a different approach to keep track of the counts.
