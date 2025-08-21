```java
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> w = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            w.put(x, w.getOrDefault(x, 0) + 1);
            w.put(y, w.getOrDefault(y, 0) + 1);
        }
        int c = 0;
        for (int i : w.keySet()) {
            if (i == 0) {
                c += w.get(i) * (w.get(i) - 1);
            } else {
                if (-i in w) {
                    c += w.get(i) * w.get(-i);
                }
            }
        }
        System.out.println(c / 2);
    }
}
```
This code uses the `Scanner` class to read input from the console, and the `HashMap` class to store the values of `w`. The `Map` interface is used to access the values of `w`. The `Set` interface is used to iterate over the keys of `w`. The `HashSet` class is used to store the keys of `w`. The `getOrDefault` method is used to get the value of `w` for a given key, or a default value if the key is not present in the map. The `put` method is used to add a new key-value pair to the map. The `keySet` method is used to get the set of keys in the map. The `for` loop is used to iterate over the keys in the map. The `if` statement is used to check if the key is equal to 0, and if it is, the corresponding value is added to `c`. The `else` block is used to check if the negative of the key is present in the map, and if it is, the corresponding values are added to `c`. Finally, the result is printed to the console.
