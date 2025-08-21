```
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int group_size = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int top_count = sc.nextInt();
        int[] a = new int[group_size];
        int[] b = new int[y];
        int[] third_group = new int[z];
        for (int i = 0; i < group_size; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < y; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < z; i++) {
            third_group[i] = sc.nextInt();
        }
        Integer[] ab = new Integer[group_size * y];
        for (int i = 0; i < group_size; i++) {
            for (int j = 0; j < y; j++) {
                ab[i * y + j] = a[i] + b[j];
            }
        }
        Arrays.sort(ab, Collections.reverseOrder());
        Integer[] abc = new Integer[group_size * y * z];
        for (int i = 0; i < Math.min(top_count, group_size * y); i++) {
            for (int j = 0; j < z; j++) {
                abc[i * z + j] = ab[i] + third_group[j];
            }
        }
        Arrays.sort(abc, Collections.reverseOrder());
        for (int i = 0; i < top_count; i++) {
            System.out.println(abc[i]);
        }
    }
}
```

