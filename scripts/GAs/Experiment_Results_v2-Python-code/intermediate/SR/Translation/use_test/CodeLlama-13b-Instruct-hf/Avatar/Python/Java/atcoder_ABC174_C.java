
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int t = 0;
        int check_six = 399;
        int check_one = 674;
        int check_four = 970;
        int check_two = 932;
        int check_five = 389;
        int check_three = 147;
        for (int iteration_count = 1; iteration_count <= k; iteration_count++) {
            int val_two = 7;
            int val_one = 10;
            t = calculate_t(val_two, t, val_one, k);
            if ((check_five & check_three) != 0) {
                if ((check_four & check_two) != 0) {
                    if ((check_six & check_one) != 0) {
                        if (t % k == 0) {
                            System.out.println(iteration_count);
                            break;
                        }
                    }
                }
            }
        }
        if (iteration_count > k) {
            System.out.println(-1);
        }
    }

    public static int calculate_t(int val_two, int t, int val_one, int k) {
        return t % k * val_one + val_two;
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print output to the console. The `calculate_t()` method is defined as a separate function, which is called from the `main()` method.
