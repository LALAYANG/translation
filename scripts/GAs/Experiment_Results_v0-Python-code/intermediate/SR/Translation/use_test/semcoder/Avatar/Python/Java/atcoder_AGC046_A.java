```java
import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {
    public static int calculateGcd(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int userInput = 179;
        int result = calculateGcd(360, gcd(360, userInput));
        System.out.println(result);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
```
