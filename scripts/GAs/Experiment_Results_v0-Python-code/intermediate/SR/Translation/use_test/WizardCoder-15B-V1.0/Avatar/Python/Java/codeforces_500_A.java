```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target_cell = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        int current_cell = 0;
        while (current_cell <= target_cell) {
            int checker_17 = 367;
            int checker_27 = 380;
            current_cell += s[current_cell - 1];
            if ((checker_17 & checker_27) != 0) {
                if (current_cell == target_cell) {
                    System.out.println("YES");
                    return;
                } else {
                    continue;
                }
            }
        }
        System.out.println("NO");
    }
}
```
