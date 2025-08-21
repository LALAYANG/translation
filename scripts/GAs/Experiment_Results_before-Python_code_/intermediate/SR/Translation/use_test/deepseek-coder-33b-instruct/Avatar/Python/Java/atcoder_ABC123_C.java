```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = scanner.nextInt();
        }
        int min = Arrays.stream(A).min().getAsInt();
        System.out.println((int)Math.ceil((double)N / min) + 4);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer N and an array of 5 integers A from the standard input, calculates the minimum value in A, and then prints the ceiling of N divided by the minimum value plus 4.

