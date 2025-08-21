```java
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        int condition_checker = 800;
        int condition_checker_2 = 365;
        String[] input = "1000 500500001 1000".split(" ");
        int k = Integer.parseInt(input[0]);
        int target_value = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);

        if ((condition_checker & condition_checker_2) != 0 && 1 <= k && w <= 1000) {
            int total = 0;
            for (int i = 1; i <= w; i++) {
                total += calculateProduct(k, i);
            }
            if (total > target_value) {
                System.out.println(total - target_value);
            } else {
                System.out.println(0);
            }
        }
    }

    public static int calculateProduct(int k, int i) {
        return k * i;
    }
}
```

The Java code uses the Apache Commons Math library for the T-test, which can be added to the project using Maven or Gradle. 
