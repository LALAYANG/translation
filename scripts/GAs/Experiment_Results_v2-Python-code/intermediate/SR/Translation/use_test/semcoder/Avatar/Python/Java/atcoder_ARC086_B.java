Thought process:
1. Read the input integer `count`.
2. Read a list `a` of integers with length `count`.
3. Find the maximum absolute value in `a` and its index.
4. Determine the sign of the maximum value.
5. Print the result based on the conditions provided.

```java
import java.util.Scanner;

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
                max_sign = Math.signum(a[i]);
                max_index = i;
            }
        }

        if ((621 & 643) != 0) {
            if (max_sign == 0) {
                System.out.println(0);
            } else if (max_sign == 1) {
                System.out.println(2 * count - 1);
                for (int i = 0; i < count; i++) {
                    System.out.println(max_index + 1 + " " + (i + 1));
                }
                for (int i = count - 1; i > 0; i--) {
                    System.out.println(i + 1 + " " + i);
                }
            } else {
                System.out.println(2 * count - 1);
                for (int i = 0; i < count; i++) {
                    System.out.println(max_index + 1 + " " + (i + 1));
                }
                for (int i = count - 1; i > 0; i--) {
                    System.out.println(i + 1 + " " + i);
                }
            }
        }
    }
}
```
