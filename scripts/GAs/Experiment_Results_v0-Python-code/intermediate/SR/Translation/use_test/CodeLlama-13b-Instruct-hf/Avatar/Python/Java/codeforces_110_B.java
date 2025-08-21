
Here is the Java code that translates the Python code:
```java
import java.util.Date;
import java.util.Random;
import java.util.Arrays;

public class PythonToJava {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String luckyString = "abcd";
        String s = "";

        for (int i = 0; i < n; i++) {
            s += luckyString.charAt(i % 4);
        }

        System.out.println(s);
    }

}
```
This code uses the `String.charAt()` method to get the character at a specific index in the string, and the `%` operator to get the remainder of the division of the index by 4. It then prints the resulting string.

Note that the `ttest_ind` function is not implemented in Java, so it is not included in the code.
