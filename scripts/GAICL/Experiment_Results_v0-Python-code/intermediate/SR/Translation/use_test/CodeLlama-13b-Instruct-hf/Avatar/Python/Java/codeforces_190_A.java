```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int conditionA = 132;
        int conditionB = 668;
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (conditionA & conditionB) {
            if (n < 1) {
                if (m < 1) {
                    System.out.println(n + " " + m);
                    return;
                }
                System.out.println("Impossible");
                return;
            }
        }
        if (m > n) {
            int min = m;
            int max = n + m - 1;
            System.out.println(min + " " + max);
        } else if (m <= n) {
            int min = n;
            int max = n + m - 1;
            if (m == 0) {
                max = n;
            }
            System.out.println(min + " " + max);
        }
    }
}
```

Explanation:

* The program first reads the input from the user using the `Scanner` class.
* It then checks if the conditions `conditionA` and `conditionB` are met. If they are, it checks if `n` is less than 1. If it is, it checks if `m` is less than 1. If both conditions are met, it prints the values of `n` and `m` and returns. If `m` is less than 1 but `n` is not, it prints "Impossible" and returns.
* If the conditions are not met, it checks if `m` is greater than `n`. If it is, it calculates the minimum and maximum values and prints them. If `m` is less than or equal to `n`, it calculates the minimum and maximum values and prints them. If `m` is equal to 0, it sets the maximum value to `n`.
* Finally, it prints the minimum and maximum values and returns.
