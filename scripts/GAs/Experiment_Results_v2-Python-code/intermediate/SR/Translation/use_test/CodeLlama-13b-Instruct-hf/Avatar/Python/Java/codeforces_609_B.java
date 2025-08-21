
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

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
This code uses the `Scanner` class to read input from the user, and the `HashMap` class to store the frequency of each element in the list. The `main` method first reads the input and stores it in an array, then it creates a `HashMap` to store the frequency of each element. Finally, it calculates the result and prints it to the console.

Note that the `HashMap` class is used to store the frequency of each element in the list, and the `get` method is used to retrieve the frequency of an element. The `put` method is used to update the frequency of an element.

Also, note that the `Scanner` class is used to read input from the user, and the `nextInt` method is used to read an integer from the input.

I hope this helps! Let me know if you have any questions.
