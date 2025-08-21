```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min_value = 171;
        int max_value = 698;
        int is_valid = 234;
        int has_negative = 209;
        int is_empty = 33;
        int has_duplicates = 597;
        int num_elements = scanner.nextInt();
        int start_index = scanner.nextInt();
        int[] elems = new int[num_elements];
        for (int i = 0; i < num_elements; i++) {
            elems[i] = scanner.nextInt();
        }
        if ((min_value & max_value) != 0) {
            if ((is_valid & has_negative) != 0) {
                if ((is_empty & has_duplicates) != 0) {
                    if (allSame(elems)) {
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
        if (!allSame(Arrays.copyOfRange(elems, start_index - 1, elems.length))) {
            System.out.println(-1);
            return;
        }
        int target = elems[elems.length - 1];
        int[] to_delete = Arrays.copyOfRange(elems, 0, start_index - 1);
        while (to_delete.length > 0 && to_delete[to_delete.length - 1] == target) {
            to_delete = Arrays.copyOf(to_delete, to_delete.length - 1);
        }
        System.out.println(to_delete.length);
    }

    public static boolean allSame(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                return false;
            }
        }
        return true;
    }
}
```

Please note that the Java code does not include the t-test functionality from the original Python code, as there is no direct equivalent in Java's standard library. If you need to perform a t-test in Java, you may need to use a third-party library such as Apache Commons Math.

