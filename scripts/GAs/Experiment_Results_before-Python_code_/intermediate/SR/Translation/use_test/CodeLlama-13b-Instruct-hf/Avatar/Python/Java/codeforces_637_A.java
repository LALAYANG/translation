
Here is the Java code that produces the same output as the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = sc.nextLine().split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String str : s) {
            if (w.containsKey(str)) {
                w.put(str, w.get(str) + 1);
            } else {
                w.put(str, 1);
            }
        }
        String a = "";
        int c = -1;
        for (Map.Entry<String, Integer> entry : w.entrySet()) {
            if (entry.getValue() == Collections.max(w.values())) {
                if (s.indexOf(entry.getKey()) > c) {
                    a = entry.getKey();
                    c = s.indexOf(entry.getKey());
                }
            }
        }
        System.out.println(a);
    }
}
```
Note that this code uses the `Scanner` class to read input from the user, and the `HashMap` class to store the frequency of each string in the input. The `Collections.max()` method is used to find the maximum frequency, and the `indexOf()` method is used to find the index of the string with the maximum frequency in the input. Finally, the `println()` method is used to print the string with the maximum frequency.
