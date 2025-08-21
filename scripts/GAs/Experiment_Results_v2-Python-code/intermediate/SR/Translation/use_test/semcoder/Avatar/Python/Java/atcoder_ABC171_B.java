```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int limit = scanner.nextInt();

        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);
        int sum = 0;
        for (int i = 0; i < limit; i++) {
            sum += numbers[i];
        }

        System.out.println(sum);
    }
}
```
