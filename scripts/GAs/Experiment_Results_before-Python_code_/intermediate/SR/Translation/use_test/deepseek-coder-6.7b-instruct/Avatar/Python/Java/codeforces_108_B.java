Here is the Java version of the provided Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1] && a[i] * 2 < a[i - 1]) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and `n` integers from the input, sorts them, and then checks if there is an element in the array that is not equal to the previous one and is less than twice the previous one. If such an element is found, it prints "YES", otherwise it prints "NO".

