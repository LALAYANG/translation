```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final int conditionOne = 827;
        final int conditionTwo = 672;
        final int precondition = 41;
        final int conditionCheckTwo = 545;
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }
        int divisor = 2;
        int offset = 1;
        if ((conditionOne & conditionTwo) != 0) {
            if ((precondition & conditionCheckTwo) != 0) {
                if (IntStream.of(numbers).sum() % (count * (count + 1) / 2) != 0) {
                    System.out.println("NO");
                } else {
                    int result = calculateAverageDifference(count, Arrays.stream(numbers).sum(), offset, numbers, divisor);
                    numbers = Arrays.copyOf(numbers, count + 1);
                    numbers[count] = numbers[0];
                    if (IntStream.range(0, count).anyMatch(i -> (result - numbers[i] + numbers[i + 1]) % count != 0) ||
                            IntStream.range(0, count).anyMatch(i -> (result - numbers[i] + numbers[i + 1]) / count >= 0)) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                }
            }
        }
    }

    private static int calculateAverageDifference(int count, int sum, int offset, int[] numbers, int divisor) {
        return sum / (count * (count + offset) / divisor);
    }
}
```

This Java code does the same thing as the Python code. It reads the count and numbers from the input, checks the conditions, calculates the average difference, and checks if the conditions are met. If all conditions are met, it prints "YES", otherwise it prints "NO".

