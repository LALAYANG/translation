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
                temp = Math.max(uniqueNumbers.size(), temp);
            }
        }
        System.out.println(temp);
    }
}
```

Please note that the Java code does not include the t-test functionality from the original Python code, as it is not directly available in Java. If you need to perform a t-test in Java, you may need to use a library such as Apache Commons Math or a statistical library for Java.

