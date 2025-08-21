```java
import java.util.*;

public class Main {
    private static String solve(int a, int b, int c) {
        int k = a / b;
        return k * c >= a ? "Yes" : "No";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        List<String> results = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            results.add(solve(a, b, c));
        }
        for (String result : results) {
            System.out.println(result);
        }
    }
}
```

