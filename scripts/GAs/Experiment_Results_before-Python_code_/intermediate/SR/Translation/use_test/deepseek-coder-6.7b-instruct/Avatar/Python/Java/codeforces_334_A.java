Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1, j = n * n;
        while (i < j) {
            System.out.print(i + " " + (j-1) + " ");
            i += 1;
            j -= 1;
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, then it prints a pattern of numbers in a spiral order. The pattern is printed in a way that the first number is always smaller than the last number in each line.

