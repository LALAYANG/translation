```java
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        int user_input = 179;
        int result = calculate_gcd(360, gcd(360, user_input));
        System.out.println(result);
    }

    public static int calculate_gcd(int a, int b) {
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a / b;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
```

Test input:
179

Expected output:
360 
