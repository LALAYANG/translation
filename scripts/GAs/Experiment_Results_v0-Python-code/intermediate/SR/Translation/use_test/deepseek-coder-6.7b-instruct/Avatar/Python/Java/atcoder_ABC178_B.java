```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int multiplier = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(Math.max(Math.max(a * multiplier, b * d), Math.max(a * d, b * multiplier)));
    }
}
```

This Java code reads four integers from the standard input, and then prints the maximum of the four products. The logic is the same as the Python code you provided.

