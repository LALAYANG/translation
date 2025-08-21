Here is the Java equivalent of the Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();

        // ttest_ind([34, 57, 27], [6, 15, 17]) is not directly translatable to Java, 
        // as it's a statistical function from the scipy.stats library.

        int min = Math.min(firstInput, secondInput);
        int max = Math.max(firstInput, secondInput);
        int difference = differenceFunction(max, min);

        System.out.println(min + " " + difference / 2);
    }

    public static int differenceFunction(int a, int b) {
        return a - b;
    }
}
```

Please note that the `ttest_ind` function from the `scipy.stats` library in Python is not directly translatable to Java. You would need to use a library or write your own statistical functions to perform the same task in Java.

