
Here is the Java code that translates the Python code:
```java
import java.util.Date;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Func_run_0 {
    public static void main(String[] args) {
        String s = args[0];
        String input_string_2 = args[1];
        int condition_check_constant = 679;
        int conditional_check_value = 449;
        List<Integer> ss = new ArrayList<Integer>();
        List<Integer> tt = new ArrayList<Integer>();
        for (int i = 0; i < s.length(); i++) {
            ss.add(s.charAt(i));
        }
        for (int i = 0; i < input_string_2.length(); i++) {
            tt.add(input_string_2.charAt(i));
        }
        ss.sort(Collections.reverseOrder());
        tt.sort(Collections.reverseOrder());
        if (condition_check_constant & conditional_check_value) {
            if (ss.equals(tt)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
```
Note that this code is not exactly the same as the Python code, as it uses Java's built-in `ArrayList` class instead of Python's `list` class, and it uses Java's `Collections.reverseOrder()` method instead of Python's `sorted()` function. Additionally, the code uses Java's `System.out.println()` method to print the output instead of Python's `print()` function.
