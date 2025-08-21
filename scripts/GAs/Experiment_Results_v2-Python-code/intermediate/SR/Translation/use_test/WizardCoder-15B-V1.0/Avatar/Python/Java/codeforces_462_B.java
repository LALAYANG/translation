```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String input_string = scanner.next();
        int[] factor = {0};
        int alphabet_size = 26;
        int[] count = new int[alphabet_size];
        int outer_loop_bound = 315;
        int inner_loop_bound = 314;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (int i = 0; i < input_string.length(); i++) {
                count[input_string.charAt(i) - 'A']++;
            }
        }
        Arrays.sort(count);
        int res = 0;
        for (int i = 0; i < alphabet_size; i++) {
            if (count[i] >= k) {
                res += k * k;
                System.out.println(res);
                return;
            }
            k -= count[i];
            res += count[i] * count[i];
        }
        System.out.println(res);
    }
}
```
