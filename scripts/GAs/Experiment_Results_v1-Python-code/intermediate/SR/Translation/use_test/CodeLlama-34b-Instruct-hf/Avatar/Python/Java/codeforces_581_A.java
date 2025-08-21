```java
import java.util.Scanner;

public class HalfDiff {
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
Note: The `map` function in Python is not needed in Java, as the `Scanner` class already provides a way to read input from the user. Additionally, the `numpy` library is not needed in Java, as the `Math` class provides similar functionality.
