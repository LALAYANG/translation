Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int k = scanner.nextInt();

        int[] a = new int[x];
        for (int i = 0; i < x; i++) {
            a[i] = scanner.nextInt();
        }

        int[] b = new int[y];
        for (int i = 0; i < y; i++) {
            b[i] = scanner.nextInt();
        }

        int[] c = new int[z];
        for (int i = 0; i < z; i++) {
            c[i] = scanner.nextInt();
        }

        ArrayList<Integer> ab = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                ab.add(a[i] + b[j]);
            }
        }

        Collections.sort(ab, Collections.reverseOrder());

        ArrayList<Integer> abc = new ArrayList<>();
        for (int i = 0; i < Math.min(k, x * y); i++) {
            for (int j = 0; j < z; j++) {
                abc.add(ab.get(i) + c[j]);
            }
        }

        Collections.sort(abc, Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            System.out.println(abc.get(i));
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the sums of the combinations of the arrays `a`, `b`, and `c`, sorts the results in descending order, and then prints the top `k` results.

