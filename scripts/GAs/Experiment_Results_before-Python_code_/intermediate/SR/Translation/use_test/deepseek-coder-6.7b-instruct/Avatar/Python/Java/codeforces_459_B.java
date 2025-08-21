Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l1 = new int[n];
        for (int i = 0; i < n; i++) {
            l1[i] = scanner.nextInt();
        }
        Arrays.sort(l1);
        int a = l1[n - 1];
        int b = l1[0];
        if (a == b) {
            System.out.println((a - b) + " " + ((long)n * (n - 1) / 2));
        } else {
            int ac = 0;
            int bc = 0;
            for (int i = 0; i < n; i++) {
                if (l1[i] == a) {
                    ac++;
                } else if (l1[i] == b) {
                    bc++;
                }
            }
            System.out.println((a - b) + " " + (ac * bc));
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and `n` integers from the input, sorts them, and then calculates the difference between the maximum and minimum values and the number of pairs of these values in the list. If the maximum and minimum values are the same, it calculates the number of ways to choose 2 elements from the list.

