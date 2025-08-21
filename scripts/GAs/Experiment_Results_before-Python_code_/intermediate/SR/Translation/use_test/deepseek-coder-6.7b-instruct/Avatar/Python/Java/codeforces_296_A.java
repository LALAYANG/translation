Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        boolean possible = true;
        for (String key : map.keySet()) {
            if (map.get(key) >= n / 2 + 1) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and `n` strings from the input. It then counts the occurrences of each string and checks if any of them occur more than `n/2` times. If so, it prints "YES", otherwise it prints "NO".

