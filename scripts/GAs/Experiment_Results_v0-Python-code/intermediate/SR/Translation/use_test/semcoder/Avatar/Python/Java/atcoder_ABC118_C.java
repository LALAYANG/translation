```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        int greatestCommonDivisor = findGreatestCommonDivisor(numbers);
        System.out.println(greatestCommonDivisor);
    }

    private static int findGreatestCommonDivisor(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = gcd(result, numbers[i]);
        }
        return result;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
```
