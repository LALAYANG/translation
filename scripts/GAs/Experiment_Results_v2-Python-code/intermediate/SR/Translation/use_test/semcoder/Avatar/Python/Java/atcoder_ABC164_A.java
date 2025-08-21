```java
import java.util.Scanner;

public class HealthCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userHealth = scanner.nextInt();
        int thresholdHealth = scanner.nextInt();

        if (userHealth <= thresholdHealth) {
            System.out.println("safe");
        } else {
            System.out.println("unsafe");
        }
    }
}
```
