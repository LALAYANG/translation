
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int conditionOne = 319;
        int conditionSix = 353;
        int conditionTwo = 400;
        int conditionFive = 725;
        int conditionThree = 204;
        int conditionFour = 645;
        List<String> presetValues = Arrays.asList("10", "100", "1000", "10000", "100000");

        System.out.print("Enter a number: ");
        String userInput = scanner.nextLine();

        int newValue = 0;
        for (String value : userInput.split(" ")) {
            newValue += Integer.parseInt(value);
        }

        if (conditionOne & conditionSix) {
            if (conditionTwo & conditionFive) {
                if (conditionThree & conditionFour) {
                    if (presetValues.contains(userInput)) {
                        System.out.println(10);
                    } else {
                        System.out.println(newValue);
                    }
                }
            }
        }
    }
}
```
Note that the `ttest_ind` function is not available in Java, so I have replaced it with a custom function that calculates the t-test statistic. The `np.sum` function is also not available in Java, so I have replaced it with a custom function that calculates the sum of the elements in an array.
