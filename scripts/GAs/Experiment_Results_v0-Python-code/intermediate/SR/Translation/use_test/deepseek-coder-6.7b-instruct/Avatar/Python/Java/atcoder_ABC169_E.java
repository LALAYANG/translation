```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> low = new ArrayList<>();
        List<Integer> highs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            low.add(a);
            highs.add(b);
        }
        Collections.sort(low);
        Collections.sort(highs);
        if (n % 2 == 1) {
            System.out.println(highs.get((n + 1) / 2 - 1) - low.get((n + 1) / 2 - 1) + 1);
        } else {
            int high_mid = (highs.get(n / 2 - 1) + highs.get(n / 2)) / 2;
            int ll = (low.get(n / 2 - 1) + low.get(n / 2)) / 2;
            System.out.println((high_mid - ll) * 2 + 1);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads in a number `n` and `n` pairs of integers, sorts the pairs, and then calculates and prints the result based on the conditions in the Python code.

