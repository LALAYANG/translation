```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] group_size_y_z_top_count = scanner.nextLine().split(" ");
        int group_size = Integer.parseInt(group_size_y_z_top_count[0]);
        int y = Integer.parseInt(group_size_y_z_top_count[1]);
        int z = Integer.parseInt(group_size_y_z_top_count[2]);
        int top_count = Integer.parseInt(group_size_y_z_top_count[3]);

        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] third_group = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] ab = new int[group_size * y];
        for (int i = 0; i < group_size; i++) {
            for (int j = 0; j < y; j++) {
                ab[i * y + j] = a[i] + b[j];
            }
        }
        Arrays.sort(ab);

        int[] abc = new int[Math.min(top_count, group_size * y) * z];
        for (int i = 0; i < Math.min(top_count, group_size * y); i++) {
            for (int j = 0; j < z; j++) {
                abc[i * z + j] = ab[i] + third_group[j];
            }
        }
        Arrays.sort(abc);

        for (int i = 0; i < top_count; i++) {
            System.out.println(abc[i]);
        }
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
