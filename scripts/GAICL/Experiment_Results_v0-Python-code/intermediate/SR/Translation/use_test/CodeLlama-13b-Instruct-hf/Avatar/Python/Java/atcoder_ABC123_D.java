
Here is the Java code that implements the same functionality as the Python code:
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

        int[] ab = new int[width * height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                ab[i * height + j] = a[i] + b[j];
            }
        }

        Arrays.sort(ab, (a, b) -> b - a);

        int[] abc = new int[count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < z; j++) {
                abc[i] = ab[i] + c[j];
            }
        }

        Arrays.sort(abc, (a, b) -> b - a);

        for (int i = 0; i < count; i++) {
            System.out.println(abc[i]);
        }
    }
}
```
Note that this code uses the `Arrays.sort()` method to sort the arrays in descending order, and the `Arrays.min()` method to find the minimum value in an array. It also uses the `Scanner` class to read input from the user.
