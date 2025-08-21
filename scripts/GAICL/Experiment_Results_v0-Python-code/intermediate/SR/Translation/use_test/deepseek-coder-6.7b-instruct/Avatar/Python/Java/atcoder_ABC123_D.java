Here is the Java equivalent of your Python code:

```java
import java.util.*;

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
        List<Integer> ab = new ArrayList<>();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                ab.add(a[i] + b[j]);
            }
        }
        Collections.sort(ab, Collections.reverseOrder());
        List<Integer> abc = new ArrayList<>();
        int min = Math.min(count, width * height);
        for (int i = 0; i < min; i++) {
            for (int j = 0; j < z; j++) {
                abc.add(ab.get(i) + c[j]);
            }
        }
        Collections.sort(abc, Collections.reverseOrder());
        for (int i = 0; i < count; i++) {
            System.out.println(abc.get(i));
        }
    }
}
```

This Java code does the same thing as your Python code. It reads the input, performs the necessary calculations, and prints the output. The key difference is that Java uses a different syntax and libraries for certain operations. For example, Python's `input().split()` is replaced with `Scanner` in Java, and Python's `list` is replaced with `ArrayList`.

