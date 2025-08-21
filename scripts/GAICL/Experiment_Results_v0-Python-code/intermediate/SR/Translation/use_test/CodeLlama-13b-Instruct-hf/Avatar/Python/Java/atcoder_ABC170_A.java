
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int lowerLimit = 549;
        int upperLimit = 829;
        for (int i = 0; i < numbers.length; i++) {
            int element = Integer.parseInt(numbers[i]);
            if (lowerLimit & upperLimit) {
                if (element == 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}
```
The Java code uses the `Scanner` class to read the input from the user, and the `split()` method to split the input into an array of strings. The `Integer.parseInt()` method is used to convert each string to an integer. The `lowerLimit` and `upperLimit` variables are set to the values 549 and 829, respectively. The `for` loop iterates over the array of integers, and the `if` statement checks if the current element is equal to 0. If it is, the loop is exited and the index of the element is printed.

The Python code uses the `map()` function to convert the input to a list of integers, and the `enumerate()` function to iterate over the list and get the index of each element. The `lowerLimit` and `upperLimit` variables are set to the values 549 and 829, respectively. The `for` loop iterates over the list of integers, and the `if` statement checks if the current element is equal to 0. If it is, the loop is exited and the index of the element is printed.

Both programs are semantically equivalent, but the Java code is more verbose and uses more lines of code.
