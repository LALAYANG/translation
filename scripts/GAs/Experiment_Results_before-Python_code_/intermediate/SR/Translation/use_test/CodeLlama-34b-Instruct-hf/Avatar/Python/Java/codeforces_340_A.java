```java
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int lcm = lcm(x, y);
        int result = (b / lcm) - ((a - 1) / lcm);
        System.out.println(result);
    }

    public static int lcm(int a, int b) {
        while (a % b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return b;
    }
}
```
Note: The `lcm` method is a recursive function that calculates the least common multiple of two integers. The `main` method takes input from the user and calls the `lcm` method to calculate the least common multiple of `x` and `y`. The result is then used to calculate the difference between `b` and `a-1` divided by the least common multiple.
