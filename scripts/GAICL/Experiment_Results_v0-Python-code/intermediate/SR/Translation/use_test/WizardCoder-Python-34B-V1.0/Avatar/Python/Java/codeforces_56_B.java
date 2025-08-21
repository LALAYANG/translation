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
            while (true) {
                if (i + 1 != A[i]) {
                    mn = Math.min(mn, i);
                    mx = Math.max(mx, i);
                }
                i += 1;
                if (i >= array_size) {
                    break;
                }
            }
        }
        if (mx == -1) {
            System.out.println("0 0");
        } else {
            int[] sub_array_prefix = Arrays.copyOfRange(A, 0, mn);
            int[] variable_3_17 = Arrays.copyOfRange(A, mx + 1, array_size);
            int[] variable_6_17 = new int[mx - mn + 1];
            for (int i = mn; i <= mx; i++) {
                variable_6_17[mx - i] = A[i];
            }
            int[] sub_array_original = Arrays.copyOfRange(A, mn, mx + 1);
            int[] result_concatenate_arrays0 = concatenate_arrays(sub_array_prefix, variable_3_17, variable_6_17);
            if (Arrays.equals(result_concatenate_arrays0, A)) {
                System.out.println(mn + 1 + " " + (mx + 1));
            } else {
                System.out.println("0 0");
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
