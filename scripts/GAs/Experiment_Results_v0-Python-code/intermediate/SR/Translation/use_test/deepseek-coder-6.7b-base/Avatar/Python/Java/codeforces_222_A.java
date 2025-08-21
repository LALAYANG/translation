```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_elements = sc.nextInt();
        int start_index = sc.nextInt();
        int[] elems = new int[num_elements];
        for (int i = 0; i < num_elements; i++) {
            elems[i] = sc.nextInt();
        }
        int min_value = 171;
        int max_value = 698;
        int is_valid = 234;
        int has_negative = 209;
        int is_empty = 33;
        int has_duplicates = 597;
        if (min_value & max_value) {
            if (is_valid & has_negative) {
                if (is_empty & has_duplicates) {
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
        if (!allSame(elems[start_index - 1:])) {
            System.out.println(-1);
            return;
        }
        int target = elems[num_elements - 1];
        int[] to_delete = elems[0:start_index - 1];
        while (to_delete.length > 0 && to_delete[to_delete.length - 1] == target) {
            to_delete.pop();
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

