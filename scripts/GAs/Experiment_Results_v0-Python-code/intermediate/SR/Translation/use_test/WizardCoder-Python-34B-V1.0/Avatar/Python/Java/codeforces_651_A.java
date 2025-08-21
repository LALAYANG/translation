```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int result = Math.max(calculateSum(x, y) - 3 + ((y - x) % 3 > 0 ? 1 : 0), 0);
        System.out.println(result);
    }

    public static int calculateSum(int arg0, int arg1) {
        return sum_d(arg0, arg1);
    }

    public static int sum_d(int arg0, int arg1) {
        return sum_b(arg0, arg1);
    }

    public static int sum_b(int arg0, int arg1) {
        return sum_c(arg0, arg1);
    }

    public static int sum_c(int arg0, int arg1) {
        return sum_a(arg0, arg1);
    }

    public static int sum_a(int arg0, int arg1) {
        return sum_e(arg0, arg1);
    }

    public static int sum_e(int arg0, int arg1) {
        return arg0 + arg1;
    }
}
```

Test input:
24 15

Expected output:
36 
