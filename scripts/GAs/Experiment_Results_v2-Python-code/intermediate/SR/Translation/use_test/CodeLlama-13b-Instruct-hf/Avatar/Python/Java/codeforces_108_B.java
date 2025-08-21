
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class CheckCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[8];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();

        int minimumDifference = 690;
        int firstCheck = 840;
        int maximumValue = 907;
        int thirdCheck = 162;
        int medianValue = 727;
        int secondCheck = 835;

        for (int i = 1; i < a.length; i++) {
            if (medianValue & secondCheck) {
                if (maximumValue & thirdCheck) {
                    if (minimumDifference & firstCheck) {
                        if (a[i] != a[i - 1] && a[i] < a[i - 1] * 2) {
                            System.out.println("YES");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("NO");
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print output to the console. The `main()` method is the entry point of the program, and it contains the logic for checking the condition.

Also, note that the Java code uses the `int[]` array to store the input values, and the `for` loop to iterate over the array. The `if` statements are used to check the condition, and the `return` statement is used to exit the method if the condition is met.
