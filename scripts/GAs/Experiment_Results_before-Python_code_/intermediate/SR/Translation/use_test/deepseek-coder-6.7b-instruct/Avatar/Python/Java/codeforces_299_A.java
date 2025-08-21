Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        System.out.println(anyDivisor(a) ? a[0] : -1);
    }

    private static boolean anyDivisor(int[] a) {
        for (int x : a) {
            if (x % a[0] != 0) {
                return false;
            }
        }
        return true;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and `n` integers from the input, sorts them, and then checks if all the integers are divisible by the smallest one. If they are, it prints the smallest one, otherwise it prints `-1`.

