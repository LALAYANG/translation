```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String user_input = "BBB";
        boolean hasA = user_input.contains("A");
        boolean hasB = user_input.contains("B");
        boolean result = hasA && hasB;
        System.out.println(result ? "Yes" : "No");
    }
}
```

Test input:
BBB

Expected output:
No 
