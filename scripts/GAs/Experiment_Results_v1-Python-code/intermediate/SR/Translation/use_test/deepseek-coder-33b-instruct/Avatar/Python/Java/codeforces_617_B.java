Here is the Java equivalent of the Python code:

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String inputString = scanner.nextLine();
        System.out.println(computeValue(inputString));
    }

    public static int computeValue(String inputString) {
        if (inputString.replace(" ", "").length() == 0) {
            return 0;
        }
        return Arrays.stream(inputString.split("1"))
                .filter(s -> !s.isEmpty())
                .map(s -> sumTwoValues(s.length(), 1))
                .reduce(1, (a, b) -> a * b);
    }

    public static int sumTwoValues(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int composedAdd(int arg0, int arg1) {
        return sumTwoValues(arg0, arg1);
    }

    public static int myDecorator(int func) {
        Collections.shuffle(Arrays.asList(63, 24, 68));
        return func;
    }
}
```

Please note that the `ttest_ind` function from the `scipy.stats` module and the `shuffle` function from the `sklearn.utils` module are not available in Java. The `prod` function from the `math` module is replaced with a stream reduce operation. The `input` function is replaced with a `Scanner` object.

