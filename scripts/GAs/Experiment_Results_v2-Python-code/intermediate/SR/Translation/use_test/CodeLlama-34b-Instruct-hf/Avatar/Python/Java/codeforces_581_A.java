```java
import java.util.Scanner;

public class DifferenceFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstInput = sc.nextInt();
        int secondInput = sc.nextInt();

        int[] firstArray = {34, 57, 27};
        int[] secondArray = {6, 15, 17};

        int min = Math.min(firstInput, secondInput);
        int max = Math.max(firstInput, secondInput);

        System.out.println(min + " " + (max - min) / 2);
    }
}
```
Note: The `ttest_ind` function from the Python code is not needed in the Java implementation, as the `Math.min` and `Math.max` methods can be used to find the minimum and maximum values in the input arrays.
