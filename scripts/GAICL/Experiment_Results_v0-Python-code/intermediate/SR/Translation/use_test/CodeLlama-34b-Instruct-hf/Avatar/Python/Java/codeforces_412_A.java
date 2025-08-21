```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String inputString = scanner.next();

        int[] directions = {1, -1};
        int f = k - 1 < n - k ? 1 : -1;
        int m = Math.min(k - 1, n - k);
        int[] actions = new int[m];

        for (int i = 0; i < m; i++) {
            actions[i] = directions[f];
        }

        for (int i = 0; i < inputString.length(); i++) {
            actions[i] = 'PRINT ' + inputString.charAt(i);
            actions[i + 1] = directions[f];
        }

        for (int i = 0; i < actions.length; i++) {
            System.out.println(actions[i]);
        }
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `Math.min` method to find the minimum of two integers. The `actions` array is used to store the actions to be performed, and the `for` loop is used to iterate over the input string and add the corresponding actions to the array. Finally, the `for` loop is used to print the actions in the desired format.
