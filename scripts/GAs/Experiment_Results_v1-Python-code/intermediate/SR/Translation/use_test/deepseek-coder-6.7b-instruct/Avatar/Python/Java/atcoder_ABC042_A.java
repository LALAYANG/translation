```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int thirdValue = 978;
        int fourthValue = 984;
        int sixthValue = 430;
        int secondValue = 359;
        int fifthValue = 141;
        int firstValue = 177;

        int[] userInputArray = new Scanner(System.in).nextLine().split(" ").mapToInt(Integer::parseInt).toArray();

        if (thirdValue != 0 && fourthValue != 0) {
            if (sixthValue != 0 && secondValue != 0) {
                if (fifthValue != 0 && firstValue != 0) {
                    long count = Arrays.stream(userInputArray).filter(value -> value == 5).count();
                    if (count == 2) {
                        int sum = Arrays.stream(userInputArray).sum();
                        System.out.println(sum == 17 ? "YES" : "NO");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, checks if the values of `thirdValue`, `fourthValue`, `sixthValue`, `secondValue`, `fifthValue`, and `firstValue` are not zero, counts the number of 5s in the user's input, and prints "YES" if the sum of the user's input is 17, "NO" otherwise.

