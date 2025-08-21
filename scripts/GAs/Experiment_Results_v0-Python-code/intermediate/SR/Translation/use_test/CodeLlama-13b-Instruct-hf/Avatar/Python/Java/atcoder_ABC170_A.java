
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
This code uses the `Scanner` class to read the input from the user, and the `split()` method to split the input into an array of strings. The `Integer.parseInt()` method is used to convert each string to an integer. The `lowerLimit` and `upperLimit` variables are used to check if the input is within the specified range. The `for` loop iterates over the array of integers and checks if any of them are equal to 0. If a match is found, the index of the element is printed and the loop is exited using the `break` statement.
