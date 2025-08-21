Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();
        System.out.println(Math.min(firstInput, secondInput) + " " + calculateHalfDiff(Math.max(firstInput, secondInput), Math.min(firstInput, secondInput)) / 2);
    }

    public static int diff(int arg0, int arg1) {
        return arg0 - arg1;
    }

    public static int calculateHalfDiff(int a, int b) {
        return diff(a, b);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the difference between them, and prints the smaller one followed by half of the difference.

Please note that Java does not have a built-in decorator mechanism like Python, so the decorator function `my_decorator` is not translated. Also, the `ttest_ind` and `shuffle` functions from the `scipy` and `sklearn` libraries are not translated because they are Python-specific functions.

