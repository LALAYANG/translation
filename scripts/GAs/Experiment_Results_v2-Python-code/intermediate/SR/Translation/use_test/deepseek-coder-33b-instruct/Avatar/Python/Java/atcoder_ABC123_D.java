```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int k = scanner.nextInt();

        int[] a = new int[x];
        for (int i = 0; i < x; i++) {
            a[i] = scanner.nextInt();
        }

        int[] b = new int[y];
        for (int i = 0; i < y; i++) {
            b[i] = scanner.nextInt();
        }

        int[] array_c = new int[z];
        for (int i = 0; i < z; i++) {
            array_c[i] = scanner.nextInt();
        }

        List<Integer> sum_ab = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            for (int index_b = 0; index_b < y; index_b++) {
                sum_ab.add(a[i] + b[index_b]);
            }
        }
        Collections.sort(sum_ab, Collections.reverseOrder());

        List<Integer> abc = new ArrayList<>();
        for (int i = 0; i < Math.min(k, x * y); i++) {
            for (int index_b = 0; index_b < z; index_b++) {
                abc.add(sum_ab.get(i) + array_c[index_b]);
            }
        }
        Collections.sort(abc, Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            System.out.println(abc.get(i));
        }
    }
}
```

Please note that the Java code does not include the functionality of the t-test from the Python code. The t-test is a statistical test that is used to determine if two sets of data are significantly different from each other. It is not directly translatable to Java as it is a statistical function and not a standard library function.

