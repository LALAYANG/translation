Here is the Java version of the Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[4];
        for (int i = 0; i < 4; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();

        if (A[1] <= A[2] || A[3] <= A[0]) {
            System.out.println(0);
        } else {
            Arrays.sort(A);
            System.out.println(A[2] - A[1]);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the input, stores them in an array, and then checks if the conditions specified in the Python code are met. If they are, it prints 0. Otherwise, it sorts the array and prints the difference between the third and second elements.

