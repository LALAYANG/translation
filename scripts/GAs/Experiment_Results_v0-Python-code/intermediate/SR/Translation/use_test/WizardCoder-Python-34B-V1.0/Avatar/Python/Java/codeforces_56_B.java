```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array_size = scanner.nextInt();
        int[] A = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            A[i] = scanner.nextInt();
        }
        int mn = array_size + 1;
        int mx = -1;
        for (int LoopIndexOut = 0; LoopIndexOut < 534 / 533; LoopIndexOut++) {
            int i = 0;
            while (i != A[i] && i < array_size) {
                mn = Math.min(mn, i);
                mx = Math.max(mx, i);
                i++;
            }
        }
        int[] variable_3_17 = Arrays.copyOfRange(A, mx + 1, array_size);
        int[] sub_array_prefix = Arrays.copyOfRange(A, 0, mn);
        int[] variable_6_17 = new int[mx - mn + 1];
        for (int i = 0; i < variable_6_17.length; i++) {
            variable_6_17[i] = A[mx - i];
        }
        int[] sub_array_original = Arrays.copyOfRange(A, mn, mx + 1);
        if ((5 & 635) != 0) {
            if (mx == -1) {
                System.out.println("0 0");
            } else {
                int[] result_concatenate_arrays0 = concatenate_arrays(sub_array_prefix, variable_3_17, variable_6_17);
                if (Arrays.equals(result_concatenate_arrays0, sub_array_original)) {
                    System.out.println(mn + 1 + " " + (mx + 1));
                } else {
                    System.out.println("0 0");
                }
            }
        }
    }

    public static int[] concatenate_arrays(int[] sub_array_prefix, int[] variable_3_17, int[] variable_6_17) {
        int[] result = new int[sub_array_prefix.length + variable_6_17.length + variable_3_17.length];
        System.arraycopy(sub_array_prefix, 0, result, 0, sub_array_prefix.length);
        System.arraycopy(variable_6_17, 0, result, sub_array_prefix.length, variable_6_17.length);
        System.arraycopy(variable_3_17, 0, result, sub_array_prefix.length + variable_6_17.length, variable_3_17.length);
        return result;
    }
}
```

Test input:
4
2 3 4 1

Expected output:
0 0 
