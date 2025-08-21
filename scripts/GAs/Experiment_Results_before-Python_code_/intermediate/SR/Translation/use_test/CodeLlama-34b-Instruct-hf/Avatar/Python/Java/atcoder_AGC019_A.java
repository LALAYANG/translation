```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int h = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        int best1L = Math.min(q * 4, h * 2, s);
        int best2L = Math.min(d, best1L * 2);

        if (n % 2 == 0) {
            System.out.println(best2L * (n / 2));
        } else {
            System.out.println(best2L * (n / 2) + best1L);
        }
    }
}
```
Note: The `Scanner` class is used to read input from the user. The `Math.min()` method is used to find the minimum of three numbers. The `n % 2 == 0` condition is used to check if the input number `n` is even or odd.
