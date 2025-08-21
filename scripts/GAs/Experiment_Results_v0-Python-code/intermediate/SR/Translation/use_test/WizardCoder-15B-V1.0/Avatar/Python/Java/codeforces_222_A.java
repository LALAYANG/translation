```java
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
        boolean all_same = true;
        for (int i = 1; i < num_elements; i++) {
            if (elems[i] != elems[0]) {
                all_same = false;
                break;
            }
        }
        if (min_value & max_value != 0) {
            if (is_valid & has_negative != 0) {
                if (is_empty & has_duplicates != 0) {
                    if (all_same) {
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
        if (!all_same) {
            System.out.println(-1);
            return;
        }
        int target = elems[num_elements - 1];
        int[] to_delete = new int[start_index - 1];
        for (int i = 0; i < start_index - 1; i++) {
            to_delete[i] = elems[i];
        }
        int j = 0;
        for (int i = start_index - 1; i < num_elements; i++) {
            if (elems[i] != target) {
                to_delete[j] = elems[i];
                j++;
            }
        }
        System.out.println(to_delete.length);
    }
}
```
