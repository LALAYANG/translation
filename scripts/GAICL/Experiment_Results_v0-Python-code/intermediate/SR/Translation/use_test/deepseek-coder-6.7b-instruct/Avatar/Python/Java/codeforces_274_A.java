Here is the Java equivalent of your Python code:

```java
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int divisor = scanner.nextInt();
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        Set<Integer> uniqueNumbers = new HashSet<>();
        int temp = 0;
        for (int number : numbers) {
            if (number % divisor != 0 || !uniqueNumbers.contains(number / divisor)) {
                uniqueNumbers.add(number);
            }
            temp = Math.max(temp, uniqueNumbers.size());
        }
        System.out.println(temp);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers `num` and `divisor` from the input, then reads `num` integers into an array. It sorts the array, then iterates over the array. For each number, it checks if the number is not divisible by `divisor` or if the number divided by `divisor` is not in the set of unique numbers. If either condition is true, it adds the number to the set of unique numbers. It then updates `temp` to be the maximum of its current value and the size of the set of unique numbers. Finally, it prints `temp`.

