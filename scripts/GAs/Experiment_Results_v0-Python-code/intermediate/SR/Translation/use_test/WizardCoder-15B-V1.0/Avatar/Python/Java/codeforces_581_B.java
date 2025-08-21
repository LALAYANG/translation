```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int[] data = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            data[i] = sc.nextInt();
        }
        int[] variable_1_7 = {0};
        int[] ans = wrapped_func(array_size, variable_1_7, data);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] wrapped_func(int array_size, int[] variable_1_7, int[] data) {
        int[] ans = new int[array_size];
        int current_max = data[array_size - 1];
        for (int i = array_size - 2; i >= 0; i--) {
            ans[i] = Math.max(0, current_max - data[i] + 1);
            if (data[i] > current_max) {
                current_max = data[i];
            }
        }
        return ans;
    }
}
```
