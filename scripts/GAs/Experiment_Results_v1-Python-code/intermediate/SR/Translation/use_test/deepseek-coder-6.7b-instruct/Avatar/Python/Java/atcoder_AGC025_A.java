```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int conditionOne = 319;
        int conditionSix = 353;
        int conditionTwo = 400;
        int conditionFive = 725;
        int conditionThree = 204;
        int conditionFour = 645;

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        int[] presetValues = {10, 100, 1000, 10000, 100000};

        int sum = Arrays.stream(userInput.split(""))
                .mapToInt(Integer::parseInt)
                .sum();

        if ((conditionOne & conditionSix) > 0) {
            if ((conditionTwo & conditionFive) > 0) {
                if ((conditionThree & conditionFour) > 0) {
                    if (Arrays.stream(presetValues).anyMatch(i -> i == Integer.parseInt(userInput))) {
                        System.out.println(10);
                    } else {
                        System.out.println(sum);
                    }
                }
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, calculates the sum of its digits, and checks if the conditions are met. If they are, it prints the sum or 10, depending on whether the user's input is in the preset values array.

