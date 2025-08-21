Here is the Java version of the Python code:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = scanner.nextInt();
        }
        int min = A[0];
        for (int i = 1; i < 5; i++) {
            if (A[i] < min) {
                min = A[i];
            }
        }
        System.out.println((int)Math.ceil((double)N / min) + 4);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer N and an array A of 5 integers from the input. It calculates the minimum of the array A and divides N by this minimum. The result is then rounded up to the nearest integer using the `Math.ceil` function. The result is then incremented by 4 and printed to the output.

