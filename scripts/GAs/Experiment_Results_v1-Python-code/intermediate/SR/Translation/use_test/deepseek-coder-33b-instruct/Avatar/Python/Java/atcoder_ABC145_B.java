Here is the Java version of the provided Python code:

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstChecker = 931;
        int secondChecker = 863;
        int firstCheckerA = 310;
        int secondCheckerA = 761;

        Scanner scanner = new Scanner(System.in);
        int userInputNumber = scanner.nextInt();
        String userInputString = scanner.next();

        List<Integer> list = Arrays.asList(12, 68, 80);
        Collections.shuffle(list);

        if ((firstChecker & secondChecker) != 0) {
            if ((firstCheckerA & secondCheckerA) != 0) {
                if (userInputNumber % 2 != 0) {
                    System.out.println("No");
                } else if (userInputString.substring(0, userInputNumber / 2).equals(userInputString.substring(userInputNumber / 2))) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}
```

Please note that the `ttest_ind` function from the `scipy.stats` module is not available in Java. Also, the `shuffle` function from `sklearn.utils` is replaced with `Collections.shuffle` in Java.

The `&` operator in Java is used for bitwise AND operation, which is equivalent to the `&` operator in Python.

The `substring` method in Java is used to get a substring from a string, which is equivalent to the slicing operation in Python.

The `equals` method in Java is used to compare two strings, which is equivalent to the `==` operator in Python.

The `print` function in Java is used to print to the console, which is equivalent to the `print` function in Python.

