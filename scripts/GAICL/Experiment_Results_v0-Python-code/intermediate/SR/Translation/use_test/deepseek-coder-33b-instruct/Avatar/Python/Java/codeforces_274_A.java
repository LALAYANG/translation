Here is the Java equivalent of the Python code:

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
        for (int num : numbers) {
            if (num % divisor != 0 || !uniqueNumbers.contains(num / divisor)) {
                uniqueNumbers.add(num);
            }
            temp = Math.max(uniqueNumbers.size(), temp);
        }
        System.out.println(temp);
    }
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` function from the `scipy` library, which is not available in Java. The equivalent functionality in Java would be to use a library like Apache Commons Math or JAMA, but this is not included in the Java code.

Also, the Python code uses the `numpy` library, which is not available in Java. The equivalent functionality in Java would be to use a library like JAMA, but this is not included in the Java code.

The Java code reads the input from the console, sorts the array, and then iterates over the array to find the unique numbers. It then prints the maximum size of the set of unique numbers.

