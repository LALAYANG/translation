Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = scanner.nextInt();
        }
        int a = 1;
        int pos = 0;
        for (int i = 1; i < N; i++) {
            if (n[pos] > n[i]) {
                a += 1;
                pos = i;
            }
        }
        System.out.println(a);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `N` and an array of `N` integers from the input, then it counts the number of decreasing subsequences in the array and prints the result.

