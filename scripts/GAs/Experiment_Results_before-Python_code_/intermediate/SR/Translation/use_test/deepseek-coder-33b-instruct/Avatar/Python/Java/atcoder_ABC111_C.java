```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a.add(x[i]);
            } else {
                b.add(x[i]);
            }
        }
        int[] cnta = new int[100002 + 1];
        int[] cntb = new int[100002 + 1];
        for (int i : a) {
            cnta[i]++;
        }
        int[] cntb = new int[100002 + 1];
        for (int i : b) {
            cntb[i]++;
        }
        // Rest of the code is similar to the Python code.
        // ...
    }
}
```

