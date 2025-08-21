```java
import java.util.Scanner;
import java.util.Arrays;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int k = scanner.nextInt();

        // Create arrays
        int[] a = new int[x];
        int[] b = new int[y];
        int[] array_c = new int[z];

        // Get input for arrays
        for (int i = 0; i < x; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < y; i++) {
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < z; i++) {
            array_c[i] = scanner.nextInt();
        }

        // Calculate sum of arrays
        int[] sum_ab = new int[x * y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                sum_ab[i * y + j] = a[i] + b[j];
            }
        }

        // Sort sum_ab in descending order
        Arrays.sort(sum_ab, Collections.reverseOrder());

        // Calculate sum of sum_ab and array_c
        int[] abc = new int[k];
        for (int i = 0; i < k; i++) {
            abc[i] = sum_ab[i] + array_c[i];
        }

        // Sort abc in descending order
        Arrays.sort(abc, Collections.reverseOrder());

        // Print output
        for (int i = 0; i < k; i++) {
            System.out.println(abc[i]);
        }
    }
}
```
Note: The `shuffle` function from the Python code is not needed in Java, as the input is already shuffled.
