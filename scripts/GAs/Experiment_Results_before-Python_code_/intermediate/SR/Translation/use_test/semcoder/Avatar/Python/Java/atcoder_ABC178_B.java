To solve this problem, we need to find the maximum product of two pairs of integers. We can achieve this by considering all possible pairs and comparing their products.

**Plan:**
1. Read the four integers `a`, `b`, `c`, and `d` from the input.
2. Calculate the products of pairs: `a*c`, `b*d`, `a*d`, and `b*c`.
3. Find the maximum of these products.
4. Return the maximum product.

Here is the Java solution implementing the above plan:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int maxProduct = Math.max(a * c, Math.max(b * d, Math.max(a * d, b * c)));
        System.out.println(maxProduct);
    }
}
```

This solution reads the input integers, calculates the products of pairs, and finds the maximum product. Finally, it prints the maximum product as the output.
