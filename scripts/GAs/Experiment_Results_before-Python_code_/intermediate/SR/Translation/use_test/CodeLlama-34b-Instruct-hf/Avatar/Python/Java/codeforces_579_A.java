```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 1;
        while (Math.log(n) % 1 != 0) {
            x += 1;
            n -= Math.pow(2, (int) Math.log(n));
        }
        System.out.println(x);
    }
}
```
Note: In Java, the `Math.log()` method returns the natural logarithm (base e) of a number, so we need to use `Math.log2()` to get the logarithm base 2. Also, the `Math.pow()` method is used to calculate the power of 2.
