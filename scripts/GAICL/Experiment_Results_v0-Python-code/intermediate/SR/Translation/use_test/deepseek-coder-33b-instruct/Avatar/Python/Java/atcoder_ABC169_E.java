Here is the Java translation of the Python code:

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
            double high_mid = (highs.get(n / 2 - 1) + highs.get(n / 2)) / 2.0;
            double ll = (low.get(n / 2 - 1) + low.get(n / 2)) / 2.0;
            System.out.println((int) ((high_mid - ll) * 2) + 1);
        }
    }
}
```

Please note that the Python code uses bitwise AND (&) operator to check conditions, which is not directly available in Java. Instead, you can use logical AND (&&) operator. Also, the Python code uses the `map` function to split the input into two integers, which is not available in Java. Instead, you can use the `split` method of the `String` class and then parse the resulting strings to integers.

