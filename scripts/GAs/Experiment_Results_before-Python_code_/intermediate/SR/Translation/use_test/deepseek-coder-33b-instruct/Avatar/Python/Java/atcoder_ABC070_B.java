```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[4];
        for (int i = 0; i < 4; i++) {
            A[i] = scanner.nextInt();
        }
        Arrays.sort(A);
        if (A[1] <= A[2] || A[3] <= A[0]) {
            System.out.println(0);
        } else {
            System.out.println(A[3] - A[1]);
        }
    }
}
```

This Java code does the same thing as the Python code you provided. It reads four integers from the standard input, sorts them, and then checks if the second and third numbers are within the range of the first and fourth numbers. If they are, it prints 0. Otherwise, it prints the difference between the third and first numbers.

