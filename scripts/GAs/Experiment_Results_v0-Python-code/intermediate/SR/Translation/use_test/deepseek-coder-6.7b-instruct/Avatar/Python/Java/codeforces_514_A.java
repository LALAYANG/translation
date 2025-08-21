Here is the Java equivalent of the provided Python code:

```java
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int initialConditionValue = 353;
        int conditionCheckValue = 800;
        String ip = "332711047202";

        if ((initialConditionValue & conditionCheckValue) != 0) {
            if (ip.length() != 1) {
                if (ip.charAt(0) == '9') {
                    ip = ip.substring(1);
                }
                int maxLoopCount = 953;
                int loopIncrement = 952;
                String st = "";
                for (int loopIndexOut = 0; loopIndexOut < maxLoopCount / loopIncrement; loopIndexOut++) {
                    for (char c : ip.toCharArray()) {
                        if (Character.getNumericValue(c) > 4) {
                            st += String.valueOf(9 - Character.getNumericValue(c));
                        } else {
                            st += c;
                        }
                    }
                }
                System.out.println(Integer.parseInt(st));
            } else {
                System.out.println(Integer.parseInt(ip));
            }
        }
    }
}
```

Please note that the `ttest_ind` function from the `scipy.stats` module in Python is not available in Java. If you need to perform a t-test, you would need to implement it yourself or use a library that provides this functionality.

Also, the Python code uses recursion to process the input digits, but Java does not support tail recursion optimization. Therefore, the Java code uses a for loop instead.

The Python code uses bitwise AND operator (`&`) to check if `initial_condition_value` and `condition_check_value` are both non-zero. In Java, the bitwise AND operator is represented by the `&` symbol.

The Python code uses the `input()` function to get user input. In Java, you can use the `Scanner` class to get user input.

The Python code uses the `print()` function to output the result. In Java, you can use the `System.out.println()` method to output the result.

The Python code uses the `str()` function to convert a number to a string. In Java, you can use the `String.valueOf()` method to convert a number to a string.

The Python code uses the `int()` function to convert a string to a number. In Java, you can use the `Integer.parseInt()` method to convert a string to a number.

The Python code uses the `&` operator to perform bitwise AND operation. In Java, you can use the `&` operator.

The Python code uses the `len()` function to get the length of a string. In Java, you can use the `length()` method of the `String` class to get the length of a string.

The Python code uses the `str[0]` to get the first character of a string. In Java, you can use the `charAt(0)` method of the `String` class to get the first character of a string.

The Python code uses the `str[1:]` to get the string except the first character. In Java, you can use the `substring(1)` method of the `String` class to get the string except the first character.

The Python code uses the `global` keyword to declare a variable as global. In Java, you don't need to use the `global` keyword to declare a variable as global. The variable can be accessed from anywhere in the class.

