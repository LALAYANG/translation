Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(Math.max(calculateSum(x, y) - 3 + ((y - x) % 3 > 0 ? 1 : 0), 0));
    }

    public static int calculateSum(int a, int b) {
        return sumD(a, b);
    }

    public static int sumD(int arg0, int arg1) {
        return sumC(arg0, arg1);
    }

    public static int sumC(int arg0, int arg1) {
        return sumB(arg0, arg1);
    }

    public static int sumB(int arg0, int arg1) {
        return sumA(arg0, arg1);
    }

    public static int sumA(int arg0, int arg1) {
        return sumE(arg0, arg1);
    }

    public static int sumE(int arg0, int arg1) {
        return arg0 + arg1;
    }
}
```

Please note that the `shuffle`, `ttest_ind`, `read_int`, `read_int_array`, `read_ints`, and `read_string` functions from the Python code are not included in the Java version because they are not used in the main logic of the program.

