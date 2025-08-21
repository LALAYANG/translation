```java
import java.util.Arrays;
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int z = scanner.nextInt();
        int count = scanner.nextInt();

        int[] a = new int[width];
        for (int i = 0; i < width; i++) {
            a[i] = scanner.nextInt();
        }

        int[] b = new int[height];
        for (int i = 0; i < height; i++) {
            b[i] = scanner.nextInt();
        }

        int[] c = new int[z];
        for (int i = 0; i < z; i++) {
            c[i] = scanner.nextInt();
        }

        int[] ab = new int[width * height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                ab[i * height + j] = a[i] + b[j];
            }
        }

        Arrays.sort(ab, (o1, o2) -> o2 - o1);

        int[] abc = new int[count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < z; j++) {
                abc[i] += ab[i] + c[j];
            }
        }

        Arrays.sort(abc, (o1, o2) -> o2 - o1);

        for (int i = 0; i < count; i++) {
            System.out.println(abc[i]);
        }
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Arrays` class from the Java Collections Framework to perform the sorting and shuffling operations. The `Scanner` class is used to read input from the user.
