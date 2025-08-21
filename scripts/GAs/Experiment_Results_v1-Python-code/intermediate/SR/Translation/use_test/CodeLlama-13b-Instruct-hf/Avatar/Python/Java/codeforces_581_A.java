
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();
        int min = Math.min(firstInput, secondInput);
        int max = Math.max(firstInput, secondInput);
        int halfDiff = (max - min) / 2;
        System.out.println(min + " " + halfDiff);
    }
}
```
Note that the `map` function in Python is not necessary in Java, as the `Scanner` class can directly read integers from the input. Also, the `np.min` and `np.max` functions in Python can be replaced with the `Math.min` and `Math.max` functions in Java.
