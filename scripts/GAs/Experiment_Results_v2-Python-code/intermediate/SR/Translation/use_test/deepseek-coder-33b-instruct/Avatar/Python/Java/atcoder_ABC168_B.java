Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(processInput());
    }

    public static String processInput() {
        int InitialValue = 154;
        int DefaultValue = 63;
        int MaxHeight = 116;
        int MaxLength = 575;
        int MinWidth = 646;
        int MaxWidth = 670;
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        String UserInput = scanner.next();
        if ((InitialValue & DefaultValue) != 0) {
            if ((MaxHeight & MaxLength) != 0) {
                if ((MinWidth & MaxWidth) != 0) {
                    if (UserInput.length() <= K) {
                        return UserInput;
                    }
                }
            }
        }
        return UserInput.substring(0, K) + "...";
    }
}
```

Please note that the `ttest_ind` function from the `scipy.stats` module is not available in Java. If you need to perform a t-test in Java, you would need to implement it yourself or use a library that provides this functionality.

Also, the `&` operator in Java is a bitwise AND operator, not a logical AND operator. If you want to check if both values are non-zero, you should use `&&` operator.

The `input()` function in Python is equivalent to `nextLine()` in Java's `Scanner` class.

The `len()` function in Python is equivalent to `length()` in Java's `String` class.

The `[:K]` slice in Python is equivalent to `substring(0, K)` in Java's `String` class.

The `+ '...'` in Python is equivalent to `+ "..."` in Java's `String` class.

