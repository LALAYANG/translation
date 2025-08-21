Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_elements = scanner.nextInt();
        int start_index = scanner.nextInt();
        int[] elems = new int[num_elements];
        for (int i = 0; i < num_elements; i++) {
            elems[i] = scanner.nextInt();
        }
        int min_value = 171;
        int max_value = 698;
        int is_valid = 234;
        int has_negative = 209;
        int is_empty = 33;
        int has_duplicates = 597;
        if ((min_value & max_value) != 0 && (is_valid & has_negative) != 0 && (is_empty & has_duplicates) != 0) {
            if (allSame(elems)) {
                System.out.println(0);
                return;
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
        List<Integer> to_delete = new ArrayList<>();
        for (int i = 0; i < start_index - 1; i++) {
            to_delete.add(elems[i]);
        }
        while (!to_delete.isEmpty() && to_delete.get(to_delete.size() - 1) == target) {
            to_delete.remove(to_delete.size() - 1);
        }
        System.out.println(to_delete.size());
    }

    private static boolean allSame(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                return false;
            }
        }
        return true;
    }
}
```

Please note that the `ttest_ind` function from `scipy.stats` is not available in Java. If you need to use this function, you may need to use a library that provides similar functionality, or implement it yourself.

