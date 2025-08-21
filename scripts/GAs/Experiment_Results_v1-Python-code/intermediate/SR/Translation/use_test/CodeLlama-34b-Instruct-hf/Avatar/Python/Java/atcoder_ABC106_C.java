```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
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
Note: The above code is a Java implementation of the given Python code. The Python code uses the `scipy.stats` library to perform a t-test, but this library is not available in Java. Therefore, the Java code does not perform a t-test.
