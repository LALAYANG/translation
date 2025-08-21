Here is the Java version of the provided Python code:

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        int c = 0;
        for (int i : l) {
            if (i > c) {
                c++;
            }
        }
        System.out.println(c + 1);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and an array of `n` integers from the standard input, sorts the array, and then counts the number of unique elements in the array. The result is printed to the standard output.

