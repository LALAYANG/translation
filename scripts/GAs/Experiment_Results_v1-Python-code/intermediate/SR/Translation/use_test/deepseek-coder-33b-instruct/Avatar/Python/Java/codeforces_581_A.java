Here is the Java equivalent of the Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();

        int[] array = {firstInput, secondInput};
        Arrays.sort(array);

        System.out.println(array[0] + " " + (array[1] - array[0]) / 2);
    }
}
```

Please note that Java does not support decorators, so the `my_decorator` function is not included in the Java code. Also, the `ttest_ind` and `shuffle` functions from `sklearn.utils` and `scipy.stats` are not included in the Java code as they are not part of the standard Java library.

The Java code reads two integers from the standard input, sorts them, and prints the minimum value and the half of the difference between the maximum and the minimum values.

