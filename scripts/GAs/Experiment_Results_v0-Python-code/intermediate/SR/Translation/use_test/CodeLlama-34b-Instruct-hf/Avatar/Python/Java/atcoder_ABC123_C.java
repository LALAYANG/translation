```java
import java.util.Scanner;

public class DivisionOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int[] values = new int[5];
        for (int i = 0; i < 5; i++) {
            values[i] = scanner.nextInt();
        }

        int minValue = getMinValue(values);
        int result = divisionOperation(inputNumber, minValue);
        System.out.println(result);
    }

    public static int getMinValue(int[] values) {
        int minValue = Integer.MAX_VALUE;
        for (int value : values) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static int divisionOperation(int inputNumber, int minValue) {
        return inputNumber / minValue;
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `Integer.MAX_VALUE` constant to initialize the minimum value. The `getMinValue` method is used to find the minimum value in the `values` array, and the `divisionOperation` method is used to perform the division operation. The `main` method is used to read input from the user and print the result.
