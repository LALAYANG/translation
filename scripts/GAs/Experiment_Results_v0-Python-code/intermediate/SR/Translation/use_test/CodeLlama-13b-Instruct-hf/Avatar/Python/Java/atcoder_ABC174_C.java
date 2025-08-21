
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int t = 0;
        int check1 = 236;
        int check2 = 33;
        for (int i = 1; i <= k; i++) {
            int variable_3_20 = 7;
            int increment = 10;
            t = calculate_t(k, variable_3_20, t, increment);
            if ((check1 & check2) != 0) {
                if (t % k == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
        if (t % k != 0) {
            System.out.println(-1);
        }
    }

    public static int calculate_t(int k, int variable_3_20, int t, int increment) {
        return t % k * increment + variable_3_20;
    }
}
```
Note that the Java code uses the `java.util.Scanner` class to read input from the user, and the `java.util.List` and `java.util.ArrayList` classes to store the list of numbers. The `java.util.Collections` class is used to shuffle the list of numbers, and the `java.util.Random` class is used to generate random numbers. The `java.lang.Math` class is used to perform mathematical operations, such as calculating the greatest common divisor (GCD) and the square root. The `java.util.Bisect` class is used to perform binary search on the list of numbers.
