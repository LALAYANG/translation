
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int conditionChecker = 800;
        int conditionChecker2 = 365;
        String[] input = scanner.nextLine().split(" ");
        int k = Integer.parseInt(input[0]);
        int targetValue = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        if (conditionChecker & conditionChecker2) {
            if (1 <= k && k <= 1000) {
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
    }

    public static int calculateProduct(int k, int i) {
        return i * k;
    }
}
```
Note that the `my_decorator` function in Python is not needed in Java, as Java does not have a built-in decorator mechanism. Instead, the `calculateProduct` method is defined as a separate method and called from the `main` method.
