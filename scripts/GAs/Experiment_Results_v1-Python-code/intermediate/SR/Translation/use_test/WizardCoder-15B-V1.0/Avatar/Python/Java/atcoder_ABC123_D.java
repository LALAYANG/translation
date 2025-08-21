```java
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int groupSize = 2;
        int y = 2;
        int z = 2;
        int topCount = 8;
        int[] a = {4, 6};
        int[] b = {1, 5};
        int[] thirdGroup = {3, 8};
        int[] ab = new int[groupSize * y];
        for (int i = 0; i < groupSize; i++) {
            for (int j = 0; j < y; j++) {
                ab[i * y + j] = a[i] + b[j];
            }
        }
        Arrays.sort(ab);
        int[] abc = new int[Math.min(topCount, groupSize * y) * z];
        for (int i = 0; i < Math.min(topCount, groupSize * y); i++) {
            for (int j = 0; j < z; j++) {
                abc[i * z + j] = ab[i] + thirdGroup[j];
            }
        }
        Arrays.sort(abc);
        for (int i = 0; i < topCount; i++) {
            System.out.println(abc[i]);
        }
    }
}
```
