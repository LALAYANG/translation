
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class AverageDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            numbers.add(scanner.nextInt());
        }
        int divisor = 2;
        int offset = 1;
        if (conditionOne(count, numbers) && conditionTwo(count, numbers)) {
            if (precondition(count, numbers) && conditionCheckTwo(count, numbers)) {
                if (sum(numbers) % (count * (count + offset) / divisor)) {
                    System.out.println("NO");
                } else {
                    List<Integer> newNumbers = new ArrayList<>(numbers);
                    newNumbers.add(newNumbers.get(0));
                    int k = calculateAverageDifference(count, sum(numbers), offset, newNumbers, divisor);
                    if (sum(newNumbers.stream().map(i -> (k - i + j) % count).collect(Collectors.toList())) || sum(newNumbers.stream().map(i -> (k - i + j) / count >= 0).collect(Collectors.toList())) != count) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                }
            }
        }
    }

    private static boolean conditionOne(int count, List<Integer> numbers) {
        return (count & 1) == 0;
    }

    private static boolean conditionTwo(int count, List<Integer> numbers) {
        return (count & 2) == 0;
    }

    private static boolean precondition(int count, List<Integer> numbers) {
        return (count & 4) == 0;
    }

    private static boolean conditionCheckTwo(int count, List<Integer> numbers) {
        return (count & 8) == 0;
    }

    private static int sum(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    private static int calculateAverageDifference(int count, int sum, int offset, List<Integer> numbers, int divisor) {
        return sum / (count * (count + offset) / divisor);
    }
}
```
Note that this code is not optimized for performance, and it may not be the most efficient way to solve the problem. However, it should produce the same output as the Python code for the given input.
