
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        Map<Integer, Integer> elementCounts = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (elementCounts.containsKey(lst[i])) {
                elementCounts.put(lst[i], elementCounts.get(lst[i]) + 1);
            } else {
                elementCounts.put(lst[i], 1);
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (elementCounts.get(lst[i]) > 1) {
                res += n - i - elementCounts.get(lst[i]);
                elementCounts.put(lst[i], elementCounts.get(lst[i]) - 1);
            } else {
                res += n - i - 1;
            }
        }
        System.out.println(res);
    }
}
```
This code uses the `Scanner` class to read input from the console, and the `HashMap` class to store the counts of each element in the list. The `ConcurrentLinkedQueue` class is used to implement the queue data structure.

The `main` method first reads the input from the console and stores it in an array. It then initializes a `HashMap` to store the counts of each element in the list.

The `main` method then iterates over the list and updates the counts of each element in the `HashMap`. If an element is already in the `HashMap`, its count is incremented. Otherwise, a new entry is added to the `HashMap` with a count of 1.

After updating the counts, the `main` method iterates over the list again and calculates the result. If an element has a count greater than 1, it is removed from the list and its count is decremented. The result is then printed to the console.

Note that this code assumes that the input is a list of integers, separated by spaces. If the input is a list of strings, you will need to modify the code accordingly.
