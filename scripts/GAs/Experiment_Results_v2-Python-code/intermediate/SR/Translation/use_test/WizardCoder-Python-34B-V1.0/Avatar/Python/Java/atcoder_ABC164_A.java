```java
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class HealthCheck {
    public static void main(String[] args) {
        healthCheck();
    }

    public static void healthCheck() {
        int userHealth = 100;
        int thresholdHealth = 2;
        if (userHealth <= thresholdHealth) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}
```

Test input:
100 2

Expected output:
safe 
