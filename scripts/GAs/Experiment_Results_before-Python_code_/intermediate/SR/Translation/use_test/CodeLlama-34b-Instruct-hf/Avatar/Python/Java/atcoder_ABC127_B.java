```java
import java.util.Scanner;

public class JavaProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, D, x;
        r = sc.nextInt();
        D = sc.nextInt();
        x = sc.nextInt();

        for (int i = 2; i <= 12; i++) {
            System.out.println(Math.round((Math.pow(r, i - 1) * (x + D / (1 - r))) - D / (1 - r)));
        }
    }
}
```

Explanation:

The Python code you provided is using the `map` function to convert the input string to a list of integers. In Java, we can use the `Scanner` class to read the input and convert it to integers.

The rest of the code is similar to the Python code, using the `Math.pow` method to calculate the power of `r` and the `Math.round` method to round the result to the nearest integer.

Note that in Java, we need to use the `Math.round` method to round the result to the nearest integer, as the `round` function in Python is not available in Java.
