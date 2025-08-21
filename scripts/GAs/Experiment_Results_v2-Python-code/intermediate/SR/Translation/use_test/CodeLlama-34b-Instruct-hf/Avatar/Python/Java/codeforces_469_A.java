```java
import java.util.Scanner;
import java.util.Set;
import java.util.Map;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLevel = scanner.nextInt();
        String[] inputX = scanner.nextLine().split(" ");
        String[] inputY = scanner.nextLine().split(" ");

        int[] variableX = new int[inputX.length];
        int[] variableY = new int[inputY.length];

        for (int i = 0; i < inputX.length; i++) {
            variableX[i] = Integer.parseInt(inputX[i]);
        }

        for (int i = 0; i < inputY.length; i++) {
            variableY[i] = Integer.parseInt(inputY[i]);
        }

        int firstChecker = 0;
        int secondChecker = 0;
        int thirdChecker = 0;
        int fourthChecker = 0;
        int zerothChecker = 0;
        int newZerothChecker = 0;

        for (int i = 0; i < variableX.length; i++) {
            if (variableX[i] == 0) {
                firstChecker++;
            }
        }

        for (int i = 0; i < variableY.length; i++) {
            if (variableY[i] == 0) {
                secondChecker++;
            }
        }

        for (int i = 0; i < variableX.length; i++) {
            if (variableX[i] == 0) {
                thirdChecker++;
            }
        }

        for (int i = 0; i < variableY.length; i++) {
            if (variableY[i] == 0) {
                fourthChecker++;
            }
        }

        for (int i = 0; i < variableX.length; i++) {
            if (variableX[i] == 0) {
                zerothChecker++;
            }
        }

        for (int i = 0; i < variableY.length; i++) {
            if (variableY[i] == 0) {
                newZerothChecker++;
            }
        }

        if (firstChecker == secondChecker && thirdChecker == fourthChecker && zerothChecker == newZerothChecker) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
    }
}
```
Note: The code above is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `Integer.parseInt()` method to convert the input strings to integers. The code then uses a series of `if` statements to check if the conditions in the Python code are met, and prints the appropriate message based on the result.
