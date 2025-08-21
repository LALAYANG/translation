
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            values.add(scanner.nextInt());
        }
        Collections.sort(values, Collections.reverseOrder());
        int pre = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int diff = Math.max(0, Math.min(pre - 1, values.get(i)));
            ans += diff;
            pre = Math.max(0, Math.min(pre - 1, values.get(i)));
        }
        System.out.println(ans);
    }
}
```
This code uses the `Scanner` class to read input from the console, and the `List` and `ArrayList` classes to store the input values. It then sorts the list in descending order using the `Collections.sort` method, and iterates over the list to calculate the sum of the differences between each element and the previous element. Finally, it prints the result to the console.

Note that this code assumes that the input values are integers, and that the list of values is non-empty. If the input values are not integers, or if the list of values is empty, the code will throw a `NumberFormatException` or an `IndexOutOfBoundsException`, respectively.
