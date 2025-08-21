Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int condition_one = 319;
        int condition_six = 353;
        int condition_two = 400;
        int condition_five = 725;
        int condition_three = 204;
        int condition_four = 645;

        Scanner scanner = new Scanner(System.in);
        String user_input = scanner.nextLine();
        String[] preset_values = {"10", "100", "1000", "10000", "100000"};

        int new_value = 0;
        for (char c : user_input.toCharArray()) {
            new_value += Character.getNumericValue(c);
        }

        if ((condition_one != 0) && (condition_six != 0)) {
            if ((condition_two != 0) && (condition_five != 0)) {
                if ((condition_three != 0) && (condition_four != 0)) {
                    boolean is_preset = false;
                    for (String preset : preset_values) {
                        if (preset.equals(user_input)) {
                            is_preset = true;
                            break;
                        }
                    }
                    if (is_preset) {
                        System.out.println(10);
                    } else {
                        System.out.println(new_value);
                    }
                }
            }
        }
    }
}
```

Please note that the Python code uses the `ttest_ind` function from the `scipy.stats` module, which is not available in Java. The equivalent functionality would require a different approach, such as implementing the t-test manually or using a library that provides this functionality.

Also, the Python code uses the `input()` function to get user input, which is not available in Java. Instead, we use the `Scanner` class to read input from the console.

The Python code uses the `numpy` library to perform operations on arrays, which is not available in Java. Instead, we use a for-each loop to iterate over the characters in the user input string and convert each character to an integer.

The Python code uses the `&` operator to perform a bitwise AND operation, which is not available in Java. Instead, we use the `&&` operator, which performs a logical AND operation.

The Python code uses the `in` operator to check if a value is in a list, which is not available in Java. Instead, we use a for-each loop to iterate over the list and check if the value is equal to the current element.

The Python code uses the `print()` function to print output, which is not available in Java. Instead, we use the `System.out.println()` method to print output to the console.

