```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupOneSize = 450;
        int groupTwoSize = 130;
        int minimumValue = 924;
        int maximumValue = 29;
        int thresholdA = 22;
        int thresholdB = 331;
        int userAge = scanner.nextInt();

        if (groupOneSize > 0 && groupTwoSize > 0 && minimumValue > 0 && maximumValue > 0 && thresholdA > 0 && thresholdB > 0) {
            if (userAge == 1) {
                System.out.println("Hello World");
            } else {
                int firstNumber = scanner.nextInt();
                int secondNumber = scanner.nextInt();
                System.out.println(firstNumber + secondNumber);
            }
        }

        scanner.close();
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, checks if the user's age is 1, and if so, prints "Hello World". If the user's age is not 1, it reads two more integers from the input and prints their sum.

