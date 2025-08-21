```java
import java.util.Scanner;

public class Vamshi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vamshi = sc.nextInt();
        int z = sc.nextInt();
        System.out.println((vamshi / z + 1) * z);
    }
}
```

Explanation:

In Java, we use the `Scanner` class to read input from the user. We create a `Scanner` object and use the `nextInt()` method to read the next integer from the user. We store the input in variables `vamshi` and `z`.

We then use the arithmetic operator `/` to divide `vamshi` by `z` and add 1 to the result. We then multiply the result by `z` and print it to the console using `System.out.println()`.

Note that in Java, we use the `//` operator to perform integer division, which is different from the `/` operator in Python. The `//` operator performs integer division and returns the integer part of the result, whereas the `/` operator performs floating-point division and returns a floating-point number.
