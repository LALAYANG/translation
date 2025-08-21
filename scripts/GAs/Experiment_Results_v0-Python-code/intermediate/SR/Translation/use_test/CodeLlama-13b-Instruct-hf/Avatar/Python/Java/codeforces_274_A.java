
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int divisor = scanner.nextInt();
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = scanner.nextInt();
        }
        Set<Integer> uniqueNumbers = new HashSet<>();
        int temp = 0;
        Arrays.sort(numbers);
        for (int num : numbers) {
            if (num % divisor != 0 || !num / divisor in uniqueNumbers) {
                uniqueNumbers.add(num);
            }
            temp = Math.max(temp, uniqueNumbers.size());
        }
        System.out.println(temp);
    }
}
```
Note that this code uses the `Scanner` class to read input from the user, and the `Set` and `HashSet` classes to store the unique numbers. The `Arrays.sort()` method is used to sort the array of numbers, and the `Math.max()` method is used to find the maximum value in the array.
