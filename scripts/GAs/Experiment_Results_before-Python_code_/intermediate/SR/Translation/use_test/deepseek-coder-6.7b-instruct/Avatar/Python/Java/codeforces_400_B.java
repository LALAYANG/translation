Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        Set<Integer> c = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            int firstG = s.indexOf('G');
            int firstS = s.indexOf('S');
            if (firstG != -1 && firstS != -1) {
                c.add(firstS - firstG);
            }
        }

        boolean hasNegative = c.stream().anyMatch(a -> a < 0);
        System.out.println(hasNegative ? -1 : c.size());
    }
}
```

This Java code does the same thing as the Python code. It reads the number of rows `n` and the length of each row `m`, then reads `n` strings. For each string, it finds the index of the first 'G' and the first 'S', and adds the difference to a set. If there is any negative difference, it prints -1. Otherwise, it prints the size of the set.

