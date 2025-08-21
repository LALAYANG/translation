Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int k = Integer.parseInt(input[0]);
        int targetValue = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);

        int conditionChecker = 800;
        int conditionChecker2 = 365;

        if ((conditionChecker & conditionChecker2) != 0 && 1 <= k && w <= 1000) {
            int total = 0;
            for (int i = 1; i <= w; i++) {
                total += calculateProduct(k, i);
            }
            if (total > targetValue) {
                System.out.println(total - targetValue);
            } else {
                System.out.println(0);
            }
        }
    }

    public static int calculateProduct(int k, int i) {
        return i * k;
    }
}
```

Please note that Java does not have a direct equivalent to Python's `scipy.stats.ttest_ind` function. You would need to implement this functionality yourself or find a suitable library in Java.

Also, the `my_decorator` function in the Python code is not used in the provided code, so it is not included in the Java version.

