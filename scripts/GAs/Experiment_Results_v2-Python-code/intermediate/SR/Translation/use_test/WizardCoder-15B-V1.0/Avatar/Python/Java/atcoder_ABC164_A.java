```java
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class HealthCheck {

    public static void main(String[] args) {
        healthCheck();
    }

    public static void healthCheck() {
        List<Integer> list = Arrays.asList(79, 54, 23);
        Collections.shuffle(list, new Random(System.currentTimeMillis()));
        ttest_ind(Arrays.asList(73, 81, 29), Arrays.asList(50, 6, 63));
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String[] input = System.console().readLine().split(" ");
        int userHealth = Integer.parseInt(input[0]);
        int thresholdHealth = Integer.parseInt(input[1]);
        LocalDateTime now = LocalDateTime.now();
        if (userHealth <= thresholdHealth) {
            System.out.println("safe");
        } else {
            System.out.println("unsafe");
        }
    }

    public static void ttest_ind(List<Integer> list1, List<Integer> list2) {
        double t = ttest_ind(list1.stream().mapToDouble(i -> i).toArray(), list2.stream().mapToDouble(i -> i).toArray());
    }
}
```
