```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int m = sc.nextInt();
        int[] output_array = new int[array_size];
        int[] comp = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            comp[i] = i + 2;
        }
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int x = sc.nextInt();
            int current_index = l;
            while (current_index <= r) {
                int next_value = comp[current_index - 1];
                if (output_array[current_index - 1] == 0 && current_index != x) {
                    output_array[current_index - 1] = x;
                }
                comp[current_index - 1] = r + 1;
                current_index = next_value;
            }
        }
        for (int i = 0; i < array_size; i++) {
            System.out.print(output_array[i] + " ");
        }
    }
}
```

