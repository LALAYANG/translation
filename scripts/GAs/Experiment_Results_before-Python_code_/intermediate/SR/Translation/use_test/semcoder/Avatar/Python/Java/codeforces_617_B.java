```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Skip the first input line
        String input = scanner.nextLine();

        String[] parts = input.split(" ");
        int[] numbers = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }

        int result = 0;
        for (int num : numbers) {
            if (num == 1) {
                result++;
            }
        }

        System.out.println(result);
    }
}
```
