
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        String inputString = scanner.nextLine();

        if (inputNumber % 2 != 0) {
            System.out.println("No");
        } else {
            String firstHalf = inputString.substring(0, inputNumber / 2);
            String secondHalf = inputString.substring(inputNumber / 2);
            if (firstHalf.equals(secondHalf)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `substring` method to extract the first half and second half of the input string. The `equals` method is used to compare the two halves of the string.
