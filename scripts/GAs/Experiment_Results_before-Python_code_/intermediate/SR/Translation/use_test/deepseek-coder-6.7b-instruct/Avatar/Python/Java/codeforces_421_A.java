Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] lista = new int[n];
        for (int i = 0; i < n; i++) {
            lista[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i + 1 == lista[i]) {
                System.out.print(1 + " ");
            } else {
                System.out.print(2 + " ");
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers `n`, `a`, and `b` from the input, then reads `n` integers into an array `lista`. It then iterates over the array and prints `1` if the index plus one equals the value at that index, otherwise it prints `2`.

