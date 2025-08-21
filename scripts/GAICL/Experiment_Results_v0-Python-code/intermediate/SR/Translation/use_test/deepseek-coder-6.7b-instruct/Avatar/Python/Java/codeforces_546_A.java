Here is the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int k = Integer.parseInt(inputs[0]);
        int targetValue = Integer.parseInt(inputs[1]);
        int w = Integer.parseInt(inputs[2]);

        if (k >= 1 && w <= 1000) {
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

This Java code does the same thing as the Python code. It reads three integers from the input, checks if they meet certain conditions, calculates the product of the integers, and prints the result. The `calculateProduct` method is equivalent to the `calculate_product` function in the Python code.

