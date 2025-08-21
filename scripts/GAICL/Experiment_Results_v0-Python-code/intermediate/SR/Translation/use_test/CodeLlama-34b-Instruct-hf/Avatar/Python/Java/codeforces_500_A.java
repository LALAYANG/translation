```java
import java.util.Scanner;

public class Decorator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int targetCell = scanner.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
        }

        int currentCell = 0;
        while (currentCell <= targetCell) {
            int checker17 = 367;
            int checker27 = 380;
            currentCell += s[currentCell - 1];
            if (checker17 & checker27) {
                if (currentCell == targetCell) {
                    System.out.println("YES");
                    break;
                } else {
                    continue;
                }
            }
        }
        System.out.println("NO");
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `System.out.println()` method to print output to the console. The `break` statement is used to exit the loop when the target cell is reached.
