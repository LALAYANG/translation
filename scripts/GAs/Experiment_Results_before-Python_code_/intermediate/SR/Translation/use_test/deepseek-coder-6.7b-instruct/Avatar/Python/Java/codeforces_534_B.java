```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] v_and_t = scanner.nextLine().split(" ");
        String[] d_and_a = scanner.nextLine().split(" ");
        int v1 = Integer.parseInt(v_and_t[0]);
        int v2 = Integer.parseInt(v_and_t[1]);
        int t = Integer.parseInt(d_and_a[0]);
        int d = Integer.parseInt(d_and_a[1]);
        int a = 1;
        int v = v1;
        int distance = 0;
        for (int i = 0; i < t; i++) {
            if (v - v2 > (t - i - 1) * d) {
                a *= -1;
                v = (t - i - 1) * d + v2;
            }
            distance += v;
            v += a * d;
        }
        System.out.println(distance);
    }
}
```

This Java code does the same thing as the Python code. It reads two lines of input, converts them to integers, and then calculates the total distance traveled based on the given conditions. The result is then printed to the console.

