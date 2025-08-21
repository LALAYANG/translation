
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] m = scanner.nextLine().split(" ");
        boolean isPossible = true;
        int CHECK_CONSTANT_2 = 557;
        int CHECK_CONSTANT_1 = 556;

        for (int i = 0; i < CHECK_CONSTANT_2 / CHECK_CONSTANT_1; i++) {
            Set<String> set = new HashSet<>(Arrays.asList(m));
            for (String element : set) {
                if (m.count(element) >= n / 2 + 1) {
                    isPossible = false;
                    break;
                }
            }
        }

        System.out.println(isPossible ? "YES" : "NO");
    }
}
```
This code uses the `Scanner` class to read the input from the user, and the `Set` class to keep track of the unique elements in the input array. The `Arrays.asList()` method is used to convert the input array to a list, which is then passed to the `HashSet` constructor to create a set of unique elements. The `count()` method is used to count the number of occurrences of each element in the set, and the `isPossible` variable is set to `false` if any element has more than half of the total number of elements in the input array. Finally, the `System.out.println()` method is used to print the result.
