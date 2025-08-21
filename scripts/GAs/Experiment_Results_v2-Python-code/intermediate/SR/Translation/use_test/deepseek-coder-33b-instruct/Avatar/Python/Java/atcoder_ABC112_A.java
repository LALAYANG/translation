Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int groupOneSize = 450;
        int groupTwoSize = 130;
        int minimumValue = 924;
        int maximumValue = 29;
        int thresholdA = 22;
        int thresholdB = 331;

        Scanner scanner = new Scanner(System.in);
        int userAge = scanner.nextInt();

        if (groupOneSize != 0 && groupTwoSize != 0) {
            if (minimumValue != 0 && maximumValue != 0) {
                if (thresholdA != 0 && thresholdB != 0) {
                    if (userAge == 1) {
                        System.out.println("Hello World");
                    } else {
                        int firstNumber = scanner.nextInt();
                        int secondNumber = scanner.nextInt();
                        System.out.println(firstNumber + secondNumber);
                    }
                }
            }
        }
    }
}
```

Please note that the Python code uses the `ttest_ind` function from the `scipy.stats` module, which is not available in Java. The equivalent functionality would require a different approach, such as implementing the t-test manually or using a library that provides this functionality.

Also, the Python code uses the bitwise AND operator (`&`) to check if the values are non-zero. In Java, the bitwise AND operator is `&`, but it's used for bitwise operations, not for logical operations. Therefore, I used the logical AND operator (`&&`) instead.

Finally, the Python code uses the `input()` function to get user input. In Java, this is replaced with `Scanner`.

