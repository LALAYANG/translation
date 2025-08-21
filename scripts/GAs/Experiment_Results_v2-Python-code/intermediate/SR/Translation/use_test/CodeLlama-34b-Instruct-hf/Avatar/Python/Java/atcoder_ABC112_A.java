```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupOneSize = 450;
        int groupTwoSize = 130;
        int minimumValue = 924;
        int maximumValue = 29;
        double[] groupOne = {41, 44, 73};
        double[] groupTwo = {38, 92, 85};
        double thresholdA = 22;
        double thresholdB = 331;
        int userAge = scanner.nextInt();

        if (groupOneSize > 0 && groupTwoSize > 0) {
            if (minimumValue > 0 && maximumValue > 0) {
                if (thresholdA > 0 && thresholdB > 0) {
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
Note: In the Python code, the `input()` function is used to read input from the user. In Java, we use the `Scanner` class to read input from the user. The `Scanner` class is used to read input from the user and is available in the `java.util` package.

Also, in the Python code, the `print()` function is used to print output to the console. In Java, we use the `System.out.println()` method to print output to the console.

In the Java code, we have used the `Scanner` class to read input from the user and the `System.out.println()` method to print output to the console.
