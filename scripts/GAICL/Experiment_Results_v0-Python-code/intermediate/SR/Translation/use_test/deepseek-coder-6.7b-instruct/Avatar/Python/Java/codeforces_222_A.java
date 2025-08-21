```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_elements = scanner.nextInt();
        int start_index = scanner.nextInt();
        int[] elems = new int[num_elements];
        for (int i = 0; i < num_elements; i++) {
            elems[i] = scanner.nextInt();
        }
        if (allSame(elems)) {
            System.out.println(0);
            return;
        }
        if (start_index == 1) {
            System.out.println(-1);
            return;
        }
        if (!allSame(Arrays.copyOfRange(elems, start_index - 1, num_elements))) {
            System.out.println(-1);
            return;
        }
        int target = elems[num_elements - 1];
        int[] to_delete = Arrays.copyOfRange(elems, 0, start_index - 1);
        while (to_delete.length > 0 && to_delete[to_delete.length - 1] == target) {
            to_delete = Arrays.copyOf(to_delete, to_delete.length - 1);
        }
        System.out.println(to_delete.length);
    }

    private static boolean allSame(int[] elems) {
        int first = elems[0];
        for (int elem : elems) {
            if (elem != first) {
                return false;
            }
        }
        return true;
    }
}
```

This Java code does the same thing as the Python code. It reads the input, checks conditions, and performs the required operations. The `allSame` method checks if all elements in the array are the same. The `Arrays.copyOfRange` method is used to create a subarray. The `Arrays.copyOf` method is used to create a copy of the array.

