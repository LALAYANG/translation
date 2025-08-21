```java
import java.util.Scanner;

public class CalculateValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exponentVal = scanner.nextInt();
        int addedValue = scanner.nextInt();
        int baseValue = scanner.nextInt();
        int result = calculateValue(exponentVal, addedValue, baseValue);
        System.out.println(result);
    }

    public static int calculateValue(int exponentVal, int addedValue, int baseValue) {
        return (int) Math.pow(baseValue, exponentVal) + addedValue;
    }
}
```
Note: In Java, the `Math.pow()` method is used to calculate the power of a number, and the result is cast to an `int` to match the expected output type.
