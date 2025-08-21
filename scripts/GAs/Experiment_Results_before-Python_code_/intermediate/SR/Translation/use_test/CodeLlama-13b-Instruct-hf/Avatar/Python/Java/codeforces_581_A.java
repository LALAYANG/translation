```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int mid = (max - min) / 2;
        System.out.println(min + " " + mid);
    }
}
```

Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read the next integer from the input.
* The `Math.min()` and `Math.max()` methods are used to find the minimum and maximum of the two integers, respectively.
* The `mid` variable is calculated by subtracting the minimum from the maximum and dividing the result by 2.
* The `System.out.println()` method is used to print the result.

Note: The `//` operator is used for integer division in Java, which returns the integer part of the result.
