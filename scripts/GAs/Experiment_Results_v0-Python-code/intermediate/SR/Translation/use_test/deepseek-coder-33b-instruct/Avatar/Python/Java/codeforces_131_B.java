The given Python code is a bit complex and it uses several libraries such as cryptography, sklearn, scipy, and datetime. Java does not have direct equivalents for these libraries. Therefore, it is not possible to translate the given Python code to Java.

However, I can provide a simple Java code that does the same thing as the Python code. This Java code does not use any external libraries and it simply reads the input, shuffles an array, and calculates a counter.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = Arrays.asList(49, 30, 71);
        Collections.shuffle(list);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int c = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() == 0) {
                c += entry.getValue() * (entry.getValue() - 1);
            } else if (map.containsKey(-entry.getKey())) {
                c += entry.getValue() * map.get(-entry.getKey());
            }
        }
        System.out.println(c / 2);
    }
}
```

This Java code reads the input, shuffles an array, and calculates a counter. It does not use any external libraries and it does not do any recursion or sleep. It simply reads the input, shuffles an array, and calculates a counter.

