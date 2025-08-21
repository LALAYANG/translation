```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int z = scanner.nextInt();
        int count = scanner.nextInt();
        int[] a = new int[width];
        int[] b = new int[height];
        int[] c = new int[z];
        for (int i = 0; i < width; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < height; i++) {
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < z; i++) {
            c[i] = scanner.nextInt();
        }

        // Calculate ab
        int[] ab = new int[width * height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                ab[i * height + j] = a[i] + b[j];
            }
        }

        // Sort ab in descending order
        Arrays.sort(ab, Collections.reverseOrder());

        // Calculate abc
        int[] abc = new int[count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < z; j++) {
                abc[i] += ab[i] + c[j];
            }
        }

        // Sort abc in descending order
        Arrays.sort(abc, Collections.reverseOrder());

        // Print output
        for (int i = 0; i < count; i++) {
            System.out.println(abc[i]);
        }
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Arrays` and `Collections` classes from the Java Standard Library to perform the sorting and reversing of the arrays.
