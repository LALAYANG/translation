Here is the Java equivalent of the provided Python code:

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupSize = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int topCount = scanner.nextInt();

        Integer[] a = new Integer[groupSize];
        Integer[] b = new Integer[y];
        Integer[] thirdGroup = new Integer[z];

        for (int i = 0; i < groupSize; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < y; i++) {
            b[i] = scanner.nextInt();
        }

        for (int i = 0; i < z; i++) {
            thirdGroup[i] = scanner.nextInt();
        }

        List<Integer> ab = new ArrayList<>();
        for (int i = 0; i < groupSize; i++) {
            for (int j = 0; j < y; j++) {
                ab.add(a[i] + b[j]);
            }
        }

        Collections.sort(ab, Collections.reverseOrder());

        List<Integer> abc = new ArrayList<>();
        int min = Math.min(topCount, groupSize * y);
        for (int i = 0; i < min; i++) {
            for (int j = 0; j < z; j++) {
                abc.add(ab.get(i) + thirdGroup[j]);
            }
        }

        Collections.sort(abc, Collections.reverseOrder());

        for (int i = 0; i < topCount; i++) {
            System.out.println(abc.get(i));
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the input, performs the calculations, and prints the output. It uses Java's built-in `Scanner` class to read the input, and `ArrayList` and `Collections` classes to handle the arrays and sort them.

