```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        int z = sc.nextInt();
        int count = sc.nextInt();
        int[] a = new int[width];
        int[] b = new int[height];
        int[] c = new int[z];
        for (int i = 0; i < width; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < height; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < z; i++) {
            c[i] = sc.nextInt();
        }
        int[] ab = new int[width * height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                ab[i * height + j] = a[i] + b[j];
            }
        }
        Arrays.sort(ab);
        for (int i = 0; i < ab.length; i++) {
            System.out.println(ab[i]);
        }
        int[] abc = new int[Math.min(count, width * height) * z];
        for (int i = 0; i < Math.min(count, width * height); i++) {
            for (int j = 0; j < z; j++) {
                abc[i * z + j] = ab[i] + c[j];
            }
        }
        Arrays.sort(abc);
        for (int i = 0; i < count; i++) {
            System.out.println(abc[i]);
        }
    }
}
```
