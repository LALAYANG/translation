```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min_value = 171;
        int max_value = 698;
        int is_valid = 234;
        int has_negative = 209;
        int is_empty = 33;
        int has_duplicates = 597;
        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(" ");
        int num_elements = Integer.parseInt(input1[0]);
        int start_index = Integer.parseInt(input1[1]);
        int[] elems = new int[num_elements];
        String[] input2 = scanner.nextLine().split(" ");
        for (int i = 0; i < num_elements; i++) {
            elems[i] = Integer.parseInt(input2[i]);
        }
        boolean all_same = true;
        for (int i = 0; i < num_elements; i++) {
            if (elems[i] != elems[0]) {
                all_same = false;
                break;
            }
        }
        if ((min_value & max_value) != 0 && (is_valid & has_negative) != 0 && (is_empty & has_duplicates) != 0) {
            if (all_same) {
                System.out.println(0);
                return;
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
        ArrayList<Integer> to_delete = new ArrayList<Integer>();
        for (int i = 0; i < start_index - 1; i++) {
            if (elems[i] == target) {
                to_delete.add(elems[i]);
            }
        }
        System.out.println(to_delete.size());
    }
}
```

Test input:
20 20
20 1 19 2 18 3 17 4 16 5 15 6 14 7 13 8 12 9 11 10

Expected output:
19 
