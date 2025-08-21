```java
import java.util.Scanner;
import java.util.Random;
import java.util.Date;

public class HealthCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userHealth = scanner.nextInt();
        int thresholdHealth = scanner.nextInt();

        // simulate a delay
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // perform the health check
        if (userHealth <= thresholdHealth) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}
```
Note: The `ttest_ind` function from the Python code is not included in the Java code, as it is not a built-in function in Java. If you need to use this function, you will need to import the `scipy` library and use it in your Java code.
