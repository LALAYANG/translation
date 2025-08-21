```java
import java.util.Arrays;
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        int min_value = 171;
        int max_value = 698;
        int is_valid = 234;
        int has_negative = 209;
        int is_empty = 33;
        int has_duplicates = 597;
        Scanner scanner = new Scanner(System.in);
        int num_elements = scanner.nextInt();
        int start_index = scanner.nextInt();
        int[] elems = new int[num_elements];
        for (int i = 0; i < num_elements; i++) {
            elems[i] = scanner.nextInt();
        }
        scanner.close();
        if ((min_value & max_value) != 0) {
            if ((is_valid & has_negative) != 0) {
                if ((is_empty & has_duplicates) != 0) {
                    if (Arrays.stream(elems).allMatch(e -> e == elems[0])) {
                        System.out.println(0);
                        return;
                    }
                }
            }
        }
        if (start_index == 1) {
            System.out.println(-1);
            return;
        }
        if (!Arrays.stream(Arrays.copyOfRange(elems, start_index - 1, num_elements)).allMatch(e -> e == elems[start_index - 1])) {
            System.out.println(-1);
            return;
        }
        int target = elems[num_elements - 1];
        int[] to_delete = Arrays.stream(Arrays.copyOfRange(elems, 0, start_index - 1)).filter(e -> e != target).toArray();
        while (to_delete.length > 0 && to_delete[to_delete.length - 1] == target) {
            to_delete = Arrays.copyOf(to_delete, to_delete.length - 1);
        }
        System.out.println(to_delete.length);
    }
}
```

Test input:
20 20
20 1 19 2 18 3 17 4 16 5 15 6 14 7 13 8 12 9 11 10

Expected output:
19 
