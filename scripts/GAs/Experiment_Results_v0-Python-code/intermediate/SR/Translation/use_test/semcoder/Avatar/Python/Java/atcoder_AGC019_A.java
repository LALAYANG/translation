Thought process:
1. Read the input values for q, h, s, d, and n.
2. Calculate the minimum values for best1L and best2L based on the given formulas.
3. Determine the number of sets of 2 and 1 pieces needed based on the remaining pieces.
4. Calculate the total price based on the calculated values and print the result.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        int h = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        int best1L = Math.min(q * 4, Math.min(h * 2, s));
        int best2L = Math.min(d, best1L * 2);

        int setsOf2 = n / 2;
        int remainingPieces = n % 2;

        long totalPrice = (long) best2L * setsOf2;
        if (remainingPieces == 1) {
            totalPrice += best1L;
        }

        System.out.println(totalPrice);
    }
}
```
