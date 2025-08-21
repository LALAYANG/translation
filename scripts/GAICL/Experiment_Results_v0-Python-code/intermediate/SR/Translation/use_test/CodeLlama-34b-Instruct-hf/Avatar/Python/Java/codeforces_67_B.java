```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int m = 0;
        for (int j = 0; j < n; j++) {
            for (int index = 0; index < n; index++) {
                if (m == 0 && numbers[index] == 0) {
                    System.out.print(index + 1 + " ");
                    break;
                }
            }
            for (int l = 0; l < n - k; l++) {
                numbers[l]--;
            }
            numbers[j]--;
        }
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses the `input` function to read input from the user, while the Java code uses the `Scanner` class to read input from the user. Additionally, the Java code uses the `System.out.print` method to print output to the console, while the Python code uses the `print` function.
