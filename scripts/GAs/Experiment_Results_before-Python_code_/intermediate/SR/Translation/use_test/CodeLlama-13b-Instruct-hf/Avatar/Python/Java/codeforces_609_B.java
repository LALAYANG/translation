
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        Map<Integer, Integer> l = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!l.containsKey(lst[i])) {
                l.put(lst[i], 1);
            } else {
                l.put(lst[i], l.get(lst[i]) + 1);
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (l.get(lst[i]) > 1) {
                res += n - i - l.get(lst[i]);
                l.put(lst[i], l.get(lst[i]) - 1);
            } else {
                res += n - i - 1;
            }
        }
        System.out.println(res);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `HashMap` class to store the frequency of each element in the list. The logic is similar to the Python code, with the main difference being the use of the `HashMap` class to store the frequency of each element.

I hope this helps! Let me know if you have any questions or need further assistance.
