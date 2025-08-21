```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = scanner.nextInt();
        }

        int a = 1;
        int pos = 0;
        for (int i = 1; i < N; i++) {
            if (values[i] > values[pos]) {
                a = a + 1;
                pos = i;
            }
        }

        System.out.println(a);
    }
}
```

The above code is a Java implementation of the Python code you provided. It uses a `Scanner` to read input from the user and an `int[]` array to store the input values. The rest of the code is similar to the Python code, with the main difference being the use of `int` instead of `float` for the `a` and `pos` variables.

Note that the Java code does not include the `numpy` library, as it is not needed for this implementation. Additionally, the Java code does not include the `threading` and `queue` libraries, as they are not needed for this implementation.
