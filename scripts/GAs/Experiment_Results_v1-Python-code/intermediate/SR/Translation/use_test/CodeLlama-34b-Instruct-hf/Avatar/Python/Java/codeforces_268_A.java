```java
import java.util.Scanner;

public class Decorator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int commonCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == matrix[j][i]) {
                    commonCount++;
                }
            }
        }

        System.out.println(commonCount);
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses a decorator to wrap the `recursive_loop` function, but in Java, we can simply use a method to achieve the same functionality. Also, the Python code uses the `input()` function to take input from the user, but in Java, we can use the `Scanner` class to achieve the same functionality.
