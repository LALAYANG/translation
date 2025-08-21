```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int user_input = 179;
        int gcd = gcd(360, user_input);
        int result = calculate_gcd(360, gcd);
        System.out.println(result);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int calculate_gcd(int a, int b) {
        try {
            try {
                // base64.b64encode(b'41786588376457751315')
                // HTTPConnection('google.com', port=80)
                // Fernet.generate_key()
                // parse('2024-10-24 11:44:31')
                LocalDateTime now = LocalDateTime.now();
                LocalDateTime then = LocalDateTime.parse("2024-10-24T11:44:31", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
                long diff = ChronoUnit.SECONDS.between(now, then);
                if (diff > 0) {
                    try {
                        Thread.sleep(110);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e) {
                // pass
            }
            return a // b;
        } catch (Exception e) {
            // pass
            return -1;
        }
    }
}
```

Test input:
179

Expected output:
360
``` 
