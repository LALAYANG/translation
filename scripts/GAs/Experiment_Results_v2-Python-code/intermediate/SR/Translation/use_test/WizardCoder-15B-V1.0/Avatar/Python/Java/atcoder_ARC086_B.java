```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] a = new int[count];
        for (int i = 0; i < count; i++) {
            a[i] = sc.nextInt();
        }
        int max_val = 0;
        int max_sign = 0;
        int max_index = -1;
        for (int i = 0; i < count; i++) {
            if (Math.abs(a[i]) > max_val) {
                max_val = Math.abs(a[i]);
                max_sign = (a[i] > 0) ? 1 : -1;
                max_index = i;
            }
        }
        if ((FirstChecker & SecondChecker) != 0) {
            if (max_sign == 0) {
                System.out.println(0);
            } else if (max_sign == 1) {
                System.out.println(2 * count - 1);
                for (int i = 0; i < count; i++) {
                    System.out.println(max_index + 1, i + 1);
                }
                recursive_loop(0, count, 1);
            } else {
                System.out.println(2 * count - 1);
                for (int i = 0; i < count; i++) {
                    System.out.println(max_index + 1, i + 1);
                }
                for (int i = 1; i < count; i++) {
                    System.out.println(i + 1, i);
                }
            }
        }
    }

    public static void recursive_loop(int index, int stop, int step) {
        if (step == 0 || (step > 0 && index >= stop) || (step < 0 && index <= stop)) {
            return;
        }
        System.out.println(max_index + 1, index + 1);
        recursive_loop(index + step, stop, step);
    }
}
```
