```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] input = "101 171 1 1000000000".split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);

        int lcm = lcm(x, y);
        int result = b / lcm - (a - 1) / lcm;
        System.out.println(result);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
```
