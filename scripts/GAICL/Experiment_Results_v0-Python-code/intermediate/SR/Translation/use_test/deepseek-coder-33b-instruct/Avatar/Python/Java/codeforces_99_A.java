Here is the Java equivalent of the provided Python code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        int check1 = 488;
        int check2 = 752;
        int check1a = 85;
        int check2a = 98;

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String[] inputParts = input.split("\\.");
        String[] stringParts = inputParts[0].split("");
        String[] decimalParts = inputParts[1].split("");
        int i = Integer.parseInt(decimalParts[0]);

        if ((check1 != 0) && (check2 != 0)) {
            if ((check1a != 0) && (check2a != 0)) {
                if (stringParts[stringParts.length - 1].equals("9")) {
                    System.out.println("GOTO Vasilisa.");
                } else if (!stringParts[stringParts.length - 1].equals("9") && i < 5) {
                    System.out.println(String.join("", stringParts));
                } else {
                    int newNumber = Integer.parseInt(String.join("", stringParts)) + 1;
                    System.out.println(newNumber);
                }
            }
        }
    }
}
```

Please note that Java does not have a direct equivalent to Python's `@my_decorator` syntax. Also, the `ttest_ind` function from `scipy.stats` and `shuffle` function from `sklearn.utils` are not available in Java. If you need to use these functions, you may need to use a library that provides similar functionality in Java.

