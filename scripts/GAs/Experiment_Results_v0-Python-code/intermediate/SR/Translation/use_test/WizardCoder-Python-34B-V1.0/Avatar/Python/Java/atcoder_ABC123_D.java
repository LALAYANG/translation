```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
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
        for (int i = 0; i < Math.min(count, width * height); i++) {
            for (int j = 0; j < z; j++) {
                abc[i] = ab[i] + c[j];
            }
        }
        Arrays.sort(abc, (a, b) -> b - a);
        for (int i = 0; i < count; i++) {
            System.out.println(abc[i]);
        }
        int[][] data1 = { {57, 21, 93};
        int[][] data2 = {91, 70, 69};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(data1, data2);
        System.out.println(pValue);
    }
}
```

Test input:
2 2 2 8
4 6
1 5
3 8

Expected output:
19
17
15
14
13
12
10
8
0.0001666666666666666666667
``` 
